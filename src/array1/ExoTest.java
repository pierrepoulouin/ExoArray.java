package array1;

public class ExoTest {

	public static void main(String[] args) {
		// Déclaration du tableau
		char [] tab = new char [5];
		tab [0] = 'a';
		tab [1] = 'v';
		tab [2] = 'i';
		tab [3] = 'o';
		tab [4] = 'n';
		
		for (int pos = 0; pos < 5; pos++) {
			if(tab[pos] == 'i') {
				System.out.println("YES");
			}
		}

	}

}
