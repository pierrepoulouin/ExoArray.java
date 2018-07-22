package array2;

import java.util.Scanner;

public class Exo5 {

	/*Ecrire un programme qui saisit d’abord un nombre n, puis ensuite saisit n caractères et les place
dans un tableau.*/

	private static Scanner input;


	public static void main(String[] args) {

		//Declaration du tableau
		char[] tab;

		//Declaration du nombre n
		int n;

		//Scanner instance
		input = new Scanner(System.in);


		// On stock l'input dans l'entier n
		System.out.println("Entrez un entier : ");
		n = input.nextInt();

		//Creation d'une instance
		tab = new char[n];


		for(int i=0; i<tab.length; i++) {
			System.out.print("Entrez un caractère : ");
			tab[i] = input.next().charAt(0);
		}
		System.out.println("Voici le résultat : ");

		for(int i=0; i<tab.length; i++) {
			System.out.print(" " + tab[i]);
		}
	}

}
