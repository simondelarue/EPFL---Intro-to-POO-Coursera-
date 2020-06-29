package Java_exercises.Banque;

class Compte{
    private double taux;
    private double solde;

    public Compte(double unTaux, double unSolde){
        taux = unTaux;
        solde = unSolde;
    }

    public double getSolde(){
        return solde;
    }

    public void boucler(){
        double interets = taux * solde;
        solde = solde + interets;
    }
}

class Client{
    private String nom;
    private String ville;
    private Compte comptePrive;
    private Compte compteEpargne;

    public Client(String unNom, String uneVille, double taux1, double solde1, 
                double taux2, double solde2){
        nom = unNom;
        ville = uneVille;
        comptePrive = new Compte(taux1, solde1);
        compteEpargne = new Compte(taux2, solde2);
    }
    
    public void afficher(){
        System.out.println("Client " + nom + " de " + ville);
        System.out.println("   Compte prive:     " + comptePrive.getSolde() + " francs");
		System.out.println("   Compte d'epargne: " + compteEpargne.getSolde() + " francs");
    }
    public void boucler(){
        comptePrive.boucler();
        compteEpargne.boucler();
    }
}

public class Banque2 {
    public static void main(String[] args) {
        double tauxPrive = 0.01;
        double tauxEpargne = 0.02;

        // Creation des clients
        Client client1 = new Client("Pedro", "Geneve", tauxPrive, 1000, tauxEpargne, 2000);
        Client client2 = new Client("Alexandra", "Lausanne", tauxPrive, 3000, tauxEpargne, 4000);

        System.out.println("Donnees avant le bouclement des comptes:");
        client1.afficher();
        client2.afficher();
        System.out.println("Donnees apres le bouclement des comptes:");
        client1.boucler();
        client2.boucler();
        client1.afficher();
        client2.afficher();
    }
}