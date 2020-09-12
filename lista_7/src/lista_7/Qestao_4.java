package lista_7;
/* 4. Um n ́umero par  ́e um n ́umero inteiro que pode ser escrito na forma 2n e n  ́e inteiro. Escreva
** um algoritmo que escreva a soma dos 100 n ́umeros pares consecutivos, iniciando do 100.
*/
public class Qestao_4 {
	

	public static void main(String[] args) {
		int soma=0;
		
		for(int i=100;i<301;i+=2) 
			
			soma += i;
			
			System.out.println(soma);
		}

	}


