package lista_7;

import java.util.Scanner;

//5. Escreva um algoritmo que leia 30 n ́umeros inteiros e imprima, a soma deles.
public class Qestao_6 {
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int inf = sc.nextInt();
		 int sup = sc.nextInt();
		
		int soma = 0;
		 
		
		for(int i = inf; i<=sup; i++)
	          
			soma+=i*i;
			
		   
		        
	            //soma = soma + i
	        System.out.println(soma);

	}}


