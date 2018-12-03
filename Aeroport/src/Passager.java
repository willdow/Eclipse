
public class Passager {

	private String nom, prenom;
	private String date;
	
	public Passager() {
		this.nom="";
		this.prenom="";
		this.date = "";
	}
	
	public void saisir() {
		System.out.println("Donner le Nom :");
		this.nom = Console.saisirString();
		System.out.println("Donner le Prenom:");
		this.prenom =Console.saisirString();
		System.out.println("Donner la date :");
		this.date =Console.saisirString();
	}
	
	public void afficher() 
	{
		System.out.println("Le nom       :"+ this.nom);
		System.out.println("Le prenom    :" +this.prenom);
		System.out.println("La date		:" +this.date);
	}
	
	public String toString() {
		String chaine = "";
		chaine = this.nom +","+this.prenom+","+this.date;
		return chaine;
	}
	
	public String toXml() {
		String chaine ="";
		chaine = "<passager>\n"+
				"<nom>"+this.nom +"</nom>\n"+
				"<prenom>"+this.prenom +"</prenom>\n"+
				"<date>"+this.date +"</date>\n"+
				"</passager>";
		return chaine;
	}
	
	
//getters and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
