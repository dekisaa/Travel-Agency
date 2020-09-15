package model.korisnici;

import java.io.Serializable;

public class Korisnik implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ime;
    private String prezime;
    private String sifra;

    public Korisnik(String ime, String prezime, String sifra) {
        this.ime = ime;
        this.prezime = prezime;
        this.sifra = sifra;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
