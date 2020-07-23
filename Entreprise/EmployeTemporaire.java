package Java_exercises.Entreprise;

public class EmployeTemporaire extends Employe {
	
	private double salaireHoraire;
	private double nbHeuresMois;

	// Constructeur de base
	public EmployeTemporaire(String unNom, double unSalaireHor, double unNbHeuresMois) {
		super(unNom);
		salaireHoraire = unSalaireHor;
		nbHeuresMois = unNbHeuresMois;	
	}
	// Constructeur pour la mutation
	public EmployeTemporaire(Employe ancien, double unSalaireHor) {
		this(ancien.getNom(), unSalaireHor, 0.0);
		nbHeuresMois = (int)(ancien.salaireCumule() / getSalaireHoraire());
	}

	
	public double getSalaireHoraire(){
		return salaireHoraire;
	}
	public double getNbHeuresMois(){
		return nbHeuresMois;
	}

	@Override
	public double salaireCumule() {
		return getSalaireHoraire() * getNbHeuresMois();
	}
	public void affiche(){
		super.affiche();
		System.out.println("Employe temporaire");
	}

}
