package Java_exercises.Salaire;

abstract class Commercial extends Employe{
    
    private double CA;

    public Commercial(String unNom, String unPrenom, int unAge, String uneDate, double unCA){
        super(unNom, unPrenom, unAge, uneDate);
        CA = unCA;
    }

    public double getCA(){
        return CA;
    }

}