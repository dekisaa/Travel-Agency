package model.korisnici;

import java.io.Serializable;

public class Klijent extends Korisnik implements Serializable {

    private static final long serialVersionUID = 1L;
    private Double raspolozivoStanje;

    public Klijent(String ime, String prezime, String sifra, Double raspolozivoStanje) {
        super(ime, prezime, sifra);
        this.raspolozivoStanje = raspolozivoStanje;
    }

    public Double getRaspolozivoStanje() {
        return raspolozivoStanje;
    }

    public void setRaspolozivoStanje(Double raspolozivoStanje) {
        this.raspolozivoStanje = raspolozivoStanje;
    }
}
