package Java_exercises.Supermarche;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

class Article{
	private String nom;
	private double prixUnitaire;
	private boolean enSolde;

	public Article(String n, double prixU, boolean enS){
		nom = n;
		prixUnitaire = prixU;
		enSolde = enS;
	}

	public double getPrixUnitaire(){
		return prixUnitaire;
	}
	public String getNom(){
		return nom;
	}
	public boolean getEnSolde(){
		return enSolde;
	}
}

class Achat{
	private Article articleAchete;
	private int quantite;
	private double prixAchat;

	public Achat(Article a, int q){
		articleAchete = a;
		quantite = q;
		if (a.getEnSolde()){
			prixAchat = 0.5 * (q * a.getPrixUnitaire());
		} else {
			prixAchat = q * a.getPrixUnitaire();
		}
	}

	public Article getArticleAchete(){
		return articleAchete;
	}
	public double getPrixAchat(){
		return prixAchat;
	}

	public void afficher(){
		if (articleAchete.getEnSolde()){
			System.out.println(articleAchete.getNom() + " : " + articleAchete.getPrixUnitaire()
			+ " x " + quantite + " = " + prixAchat + " Eur (1/2 prix)");
		} else {
			System.out.println(articleAchete.getNom() + " : " + articleAchete.getPrixUnitaire()
			+ " x " + quantite + " = " + prixAchat + " Eur");
		}
	}
}

class Caddie{
	private List<Achat> listeAchats;

	public Caddie(){
		listeAchats = new ArrayList<Achat>();
	}

	public void remplir(Article a, int q){
		Achat ach = new Achat(a, q);
		listeAchats.add(ach);
	}

	public int getNbAchats(){
		return listeAchats.size();
	}

	public Achat getAchat(int index){
		return listeAchats.get(index);
	}
}

class Caisse{
	private int numeroCaisse;
	private double montantTotScanne;

	public Caisse(int num, double montantInit){
		numeroCaisse = num;
		montantTotScanne = montantInit;
	}

	public void scanner(Caddie c){
		System.out.println("=====================================");
		Date dateCourante = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");
		System.out.println(formatDate.format(dateCourante));
		System.out.println("Caisse numero : " + numeroCaisse);
		System.out.println();

		double totalCaddie = 0;
		for (int i=0; i < c.getNbAchats(); i++){
			totalCaddie += c.getAchat(i).getPrixAchat();
			montantTotScanne += c.getAchat(i).getPrixAchat();
			c.getAchat(i).afficher();
		}

		System.out.println();
		System.out.println("Montant à payer : " + totalCaddie + " Eur");
		System.out.println("=====================================");
	}

	public void totalCaisse(){
		System.out.println("La caisse " + numeroCaisse + " a encaisse " + montantTotScanne 
							+ " Eur aujourd hui.");
	}
}

public class Supermarche {

	public static void main(String[] args) {
		// Les articles vendus dans le supermarché
		Article choufleur = new Article("Chou-fleur extra", 3.50, false);
		Article roman = new Article("Les malheurs de Sophie", 16.50, true);
		Article camembert = new Article("Cremeux 100%MG", 5.80, false);
		Article cdrom = new Article("C++ en trois jours", 48.50, false);
		Article boisson = new Article("Petit-lait", 2.50, true);
		Article petitspois = new Article("Pois surgeles", 4.35, false);
		Article poisson = new Article("Sardines", 6.50, false);
		Article biscuits = new Article("Cookies de grand-mere", 3.20, false);
		Article poires = new Article("Poires Williams", 4.80, false);
		Article cafe = new Article("100% Arabica", 6.90, true);
		Article pain = new Article("Pain d'epautre", 6.90, false);

		// Les caddies du supermarché
		Caddie caddie1 = new Caddie();
		Caddie caddie2 = new Caddie();
		Caddie caddie3 = new Caddie();

		// Les caisses du supermarché
		// le premier argument est le numero de la caisse
		// le second argument est le montant initial de la caisse.
		Caisse caisse1 = new Caisse(1, 0.0);
		Caisse caisse2 = new Caisse(2, 0.0);

		// les clients font leurs achats
		// le second argument de la méthode remplir
		// correspond à une quantité

		// remplissage du 1er caddie
		caddie1.remplir(choufleur, 2);
		caddie1.remplir(cdrom, 1);
		caddie1.remplir(biscuits, 4);
		caddie1.remplir(boisson, 6);
		caddie1.remplir(poisson, 2);

		// remplissage du 2eme caddie
		caddie2.remplir(roman, 1);
		caddie2.remplir(camembert, 1);
		caddie2.remplir(petitspois, 2);
		caddie2.remplir(poires, 2);

		// remplissage du 3eme caddie
		caddie3.remplir(cafe, 2);
		caddie3.remplir(pain, 1);
		caddie3.remplir(camembert, 2);

		// Les clients passent à la caisse
		caisse1.scanner(caddie1);
		caisse1.scanner(caddie2);
		caisse2.scanner(caddie3);
		
		caisse1.totalCaisse();
		caisse2.totalCaisse();
	}
}
