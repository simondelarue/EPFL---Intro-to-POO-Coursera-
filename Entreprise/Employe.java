package Java_exercises.Entreprise;

abstract class Employe {

	private String nom;
	
	public Employe(String unNom){
		nom = unNom;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	abstract public double salaireCumule();
	
	public void affiche(){
		System.out.println(" nom de l'employe : " + this.getNom());
		System.out.println(" salaire cumule : " + salaireCumule());
	}
}
