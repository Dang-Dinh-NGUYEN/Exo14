public abstract class Fichier {
    private Object contenu ;
    private String nom ;
    Fichier ( Object contenu , String nom ) {
        this . contenu = contenu ;
        this . nom = nom ;
    }
    Object getContenu () { return contenu ; }
    String getNom () { return nom ; }
    abstract void execute() ;
}
