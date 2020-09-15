package model.adresa;

import java.io.Serializable;

public class Adresa implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ulica;
    private String broj;
    private Mesto mesto;

    public Adresa(){

    }

    @Override
    public String toString() {
        return ulica + " " + broj + " " + mesto;
    }

    public Adresa(String ulica, String broj, Mesto mesto) {
        this.ulica = ulica;
        this.broj = broj;
        this.mesto = mesto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }
}
