package array1;
import java.util.Scanner;

public class Exo2 {

	private static Scanner user;

	public static void main(String[] args) {

		/*Ecrire un programme qui saisit un entier au clavier et qui recherche
		 *si cet entier appartient au tableau
		(r�ponse de type oui/non).
		Note : il serait possible d�arr�ter la recherche d�s qu�on a trouv� le nombre avec une instruction
		break pour sortir de la boucle for.*/

		//d�claration et initialisation de la r�ponse
		boolean reponse = false;

		//d�claration du tableau
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};

		//D�claration du Scanner
		System.out.println("Veuillez entrer un nombre entier: ");
		user = new Scanner(System.in);
		int number = user.nextInt();

		//Boucle for pour check les valeurs du tableau

		for(int i = 0; i<tab.length; i++) {
			if(number == tab[i]) {
				System.out.println("Oui");

				reponse = true;
				break; } }
		if (reponse == false) {
			System.out.println("Non");
		}
	}

}


