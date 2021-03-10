package Control;

import Model.Cliente;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ConciliaXmlVsCards {

    public void consultaCardsParaBatimentos(List<Cliente> clientes){

        String criticas = "";

        for (Cliente cli: clientes){
            //System.out.println(cli.toString());
//            System.out.println("Consultando cliente no cards...");
//
//            clienteDao.consultaCliente(Long.parseLong(cli.IdfcCli));
//            String saldo = clienteDao.consultaSaldoFaturaAtivaCliente(Long.parseLong(cli.IdfcCli));
//            System.out.println("Saldo no cards: "+saldo);

            System.out.println("Consultando cliente no cards...");


        }
        if (criticas.equals("")){
            criticas = "Críticas do XML:\n\n" + "Nenhuma crítica!";
        }else{
            criticas = "Críticas do XML:\n\n" + criticas;
        }

        gerarArquivoDeCriticas(criticas);

    }

    public String gerarArquivoDeCriticas (String erro){

        String nomeDoArquivo = LerArquivoXML.CAMINHO_ARQUIVOS+new Date()+"criticas.txt";
        BufferedWriter buffWrite = null;
        String linha = "";
        try {
            buffWrite = new BufferedWriter(new FileWriter(nomeDoArquivo));
            buffWrite.append(erro);
            buffWrite.close();
            return nomeDoArquivo;
        } catch (IOException ex) {
            System.out.println("Erro ao gerar arquivo de críticas: "+ex.getMessage());
            return "";
        }
    }



}
