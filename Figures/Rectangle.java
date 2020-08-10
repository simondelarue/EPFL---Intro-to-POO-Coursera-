package Java_exercises.Figures;

public class Rectangle extends Figure {
    private double largeur;
    private double longueur;

    public Rectangle(double unX, double unY, double largeur, double longueur) {
        super(unX, unY);
        this.largeur = largeur;
        this.longueur = longueur;
    }
    public double surface() {
        return largeur * longueur;
    }
    public double getLongueur() {
        return longueur;
    }
    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(double l) {
        largeur = l;
    }
    public void setLongueur(double l) {
        longueur = l;
    }

    // Comparaison de Rectangles
    /*
    public boolean equals(Object autreRect){
        if (autreRect == null){
            return false;
        } else {
            if (autreRect.getClass() != getClass()){
                return false;
            } else {
                return (
                    getX() == ((Rectangle)autreRect).getX() 
                &&  getY() == ((Rectangle)autreRect).getY() 
                &&  getLargeur() == ((Rectangle)autreRect).getLargeur()
                &&  getLongueur() == ((Rectangle)autreRect).getLongueur();
                )
            }
        }
    }
    */
}