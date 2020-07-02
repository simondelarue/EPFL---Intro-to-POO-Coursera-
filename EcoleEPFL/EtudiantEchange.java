package Java_exercises.EcoleEPFL;

public class EtudiantEchange extends Etudiant {

    private String univOrig;

    public EtudiantEchange(String unNom, int uneAnnee, String uneSection, String uneUnivOrig){
        super(unNom, uneAnnee, uneSection);
        univOrig = uneUnivOrig;
    }

    public String getUnivOrig(){
        return univOrig;
    }

    public void afficheInfo(){
        super.afficheInfo();
        System.out.println("Univ d'origine : " + this.getUnivOrig());
    }
    
}