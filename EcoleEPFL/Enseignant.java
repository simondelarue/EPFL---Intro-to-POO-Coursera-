package Java_exercises.EcoleEPFL;

public class Enseignant extends Personnel{

    private String section;
    
    public Enseignant(String unNom, int uneAnnee, String unLabo, double unSalaire, String uneSection){
        super(unNom, uneAnnee, unLabo, unSalaire);
        section = uneSection;
    }

    public String getSection(){
        return section;
    }

    public void afficheInfo(){
        super.afficheInfo();
        System.out.println("Section : " + this.getSection());
    }
}