package Java_exercises.Voyage;

public class OptionVoyage {
    private String nom;
    private double prix;

    public OptionVoyage(String unNom, double unPrix){
        nom = unNom;
        prix = unPrix;
    }

    public String getNom(){
        return nom;
    }
    public double prix(){
        return prix;
    };
    
    public String toString(){
        return (getNom() + " -> " + prix() + " CHF");
    }
}