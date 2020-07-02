package Java_exercises.EcoleEPFL;

public class Personnel extends EPFLien{
    
    private String labo;
    private double salaire;

    public Personnel(String unNom, int uneAnnee, String unLabo, double unSalaire){
        super(unNom, uneAnnee);
        labo = unLabo;
        salaire = unSalaire;
    }

    public String getLabo(){
        return labo;
    }
    public double getSalaire(){
        return salaire;
    }

    public void afficheInfo(){
        super.afficheInfo();
        System.out.println("Laboratoire : " + this.getLabo());
        System.out.println("Salaire : " + this.getSalaire());
    }
}