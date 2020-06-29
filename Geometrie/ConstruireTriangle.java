package Java_exercises.Geometrie;

import java.util.Scanner;

public class ConstruireTriangle {
    public static void main(String[] args) {
        // Declaration et initialisation des sommets
        Sommet s1 = new Sommet();
        Sommet s2 = new Sommet();
        Sommet s3 = new Sommet();
        initSommet(s1);
        initSommet(s2);
        initSommet(s3);

        // Declaration d'un triangle et calculs sur celui-ci
        Triangle tri = new Triangle();
        tri.setSommets(s1, s2, s3);
        System.out.println("Périmètre : " + tri.perimetre());
        tri.estIsocele();
        scanner.close();
    }

    // Méthode d'initialisation d'un sommet
    private static Scanner scanner = new Scanner(System.in);
    static void initSommet(Sommet s){
        double x = 0;
        double y = 0;

        System.out.println("Construction d'un nouveau point");
        System.out.println("    Veuillez entrer X : ");
        x = scanner.nextDouble();
        System.out.println("    Veuillez entrer Y : ");
        y = scanner.nextDouble();

        s.setCoordX(x);
        s.setCoordY(y);
    }
}

class Triangle {
    private Sommet sommet1;
    private Sommet sommet2;
    private Sommet sommet3;

    // Initialisation des sommets du triangle
    public void setSommets(Sommet s1, Sommet s2, Sommet s3){
        sommet1 = s1;
        sommet2 = s2;
        sommet3 = s3;
    }
    
    // Calcul du périmètre du triangle
    public double perimetre(){
        return (sommet1.distance(sommet2) + sommet2.distance(sommet3) + sommet3.distance(sommet1));
    }

    // Teste si un triangle est isocèle
    public boolean estIsocele(){
        double d1 = sommet1.distance(sommet2);
        double d2 = sommet2.distance(sommet3);
        double d3 = sommet3.distance(sommet1);

        if ((d1==d2) || (d2==d3) || (d3==d1)){
            System.out.println("Le triangle est isocèle.");
            return true;
        } else {
            return false;
        }
    }
}

class Sommet {
    private double coordX;
    private double coordY;

    // Getters et setters du sommet
    public double getX(){return coordX;}
    public double getY(){return coordY;}
    public void setCoordX(double x){coordX=x;}
    public void setCoordY(double y){coordY=y;}

    // Calcul de la distance entre le sommet acutel et un autre sommet
    public double distance(Sommet s){
        return Math.sqrt((coordX - s.getX())*(coordX - s.getX()) + (coordY - s.getY())*(coordY - s.getY()));
    }
}