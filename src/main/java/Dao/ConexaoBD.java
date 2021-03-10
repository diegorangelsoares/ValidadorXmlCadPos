package Dao;


import oracle.jdbc.pool.OracleDataSource;

import java.sql.*;
//import oracle.jdbc.pool.OracleDataSource;



public class ConexaoBD {


    public String usuarioOracle = "bandeira";
    public String senhaOracle = "bandeira";
    public String urlOracle = "localhost"; //"172.30.0.250"
    public String portaOracle = "1521";
    public String servicoOracle = "ORCLCDB";

    public Connection conectaBanco(){
            OracleDataSource ods;

            String url = "jdbc:oracle:thin:@"+urlOracle+":"+portaOracle+":"+servicoOracle+"";
            try {
                ods = new OracleDataSource();
                String porta = "1521";
                ods.setURL(url);
                ods.setUser(usuarioOracle);
                ods.setPassword(senhaOracle);
                Connection conn = ods.getConnection();
                return conn;
            }catch( SQLException e){ //trata os erros SQL
                System.out.println("Erro na consulta ao banco: "+e.getMessage());
                return null;
            }
    }

    public void desconectaBanco(Connection con) throws SQLException {
        try{
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }



}
