package array3;

import java.util.Scanner;

public class Exo3 {

	private static Scanner input;

	/*Il s’agit de calculer un tableau de valeurs en francs obtenus en convertissant les valeurs d’un autre
tableau, exprimées en euros et saisies au clavier.*/

	public static void main(String[] args) {

		//Déclaration des deux tables (euros et francs) de type double
		double[] tabEuros;
		double[] tabFrancs;

		int num;
		input = new Scanner(System.in);
		System.out.println("Combien de valeur ? ");
		num = input.nextInt();

		tabEuros = new double[num];
		tabFrancs = new double[num];

		for(int i=0; i<num; i++) {
			System.out.println("Entrez une valeur en euros : ");
			tabEuros[i] = input.nextDouble();
		}

		for(int i=0; i<num; i++) {
			tabFrancs[i] = tabEuros[i] * 6.559;
		}

		for(int i=0; i<num; i++) {
			System.out.print("Valeur numero " + i +" : " + tabEuros[i]);
			System.out.println(" euros (" + tabFrancs[i] + " francs)");
		}
	}

}
