package main;

public class Moto extends Vehicule {
	private boolean sidecar;
	
	public Moto(){
		super();
		sidecar = false;
	}
	public Moto(String unNom, double uneVit, int unPoids, int unCarb) {
		super(unNom, uneVit, unPoids, unCarb);
		sidecar = false;
	}
	public Moto(String unNom, double uneVit, int unPoids, int unCarb, boolean unSide) {
		super(unNom, uneVit, unPoids, unCarb);
		sidecar = unSide;
	}
	
	public boolean getSidecar(){
		return sidecar;
	}
	
	public String toString(){
		String s = "";
		s += super.toString() + ", Moto";
		s += (this.getSidecar())? ", avec sidecar" : "";
		return s;
	}

}
