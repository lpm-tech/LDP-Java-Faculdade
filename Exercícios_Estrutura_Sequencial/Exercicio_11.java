/* Estrutura Sequencial 
//Exercício 11 -  Faça um programa que receba um número inteiro e que imprima
o antecessor, o sucessor, o dobro e a metade do número informado.
*/

import java.util.Scanner;
public class Exercicio_11
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int n, antecessor, sucessor, dobro;
	    double metade;
	    
	    //Entrada
		  System.out.println("Digite um número inteiro:");
		  n=sc.nextInt();
		
		  //Processamento
      antecessor = n - 1;
      sucessor = n + 1;
		  dobro = n*2;
		  metade = n/2.0;
		
		  //Saída
		  System.out.println("---Operação com "+n+"---");
		  System.out.println("Antecessor: "+antecessor);
		  System.out.println("Sucessor: "+sucessor);
		  System.out.println("Dobro: "+dobro);
		  System.out.printf("Metade: %.2f%n",metade);
	}
}
