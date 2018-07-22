package array1;
import java.util.Scanner;

public class Exo4 {

	private static Scanner user;

	public static void main(String[] args) {

		/* Ecrire un programme qui saisit deux indices et �change
		 *  les valeurs contenues dans le tableau � ces deux
	 indices. Le programme affichera le contenu du tableau avant
	  et apr�s cette transformation. */

		//d�claration du tableau
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};

		//Affichage du tableau avant la modification avec for 
		for (int i = 0; i<tab.length; i++) {
			System.out.println(tab[i]);

		}
		//D�claration du Scanner
		System.out.println("Veuillez entrer une position du tableau en nombre entier: ");
		user = new Scanner(System.in);
		int number = user.nextInt();
		System.out.println("Veuillez entrer une seconde position du tableau en nombre entier : ");
		int number2 = user.nextInt();

		//Cr�ation d'une troisi�me variable pour stocker les deux autres
		int number3 = 0;

		//Phase d'�change
		if ((number < 0) || (number >= tab.length)) {
			System.out.println("Essayez plut�t entre 0 et 7 ;)");
		}
		else if ((number2 < 0) || (number2 >= tab.length)) {
			System.out.println("Essayez plut�t entre 0 et 7 ;)");
		}
		else {
			number3 = tab[number];
			tab[number] = tab[number2];
			tab[number2] = number3;

			//Affichage du tableau apr�s la modification
			for ( int i = 0; i<tab.length; i++) {
				System.out.println(tab[i]);

			}
		}
	}
}