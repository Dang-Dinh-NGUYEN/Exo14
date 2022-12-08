public class LecteurMailAttache extends LecteurMail{
/*
    LecteurMailAttache(String expediteur) {
        super(expediteur);
    }

    void traiteAttachement(){
        if(getCourant() instanceof MailEnrichi){
            ((MailEnrichi) getCourant()).recupere().execute();
        }
    }

    void transfereEnAttache(String Destinataire){
        MailEnrichi newMail = new MailEnrichi(getExpediteur(), Destinataire, " Tr : " +getCourant().getSujet(),"" );
        newMail.attache(new FichierMail(getCourant(),""));
        getServeur().envoie(newMail) ;
    }

    /*********************************************** réécrire *********************************************************/

    LecteurMailAttache(BoiteMail boiteMail) {
        super(boiteMail);
    }

    void traiteAttachement(){
        lit();
    }

    void transfereEnAttache(String Destinataire){
        transfere(Destinataire);
    }
}
