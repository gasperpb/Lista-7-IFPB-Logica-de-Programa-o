package lista_7;

import java.util.Scanner;

//9. Escreva um algoritmo que imprima todos os n ́umeros de 30 a 1, nesta ordem.
public class Qestao_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String fita = sc.nextLine();

		String cr = "";
		for (int i = 0; i < fita.length(); i++) {
			if (fita.charAt(i) == 'A') {
				cr = "T" + cr;

			}
			if (fita.charAt(i) == 'T') {
				cr = "A" + cr;

			}
			if (fita.charAt(i) == 'C') {
				cr = "G" + cr;

			}
			if (fita.charAt(i) == 'G') {
				cr = "C" + cr;

			}

		}

		System.out.println(cr);
		sc.close();
	}

}
