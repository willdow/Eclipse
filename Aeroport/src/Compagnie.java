
public class Compagnie {

	private String nom, code,pays;
	
	public Compagnie() {
		this.nom="";
		this.code="";
		this.pays = "";
	}
	
	public void saisir() {
		System.out.println("Donner le nom de la compagnie:");
		this.nom = Console.saisirString();
		System.out.println("Donner le code de la compagnie:");
		this.code =Console.saisirString();
		System.out.println("Donner le pays de la compagnie:");
		this.pays =Console.saisirString();
	}
	
	public void afficher() 
	{
		System.out.println("Le nom       :"+ this.nom);
		System.out.println("Le code    :" +this.code);
		System.out.println("Le pays :" +this.pays);
	}
	
	public String toString() {
		String chaine = "";
		chaine = this.nom +","+this.code+","+this.pays;
		return chaine;
	}
	
	public String toXml() {
		String chaine ="";
		chaine = "<compagnie>\n"+
				"<nom>"+this.nom +"</nom>\n"+
				"<code>"+this.code +"</code>\n"+
				"<pays>"+this.pays +"</pays>\n"+
				"</compagnie>";
		return chaine;
	}

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

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
}

