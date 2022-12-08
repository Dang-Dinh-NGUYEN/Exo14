public class BoiteMailTableau extends BoiteMail{
    private Mail lesMails [] = new Mail [100];
    BoiteMailTableau(String expediteur) {
        super(expediteur);
    }

    @Override
    Mail getMail(int i) {
        return lesMails[i];
    }

    @Override
    void recoit(Mail m) {
        lesMails[getNbMails()] = m ;
        setNbMails(getNbMails() + 1);
    }
}
