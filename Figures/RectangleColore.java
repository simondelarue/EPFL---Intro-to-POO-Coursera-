package Java_exercises.Figures;

public class RectangleColore extends Rectangle {
    private int couleur;

    public RectangleColore(double unX, double unY, double largeur, double longueur, int uneCoul) {
        super(unX, unY, largeur, longueur);
        couleur = uneCoul;
    }

    public int getCouleur(){
        return couleur;
    }
}