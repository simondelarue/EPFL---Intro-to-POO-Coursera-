package Java_exercises.EcoleEPFL;

public class Direction {
    public static void main(String[] args) {        
        Ecole EPFL = new Ecole(5);
        EPFL.add(new EtudiantRegulier("Gaston PEUTIMIDE", 2013, "Systèmes de communication", 6.0));
        EPFL.add(new EtudiantRegulier("Yvan RATTRAPEUR", 2011, "Systèmes de communication", 2.5));
        EPFL.add(new Enseignant("Mathieu MATHEU", 1998, "LMEP", 10000, "Physique"));
        EPFL.add(new Secretaire("Sophie SCRIBONA", 2005, "LMT", 5000));
        EPFL.add(new EtudiantEchange("Bjorn BORGUE", 2012, "Informatique", "KTH"));

        EPFL.afficheNbEPFLien();
        EPFL.afficheDureeMoyPresence();
        EPFL.afficheInfo();
    }    
}