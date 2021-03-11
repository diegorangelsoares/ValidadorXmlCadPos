package Control;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Diego Rangel
 */
public class Log {

    public static String gerarArquivoLog(String erro, String nomeArquivo){

        String nomeDoArquivo = LerArquivoXML.CAMINHO_ARQUIVOS+new Date()+nomeArquivo+".txt";
        BufferedWriter buffWrite = null;
        String linha = "";
        try {
            buffWrite = new BufferedWriter(new FileWriter(nomeDoArquivo));
            buffWrite.append(erro);
            buffWrite.close();
            return nomeDoArquivo;
        } catch (IOException ex) {
            System.out.println("Erro ao gerar arquivo de log: "+ex.getMessage());
            return "";
        }
    }
}
