package Java_exercises.Demenagement;

public class SimpleItem extends Item {

	private String nom;
	
	public SimpleItem(String unNom) {
		nom = unNom;
	}

	public String getNom(){
		return nom;
	}
	
	@Override
	public void afficher() {
		System.out.println("Objet : " + getNom());
	}

	@Override
	public boolean trouve(String nomObjet) {
		return nom.equals(nomObjet);
	}

}
