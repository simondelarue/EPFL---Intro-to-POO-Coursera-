package Figures;

public class FiguresGeometriques {
    public static void main(String[] args) {
        RectangleColore r = new RectangleColore(1.2,3.4,12.3,43.2,4);
        r.affiche();
        Cercle c = new Cercle (2.3, 4.5, 12.2);
        c.affiche();
    }    
}