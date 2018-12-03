
public class Vol {
	
	private String nom,numero;
	public Vol () {
		this.nom ="";
		this.numero ="";
	}
	
	public void saisir() {
		System.out.println("Donner le nom du vol");
		this.nom = Console.saisirString();
		System.out.println("Donner le numero du vol");
		this.numero = Console.saisirString();
	}
	public void afficher() {
		 System.out.println("Le nom : " + this.nom);
		 System.out.println("Le code : " + this.numero);
	     
	}
	public String toString() {
		String chaine = "";
		chaine = this.nom+","+this.numero;
		return chaine;
	}
	public String toXml() {
	 	String chaine = "";
	 	chaine +="<vol>\n";
	 	chaine +="\t<nom>"+this.nom + "</nom>\n";
	 	chaine +="\t<numero>"+this.numero + "</numero>\n";
	 	chaine +="</vol>\n";
    	return chaine;
	}
	
//getters and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	


	
}