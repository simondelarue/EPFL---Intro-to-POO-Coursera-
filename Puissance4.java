package Java_exercises;

import java.util.Scanner;
/*
Test de correction via Git.
Ceci est écrit sur la branche dev du clone en local.
*/

public class Puissance4 {

    private static Scanner clavier = new Scanner(System.in);
    public static int nbCout = 0;

    private static int VIDE = 0;
    private static int JAUNE = 1;
    private static int ROUGE = 2;

    /* Initialisation de la grille à VIDE */
    static void initialise(int[][] grille){
        for (int i=0; i < grille.length; i++){
            for (int j=0; j < grille[i].length; j++){
                grille[i][j] = VIDE;
            }
        }
    }

    /* Methode Joue */
    static boolean joue(int[][] grille, int colonne, int couleur){
        // Test sur la validité de la colonne donnée par le joueur
        if (colonne < 0 || colonne > 6){
            System.out.println("Vous jouez en dehors du jeu, vous ne pourrez pas gagner comme ça ...");
            return false;
        }

        int i=0 ;
        while((i<=grille.length-1) && grille[i][colonne] != VIDE){
            i++;
        }
        if (i==grille.length){
            return false;
        } else {
            grille[i][colonne] = couleur;
            return true;
        }
    }

    // Methode demande et joue
    static int demandeEtJoue(int[][] grille){
        System.out.println("Quelle colonne ?");
        int colonne;
        colonne = clavier.nextInt() - 1;
        
        boolean valide = false;

        while (!valide){
            if (aQuiLeTour(nbCout).equals("Joueur1")){
                valide = joue(grille, colonne, JAUNE);
            } else {
                valide = joue(grille, colonne, ROUGE);
            }
            if (!valide){
                System.out.println("Entrez à nouveau une colonne");
                colonne = clavier.nextInt() - 1;
            }
        }
        nbCout = nbCout +1 ;
        return colonne;
    }

    // A qui de jouer
    static String aQuiLeTour(int nbCout){
        if (nbCout%2 == 0){
            return "Joueur1";
        } else {
            return "Joueur2";
        }
    }


    /* Affichage de la grille dans le terminal */
    static void afficherGrille(int[][] grille){
        System.out.println("");
        for (int i = grille.length-1; i>=0; i--){
            for (int j=0; j < grille[i].length; j++){
                System.out.print("|");
                if (grille[i][j] == VIDE){
                    System.out.print(' ');
                } else if (grille[i][j] == ROUGE){
                    System.out.print('O');
                } else {
                    System.out.print('X');
                }
                System.out.print('|');
            }
            System.out.println();
        }
        System.out.print("=");
        for(int i=1; i <= grille[0].length; i++){
            System.out.print(i + "==");
        }
        System.out.println();
    }

    // Affichage des motifs des pions des joueurs
    static void motifsJoueurs(String choixJoueur1){
        String motifJaune = "X";
        String motifRouge = "O";
        if (choixJoueur1.equals("JAUNE")){
            System.out.println("Le joueur1 joue avec les " + motifJaune + " et le joueur2 avec les " + motifRouge);
        } else {
            System.out.println("Le joueur1 joue avec les " + motifRouge + " et le joueur2 avec les " + motifJaune);
        }
    }

    // Affectation des couleurs des adversaires - renvoie la couleur du joueur1
    static String affectationCouleurs(){
        System.out.println("Joueur1, quelle couleur choisissez-vous ? (ROUGE ou JAUNE)");
        String choixJoueur1 = clavier.next();

        while (!(choixJoueur1.equals("ROUGE")) && !(choixJoueur1.equals("JAUNE"))){
            System.out.println("Vous devez choisir une couleur qui soit JAUNE ou ROUGE");
            choixJoueur1 = clavier.next();
        }
        return choixJoueur1;
    }

    // Methode Gagne, renvoie true si la partie est gagnée (=condition d'arrêt de la partie)
    static boolean gagne(int[][] grille, int colonne){
        boolean cGagne = false;

        // Récupère la ligne du pion joué
        int i=0 ;
        while((i<=grille.length-1) && grille[i][colonne] != VIDE){
            i++;
        }
        int ligne = i-1;

        int c = colonne;
        boolean temp = true;

        if (colonne<=3){
            // Horizontal vers la droite
            temp = true;
            while(c < colonne+4){
                temp = temp && (grille[ligne][colonne] == grille[ligne][c]);
                c++;
            }
            cGagne = cGagne || temp;
        }
        if (colonne>=3){
            // Horizontal vers la gauche
            temp = true;
            c = colonne;
            while(c > colonne-4){
                temp = temp && (grille[ligne][colonne] == grille[ligne][c]);
                c--;
            }
            cGagne = cGagne || temp;
        }

        if (ligne<3){
            if (colonne<=3){
                // Diagonale NE
                temp = true;
                int t = 1;
                while(t < 4){
                    temp = temp && (grille[ligne][colonne] == grille[ligne+t][colonne+t]);
                    t++;
                }
                cGagne = cGagne || temp;
            }
            if (colonne>=3){
                // Diagonale NO
                temp = true;
                int t = 1;
                while(t < 4){
                    temp = temp && (grille[ligne][colonne] == grille[ligne+t][colonne-t]);
                    t++;
                }
                cGagne = cGagne || temp;
            }
        }
        if (ligne>=3){
            if (colonne<=3){
                // Diagonale SE
                temp = true;
                int t = 1;
                while(t < 4){
                    temp = temp && (grille[ligne][colonne] == grille[ligne-t][colonne+t]);
                    t++;
                }
                cGagne = cGagne || temp;
            }
            if (colonne>=3){
                // Diagonale SO
                temp = true;
                int t = 1;
                while(t < 4){
                    temp = temp && (grille[ligne][colonne] == grille[ligne-t][colonne-t]);
                    t++;
                }
                cGagne = cGagne || temp;
            }
            // Vertical vers le bas
            temp = true;
            int l = ligne;
            while(l > ligne-4){
                temp = temp && (grille[ligne][colonne] == grille[l][colonne]);
                l--;
            }
            cGagne = cGagne || temp;
        }
        return cGagne;
    }

    static boolean plein(int[][] grille){
        boolean grillePleine = true;
        for (int ligne=0; ligne<grille.length; ligne++){
            for (int colonne=0; colonne<grille[ligne].length; colonne++){
                if (grille[ligne][colonne]==VIDE){
                    grillePleine = false;
                    return grillePleine;
                }
            }
        }
        return grillePleine;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        // Initialisation de la grille
        int[][] grille = new int[6][7];
        initialise(grille);

        System.out.println("C'est parti !");
        String choixJoueur1 = affectationCouleurs();
        motifsJoueurs(choixJoueur1);

        // La partie commence
        afficherGrille(grille);
        int colonne = demandeEtJoue(grille);

        while (!(gagne(grille, colonne)) && !plein(grille)) {
            System.out.println(" --------------------------------------- ");
            System.out.println("C'est au tour de : " + aQuiLeTour(nbCout));
            afficherGrille(grille);

            colonne = demandeEtJoue(grille);
            afficherGrille(grille);
        }

        // Affichage du gagnant (si gagnant)
        if (plein(grille)){
            System.out.println("Egalité ! Bravo à tous les deux.");
        } else {
            System.out.println("Bravo " + aQuiLeTour(nbCout-1) + ". Vous avez gagné !");
        }
        clavier.close();
    }
}