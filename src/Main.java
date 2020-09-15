import model.adresa.Adresa;
import model.adresa.Drzava;
import model.adresa.Mesto;
import model.korisnici.Agent;
import model.korisnici.Klijent;
import model.korisnici.Korisnik;
import model.smestaj.Apartman;
import model.smestaj.Hotel;
import model.smestaj.TipPansiona;
import model.zakupljivanje.Aranzman;
import model.zakupljivanje.Paket;
import utils.Model;
import utils.Pomocnaklasa;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        /*Agent k1 = new Agent("Igor", "Bukva", "igor");
        Agent k2 = new Agent("Nemanja", "Bikarevic", "nemanja");
        Klijent k3 = new Klijent("Pamela", "Anderson", "pamela", 0.00);
        Klijent k4 = new Klijent("Jelena", "Rozga", "rozga", 0.00);
        ArrayList<Korisnik> korisnici = new ArrayList<>();
        korisnici.add(k1);
        korisnici.add(k2);
        korisnici.add(k3);
        korisnici.add(k4);
        Pomocnaklasa.upisiUFajlKorisnik(korisnici);

        ArrayList<Drzava> drzave = new ArrayList<>();
        Drzava d1 = new Drzava();
        d1.setNaziv("Grcka");
        Mesto n1 = new Mesto("Lefkada", d1);
        Mesto n2 = new Mesto("Rodos", d1);
        Mesto n3 = new Mesto("Krf", d1);
        Mesto n4 = new Mesto("Zakintos", d1);
        ArrayList<Mesto> mesta = new ArrayList<>();
        Drzava d2 =new Drzava();
        d2.setNaziv("Srbija");
        Mesto m1 = new Mesto("Novi Sad", d2);
        Mesto m2 = new Mesto("Beograd", d2);
        Mesto m3 = new Mesto("Sombor", d2);
        Mesto m4 = new Mesto("S.Itebej", d2);
        mesta.add(n1);
        mesta.add(n2);
        mesta.add(n3);
        mesta.add(n4);
        mesta.add(m1);
        mesta.add(m2);
        mesta.add(m3);
        mesta.add(m4);
        Pomocnaklasa.upisiUFajlMesta(mesta);
        ArrayList<Mesto> upisivanjeufajl = Pomocnaklasa.citajIzFajlaMesto("fajlovi/mesta");
        ArrayList<Mesto> mestaGRcka = new ArrayList<>();
        ArrayList<Mesto> mestaSrbija = new ArrayList<>();
        for (Mesto m: upisivanjeufajl){
            if(m.getDrzava().equals("Grcka")){
                mestaGRcka.add(m);
            }else{
                mestaSrbija.add(m);
            }
        }

        d1.setMesta(mestaGRcka);
        d2.setMesta(mestaSrbija);

        drzave.add(d1);
        drzave.add(d2);
        Pomocnaklasa.upisiUFajlDrzave(drzave);

        Adresa a1 = new Adresa("Bulevar Evrope","28",m1);
        Adresa a2 = new Adresa("Knezeva", "1", m2);
        ArrayList<Adresa> adresas = new ArrayList<>();
        adresas.add(a1);
        adresas.add(a2);

        Pomocnaklasa.upisiUFajlAdresa(adresas);

        ArrayList<Drzava> radi = Pomocnaklasa.citajIzFajlaDrzava("fajlovi/drzave");
        System.out.println(radi.get(1).getMesta().get(1).getNaziv());
        ArrayList<Apartman> apartmani = new ArrayList<>();
        Apartman a = new Apartman();
        a.setPovrsina((float) 45.1);
        a.setAdresa(a1);
        a.setTipPansiona(TipPansiona.POLUPANSION);
        a.setBrojKreveta(3);
        apartmani.add(a);
        Pomocnaklasa.upisiUFajlApartmani(apartmani);

        ArrayList<Hotel> hotels = new ArrayList<>();
        Hotel hotel = new Hotel();
        hotel.setAdresa(a2);
        hotel.setPovrsina((float) 23);
        hotel.setBrojKreveta(2);
        hotel.setTipPansiona(TipPansiona.ALL_INCLUSIVE);
        hotels.add(hotel);
        Pomocnaklasa.upisiUFajlHotel(hotels);

        Aranzman aranzman = new Aranzman();
        aranzman.setSmestaj(hotel);
        aranzman.setGrupni(false);
        aranzman.setSaOsiguranjem(true);
        ArrayList<Aranzman> aranzmani = new ArrayList<>();
        aranzmani.add(aranzman);
        Pomocnaklasa.upisiUFajlAranzmani(aranzmani);

        Paket paket = new Paket();
        paket.setAranzmani(aranzmani);
        paket.setKreirao(k1);
        paket.setProcentualnaVrednostPovratkaNovca(15.00);
        paket.setZakupio(k4);
        ArrayList<Paket> paketi = new ArrayList<>();
        paketi.add(paket);
        Pomocnaklasa.upisiUFajlPaketi(paketi);*/

        Model.getInstance();

        while(true){
            StateMachine.getInstance().handleState();
        }

    }
}
