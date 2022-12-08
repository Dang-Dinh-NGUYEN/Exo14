public class LecteurMail2 extends LecteurMail{
    /*
    LecteurMail2(String expediteur) {
        super(expediteur);
    }
    */

    /*****réécrire*****/
    LecteurMail2(BoiteMail boiteMail){
        super(boiteMail);
    }

    void suivant () { // passe au mail suivant ( dans le tableau ) et lit automatiquement
        super.suivant();
        try {
            lit();
        }catch (NullPointerException ignored){}
    }
}

