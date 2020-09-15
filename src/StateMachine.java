
enum State {
    NIJE_PRIJAVLJEN,
    MENI_PRIJAVLJEN,
    UPLATA_NOVCA,
    KREIRANJE_ARANZMANA,
    KREIRANJE_PAKETA,
    KREIRANJE_PAKETA_STEP2,
    BRISANJE_ARANZMANA,
    ZAKUPLJIVANJE_PAKETA,
    OTKAZIVANJE_PAKETA
}

public class StateMachine {

    private State state;

    private static StateMachine instance = null;

    public static StateMachine getInstance(){
        if(instance ==null){
            instance = new StateMachine();
            return instance;
        }

        return instance;
    }

    private StateMachine(){
        state = State.NIJE_PRIJAVLJEN;
    }

    public void setState(State state){
        this.state = state;
    }

    public void handleState(){
        switch (state){
            case NIJE_PRIJAVLJEN:
                Meni.getInstance().ispisiMeni();
                break;
            case MENI_PRIJAVLJEN:
                Meni.getInstance().ispisiMeniUlogovan();
                break;
            case UPLATA_NOVCA:
                Meni.getInstance().ispisiUplataNovca();
                break;
            case KREIRANJE_ARANZMANA:
                Meni.getInstance().ispisiMeniKreiranjeAranzmana();
                break;
            case BRISANJE_ARANZMANA:
                Meni.getInstance().ispisiMeniBrisanjeAranzmana();
                break;
            case KREIRANJE_PAKETA:
                Meni.getInstance().ispisiMeniKreiranjePaketa();
                break;
            case KREIRANJE_PAKETA_STEP2:
                Meni.getInstance().ispisiMeniKreiranjePaketaStep2();
                break;
            case ZAKUPLJIVANJE_PAKETA:
                Meni.getInstance().ispisiMeniZakupljivanjePaketa();
                break;
            case OTKAZIVANJE_PAKETA:
                Meni.getInstance().ispisimeniZaOtkazivanjePaketa();
                break;
            default:

        }
    }

}
