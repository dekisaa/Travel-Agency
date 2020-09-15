package model.adresa;

import java.io.Serializable;
import java.util.List;

public class Drzava implements Serializable {

    private static final long serialVersionUID = 1L;
    private String naziv;
    private List<Mesto> mesta;

    @Override
    public String toString(){
        return naziv;
    }

    public Drzava(){

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Mesto> getMesta() {
        return mesta;
    }

    public void setMesta(List<Mesto> mesta) {
        this.mesta = mesta;
    }
}
