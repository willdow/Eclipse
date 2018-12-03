
public class Pilote {

	private String nom, prenom;
	private String dateEntree;
	
	public Pilote() {
		this.nom="";
		this.prenom="";
		this.dateEntree = "";
	}
	
	public void saisir() {
		System.out.println("Donner le Nom :");
		this.nom = Console.saisirString();
		System.out.println("Donner le Prenom:");
		this.prenom =Console.saisirString();
		System.out.println("Donner la date Entree:");
		this.dateEntree =Console.saisirString();
	}
	
	public void afficher() 
	{
		System.out.println("Le nom       :"+ this.nom);
		System.out.println("Le prenom    :" +this.prenom);
		System.out.println("La date Entree :" +this.dateEntree);
	}
	
	public String toString() {
		String chaine = "";
		chaine = this.nom +","+this.prenom+","+this.dateEntree;
		return chaine;
	}
	
	public String toXml() {
		String chaine ="";
		chaine = "<pilote>\n"+
				"<nom>"+this.nom +"</nom>\n"+
				"<prenom>"+this.prenom +"</prenom>\n"+
				"<dateEntree>"+this.dateEntree +"</dateEntree>\n"+
				"</pilote>";
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

	public String getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}
	
	
	
}
