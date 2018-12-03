

public class Ville {
	
	private String nom,code;
	public Ville () {
		this.nom ="";
		this.code ="";
	}
	
	public void saisir() {
		System.out.println("Donner le nom de la ville");
		this.nom = Console.saisirString();
		System.out.println("Donner le code de la ville");
		this.code = Console.saisirString();
	}
	public void afficher() {
		 System.out.println("Le nom : " + this.nom);
		 System.out.println("Le code : " + this.code);
	     
	}
	public String toString() {
		String chaine = "";
		chaine = this.nom+","+this.code;
		return chaine;
	}
	public String toXml() {
	 	String chaine = "";
	 	chaine +="<ville>\n";
	 	chaine +="\t<nom>"+this.nom + "</nom>\n";
	 	chaine +="\t<code>"+this.code + "</code>\n";
	 	chaine +="</ville>\n";
    	return chaine;
	}
	
//getters and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}