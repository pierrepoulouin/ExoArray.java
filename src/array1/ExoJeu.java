package array1;
import java.util.Scanner;

public class ExoJeu {

	private static Scanner user;

	public static void main(String[] args) {
		String [] tab = new String [5];
		tab [0] = "a";
		tab [1] = "v";
		tab [2] = "i";
		tab [3] = "o";
		tab [4] = "n";
		int i = 0;


		System.out.println("Veuillez entrer une lettre: ");
		user = new Scanner(System.in);
		String letter = user.nextLine();
		boolean bool = false;
		for (i = 0; i < 5; i++) {
			if (((letter.equals(tab[i])) && (tab[i].equals("a"))) || ((letter.equals(tab[i])) && (tab[i].equals("n")))) {
				System.out.println("Vous êtes vraiment un dieu ! ");
				bool = true;
				break;
			}	
		}
		if (bool == false) {
			System.out.println("vous êtes pas très bon !");
		}

	}
}

