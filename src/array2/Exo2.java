package array2;

import java.util.Scanner;

public class Exo2 {

	/*Reprendre la partie saisie du programme précédent pour écrire un nouveau programme qui re-
	cherche et affiche le plus grand élément du tableau.*/

	private static Scanner input;

	public static void main(String[] args) {
		//déclaration du tableau
		int[] tab;
		
		//création d'une nouvelle instance 
		tab = new int[6];
		
		//Création d'une variable pour cibler le plus grand élément
		int bigNumber;
		
		//création Scanner
		input = new Scanner(System.in);
		
		//Entrer 6 entiers dans notre tableau
		for(int i=0; i<tab.length; i++) {
			System.out.print("Entrez un entier: ");
			tab[i] = input.nextInt();

		}
		
		//initialisation du la variable bigNumber
		bigNumber = tab[0];
		
		//Affichage du plus grand element
		for(int i=0; i<tab.length; i++) {
			if(tab[i] > bigNumber) {
				bigNumber = tab[i];
			}
		}
		System.out.print("Voici le plus grand élement de ce tableau : " + bigNumber);
	}

}