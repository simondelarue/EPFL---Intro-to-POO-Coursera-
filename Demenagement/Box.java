package Java_exercises.Demenagement;

public class Box extends Item {

	private int numero;
	private int nbItems;
	private Item[] contenu;
	
	public Box(int unNbItems, int unNumero) {
		contenu = new Item[unNbItems];
		nbItems = -1;
		numero = unNumero;
	}
	
	public int getNumero(){
		return numero;
	}
	public int getNbItems(){
		return nbItems;
	}
	
	public void addItem(Item i){
		if (nbItems < contenu.length -1){
			nbItems++;
			contenu[nbItems] = i;
		}
	}
	@Override
	public void afficher(){
		for (int i=0; i<=nbItems; i++){
			contenu[i].afficher();
		}
	}
	@Override
	public boolean trouve(String nomObjet){
		for (int i=0; i<=nbItems; i++){
			if (contenu[i].trouve(nomObjet)){
				return true;
			}
		}
		return false;
	}
}
