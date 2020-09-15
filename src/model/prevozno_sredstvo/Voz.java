package model.prevozno_sredstvo;

public class Voz extends PrevoznoSredstvo {

    private KlasaVoznogMesta klasaVoznogMesta;

    @Override
    public Double zakupi() {
        if(klasaVoznogMesta == KlasaVoznogMesta.PRVI_RAZRED)
            return super.zakupi() + 210;
        else if(klasaVoznogMesta == KlasaVoznogMesta.SPAVACA_KOLA)
            return  super.zakupi() + 1000;
        else
            return super.zakupi();
    }

    @Override
    public void otkazi() {
        System.out.println("Troskovi se umanjuju za: " + zakupi() + " dinara");
    }

    public KlasaVoznogMesta getKlasaVoznogMesta() {
        return klasaVoznogMesta;
    }

    public void setKlasaVoznogMesta(KlasaVoznogMesta klasaVoznogMesta) {
        this.klasaVoznogMesta = klasaVoznogMesta;
    }
}
