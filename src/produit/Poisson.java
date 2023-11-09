package produit;

public class Poisson extends Produit {
	private String date;
	
	public Poisson(String nom, String date) {
		super(nom);
		this.date = date;
	}
	public String getDate() {
		return date;
	}
}
