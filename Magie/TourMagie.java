/* =============================================================================================================== */
/*
Description du tour de magie implémenté :
    Un magicien demande à un spectateur d'écrire sur un papier son âge et la somme qu'il a en poche (moins de 100 francs suisses).
    L'assistant doit ensuite le lire (sans rien dire), puis effectuer secrètement le calcul suivant : 
        multiplier l'âge par 2, lui ajouter 5, multiplier le résultat par 50, ajouter la somme en poche, 
        et soustraire le nombre de jours que contient une année, puis finalement donner le résultat à haute voix.
    En ajoutant mentalement (rapidement !) 115 au chiffre reçu, le magicien trouve tout de suite l'âge et la somme 
    en poche (qui étaient restés secrets).
*/
/* =============================================================================================================== */
package Java_exercises.Magie;

import java.util.Scanner;

public class TourMagie {
    public static void main(String[] args) {
        // On instancie les protagonistes du tour de magie.
        Spectateur s = new Spectateur();
        Magicien m = new Magicien();
        Assistant a = new Assistant();

        // Le spectateur arrive
        // Le magicien annonce le tour
        // Puis il effectue son tour
        s.arriver();
        m.annonceTour();
        m.effectueTour(a, s);
    }
}

class Magicien {
    private int ageDevine;
    private int argentDevine;

    // Le magicien annonce son tour.
    public void annonceTour(){
        System.out.println("[Magicien] Un petit tour de magie ...");
    }

    // Le magicien effectue le tour de magie au spectateur, avec l'aide de l'assistant.
    // Le billet n'existe qu'à l'intérieur d'un tour.
    public void effectueTour(Assistant a, Spectateur s){
        Papier billet = new Papier();
        s.ecrirePapier(billet);
        a.lirePapier(billet);
        a.calculMental();
        calculRapide(a.annonceResCalcul());
        prestige();
    }

    // Calcul mental rapide du magicien, sur la base du résultat donné par l'assistant.
    private void calculRapide(int resultatRecu){
        System.out.println("[Magicien] Hum ....");
        resultatRecu+=115;
        ageDevine = resultatRecu / 100;
        argentDevine = resultatRecu % 100;
    }

    // Dernière phase du tour - le Prestige.
    private void prestige(){
        System.out.println("[Magicien] Je vois que vous êtes agé de " + ageDevine + " et que vous avez " + argentDevine + " euros en poche !!");
    }
}

class Papier {
    private int age;
    private int argentPoche;

    // Méthode permettant au spectateur d'écrire sur le billet.
    public void ecrire(int ageSpect, int argentSpect){
        age = ageSpect;
        argentPoche = argentSpect;
    }

    // Méthodes permettant à l'assistant de lire le billet.
    public int lireAge(){return age;}
    public int lireArgentPoche(){return argentPoche;}
}

class Assistant {
    // A aucun moment, les données lues par l'assistant ne sont accessibles par quelqu'un d'autre.
    private int ageLu;
    private int argentLu;
    private int resultat;

    // L'assistant lit le billet écrit par le spectateur.
    public void lirePapier(Papier billet){
        System.out.println("[Assistant] Je lis le papier.");
        ageLu = billet.lireAge();
        argentLu = billet.lireArgentPoche();
    }
    
    // Calcul mental effectué par l'assistant.
    public void calculMental(){
        System.out.println("[Assistant] Je calcule mentalement.");
        resultat =  (ageLu*2 + 5)*50 + argentLu - 365;
    }

    // Annonce du résultat du calcul mental pour le magicien.
    public int annonceResCalcul(){
        System.out.println("[Assistant] J'annonce : " + resultat + " !");
        return resultat;
    }
}

class Spectateur {
    private final static Scanner clavier = new Scanner(System.in);
    private int age;
    private int argentPoche;

    // Arrivée du spectateur. On lui demande son âge et l'argent qu'il a en poche.
    public void arriver(){
        System.out.println("[Spectateur] J'entre en scène.");
        System.out.println("Quel âge ai-je ?");
        age = clavier.nextInt();

        do {
            System.out.println("Combien d'argent ai-je en poche ? (<100 et >0)");
            argentPoche = clavier.nextInt();
        } while (argentPoche >= 100 || argentPoche <= 0);
        System.out.println("[Spectateur] J'ai un montant qui convient.");

    }

    // Le spectateur écrit son âge et la quantité d'argent sur un billet pour l'assistant.
    public void ecrirePapier(Papier billet){
        System.out.println("[Spectateur] J'écris le papier.");
        billet.ecrire(age, argentPoche);
    }
}