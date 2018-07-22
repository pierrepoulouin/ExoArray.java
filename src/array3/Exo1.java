package array3;

import java.util.Scanner;

public class Exo1 {

	/* Ecrivez un programme qui saisit un nombre n au clavier et qui calcule un tableau dont le plus grand
indice est n et dans lequel il y a, pour chaque case d’indice i, la somme des entiers compris entre 0 et i */
	private static Scanner input;

	public static void main(String[] args) {
		int n;
		int[] tab;
		int sum = 0;

		input = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier : ");
		n = input.nextInt();
		tab = new int[n + 1];

		for(int i=0; i<= n; i++) {
			sum = 0;
			for(int j=0; j<= i; j++) {
				sum = sum + j;
			}
			tab[i] = sum;
		}
		for(int i=0; i<=n; i++) {
			System.out.println("Indice: " + i + " valeur " + tab[i]);
		}
	}

}
