
public class Pays {

	private String nom;
	public Pays () {
		this.nom ="";
	}
	
	public void saisir() {
		System.out.println("Donner le nom du pays");
		this.nom = Console.saisirString();
	}
	public void afficher() {
		 System.out.println("Le nom du pays: " + this.nom);
	}
	public String toString() {
		String chaine = "";
		chaine = this.nom ;
		return chaine;
	}
	public String toXml() {
	 	String chaine = "";
	 	chaine +="<pays>\n";
	 	chaine +="\t<nom>"+this.nom + "</nom>\n";
	 	chaine +="</pays>\n";
    	return chaine;
	}
	
//getters and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}