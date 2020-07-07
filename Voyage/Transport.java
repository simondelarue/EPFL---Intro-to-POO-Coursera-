package Java_exercises.Voyage;

public class Transport extends OptionVoyage{
    public final static double TARIF_LONG = 1500.0;
    public final static double TARIF_BASE = 200.0;
    private boolean trajetLong;

    public Transport(String unNom, double unPrix, boolean estLong){
        super(unNom, unPrix);
        trajetLong = estLong;
    }
    public Transport(String unNom, double unPrix){
        super(unNom, unPrix);
        trajetLong = false;
    }

    public double prix(){
        if (trajetLong){
            return (TARIF_LONG + super.prix());
        } else {
            return (TARIF_BASE + super.prix());
        }
    }
}