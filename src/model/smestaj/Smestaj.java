package model.smestaj;

import model.adresa.Adresa;
import model.zakupljivanje.Zakupljivo;

import java.io.Serializable;

public class Smestaj implements Zakupljivo, Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2321282974102907565L;
	private Float povrsina;
    private Integer brojKreveta;
    private TipPansiona tipPansiona;
    private Adresa adresa;

    @Override
    public Double zakupi() {
        Double cena = 0.00;
        switch (tipPansiona){
            case NOCENJE:
                cena = 1200.00;
                break;
            case NOCENJE_SA_DORUCKOM:
                cena = 1700.00;
                break;
            case POLUPANSION:
                cena = 2100.00;
                break;
            case PUN_PANSION:
                cena = 2800.00;
                break;
            case ALL_INCLUSIVE:
                cena = 3600.00;
                break;
            default:
                cena = 0.00;
                break;
        }
        return cena;
    }

    @Override
    public String toString() {
        return "--------Smestaj--------" + "\n" +
                "Povrsina: " + povrsina + "\n" +
                "Broj kreveta: " + brojKreveta + "\n" +
                "Tip Pansiona: " + tipPansiona + "\n" +
                "Adresa: " + adresa;
    }

    public void ispisSmestaja(){
        System.out.println("----------------Smestaj-----------------" + "\n"
                + "   Drzava: " + getAdresa().getMesto().getDrzava().getNaziv() + " "
                + "," + getAdresa().getMesto().getNaziv() + "\n" +
                "   Ulica: " + getAdresa().getUlica() + " " + getAdresa().getBroj() + "\n" +
                "----------------Specifikacije-----------------" + "\n" +
                "   Povrsina: " + getPovrsina() + "\n" +
                "   Broj kreveta: " + getBrojKreveta() + "\n" +
                "   Tip Pansiona: " + getTipPansiona());
    }

    @Override
    public void otkazi() {
        System.out.println("Troskovi se umanjuju za: " + zakupi() + " dinara");

    }

    public Float getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(Float povrsina) {
        this.povrsina = povrsina;
    }

    public Integer getBrojKreveta() {
        return brojKreveta;
    }

    public void setBrojKreveta(Integer brojKreveta) {
        this.brojKreveta = brojKreveta;
    }

    public TipPansiona getTipPansiona() {
        return tipPansiona;
    }

    public void setTipPansiona(TipPansiona tipPansiona) {
        this.tipPansiona = tipPansiona;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }
}
