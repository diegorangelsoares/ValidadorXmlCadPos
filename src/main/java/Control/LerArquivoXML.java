/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import Model.Fatura;
import Model.Operacao;
import Model.Pagamento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Rangel
 */
public class LerArquivoXML {

    public static String TAG_PAGAMENTO = "PgtoFatFchdAnt";
    public static String TAG_XML = "<?xml";

    public LerArquivoXML(){};

    //Percorrer todas as linhas do arquivo
    public List<Cliente> percorreArquivo(String caminho){
        List<Cliente> clientes = new ArrayList<>();
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            int numeroLinha = 0;
            boolean cabecalho = true;
            Cliente c  = new Cliente();
            Fatura f = new Fatura();
            List<Fatura> faturas = new ArrayList<>();
            Pagamento p = new Pagamento();
            List<Pagamento> pagamentos = new ArrayList<>();
            while (linha != null) {
                if (!linha.equals("")){
                    //System.out.println("Linha "+numeroLinha+": "+linha);
                }
                if (cabecalho) {
                    cabecalho = verificaConteudoDaLinhaCabecalho(linha);
                }
                //System.out.println("\n");

                if (!cabecalho){

                    //Verificar os dados dos clientes
                    c = verificaConteudoDaLinhaCliente(linha, c);
                    //Verificar as faturas
                    if (!c.isStatusMontagemCliente()){
                        //Verificar as faturas
                        f = verificaConteudoDaLinhaFaturasFechadasAnteriores(linha, f);
                        //
                        if (!f.isStatusMontagemFatura()){
                            if (linha.contains(LerArquivoXML.TAG_PAGAMENTO)){
                                p = verificaConteudoDaLinhaPagamentosDasFaturasFechadasAnteriores(linha, p);
                                pagamentos.add(p);
                                p = new Pagamento();
                            }
                        }else{
                            //Se o status montagem da fatura está true é porque terminou de montar a fatura
                            f.setPagamentos(pagamentos);
                            faturas.add(f);
                            pagamentos = new ArrayList<>();
                            c.getOperacao().setFaturas(faturas);
                            f = new Fatura();
                            f.setStatusMontagemFatura(false);
                        }
                    }else{
                        //Se o status montagem do cliente está true é porque terminou de montar o cliente
                        clientes.add(c);
                        c = new Cliente();
                        c.setStatusMontagemCliente(false);
                        faturas = new ArrayList<>();
                    }


                }

                linha = lerArq.readLine();
                numeroLinha++;
            }
            arq.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo "+caminho + " - "+e.getMessage());
        }
        return clientes;
    }


    public boolean verificaConteudoDaLinhaCabecalho (String linha){
        int posInicial = 0;
        int posFinal = 0;
        String conteudoTag = "";
        try {
            //Verificar o cabeçalho do xml
            if (linha.contains(LerArquivoXML.TAG_XML)) {
                //System.out.println("Linha 0: " + linha);
                if (linha.contains("version")) {

                    posInicial = linha.indexOf("version");
                    posFinal = linha.indexOf("\" encoding");

                    conteudoTag = linha.substring(posInicial, posFinal);
                    conteudoTag = conteudoTag.replace("version=\"", "");
                    System.out.println("XML version: " + conteudoTag);
                }
                if (linha.contains("encoding")) {

                    posInicial = linha.indexOf("encoding");
                    posFinal = linha.indexOf("\" standalone");

                    conteudoTag = linha.substring(posInicial, posFinal);
                    conteudoTag = conteudoTag.replace("encoding=\"", "");
                    System.out.println("encoding: " + conteudoTag);
                }
                if (linha.contains("standalone")) {

                    posInicial = linha.indexOf("standalone");
                    posFinal = linha.indexOf("\"?>");

                    conteudoTag = linha.substring(posInicial, posFinal);
                    conteudoTag = conteudoTag.replace("standalone=\"", "");
                    System.out.println("standalone: " + conteudoTag);
                }
            }

            //Verificar tipo de arquivo C-Completo P-'parcial'
            if (linha.contains("FmtRms")) {
                //System.out.println("Linha 1: " + linha);
                if (linha.contains("FmtRms")) {

                    posInicial = linha.indexOf("FmtRms");
                    posFinal = linha.indexOf("\">");

                    conteudoTag = linha.substring(posInicial, posFinal);
                    conteudoTag = conteudoTag.replace("FmtRms=\"", "");
                    System.out.println("Tipo de Arquivo: " + conteudoTag);
                }
                if (linha.contains("CmdoRms")) {

                    posInicial = linha.indexOf("CmdoRms");
                    posFinal = linha.indexOf("\" CnpjGbd");

                    conteudoTag = linha.substring(posInicial, posFinal);
                    conteudoTag = conteudoTag.replace("CmdoRms=\"", "");
                    System.out.println("CmdoRms: " + conteudoTag);
                }
            }


            if (linha.contains("<Cli")) {
                //System.out.println("\n");
                return false;
            }
        }catch (Exception e){
            System.out.println("Erro: "+e.toString());
            return false;
        }

        return true;
    }

    public Cliente verificaConteudoDaLinhaCliente (String linha, Cliente c){
        int posInicial = 0;
        int posFinal = 0;
        //Cliente c = new Cliente();
        //c.setStatusMontagemCliente(false);
        String conteudoTag = "";
        try {
            //Verificar o cabeçalho do xml
            if (linha.contains("</Cli>")) {
                //Final do dado do cliente
                c.setStatusMontagemCliente(true);
            }

            if (linha.contains("IdfcCli")) {

                posInicial = linha.indexOf("IdfcCli=\"");
                posFinal = linha.indexOf("\" NmCli");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("IdfcCli=\"", "");
                //System.out.println("IdfcCli: " + conteudoTag);
                c.setIdfcCli(conteudoTag);

            }

            if (linha.contains("NmCli")) {

                posInicial = linha.indexOf("NmCli=\"");
                posFinal = linha.indexOf("\" NtzRlc");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("NmCli=\"", "");
                //System.out.println("NmCli: " + conteudoTag);
                c.setNmCli(conteudoTag);

            }
            if (linha.contains("TipCli")) {

                posInicial = linha.indexOf("TipCli=\"");
                posFinal = linha.indexOf("\">");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("TipCli=\"", "");
                c.setTipCli(conteudoTag);

            }

            //Verificar os detalhes do cliente
            if (linha.contains("NrUnco")) {
                posInicial = linha.indexOf("NrUnco=\"");
                posFinal = linha.indexOf("\" DtCtrc");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("NrUnco=\"", "");
                //System.out.println("NrUnco: " + conteudoTag);
                if (c.getOperacao() == null){
                    Operacao operacao = new Operacao();
                    operacao.setNrUnco(conteudoTag);
                    c.setOperacao(operacao);
                }
            }

            if (linha.contains("DtCtrc")) {
                posInicial = linha.indexOf("DtCtrc=\"");
                posFinal = linha.indexOf("\" CdMdld");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("DtCtrc=\"", "");
                //System.out.println("DtCtrc: " + conteudoTag);
                c.getOperacao().setDtCtrc(conteudoTag);

            }

            if (linha.contains("DtAprc")) {
                posInicial = linha.indexOf("DtAprc=\"");
                posFinal = linha.indexOf("\">");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("DtAprc=\"", "");
                //System.out.println("DtAprc: " + conteudoTag);
                c.getOperacao().setDtCtrc(conteudoTag);

            }

            if (linha.contains("NrPlstCrt")) {
                posInicial = linha.indexOf("NrPlstCrt=\"");
                posFinal = linha.indexOf("\" SdoDvdr");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("NrPlstCrt=\"", "");
                //System.out.println("DtAprc: " + conteudoTag);
                c.getOperacao().setNrPlstCrt(conteudoTag);

            }

            if (linha.contains("SdoDvdr")) {
                posInicial = linha.indexOf("SdoDvdr=\"");
                posFinal = linha.indexOf("\"/>");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("SdoDvdr=\"", "");
                //System.out.println("DtAprc: " + conteudoTag);
                c.getOperacao().setSdoDvdr(conteudoTag);
            }


        }catch (Exception e){
            System.out.println("Erro: "+e.toString());
            return c;
        }

        return c;
    }

    public Fatura verificaConteudoDaLinhaFaturasFechadasAnteriores (String linha, Fatura f){
        int posInicial = 0;
        int posFinal = 0;
        //Cliente c = new Cliente();
        //c.setStatusMontagemCliente(false);
        String conteudoTag = "";
        try {
            //Verificar o cabeçalho do xml
            if (linha.contains("</FatFchdAnt>")) {
                //Final do dado do cliente
                f.setStatusMontagemFatura(true);
            }

            if (linha.contains("DtVnctFatFchdAnt")) {

                posInicial = linha.indexOf("DtVnctFatFchdAnt=\"");
                posFinal = linha.indexOf("\" VlTtlPgrFatFchdAnt");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("DtVnctFatFchdAnt=\"", "");
                //System.out.println("IdfcCli: " + conteudoTag);
                f.setDtVnctFatFchdAnt(conteudoTag);

            }

            if (linha.contains("VlTtlPgrFatFchdAnt")) {

                posInicial = linha.indexOf("VlTtlPgrFatFchdAnt=\"");
                posFinal = linha.indexOf("\" VlMinPgrFatFchdAnt");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("VlTtlPgrFatFchdAnt=\"", "");
                //System.out.println("NmCli: " + conteudoTag);
                f.setVlTtlPgrFatFchdAnt(conteudoTag);

            }
            if (linha.contains("VlMinPgrFatFchdAnt")) {

                posInicial = linha.indexOf("VlMinPgrFatFchdAnt=\"");
                posFinal = linha.indexOf("\">");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("VlMinPgrFatFchdAnt=\"", "");
                f.setVlMinPgrFatFchdAnt(conteudoTag);

            }


        }catch (Exception e){
            System.out.println("Erro: "+e.toString());
            return f;
        }

        return f;
    }

    public Pagamento verificaConteudoDaLinhaPagamentosDasFaturasFechadasAnteriores(String linha, Pagamento p){
        int posInicial = 0;
        int posFinal = 0;
        String conteudoTag = "";
        try {
            //Verificar o cabeçalho do xml
//            if (linha.contains("</FatFchdAnt>")) {
//                //Final do dado do cliente
//                f.setStatusMontagemFatura(true);
//            }

            if (linha.contains("Dtpgtofatfchdant")) {

                posInicial = linha.indexOf("Dtpgtofatfchdant=\"");
                posFinal = linha.indexOf("\" VlPgtoFatFchDant");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("Dtpgtofatfchdant=\"", "");
                //System.out.println("IdfcCli: " + conteudoTag);
                p.setDtpgtofatfchdant(conteudoTag);

            }

            if (linha.contains("VlPgtoFatFchDant")) {

                posInicial = linha.indexOf("VlPgtoFatFchDant=\"");
                posFinal = linha.indexOf("\"/>");

                conteudoTag = linha.substring(posInicial, posFinal);
                conteudoTag = conteudoTag.replace("VlPgtoFatFchDant=\"", "");
                //System.out.println("NmCli: " + conteudoTag);
                p.setVlPgtoFatFchDant(conteudoTag);

            }

        }catch (Exception e){
            System.out.println("Erro: "+e.toString());
            return p;
        }

        return p;

    }




}