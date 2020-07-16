package employes;

public class Personnel {
	
	public static int NB_JOURS_OEUVRES = 20;
	private Employe[] employes;

	public Personnel() {
		employes = new Employe[100];
	}
	
	private int getIndexOfEmploye(String nom){
		for (int i=0; i<employes.length; i++){
			if (employes[i] != null && employes[i].getNom().equals(nom)){
				return i;
			}
		}
		return -1;
	}
	
	// Embaucher un employé
	public void embaucher(Employe e){
		// 2 employés ne peuvent pas avoir le même nom
		if (getIndexOfEmploye(e.getNom()) != -1){
			System.out.println("Cet employé existe déjà. Trouvez un autre nom");
		} else {
			for (int i=0; i<employes.length; i++){
				if (employes[i] == null){
					employes[i] = e;
					return;
				}
			}
		}
	}
	// Licencier un employé
	public void licencier(Employe e){
		if (getIndexOfEmploye(e.getNom()) == -1){
			System.out.println("Cet employé n'existe pas");
		} else {
			employes[getIndexOfEmploye(e.getNom())] = null;
		}
	}
	// Muter un employé dans une autre catégorie
	public void muter(Employe EmployeNouvelleCat){
		if (getIndexOfEmploye(EmployeNouvelleCat.getNom()) == -1){
			System.out.println("Cet employé n'existe pas");
		}
		employes[getIndexOfEmploye(EmployeNouvelleCat.getNom())] = EmployeNouvelleCat;
	}
	// Renvoie un employé de la liste du personnel
	public Employe getEmploye(String unNom){
		if (getIndexOfEmploye(unNom) == -1){
			System.out.println("Pas d'employé avec ce nom");
			return null;
		}
		return employes[getIndexOfEmploye(unNom)];
	}
	// Affiche un employé de la liste du personnel
	public void afficherEmploye(String unNom){
		getEmploye(unNom).affiche();
	}

}
