package model.korisnici;

import java.io.Serializable;

public class Agent extends Korisnik implements Serializable {
    private static final long serialVersionUID = 1L;
    public Agent(String ime, String prezime, String sifra) {
        super(ime, prezime, sifra);
    }
}
