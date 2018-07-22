package array2;

import java.util.Scanner;

public class Exo1 {
	/*Ecrire un programme qui saisit 6 entiers et les stocke dans un tableau, puis affiche le contenu de ce
	tableau une fois qu’il est rempli.*/

	private static Scanner input;

	public static void main(String[] args) {
		//déclaration du tableau
		int[] tab;
		
		//création d'une nouvelle instance 
		tab = new int[6];
		input = new Scanner(System.in);
		
		//Entrer 6 entiers dans notre tableau
		for(int i=0; i<tab.length; i++) {
			System.out.print("Entrez un entier: ");
			tab[i] = input.nextInt();

		}
		
		//Affichage du tableau
		for(int i=0; i<tab.length; i++) {
			System.out.print( tab[i] + " ");
		}
	}

}
