package Java_exercises.EcoleEPFL;

public class EtudiantRegulier extends Etudiant {
    
    private double moyenne;

    public EtudiantRegulier(String unNom, int uneAnnee, String uneSection, double uneMoyenne){
        super(unNom, uneAnnee, uneSection);
        moyenne = uneMoyenne;
    }

    public double getMoyenne(){
        return moyenne;
    }

    public void afficheInfo(){
        super.afficheInfo();
        System.out.println("Moyenne : " + this.getMoyenne());
    }
}