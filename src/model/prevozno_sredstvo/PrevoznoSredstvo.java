package model.prevozno_sredstvo;

import model.adresa.Adresa;
import model.zakupljivanje.Zakupljivo;

import java.io.Serializable;

public class PrevoznoSredstvo implements Zakupljivo,Serializable {

    private Boolean ukljucenObrok;
    private Adresa polaznaAdresa;
    private Adresa odredisnaAdresa;

    @Override
    public Double zakupi() {
        Double cena = 0.0;
        if(ukljucenObrok)
            cena += 540;
        cena += 640;
        return cena;
    }

    @Override
    public String toString() {
        String string = "DA";
        if(!ukljucenObrok)
            string = "NE";
        return "Polazna Adresa: " + polaznaAdresa + "\n" +
                "Odredisna Adresa: " + odredisnaAdresa + "\n" +
                "Da li je ukljucen obrok: " + string;
    }

    @Override
    public void otkazi() {
        System.out.println("Troskovi se umanjuju za: " + zakupi() + " dinara");
    }

    public Boolean getUkljucenObrok() {
        return ukljucenObrok;
    }

    public void setUkljucenObrok(Boolean ukljucenObrok) {
        this.ukljucenObrok = ukljucenObrok;
    }

    public Adresa getPolaznaAdresa() {
        return polaznaAdresa;
    }

    public void setPolaznaAdresa(Adresa polaznaAdresa) {
        this.polaznaAdresa = polaznaAdresa;
    }

    public Adresa getOdredisnaAdresa() {
        return odredisnaAdresa;
    }

    public void setOdredisnaAdresa(Adresa odredisnaAdresa) {
        this.odredisnaAdresa = odredisnaAdresa;
    }
}
