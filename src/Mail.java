
public class Mail {
    private String auteur ;
    private String destinataire ;
    private String sujet ;
    private String contenu ;
    private boolean lu ;
    Mail ( String auteur , String destinataire , String sujet , String contenu ) {
        this . auteur = auteur ;
        this . destinataire = destinataire ;
        this . sujet = sujet ;
        this . contenu = contenu ;
    }
    String getAuteur () { return auteur ; }
    void setAuteur ( String auteur ) { this . auteur = auteur ; }
    void setLu () { lu = true ; }
    boolean getLu () { return lu ; }
    String getSujet () { return sujet ; }
    String getContenu () { return contenu ; }
    void affiche () {
        System . out . println ( " From : " + auteur + " \nTo : " + destinataire +
                " \nSujet : " + sujet + " \n " + contenu ) ;
        lu = true ;
    }
}
