package Figures;

public class Figure {
    private double x;
    private double y;

    public Figure(double unX, double unY){
        x = unX;
        y = unY;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void affiche(){
        System.out.println("Coordonnées du centre : " + x + " " + y);
    }
}