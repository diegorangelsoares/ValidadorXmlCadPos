package Model;

import java.util.List;

public class Fatura {

    public static String TIPO_ANTERIOR = "A";
    public static String TIPO_FUTURA = "F";

    public int id;
    public String DtVnctFatFchdAnt;
    public String VlTtlPgrFatFchdAnt;
    public String VlMinPgrFatFchdAnt;
    public String Tipo;

    public List<Pagamento> pagamentos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDtVnctFatFchdAnt() {
        return DtVnctFatFchdAnt;
    }

    public void setDtVnctFatFchdAnt(String dtVnctFatFchdAnt) {
        DtVnctFatFchdAnt = dtVnctFatFchdAnt;
    }

    public String getVlTtlPgrFatFchdAnt() {
        return VlTtlPgrFatFchdAnt;
    }

    public void setVlTtlPgrFatFchdAnt(String vlTtlPgrFatFchdAnt) {
        VlTtlPgrFatFchdAnt = vlTtlPgrFatFchdAnt;
    }

    public String getVlMinPgrFatFchdAnt() {
        return VlMinPgrFatFchdAnt;
    }

    public void setVlMinPgrFatFchdAnt(String vlMinPgrFatFchdAnt) {
        VlMinPgrFatFchdAnt = vlMinPgrFatFchdAnt;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
