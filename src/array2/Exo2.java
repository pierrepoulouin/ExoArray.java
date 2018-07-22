package array2;

import java.util.Scanner;

public class Exo2 {

	/*Reprendre la partie saisie du programme pr�c�dent pour �crire un nouveau programme qui re-
	cherche et affiche le plus grand �l�ment du tableau.*/

	private static Scanner input;

	public static void main(String[] args) {
		//d�claration du tableau
		int[] tab;
		
		//cr�ation d'une nouvelle instance 
		tab = new int[6];
		
		//Cr�ation d'une variable pour cibler le plus grand �l�ment
		int bigNumber;
		
		//cr�ation Scanner
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
		System.out.print("Voici le plus grand �lement de ce tableau : " + bigNumber);
	}

}