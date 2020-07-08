package Java_exercises.BoiteALettres;

class Boite {

	private Courrier[] contenu;
	private int index;

	// constructeur
	public Boite(int max) {
		contenu = new Courrier[max];
		index = 0;
	}

	// la méthode demand'ee
	public double affranchir() {
		double montant = 0.0;
		for(int i=0; i < index; ++i){
			Courrier c = contenu[i];
			montant += c.affranchir();
		}
		return montant;
	}

	public int size() {
		return index;
	}

	public Courrier getCourrier(int index) {
		if (index < contenu.length)
			return contenu[index];
		else
			return null;
	}

	// retourne le nombre de courriers invalides
	public int courriersInvalides() {
		int count = 0;
		for (int i = 0; i < index; i++) {
			if (!contenu[i].valide())
				count++;
		}
		return count;
	}

	// difficile de fonctionner sans 
	public void ajouterCourrier(Courrier  unCourrier) {
		if (index < contenu.length){
			contenu[index] = unCourrier;
			index++;
		} else {
			System.out.println("Impossible d'ajouter un nouveau courrier. Boite pleine !");
		}
	}
	
	public void afficher() {
		for (int i = 0; i < index; i++) {
			System.out.println(contenu[i]);
		}
	}
	
}