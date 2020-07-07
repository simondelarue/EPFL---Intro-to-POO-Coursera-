package Java_exercises.Voyage;
import java.util.ArrayList;

public class KitVoyage {
    private ArrayList<OptionVoyage> voyages;
    private String depart;
    private String destination;

    public KitVoyage(String unDepart, String uneDest){
        voyages = new ArrayList<OptionVoyage>();
        depart = unDepart;
        destination = uneDest;
    }

    public double prix(){
        double totOption = 0.0;
        for (OptionVoyage ov : voyages){
            totOption += ov.prix();
        }
        return totOption;
    }

    public void ajouterOption(OptionVoyage ov){
        if (ov == null){
            System.out.println("Pas d'ajout d'option");
        } else {
            voyages.add(ov);
        }
    }
    public void annuler(){
        voyages.clear();
    }

    public int getNbOptions(){
        return voyages.size();
    }

    public String toString(){
        String chaine;
        chaine = ("Voyage de " + depart + " à " + destination + ", avec pour options : \n");
        for (OptionVoyage ov : voyages){
            chaine += (" - " + ov + "\n");
        }
        chaine += ("Prix total : " + prix() + " CHF\n");
        return chaine;
    }
}