package array2;

import java.util.Scanner;

public class Exo4 {

	/*Ecrire un programme qui saisit un tableau de 6 entiers puis calcule la moyenne de ces six entiers.
Attention, la moyenne des entiers n’est pas un entier.*/
	private static Scanner input;

	public static void main(String[] args) {
		
		//déclaration du tableau
		int[] tab;
		
		//création d'une nouvelle instance 
		tab = new int[6];
		
		//création Scanner
		input = new Scanner(System.in);
		
		//Entrer 6 entiers dans notre tableau
		for(int i=0; i<tab.length; i++) {
			System.out.print("Entrez un entier: ");
			tab[i] = input.nextInt();

		}
		
		//Faire la moyenne des 6 entiers
		double average = (tab[0] + tab[1] + tab[2] + tab[3] + tab[4] + tab[5]) / 6.0;
		System.out.print("Voici la moyenne des valeurs du tableau : " + average);
	}

}
