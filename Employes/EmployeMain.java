package employes;

public class EmployeMain {

	public static void main(String[] args) {
		Personnel personnel = new Personnel();
		
		// On cr'ee un employ'e Temporaire "T1", et on l'embauche
		EmployeTemporaire t1 = new EmployeTemporaire("T1", 21, 20);
		personnel.embaucher(t1);
		personnel.afficherEmploye("T1");
		
		// On le mute dans la categorie Permanent
		personnel.muter(new EmployePermanent(t1, 4200, 0, false, 110));
		personnel.afficherEmploye("T1");
		System.out.println();
		
		// On cr'ee un employ'e temporaire "P3", et on l'embauche
		EmployePermanent p3 = new EmployePermanent("P3", 20, 2000, 1, true, 100);
		personnel.embaucher(p3);
		personnel.afficherEmploye("P3");
		
		// On le mute dans la categoire de Temporaire
		personnel.muter(new EmployeTemporaire(p3, 20));
		personnel.afficherEmploye("P3");
		}
}
