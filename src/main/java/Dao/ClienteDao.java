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
            //System.out.println("IDCLIENTETITULARPESSOAFISICA: "+IDCLIENTETITULARPESSOAFISICA);
        }
        conexao.desconectaBanco(conn);
    }

    public int consultaClientePorCPFeCartao (String cpf, String finalNumeroCartao) throws SQLException {
        int idCliente = 0;
        Connection conn = conexao.conectaBanco();
        String query = "SELECT DISTINCT (PF.IDPESSOAFISICA) IDPESSOAFISICA " +
                "   FROM T_CARTAOLOJA CA, T_PESSOAFISICA PF\n" +
                "     WHERE PF.IDPESSOAFISICA = CA.IDCLIENTEPESSOAFISICA\n" +
                "        AND PF.CPF = '"+cpf+"'\n" +
                "        AND CA.NUMEROTRUNCADO IS NOT NULL\n" +
                "        AND SUBSTR(CA.NUMEROTRUNCADO, 13, 17) = '"+finalNumeroCartao+"'";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        //Preenche os dados
        while (rs.next()){
            String IDPESSOAFISICA = rs.getString("IDPESSOAFISICA");
            //System.out.println("IDPESSOAFISICA: "+IDPESSOAFISICA);
            if (IDPESSOAFISICA != null && !IDPESSOAFISICA.equals("")){
                idCliente = Integer.parseInt(IDPESSOAFISICA);
            }
        }
        conexao.desconectaBanco(conn);
        return idCliente;
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
            //System.out.println("SALDO: "+saldo);
        }
        conexao.desconectaBanco(conn);
        return saldo;
    }


}
