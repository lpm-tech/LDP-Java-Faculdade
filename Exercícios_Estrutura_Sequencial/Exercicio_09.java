/* Estrutura Sequencial
//Exercício 9 - Receba um número positivo, calcule e mostre:
- O número digitado ao quadrado
- O número digitado ao cubo
- A raiz quadrada do número digitado
- A raiz cúbica do número digitado.
*/

import java.util.Scanner;
public class Exercicio_09
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double n, quadrado, cubo, raiz_q, raiz_c;
	    
	    //Entrada
		  System.out.println("Digite um número positivo:");
		  n=sc.nextDouble();
		
		  //Processamento
		  quadrado = n*n;
		  cubo = n*n*n;
		  raiz_q = Math.sqrt(n);
		  raiz_c = Math.cbrt(n);
		
		  //Saída
		  System.out.printf("O quadrado de %.2f é: %.2f%n",n,quadrado);
	    System.out.printf("O cubo de %.2f é: %.2f%n",n,cubo);
	    System.out.printf("A raiz quadrada de %.2f é: %.2f%n",n,raiz_q);
	    System.out.printf("A raiz cúbica de %.2f é: %.2f%n",n,raiz_c);
	}
}
