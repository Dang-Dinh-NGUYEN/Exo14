public class LecteurMail {
/*
    private Mail lesMails [] = new Mail [100];
    private int nbMails ;
    private int courant ; // indice d ’ un mail dans le tableau lesMails
    private String expediteur ;
    private Serveur serveur = new Serveur () ; // serveur de mails
    LecteurMail ( String expediteur ) {
        this . expediteur = expediteur ;
    }
    Mail getCourant () { return lesMails [ courant ]; } // le mail courant
    String getExpediteur () { return expediteur ; }
    Serveur getServeur () { return serveur ; }

    void recoit ( Mail m ) {
        lesMails [ nbMails ] = m ;
        nbMails ++;
    }
    void lit () { // lit le mail courant
        lesMails [ courant ]. affiche () ;
    }
    void suivant () { // passe au mail suivant ( dans le tableau )
        if ( nbMails == 0)
            System . out . println ( " Pas de mails " ) ;
        else {
            courant ++;
            if ( courant == nbMails )
                courant = 0;
        }
    }
    void ecrit ( String expediteur , String destinataire , String sujet , String contenu ) {
        serveur.envoie( new Mail ( expediteur , destinataire , sujet , contenu ) ) ;
    }
    void repond ( String reponse ) { // repond au mail courant
        ecrit ( expediteur , lesMails [ courant ]. getAuteur () ,
                " Re : " + lesMails [ courant ]. getSujet () ,
                lesMails [ courant ]. getContenu () + reponse ) ;
    }
    void transfere ( String destinataire ) { // transfere le mail courant
        ecrit ( expediteur , destinataire , " Tr : " + lesMails [ courant ]. getSujet () ,
                lesMails [ courant ]. getContenu () ) ;
    }

    /*On peut considérer que la classe LecteurMail s’occupe d’au moins deux aspects dont chacun peut
    changer : la mémorisation des mails et leur consultation. Alors, de ce point de vue, elle a violé le Single Responsibility Principle */

    /************************************************    réécrire   ***************************************************/

    private BoiteMail boiteMail;
    private Serveur serveur =  new Serveur();
    private int courant;
    LecteurMail(BoiteMail boiteMail){
        this.boiteMail = boiteMail;
    }

    Serveur getServeur () { return serveur ; }

    Mail getCourant(){ return boiteMail.getMail(boiteMail.getNbMails());}

    void suivant(){
        if ( boiteMail.getNbMails() == 0)
            System.out.println("Pas de mails") ;
        else {
            courant ++;
            if ( courant == boiteMail.getNbMails())
                courant = 0;
        }
    }

    void lit(){
        getCourant().affiche();
        getCourant().setLu();
    }
    void ecrit (String destinataire , String sujet , String contenu){
        boiteMail.ecrit(destinataire,sujet,contenu);
    }

    void repond ( String reponse ) { // repond au mail courant
        boiteMail.ecrit(getCourant().getAuteur (), " Re : " + getCourant().getSujet (),getCourant().getContenu() + reponse);
    }
    void transfere ( String destinataire ) { // transfere le mail courant
        boiteMail.ecrit(destinataire, " Tr : " + getCourant().getSujet (),getCourant().getContenu());
    }

    /*Après ayant réécrit les classe de LecteurMail(2/3), BoiteMail, BoiteMailTableau,... les principes de SOLID sont bien respectés:
    * - Single Responsibility: chaque classe a une seule responsabilité: les classes lecteur se serve à consulter le mail
    * au courant uniquement, la gestion de mails est effectué par la BoiteMail et le stratégie de lecture est stocké dans StrategieSuivant.
    * - Open/Close: Grace au respect de SRP, on peut consulter et modifier une classe/ un comportement discrètement sans violé les autres
    * classes et le fonctionnement du programme.
    * - Dependency Inverse: tous dépendent d'abstractions */
}
