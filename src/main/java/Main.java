import Control.ConciliaXmlVsCards;
import Control.Configuracoes;
import Control.LerArquivoXML;
import Dao.ClienteDao;
import Dao.ConexaoBD;
import Model.Cliente;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

/**
 *
 * @author Diego Rangel
 */
public class Main {

    public static void main(String[] args) throws SQLException {


        ClienteDao clienteDao = new ClienteDao();

        LerArquivoXML ler = new LerArquivoXML();

        List<Cliente> clientes = new ArrayList<>();

        clientes = ler.percorreArquivo(Configuracoes.CAMINHO_ARQUIVOS+Configuracoes.NOME_ARQUIVO_XML);

        if (clientes != null && !clientes.isEmpty()){
            ConciliaXmlVsCards conciliaXmlVsCards = new ConciliaXmlVsCards();
            conciliaXmlVsCards.consultaCardsParaBatimentos(clientes);
        }

        System.out.println("Total de Clientes: "+clientes.size());

    }
}
