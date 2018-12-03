import java.util.ArrayList;

public class Aeroport {

	private String nom, salle;
	private Avion unAvion; //composition 1-1 entre groupe et maitresse
	private Compagnie laCompagnie; //composition 1-1 entre groupe et niveauEtudes
	private ArrayList<Vol> lesVols;; //composition 1-1 entre groupe et enfant
	
	public Aeroport() {
		this.nom="";
		this.salle="";
		this.unAvion = new Avion(); //instanciation de la classe
		this.laCompagnie = new Compagnie();
		this.lesVols = new ArrayList<Vol>();
	}
	public void saisir() {
		System.out.println("Donner le nom : ");
		this.nom = Console.saisirString();
		System.out.println("Donner la salle : ");
		this.salle = Console.saisirString();
		System.out.println("Donner les infos de l'avion : ");
		this.unAvion.saisir();
		System.out.println("Infos de la Compagnie : ");
		this.laCompagnie.saisir();
	}
	public void afficher () {
		System.out.println("Le nom du groupe est : " + this.nom);
		System.out.println("La salle du groupe est : " + this.salle);
		System.out.println("L'avion : " );
		this.unAvion.afficher();
		System.out.println("La compagnie : " );
		this.laCompagnie.afficher();
	}
	public void ajouterVol(){
		
		Vol unVol = new Vol (); //instanciation
		unVol.saisir(); //renseignement des attributs
		this.lesVols.add(unVol);
		System.out.println("Le vol a bien été enregistré !");
	}
	public void listerLesVols() { 
		//parcours par indice
		for (int i = 0; i<this.lesVols.size();i++)
		{
			this.lesVols.get(i).afficher();
		}
		//parcours par référence					boucle a apprendre par coeur (exam)
		for (Vol unVol : this.lesVols)
		{
			unVol.afficher();
		}
	}
	public void rechercher() {
		String nom;
		System.out.println("Donner le nom a rechercher: ");
		nom = Console.saisirString();
		for (Vol unVol : this.lesVols)
		{
			if (unVol.getNom().equals(nom) || unVol.getNumero().equals(nom))
			{
				unVol.afficher();
			}
		}
	}
	public void supprimer() {
		String nom, prenom;
		System.out.println("Donner le nom de du vol à retirer : ");
		nom = Console.saisirString();
		System.out.println("Donner le prenom du vol à retirer : ");
		prenom = Console.saisirString();
		for (Vol unEnfant : this.lesVols)
		{
			if (unEnfant.getNom().equals(nom) && unEnfant.getNumero().equals(prenom))
			{
				System.out.println("Cet enfant est retiré !");
				unEnfant.afficher();
				this.lesVols.remove(unEnfant);
			}
		}
	}
	public void menu() {
		int choix = 0;
		do {
			System.out.println("----- Menu Aeroport -----");
			System.out.println("1- Saisie des infos Aeroport");
			System.out.println("2- Afficher infos Aeroport");
			System.out.println("3- Ajouter d'un vol");
			System.out.println("4- Lister les vols");
			System.out.println("5- Recherche des Vol");
			System.out.println("6- Supprimer un vol");
			System.out.println("0- Quitter le menu");
			System.out.println("Votre choix : ");
			choix = Console.saisirInt();
			switch(choix)
			{
			case 1 : this.saisir(); break;
			case 2 : this.afficher(); break;
			case 3 : this.ajouterVol();break;
			case 4 : this.listerLesVols();break;
			case 5 : this.rechercher(); break;
			case 6 : this.supprimer();break;
			}
		}while(choix !=0);
		
	}
	public String toXml()
	{
		String chaine="";
		chaine ="<aeroport>\n" + "<nom>"+this.nom +"</nom>\n"+
				"<salle>"+this.salle +"</salle>\n"+
			this.unAvion.toXml()+
			this.laCompagnie.toXml()+ "\n<liste>";
		for (Vol unEnfant : this.lesVols)
		{
			chaine+= unEnfant.toXml();
				
		}
		chaine += "\n</liste>";
		chaine+= "\n</aeroport>";
		return chaine;
	}
}