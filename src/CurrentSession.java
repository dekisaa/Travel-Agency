import model.korisnici.Klijent;
import model.korisnici.Korisnik;
import model.zakupljivanje.Paket;

public class CurrentSession {

    private Boolean prijavljen;
    private Boolean klijent;
    private Korisnik korisnik;
    private Paket paket;

    private static CurrentSession instance = null;

    public static CurrentSession getInstance(){
        if(instance ==null){
            instance = new CurrentSession();
            return instance;
        }

        return instance;
    }

    private CurrentSession(){
        prijavljen = false;
        klijent = true;
        paket = null;
    }

    public Boolean getPrijavljen() {
        return prijavljen;
    }

    public void setPrijavljen(Boolean prijavljen) {
        this.prijavljen = prijavljen;
    }

    public Boolean getKlijent() {
        return klijent;
    }

    public void setKlijent(Boolean klijent) {
        this.klijent = klijent;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Paket getPaket() {
        return paket;
    }

    public void setPaket(Paket paket) {
        this.paket = paket;
    }
}
