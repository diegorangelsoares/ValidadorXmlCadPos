package Control;

import Dao.ClienteDao;
import Model.Cliente;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Diego Rangel
 */
public class ConciliaXmlVsCards {

    public void consultaCardsParaBatimentos(List<Cliente> clientes) throws SQLException {

        String criticas = "";
        ClienteDao clienteDao = new ClienteDao();

        for (Cliente cli: clientes){

            System.out.println("Consultando cliente no cards...");
            int idCliente = clienteDao.consultaClientePorCPFeCartao(cli.getIdfcCli(), cli.getOperacao().getNrPlstCrt());
            if (idCliente != 0){
                //Percorrer para verificar as faturas e pagamentos
                String saldo = clienteDao.consultaSaldoFaturaAtivaCliente(idCliente);

                //String string = "abcdef";
                String saldoNoArquivo = cli.getOperacao().getSdoDvdr();
                StringBuilder stringBuilder = new StringBuilder(saldoNoArquivo);
                stringBuilder.insert(saldoNoArquivo.length() - 2, '.');
                //System.out.println(stringBuilder.toString());
                saldoNoArquivo = stringBuilder.toString();

                if (!saldo.equals(saldoNoArquivo)){
                    criticas = criticas + "Saldo do cliente: "+cli.getIdfcCli()+" incorreto. Saldo no cards: "+saldo+" Saldo no arquivo: "+saldoNoArquivo+"\n";
                }

            }else{
                criticas = criticas + "Cliente nao encontrato. CPF: "+cli.getIdfcCli()+" Final cartão: "+cli.getOperacao().getNrPlstCrt()+"\n";
            }


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
