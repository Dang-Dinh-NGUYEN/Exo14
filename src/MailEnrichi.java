public class MailEnrichi extends Mail{
    private Fichier attachement;
    MailEnrichi(String auteur, String destinataire , String sujet , String contenu){
        super(auteur,destinataire,sujet,contenu);
    }

    void attache(Fichier attachement){
        this.attachement = attachement;
    }

    Fichier recupere(){
        return this.attachement;
    }

    void affiche(){
        super.affiche();
        if(this.attachement != null) System.out.println("Att : " + this.attachement.getNom());
    }

    /* cette classe respecte le principe de Liskov */
}
