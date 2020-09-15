import model.korisnici.Agent;
import model.korisnici.Korisnik;
import utils.Model;
import utils.Pomocnaklasa;

import java.util.ArrayList;

public class Autentifikacija {

    public Autentifikacija(){

    }

    public Boolean autentifikuj(String korisnicko_ime, String sifra){
        ArrayList<Korisnik> korisnici = Model.getInstance().getKorisnici();
        for(Korisnik k : korisnici){
            if(k.getIme().equals(korisnicko_ime) && k.getSifra().equals(sifra)){
                if(k instanceof Agent){
                    CurrentSession.getInstance().setKlijent(false);
                    CurrentSession.getInstance().setKorisnik(k);
                }else{
                    CurrentSession.getInstance().setKlijent(true);
                    CurrentSession.getInstance().setKorisnik(k);
                }
                StateMachine.getInstance().setState(State.MENI_PRIJAVLJEN);
                return true;
            }
        }
        System.out.println("Pogresno ime ili lozinka");
        return false;
    }
}
