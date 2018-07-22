package array3;

import java.util.Scanner;

public class Exo2 {

	/* Ecrivez un programme qui saisit au clavier 4 valeurs bool�ennes (true ou false) et qui
affiche ensuite le r�sultat de l�op�ration ET sur toutes ces valeurs ainsi que le r�sultat de l�op�ration
OU sur toutes ces valeurs*/

	private static Scanner input;

	public static void main(String[] args) {

		//cr�ation d'un tableau de type boolean avec une taille de 4
		boolean[] tab = new boolean[4];

		//d�claration de deux variables boolean et/ou
		boolean et;
		boolean ou;

		input = new Scanner(System.in);

		for(int i=0; i<4; i++) {
			System.out.println("Entrez un booleen (false ou true): ");
			tab[i] = input.nextLine() != null;

		}
		//on initialise les variables
		et = true;
		ou = false;


		for (int i=0; i<4; i++) {
			et = et && tab[i];
			ou = ou || tab[i];
		}

		System.out.println("Valeur du et: " + et);
		System.out.println("Valeur du ou: " + ou);



	}

}
