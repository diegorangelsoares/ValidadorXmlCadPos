package Model;

import java.util.List;

/**
 *
 * @author Diego Rangel
 */
public class Operacao {

    public String NrUnco;
    public String DtCtrc;
    public String CdMdld;
    public String DtAprc;

    public String NrPlstCrt;
    public String SdoDvdr;

    public List<Fatura> faturas;

    public String getNrUnco() {
        return NrUnco;
    }

    public void setNrUnco(String nrUnco) {
        NrUnco = nrUnco;
    }

    public String getDtCtrc() {
        return DtCtrc;
    }

    public void setDtCtrc(String dtCtrc) {
        DtCtrc = dtCtrc;
    }

    public String getCdMdld() {
        return CdMdld;
    }

    public void setCdMdld(String cdMdld) {
        CdMdld = cdMdld;
    }

    public String getDtAprc() {
        return DtAprc;
    }

    public void setDtAprc(String dtAprc) {
        DtAprc = dtAprc;
    }

    public String getNrPlstCrt() {
        return NrPlstCrt;
    }

    public void setNrPlstCrt(String nrPlstCrt) {
        NrPlstCrt = nrPlstCrt;
    }

    public String getSdoDvdr() {
        return SdoDvdr;
    }

    public void setSdoDvdr(String sdoDvdr) {
        SdoDvdr = sdoDvdr;
    }

    public List<Fatura> getFaturas() {
        return faturas;
    }

    public void setFaturas(List<Fatura> faturas) {
        this.faturas = faturas;
    }

    @Override
    public String toString() {
        return "Operacao{" +
                "NrUnco='" + NrUnco + '\'' +
                ", DtCtrc='" + DtCtrc + '\'' +
                ", CdMdld='" + CdMdld + '\'' +
                ", DtAprc='" + DtAprc + '\'' +
                ", NrPlstCrt='" + NrPlstCrt + '\'' +
                ", SdoDvdr='" + SdoDvdr + '\'' +
                ", faturas=" + faturas +
                '}';
    }
}
