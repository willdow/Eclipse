
public class Compte 
{
	private String nom, prenom;
	private int numero;
	private float solde;
	
	public Compte() {
		this.nom = "";
		this.prenom ="";
		this.numero=0;
		this.solde=0;
		
	}
	public void ouvrir() {
		System.out.println("Donner le nom");
		this.nom = Console.saisirString();
		System.out.println("Donner le prenom");
		this.prenom = Console.saisirString();
		System.out.println("Donner le numero");
		this.numero = Console.saisirInt();
	}
	
	public void consulter() {
		System.out.println("Nom:    " + this.nom);
		System.out.println("Prenom:    " + this.prenom);
		System.out.println("Numero:    " + this.numero);
		System.out.println("Solde:    " + this.solde);
	}
	public void deposer() {
		float somme;
		System.out.println("Donner la somme a deposer");
		somme = Console.saisirFloat();
		this.solde += somme;
	}
	
	public void retirer() {
		float somme;
		System.out.println("Donner la somme a retirer");
		somme = Console.saisirFloat();
		if (somme<= this.solde) {
			this.solde -= somme;
			System.out.println("New solde :" + this.solde);
		}else {
			System.out.println("Retrait impossible");
		}
	}

	public void gerer() {
		int choix = 0;
		do {
			System.out.println("-----Menu Gere Compte-----");
			System.out.println("1- Ouverture");
			System.out.println("2- Consultation");
			System.out.println("3- Depot");
			System.out.println("4- Retrait");
			System.out.println("0- Quitter");
			
			choix = Console.saisirInt();
			switch(choix)
			{
			case 1 : this.ouvrir(); break;
			case 2 : this.consulter(); break;
			case 3 : this.deposer();break;
			case 4 : this.retirer();break;
			}
		}while(choix !=0);
	}
}	
