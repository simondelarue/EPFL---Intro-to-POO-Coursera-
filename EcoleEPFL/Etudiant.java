package Java_exercises.EcoleEPFL;

public class Etudiant extends EPFLien{

    private String section;

    public Etudiant(String unNom, int uneAnnee, String uneSection){
        super(unNom, uneAnnee);
        section = uneSection;
    }

    public boolean estEtudiant(){
        return true;
    }

    public String getSection(){
        return section;
    }

    public void afficheInfo(){
        super.afficheInfo();
        System.out.println("Section : " + this.getSection());
    }
    
}