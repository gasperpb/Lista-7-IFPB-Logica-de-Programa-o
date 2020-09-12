package lista_7;




public class Qestao_12 {

	public static void main(String[] args) {

		for (int i = 2; i < 100; i++) {

			boolean ehPrimo = true;

			for (int j = 2; j <= i; j++) {
				if (((i % j) == 0) && (j != i)) {
					ehPrimo = false;
					break;
				}
			}

			if (ehPrimo) {
				System.out.println(i + " É Primo!");
			}
		}
	}

}
