public class FichierMail extends Fichier{

    FichierMail(Mail contenu, String nom) {
        super(contenu,nom);
    }

    @Override
    void execute() {
        ((Mail) getContenu()).affiche();
    }
}
