package lista_7;
/*16. Escreva um algoritmo que imprima a lista dos n´umeros primos entre 200 e 300. N´umero
primo ´e um n´umero natural que tem apenas dois divisores diferentes, o 1 e ele mesmo. Por
defini¸c˜ao, 1 n˜ao ´e primo.*/


public class Qestao_16 {

	public static void main(String[] args) {
		
		


        for (int i = 200; i < 300; i++) {
          
        	
        	boolean ehPrimo = true;
            
            
            for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(i + " é Primo!");
                }
            }
        }
	}
