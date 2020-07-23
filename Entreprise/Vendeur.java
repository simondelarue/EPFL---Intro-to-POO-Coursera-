package Java_exercises.Entreprise;

public class Vendeur extends EmployeTemporaire {
	
	private double volumeVente;
	private double commission;

	// Constructeur de base
	public Vendeur(String unNom, double unSalaireHor, double unNbHeuresMois, double unVolumeVente, double uneCommission) {
		super(unNom, unSalaireHor, unNbHeuresMois);
		volumeVente = unVolumeVente;
		commission = uneCommission;
	}
	// Constructeur pour la mutation
	public Vendeur(Employe ancien, double unSalaireHor, double unNbHeuresMois, double uneCommission) {
		this(ancien.getNom(), unSalaireHor, unNbHeuresMois, 0.0, uneCommission);
		volumeVente = (double)(ancien.salaireCumule() / getCommission());
	}
	
	public double getVolumeVente(){
		return volumeVente;
	}
	public double getCommission(){
		return commission;
	}
	
	private double getMtCommission(){
		return getVolumeVente() * getCommission();
	}
	@Override
	public double salaireCumule() {
		return super.salaireCumule() + getMtCommission() ;
	}
	public void affiche(){
		super.affiche();
		System.out.println("Vendeur");
	}

}
