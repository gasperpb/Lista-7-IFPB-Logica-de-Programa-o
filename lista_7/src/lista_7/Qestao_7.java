package lista_7;

import java.util.Scanner;

//7. Escreva um algoritmo que leia uma palavra e indique o n ́umero de ocorrˆencias de cada uma
//das seguintes letras, B, C e D.
public class Qestao_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra = sc.nextLine();

		int contB = 0, contC = 0, contD = 0;

		for (int i = 0; i < palavra.length(); i++) {

			if (palavra.charAt(i) == 'B') {
				contB++;
			} 
				if (palavra.charAt(i) == 'C') {
				contC++;
			} if (palavra.charAt(i) == 'D') {
				contD++;
				
			}
		}
		System.out.println(contB);
		System.out.println(contC);
		System.out.println(contD);
		sc.close();
	}
}
