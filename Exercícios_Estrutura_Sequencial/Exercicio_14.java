/* Estrutura Sequencial 
//Exercício 14 - Faça um programa que leia duas variáveis e troque o conteúdo dessas duas variáveis.
Em seguida, imprima o valor dessas variáveis invertido. 
Exemplo: A = 7, B = 9. Saída: A = 9, B = 7.
*/

import java.util.Scanner;
public class Exercicio_14
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double a, b, auxiliar;
	    
	    //Entrada
		  System.out.println("Digite o valor de A:");
		  a=sc.nextDouble();
		  System.out.println("Digite o valor de B:");
		  b=sc.nextDouble();
		
		  //Processamento
      auxiliar = a;
      a = b;
      b = auxiliar;
		
		  //Saída
		  System.out.println("A = "+a);
		  System.out.println("B = "+b);
	}
}
