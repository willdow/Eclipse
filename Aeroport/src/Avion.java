
public class Avion {

	private String nom, code, type, date;
	
	public Avion() {
		this.nom="";
		this.code="";
		this.type = "";
		this.date = "";
	}
	
	public void saisir() {
		System.out.println("Donner le Nom :");
		this.nom = Console.saisirString();
		System.out.println("Donner le code:");
		this.code =Console.saisirString();
		System.out.println("Donner le type:");
		this.type =Console.saisirString();
		System.out.println("Donner la date:");
		this.date =Console.saisirString();
	}
	
	public void afficher() 
	{
		System.out.println("Le nom       :"+ this.nom);
		System.out.println("Le code    :" +this.code);
		System.out.println("Le type :" +this.type);
		System.out.println("La date :" +this.date);
	}
	
	public String toString() {
		String chaine = "";
		chaine = this.nom +","+this.code+","+this.type+","+this.date;
		return chaine;
	}
	
	public String toXml() {
		String chaine ="";
		chaine = "<avion>\n"+
				"<nom>"+this.nom +"</nom>\n"+
				"<code>"+this.code +"</code>\n"+
				"<type>"+this.type +"</type>\n"+
				"<date>"+this.date +"</date>\n"+
				"</avion>";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

	
	
	
}
