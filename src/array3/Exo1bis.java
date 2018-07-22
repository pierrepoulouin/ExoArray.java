package array3;

import java.util.Scanner;

public class Exo1bis {

	/* Dans cette premi�re version du programme, chaque somme est calcul�e ind�pendamment. On peut
optimiser les calculs en consid�rant que pour chaque case (sauf la premi�re), il suffit d�ajouter la valeur
de l�indice � la valeur de la case pr�c�dente pour obtenir le r�sultat recherch�.*/

	private static Scanner input;

	public static void main(String[] args) {

		int[] tab;
		int n;
		input = new Scanner(System.in);
		System.out.println("Veuillez entrer le plus grand indice: ");
		n = input.nextInt();

		//La table prendra la taille n+1
		tab = new int[n+1];

		//Entrer la premi�re valeur du tableau
		tab[0] = 0;

		for(int i=1; i<= n; i++) {
			tab[i] = tab[i -1] + i;
		}

		for(int i=0; i<=n; i++) {
			System.out.println("Indice " + i + " valeur " + tab[i]);
		}
	}

}
