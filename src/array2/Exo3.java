package array2;

import java.util.Scanner;

public class Exo3 {

	/*M�me question, c�est � dire saisie d�un tableau et recherche du plus grand �l�ment, mais cette fois pour
un tableau contenant des caract�res.*/
	private static Scanner input;

	public static void main(String[] args) {
		//d�claration du tableau
		char[] tab;
		
		//cr�ation d'une nouvelle instance 
		tab = new char[6];
		
		//Cr�ation d'une variable pour cibler le plus grand �l�ment
		char bigLetter;
		
		//cr�ation Scanner
		input = new Scanner(System.in);
		
		//Entrer 6 entiers dans notre tableau
		for(int i=0; i<tab.length; i++) {
			System.out.print("Entrez une letter: ");
			tab[i] = input.next().charAt(0);

		}
		//initialisation du la variable bigNumber
		bigLetter = tab[0];
		
		//Affichage du plus grand element
		for(int i=0; i<tab.length; i++) {
			if(tab[i] > bigLetter) {
				bigLetter = tab[i];
			}
		}
		System.out.print("Voici le plus grand �lement de ce tableau : " + bigLetter);
	}



}


