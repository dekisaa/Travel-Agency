package model.prevozno_sredstvo;

public class Avion extends PrevoznoSredstvo {

    private KlasaAvionskogMesta klasaAvionskogMesta;

    @Override
    public Double zakupi() {
        if(klasaAvionskogMesta == KlasaAvionskogMesta.BIZNIS)
            return super.zakupi() + 1000;
        else
            return super.zakupi() + 250;
    }

    @Override
    public void otkazi() {
        System.out.println("Troskovi se umanjuju za: " + zakupi() + " dinara");
    }

    public KlasaAvionskogMesta getKlasaAvionskogMesta() {
        return klasaAvionskogMesta;
    }

    public void setKlasaAvionskogMesta(KlasaAvionskogMesta klasaAvionskogMesta) {
        this.klasaAvionskogMesta = klasaAvionskogMesta;
    }
}
