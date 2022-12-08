public class StrategieSuivantLit extends StrategieSuivant{
    @Override
    void suivant(LecteurMail l) {
        l.suivant();
        try {
            l.lit();
        }catch (NullPointerException ignored){}
    }
}
