package array3;

import java.util.Scanner;

public class Exo1bis {

	/* Dans cette première version du programme, chaque somme est calculée indépendamment. On peut
optimiser les calculs en considérant que pour chaque case (sauf la première), il suffit d’ajouter la valeur
de l’indice à la valeur de la case précédente pour obtenir le résultat recherché.*/

	private static Scanner input;

	public static void main(String[] args) {

		int[] tab;
		int n;
		input = new Scanner(System.in);
		System.out.println("Veuillez entrer le plus grand indice: ");
		n = input.nextInt();

		//La table prendra la taille n+1
		tab = new int[n+1];

		//Entrer la première valeur du tableau
		tab[0] = 0;

		for(int i=1; i<= n; i++) {
			tab[i] = tab[i -1] + i;
		}

		for(int i=0; i<=n; i++) {
			System.out.println("Indice " + i + " valeur " + tab[i]);
		}
	}

}
