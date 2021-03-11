package Dao;

import java.sql.*;

/**
 *
 * @author Diego Rangel
 */
public class ClienteDao {

    ConexaoBD conexao = new ConexaoBD();

    public void consultaClientePorId (long idCliente) throws SQLException {
        Connection conn = conexao.conectaBanco();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FroM T_CLIENTETITULARPESSOAFISICA CLI" +
                                                            " WHERE CLI.IDCLIENTETITULARPESSOAFISICA = "+idCliente+"");
        ResultSet rs = stmt.executeQuery();
        //Preenche os dados
        while (rs.next()){
            String IDCLIENTETITULARPESSOAFISICA = rs.getString("IDCLIENTETITULARPESSOAFISICA");
            System.out.println("IDCLIENTETITULARPESSOAFISICA: "+IDCLIENTETITULARPESSOAFISICA);
        }
        conexao.desconectaBanco(conn);
    }

    public boolean consultaClientePorCPFeCartao (String cpf, String finalNumeroCartao) throws SQLException {
        boolean clienteEncontrato = false;
        Connection conn = conexao.conectaBanco();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM T_CLIENTETITULARPESSOAFISICA CLI, T_CARTAOLOJA CA, T_PESSOAFISICA PF\n" +
                "     WHERE CLI.IDCLIENTETITULARPESSOAFISICA = CA.IDCLIENTEPESSOAFISICA\n" +
                "        AND CLI.IDCLIENTETITULARPESSOAFISICA = PF.IDPESSOAFISICA\n" +
                "        AND PF.CPF = '"+cpf+"'\n" +
                "        AND CA.NUMEROTRUNCADO IS NOT NULL\n" +
                "        AND SUBSTR(CA.NUMEROTRUNCADO, 13, 17) = '"+finalNumeroCartao+"'");
        ResultSet rs = stmt.executeQuery();
        //Preenche os dados
        while (rs.next()){
            String IDCLIENTETITULARPESSOAFISICA = rs.getString("IDCLIENTETITULARPESSOAFISICA");
            System.out.println("IDCLIENTETITULARPESSOAFISICA: "+IDCLIENTETITULARPESSOAFISICA);
            if (IDCLIENTETITULARPESSOAFISICA != null && !IDCLIENTETITULARPESSOAFISICA.equals("")){
                clienteEncontrato = true;
            }
        }
        conexao.desconectaBanco(conn);
        return clienteEncontrato;
    }

    public String consultaSaldoFaturaAtivaCliente (long idCliente) throws SQLException {
        Connection conn = conexao.conectaBanco();
        PreparedStatement stmt = conn.prepareStatement("SELECT FAT.VALORTOTAL SALDO" +
                " FroM T_FATURA FAT " +
                " WHERE FAT.IDCLIENTETITULARPESSOAFISICA = "+idCliente+"" +
                " AND FAT.ATIVA = 'S'");
        ResultSet rs = stmt.executeQuery();
        String saldo = "0";
        //Preenche os dados
        while (rs.next()){
            saldo = rs.getString("SALDO");
            System.out.println("SALDO: "+saldo);
        }
        conexao.desconectaBanco(conn);
        return saldo;
    }


}
