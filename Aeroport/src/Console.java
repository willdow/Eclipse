import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	//declaration d'un buffer de lecture clavier
	
	private static BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
	//lecture d'un entier
	
	public static int saisirInt()
	{ 
		int nb = 0;
		String chaine ="";
		boolean ok= false;
		do {
		try {
			chaine = entree.readLine(); //lecture de la chaine
			nb = Integer.parseInt(chaine); //conversion en un entier
			ok = true;
		}
		catch(IOException exp)
		{
			System.out.println("Erreur de lecture clavier");
		}
		catch(NumberFormatException exp)
		{
			System.out.println("Erreur du format du nombre !");
		}
	}while (ok == false);
	return nb;
	}
	
	
	public static float saisirFloat()
	{ 
		float nb = 0;
		String chaine ="";
		boolean ok= false;
		do {
		try {
			chaine = entree.readLine(); //lecture de la chaine
			nb = Float.parseFloat(chaine); //conversion en un entier
			ok = true;
		}
		catch(IOException exp)
		{
			System.out.println("Erreur de lecture clavier");
		}
		catch(NumberFormatException exp)
		{
			System.out.println("Erreur du format du nombre !");
		}
	}while (ok == false);
	return nb;
	}
	
	
	public static String saisirString()
	{ 
		String chaine ="";
	
		try {
			chaine = entree.readLine(); //lecture de la chaine
			
		}
		catch(IOException exp)
		{
			System.out.println("Erreur de lecture clavier");
		}
		
	return chaine;
	}
	
	public static char saisirChar()
	{ 
		String chaine ="";
	
		try {
			chaine = entree.readLine(); //lecture de la chaine
			
		}
		catch(IOException exp)
		{
			System.out.println("Erreur de lecture clavier");
		}
		
	return chaine.charAt(0);
	}
}