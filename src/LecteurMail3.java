public class LecteurMail3 extends LecteurMail{
    private StrategieSuivant strategieSuivant;
    /*
    LecteurMail3(String expediteur) {
        super(expediteur);
    }
    */

    /*****réécrire*****/
    LecteurMail3(BoiteMail boiteMail, StrategieSuivant strategieSuivant){
        super(boiteMail);
        this.setStrategieSuivant(strategieSuivant);
    }

    void setStrategieSuivant(StrategieSuivant strategieSuivant){
        this.strategieSuivant = strategieSuivant;
    }

    void suivant (){
        this.strategieSuivant.suivant(this);
    }
}
