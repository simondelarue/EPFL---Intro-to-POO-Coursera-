package Java_exercises.EcoleEPFL;

import java.util.ArrayList;

public class Ecole {

    private ArrayList<EPFLien> listEPFLiens;

    public Ecole(int nbPersonnes){
        listEPFLiens = new ArrayList<EPFLien>();
    }

    public void add(EPFLien e){
        if (e != null){
            listEPFLiens.add(e);
        }
    }

    public int countEPFLIEN(){
        return listEPFLiens.size();
    }
    public int countEtudiant(){
        ArrayList<EPFLien> etuds = new ArrayList<EPFLien>();
        for (EPFLien e : listEPFLiens){
            if (e.estEtudiant()){
                etuds.add(e);
            }
        }
        int nbEtud = etuds.size();
        return nbEtud;
    }

    public void afficheNbEPFLien(){
        System.out.println("Il y a " + countEPFLIEN() + " EPFLiens, dont " + countEtudiant() 
        + " etudiants dans l'école.");
    }

    public double dureeMoyennePresence(){
        double dureeMoy = 0.0; 
        int dureeTot = 0;
        for (EPFLien e: listEPFLiens){
            dureeTot = dureeTot += e.dureePresence();
        }
        dureeMoy = dureeTot / listEPFLiens.size();
        return dureeMoy;
    }

    public void afficheDureeMoyPresence(){
        System.out.println("En moyenne, les EPFLiens sont là depuis " + dureeMoyennePresence() + " ans.");
    }

    public void afficheInfo(){
        for (EPFLien e : listEPFLiens){
            System.out.println(" ------------ ");
            e.afficheInfo();
        }
    }
    
}