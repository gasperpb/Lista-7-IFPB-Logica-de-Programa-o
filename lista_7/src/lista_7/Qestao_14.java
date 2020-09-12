package lista_7;

import java.util.Scanner;

public class Qestao_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();

		int i = 1;
		int t = 0;
		while (t < n1) {
			t = i * (i + 1) * (i + 2);
			i += 1;
		}
		if (t == n1) {
			System.out.println(" é triangular" + n1);
		}

		else {
			System.out.println(" Não é triangular" + n1);

			sc.close();
		}
	}
}