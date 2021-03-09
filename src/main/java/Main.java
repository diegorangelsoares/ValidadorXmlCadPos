import Control.LerArquivoXML;
import Dao.ClienteDao;
import Dao.ConexaoBD;
import Model.Cliente;

import java.sql.SQLException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws SQLException {

        String nomeArquivo = "teste.xml";

        ClienteDao clienteDao = new ClienteDao();

        String caminhoPasta = "/home/local/CONDUCTOR/diego.freire/Documentos/XMLsPositivo/";

        LerArquivoXML ler = new LerArquivoXML();

        List<Cliente> clientes = new ArrayList<>();

        clientes = ler.percorreArquivo(caminhoPasta+nomeArquivo);
        System.out.println("Clientes:\n");
        for (Cliente cli: clientes){
            //System.out.println(cli.toString(cli));
            System.out.println(cli.toString());
            System.out.println("Consultando cliente no cards...");

            clienteDao.consultaCliente(Long.parseLong(cli.IdfcCli));
            String saldo = clienteDao.consultaSaldoFaturaAtivaCliente(Long.parseLong(cli.IdfcCli));
            System.out.println("Saldo no cards: "+saldo);

        }
        System.out.println("Total de Clientes: "+clientes.size());



    }
}
