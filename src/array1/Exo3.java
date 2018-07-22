package array1;
import java.util.Scanner;

public class Exo3 {

	private static Scanner user;

	public static void main(String[] args) {

		/* Ecrire un programme qui saisit un entier au clavier et qui recherche si cet entier appartient au tableau.
		Au cas où la réponse est positive, l’indice de cet entier dans le tableau est affiché. S’il y a plusieurs
		occurrences, le dernier indice est affiché.*/




		//déclaration du tableau
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};

		//Déclaration du Scanner
		System.out.println("Veuillez entrer un nombre entier: ");
		user = new Scanner(System.in);
		int number = user.nextInt();

		//Boucle for pour check les valeurs du tableau

		for(int i = 7; i>0; i--) {
			if(number == tab[i]) {
				System.out.println("Oui il y a bien le chiffre " + number + " à la position " + i);
				i = 0;

			}}
	}
}


