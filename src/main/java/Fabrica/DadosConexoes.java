package Fabrica;

/**
 *
 * @author Diego Rangel
 */
public class DadosConexoes {

    public static String BASE_URL ="jdbc:oracle:thin:@localhost:1521:ORCLCDB";
    public static String BASE_USUARIO ="bandeira";
    public static String BASE_SENHA ="bandeira";
    public static String BASE_PORTA ="1251";
    public static String BASE_SID ="ORCLCDB";

    public String host;
    public String porta;
    public String usuario;
    public String senha;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
