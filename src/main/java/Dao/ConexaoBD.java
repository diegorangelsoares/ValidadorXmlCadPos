package Dao;

import Control.Log;
import Fabrica.DadosConexoes;
import oracle.jdbc.pool.OracleDataSource;

import java.sql.*;

/**
 *
 * @author Diego Rangel
 */
public class ConexaoBD {

    public String usuarioOracle;
    public String senhaOracle;
    public String enderecoOracle;
    public String portaOracle;
    public String servicoOracle;

    public ConexaoBD(){
        usuarioOracle = DadosConexoes.BASE_USUARIO;
        senhaOracle = DadosConexoes.BASE_SENHA;
        enderecoOracle = DadosConexoes.BASE_URL;
        portaOracle = DadosConexoes.BASE_PORTA;
        servicoOracle = DadosConexoes.BASE_SID;
    }

    public Connection conectaBanco(){
            OracleDataSource ods;

            String url = "jdbc:oracle:thin:@"+enderecoOracle+":"+portaOracle+":"+servicoOracle+"";
            try {
                ods = new OracleDataSource();
                ods.setURL(url);
                ods.setUser(usuarioOracle);
                ods.setPassword(senhaOracle);
                Connection conn = ods.getConnection();
                return conn;
            }catch( SQLException e){ //trata os erros SQL
                Log.gerarArquivoLog("Erro na consulta ao banco: "+e.getMessage(), "Erro");
                System.out.println("Erro na consulta ao banco: "+e.getMessage());
                return null;
            }
    }

    public void desconectaBanco(Connection con) throws SQLException {
        try{
            con.close();
        } catch (SQLException ex) {
            Log.gerarArquivoLog("Error: "+ex.getMessage(), "Erro");
            System.out.println("Error: "+ex.getMessage());
        }
    }



}
