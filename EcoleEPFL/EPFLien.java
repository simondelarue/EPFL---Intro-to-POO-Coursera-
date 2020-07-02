package Java_exercises.EcoleEPFL;

import java.util.Calendar;

public class EPFLien {

    private String nom;
    private int anneeArrivee;

    public EPFLien(String unNom, int uneAnnee){
        nom = unNom;
        anneeArrivee = uneAnnee;
    }

    public String getNom(){
        return nom;
    }
    public int getAnneeArrivee(){
        return anneeArrivee;
    }

    public boolean estEtudiant(){
        return false;
    }

    public int dureePresence(){
        int anneeCourante = Calendar.getInstance().get(Calendar.YEAR);
        int ecartAnnee = anneeCourante - anneeArrivee;
        return ecartAnnee;
    }

    public void afficheInfo(){
        System.out.println("Nom : " + this.getNom());
        System.out.println("Année d'arrivée : " + getAnneeArrivee());
    }
}