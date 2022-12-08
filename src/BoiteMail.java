public abstract class BoiteMail {
    private int nbMails ;
    private String expediteur ;
    private Serveur serveur = new Serveur () ;
    BoiteMail ( String expediteur ) {
        this . expediteur = expediteur ;
    }
    abstract Mail getMail ( int i ) ;
    String getExpediteur () { return expediteur ; }
    int getNbMails () { return nbMails ;}
    void setNbMails ( int n ) { nbMails = n ; }
    abstract void recoit ( Mail m ) ;
    void ecrit ( String destinataire,String sujet,String contenu){
        serveur.envoie(new Mail(expediteur,destinataire,sujet,contenu));
    }
}
