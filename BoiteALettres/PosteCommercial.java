package Java_exercises.BoiteALettres;

// PROGRAMME PRINCIPAL 
class PosteCommercial {

	public static void  main(String args[]) {
		
		//Cr'eation d'une boite-aux-lettres
		Boite boite = new Boite(30);

		//Creation de divers courriers/colis..
       
		Publicite pub1 = new Publicite(1500, true, "Les Moilles  13A, 1913 Saillon");
		Publicite pub2 = new Publicite(3000, false, "Ch. de l'Impasse 1, 9999 Nowhere"); 

		ColisCommercial colisCom1 = new ColisCommercial(7000, false, "Route de la rape 11, 1509 Vucherens", 25);
		ColisCommercial colisCom2 = new ColisCommercial(2500, true, "Route du Rameau 14b, 404 Notfound", 21); 

		boite.ajouterCourrier(pub1);
		boite.ajouterCourrier(pub2);
		boite.ajouterCourrier(colisCom1);
		boite.ajouterCourrier(colisCom2);


		System.out.println("Le montant total d'affranchissement est de " +
						   boite.affranchir());
		boite.afficher();
		
		System.out.println("La boite contient " + boite.courriersInvalides()
						   + " courriers invalides");
		
	}

}

