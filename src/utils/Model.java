package utils;

import model.adresa.Adresa;
import model.adresa.Drzava;
import model.adresa.Mesto;
import model.korisnici.Korisnik;
import model.smestaj.Apartman;
import model.smestaj.Hotel;
import model.zakupljivanje.Aranzman;
import model.zakupljivanje.Paket;

import java.io.IOException;
import java.util.ArrayList;

public class Model {

    private ArrayList<Adresa> adrese;
    private ArrayList<Drzava> drzave;
    private ArrayList<Korisnik> korisnici;
    private ArrayList<Mesto> mesta;
    private ArrayList<Apartman> apartmani;
    private ArrayList<Hotel> hoteli;
    private ArrayList<Paket> paketi;

    private ArrayList<Aranzman> aranzmani;

    private static Model instance = null;

    public static Model getInstance(){
        if(instance ==null){
            instance = new Model();
            return instance;
        }

        return instance;
    }

    private Model(){
        this.adrese = Pomocnaklasa.citajIzFajlaAdresa("fajlovi/adrese");
        this.drzave = Pomocnaklasa.citajIzFajlaDrzava("fajlovi/drzave");
        this.korisnici = Pomocnaklasa.citajIzFajlaKorisnik("fajlovi/korisnici");
        this.mesta = Pomocnaklasa.citajIzFajlaMesto("fajlovi/mesta");
        this.apartmani = Pomocnaklasa.citajIzFajlaApartmani("fajlovi/apartmani");
        this.hoteli = Pomocnaklasa.citajIzFajlaHotel("fajlovi/hoteli");
        this.aranzmani = Pomocnaklasa.citajIzFajlaAranzmani("fajlovi/aranzmani");
        this.paketi = Pomocnaklasa.citajIzFajlaPaketi("fajlovi/paketi");
    }

    public void snimiModel() throws IOException {
        Pomocnaklasa.upisiUFajlAdresa(adrese);
        Pomocnaklasa.upisiUFajlDrzave(drzave);
        Pomocnaklasa.upisiUFajlKorisnik(korisnici);
        Pomocnaklasa.upisiUFajlMesta(mesta);
        Pomocnaklasa.upisiUFajlApartmani(apartmani);
        Pomocnaklasa.upisiUFajlHotel(hoteli);
        Pomocnaklasa.upisiUFajlAranzmani(aranzmani);
        Pomocnaklasa.upisiUFajlPaketi(paketi);
    }

    public ArrayList<Adresa> getAdrese() {
        return adrese;
    }

    public void setAdrese(ArrayList<Adresa> adrese) {
        this.adrese = adrese;
    }

    public ArrayList<Drzava> getDrzave() {
        return drzave;
    }

    public void setDrzave(ArrayList<Drzava> drzave) {
        this.drzave = drzave;
    }

    public ArrayList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ArrayList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public ArrayList<Mesto> getMesta() {
        return mesta;
    }

    public void setMesta(ArrayList<Mesto> mesta) {
        this.mesta = mesta;
    }

    public static void setInstance(Model instance) {
        Model.instance = instance;
    }

    public ArrayList<Apartman> getApartmani() {
        return apartmani;
    }

    public void setApartmani(ArrayList<Apartman> apartmani) {
        this.apartmani = apartmani;
    }

    public ArrayList<Hotel> getHoteli() {
        return hoteli;
    }

    public void setHoteli(ArrayList<Hotel> hoteli) {
        this.hoteli = hoteli;
    }

    public ArrayList<Aranzman> getAranzmani() {
        return aranzmani;
    }

    public void setAranzmani(ArrayList<Aranzman> aranzmani) {
        this.aranzmani = aranzmani;
    }

    public ArrayList<Paket> getPaketi() {
        return paketi;
    }

    public void setPaketi(ArrayList<Paket> paketi) {
        this.paketi = paketi;
    }
}
