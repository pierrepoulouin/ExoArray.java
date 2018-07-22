package array1;

public class Exo1 {
	/* Ecrire un programme qui saisit un entier et qui 
	 * recherche si cet entier appartient au tableau
	 * (réponse de type oui/non
	 * 
	 * Note : il serait possible d’arrêter la recherche dès qu’on a trouvé le nombre avec une instruction
break pour sortir de la boucle for.
	 */
	public static void main(String[] args) {



		//déclaration du tableau
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};

		//afficher le 8 element du tableau
		System.out.println(tab [7]);

		//afficher tous les elements du tableau sans boucle
		System.out.print(tab[0]);
		System.out.print(tab[1]);
		System.out.print(tab[2]);
		System.out.print(tab[3]);
		System.out.print(tab[4]);
		System.out.print(tab[5]);
		System.out.print(tab[6]);
		System.out.println(tab[7]);

		//Avec boucle while
		int i = 0;
		while(i<8) {
			System.out.println(tab[i]);
			i++;
		}
		/*Avec boucle for.   On peut utiliser tab.length 
		 * pour définir la taille du tableau 
		 */
		for (i = 0; i<8; i++) {
			System.out.println(tab[i]);
		}











	}

}
