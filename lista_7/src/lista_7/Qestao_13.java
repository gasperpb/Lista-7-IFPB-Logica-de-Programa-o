package lista_7;

import java.util.Scanner;

/*13. Escreva um algoritmo que imprima um menu com cinco op¸c˜oes (soma, subtra¸c˜ao, multiplica
¸c˜ao, divis˜ao e sair) e, de acordo com a escolha do usu´ario, deve solicitar os dois
operandos e realizar a opera¸c˜ao ou encerrar a execu¸c˜ao. Enquanto n˜ao escolher sair, o algoritmo
deve ficar imprimindo o menu, lendo a op¸c˜ao e executando a opera¸c˜ao aritm´etica.
*/


public class Qestao_13 {
	
	
	
	
	public static int menu(Scanner sc) {
		
		
		//System.out.println("========Calculadora============");
		System.out.println("1 Para Somar");
		System.out.println("2 Para Subtração");
		System.out.println("3 Para Multiplicação");
		System.out.println("4 Para Divisão");
		System.out.println("5 Para Sair");
		
		
		
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int op;
		while ((op = menu(sc)) != 5) {
			System.out.println("Digite o 1 operado:  ");
			Double n1 = sc.nextDouble();
			System.out.println("Digite o 2 operado:  ");
			Double n2 = sc.nextDouble();

			if (op == 1) {
				System.out.printf("%.2f", (n1 + n2));
			}
			if (op == 2) {
				System.out.printf("%.2f", (n1 - n2));
			}
			if (op == 3) {
				System.out.printf("%.2f", (n1 * n2));
			}
			if (op == 4) {
				System.out.printf("%.2f", (n1 / n2));
			}
		}
	
}}
