package model.zakupljivanje;

import model.korisnici.Klijent;
import model.korisnici.Korisnik;

import java.io.Serializable;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Paket implements Zakupljivo, Serializable {

    private static final long serialVersionUID = 1L;
    private Double procentualnaVrednostPovratkaNovca;
    private List<Aranzman> aranzmani;
    private Korisnik kreirao;
    private Klijent zakupio;

    @Override
    public Double zakupi() {
        Double suma = 0.0;
        for(Aranzman a : aranzmani){
            if(a.getPrevoznoSredstvo() != null)
                suma += a.getPrevoznoSredstvo().zakupi();
            if(a.getSmestaj() != null && a.getDatumPolaska() != null &&
                    a.getDatumPovratka() != null)
                suma += a.getSmestaj().zakupi()*(a.getDatumPovratka().getTime()-a.getDatumPolaska().getTime()/ (1000*60*60*24));
        }
        return  suma;
    }

    @Override
    public String toString() {
        String s = "";
        for(Aranzman a: aranzmani){
            s = s + a;
        }
        return s;
    }

    @Override
    public void otkazi() {
        zakupio = null;
    }

    public Double getProcentualnaVrednostPovratkaNovca() {
        return procentualnaVrednostPovratkaNovca;
    }

    public void setProcentualnaVrednostPovratkaNovca(Double procentualnaVrednostPovratkaNovca) {
        this.procentualnaVrednostPovratkaNovca = procentualnaVrednostPovratkaNovca;
    }

    public List<Aranzman> getAranzmani() {
        return aranzmani;
    }

    public void setAranzmani(List<Aranzman> aranzmani) {
        this.aranzmani = aranzmani;
    }

    public Korisnik getKreirao() {
        return kreirao;
    }

    public void setKreirao(Korisnik kreirao) {
        this.kreirao = kreirao;
    }

    public Klijent getZakupio() {
        return zakupio;
    }

    public void setZakupio(Klijent zakupio) {
        this.zakupio = zakupio;
    }
}
