package Model;

public class Cliente {

    public String IdfcCli;
    public String NmCli;
    public String NtzRlc;
    public String TipCli;
    public boolean statusMontagemCliente;

    public Operacao operacao;

    public String getIdfcCli() {
        return IdfcCli;
    }

    public void setIdfcCli(String idfcCli) {
        IdfcCli = idfcCli;
    }

    public String getNmCli() {
        return NmCli;
    }

    public void setNmCli(String nmCli) {
        NmCli = nmCli;
    }

    public String getNtzRlc() {
        return NtzRlc;
    }

    public void setNtzRlc(String ntzRlc) {
        NtzRlc = ntzRlc;
    }

    public String getTipCli() {
        return TipCli;
    }

    public void setTipCli(String tipCli) {
        TipCli = tipCli;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public boolean isStatusMontagemCliente() {
        return statusMontagemCliente;
    }

    public void setStatusMontagemCliente(boolean statusMontagemCliente) {
        this.statusMontagemCliente = statusMontagemCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "IdfcCli='" + IdfcCli + '\'' +
                ", NmCli='" + NmCli + '\'' +
                ", NtzRlc='" + NtzRlc + '\'' +
                ", TipCli='" + TipCli + '\'' +
                ", statusMontagemCliente=" + statusMontagemCliente +
                ", operacao=" + operacao +
                '}';
    }

    public String toString(Cliente c) {
        return "Cliente{" +
                "IdfcCli='" + c.getIdfcCli() + '\'' +
                ", NmCli='" + c.getNmCli() + '\'' +
                ", NtzRlc='" + c.getNtzRlc() + '\'' +
                ", TipCli='" + c.getTipCli() + '\'' +
                ", operacao=" + c.getOperacao() +
                '}';
    }
}
