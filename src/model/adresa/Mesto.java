package model.adresa;

import java.io.Serializable;

public class Mesto implements Serializable {

    private static final long serialVersionUID = 1L;
    private String naziv;
    private Drzava drzava;

    public Mesto(String naziv, Drzava drzava) {
        this.naziv = naziv;
        this.drzava = drzava;
    }

    @Override
    public String toString() {
        return naziv + " " + drzava;
    }

    public Mesto(){

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }
}
