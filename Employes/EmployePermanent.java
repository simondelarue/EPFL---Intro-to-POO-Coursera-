package employes;

public class EmployePermanent extends Employe {
	
	private int nbJoursTravailles;
	private double salaireMensuel;
	private int nbEnfants;
	private boolean marie;
	private double primeEnfant;

	// Constructeur de base
	public EmployePermanent(String unNom, int unNbJours, double unSalaire, int unNbEnf, boolean estMarie, double unePrime) {
		super(unNom);
		nbJoursTravailles = unNbJours;
		salaireMensuel = unSalaire;
		nbEnfants = unNbEnf;
		marie = estMarie;
		primeEnfant = unePrime;
	}
	// Constructeur pour la mutation
	public EmployePermanent(Employe ancien, double unSalaire, int unNbEnf, boolean estMarie, double unePrime) {
		this(ancien.getNom(), 0, unSalaire, unNbEnf, estMarie, unePrime);
		nbJoursTravailles = (int)(ancien.salaireCumule() * (Personnel.NB_JOURS_OEUVRES / salairePrime()));
	}
	
	public int getNbJoursTravailles(){
		return nbJoursTravailles;
	}
	public double getSalaireMensuel(){
		return salaireMensuel;
	}
	public int getNbEnfants(){
		return nbEnfants;
	}
	public boolean estMarie(){
		return marie;
	}
	public double getPrimeEnfant(){
		return primeEnfant;
	}

	private double salairePrime(){
		double salaireTot = getSalaireMensuel();
		if (marie && getNbEnfants()>0){
			salaireTot +=  getPrimeEnfant() * getNbEnfants(); 
		}
		return salaireTot;
	}

	@Override
	public double salaireCumule() {
		return (getNbJoursTravailles() * (salairePrime() / (double)Personnel.NB_JOURS_OEUVRES));
	}
	
	public void affiche(){
		super.affiche();
		System.out.println(" Employe permanent");
	}

}
