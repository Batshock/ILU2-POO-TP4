package produit;

public class Sanglier extends Produit{
	private int poids;
	
	public Sanglier(String nom, int poids) {
		super(nom);
		this.poids = poids;
	}
	public int getPoids() {
		return poids;
	}
}
