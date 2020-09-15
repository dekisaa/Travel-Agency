package model.zakupljivanje;

import model.prevozno_sredstvo.PrevoznoSredstvo;
import model.smestaj.Smestaj;

import java.io.Serializable;
import java.util.Date;

public class Aranzman implements Serializable {

    private static final long serialVersionUID = 1L;
    private Boolean saOsiguranjem;
    private Boolean grupni;
    private Date datumPolaska;
    private Date datumPovratka;
    private PrevoznoSredstvo prevoznoSredstvo;
    private Smestaj smestaj;

    public Aranzman() {
    }

    @Override
    public String toString() {
        return "--------Aranzman---------" + "\n" +
                "Putno Osiguranje: " + saOsiguranjem + "\n" +
                "Grupno Putovanje: " + grupni + "\n" +
                "Datum Putovanja: " + datumPolaska + "\n" +
                "Datum Povratka: " + datumPovratka + "\n" +
                "Prevozno Sredstvo: " + prevoznoSredstvo + "\n"+
                "Smestaj: " + smestaj;
    }

    public Boolean getSaOsiguranjem() {
        return saOsiguranjem;
    }

    public void setSaOsiguranjem(Boolean saOsiguranjem) {
        this.saOsiguranjem = saOsiguranjem;
    }

    public Boolean getGrupni() {
        return grupni;
    }

    public void setGrupni(Boolean grupni) {
        this.grupni = grupni;
    }

    public Date getDatumPolaska() {
        return datumPolaska;
    }

    public void setDatumPolaska(Date datumPolaska) {
        this.datumPolaska = datumPolaska;
    }

    public Date getDatumPovratka() {
        return datumPovratka;
    }

    public void setDatumPovratka(Date datumPovratka) {
        this.datumPovratka = datumPovratka;
    }

    public PrevoznoSredstvo getPrevoznoSredstvo() {
        return prevoznoSredstvo;
    }

    public void setPrevoznoSredstvo(PrevoznoSredstvo prevoznoSredstvo) {
        this.prevoznoSredstvo = prevoznoSredstvo;
    }

    public Smestaj getSmestaj() {
        return smestaj;
    }

    public void setSmestaj(Smestaj smestaj) {
        this.smestaj = smestaj;
    }
}
