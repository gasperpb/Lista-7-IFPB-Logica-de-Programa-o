package lista_7;

import java.util.Scanner;

public class Qestao_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double n1, n2;
		do {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			Double result = n1 + n2;
			System.out.println(result);
		} while (n1 != 0 || n2 != 0);

	}

}
