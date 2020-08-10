package montres;

public class MontresMain {

	public static void main(String[] args) {
		
		// Test première version
		/*
		Montre m = new Montre();
		m.ajouterAccessoire(new Bracelet("cuir", 54.0));
		m.ajouterAccessoire(new Fermoir("acier", 12.5));
		m.ajouterAccessoire(new Boitier("acier", 36.6));
		m.ajouterAccessoire(new Vitre("quartz", 44.8));
		
		System.out.println("\n" + "Montre m : ");
		m.afficher();
		*/
		
		// Test deuxième version
		MecanismeAnalogique v1 = new MecanismeAnalogique(312.00, 20201212);
		MecanismeDigital v2 = new MecanismeDigital(32.00, "11:45", "7:00");
		MecanismeDouble v3 = new MecanismeDouble(543.00, "8:20", 20191012, "6:30");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		Montre m = new Montre(new MecanismeDouble(468.00, "9:15", 20200907, "7:00"));
		m.ajouterAccessoire(new Bracelet("cuir", 54.0));
		m.ajouterAccessoire(new Fermoir("acier", 12.5));
		m.ajouterAccessoire(new Boitier("acier", 36.6));
		m.ajouterAccessoire(new Vitre("quartz", 44.8));
		System.out.println("\n" + "Montre m : ");
		m.afficher();
		
		// Test pour la copie d'une montre
		Montre m2 = new Montre(m);
		System.out.println("Montre m2 : ");
		m2.afficher();
	}

}
