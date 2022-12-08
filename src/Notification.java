public class Notification extends BoiteMailTableau{
    private BoiteMailTableau boiteMail;
    Notification(BoiteMailTableau boiteMail) {
        super(boiteMail.getExpediteur());
        this.boiteMail = boiteMail;
    }

    @Override
    Mail getMail(int i) {
        return boiteMail.getMail(i);
    }

    @Override
    void recoit(Mail m) {
        boiteMail.recoit(m);
        System.out.println("Un nouveau mail est arrivé");
    }
}
