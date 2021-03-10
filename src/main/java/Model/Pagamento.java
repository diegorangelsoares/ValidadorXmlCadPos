package Model;

public class Pagamento {

    public int id;
    public String Dtpgtofatfchdant;
    public String VlPgtoFatFchDant;
    public String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDtpgtofatfchdant() {
        return Dtpgtofatfchdant;
    }

    public void setDtpgtofatfchdant(String dtpgtofatfchdant) {
        Dtpgtofatfchdant = dtpgtofatfchdant;
    }

    public String getVlPgtoFatFchDant() {
        return VlPgtoFatFchDant;
    }

    public void setVlPgtoFatFchDant(String vlPgtoFatFchDant) {
        VlPgtoFatFchDant = vlPgtoFatFchDant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", Dtpgtofatfchdant='" + Dtpgtofatfchdant + '\'' +
                ", VlPgtoFatFchDant='" + VlPgtoFatFchDant + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
