package Dao;

import java.sql.*;

public class ClienteDao {

    ConexaoBD conexao = new ConexaoBD();

    public void consultaCliente (long idCliente) throws SQLException {
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
