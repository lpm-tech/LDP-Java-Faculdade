/* Estrutura Sequencial
//Exercício 6 - Faça um programa que solicite ao usuário que informe os coeficientes a, b e c de uma equação de segundo grau,
e que imprima as raízes desta equação (considere que os valores informados sempre retornarão raízes reais para a equação).
*/

import java.util.Scanner;
public class Exercicio_06
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double a, b, c, delta, x1, x2;
	    
	    //Entrada
	    System.out.println("---Equação de 2 grau---");
		  System.out.println("Digite o coeficiente a:");
		  a=sc.nextDouble();
		  System.out.println("Digite o coeficiente b:");
		  b=sc.nextDouble();
		  System.out.println("Digite o coeficiente c:");
		  c=sc.nextDouble();
		
		  //Processamento
		  delta = (b*b) - (4*a*c);
		  x1 = (-b + Math.sqrt(delta)) / (2 * a);
		  x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		  //Saída
		  System.out.printf("O valor de Delta é: %.2f%n", delta);
      System.out.printf("A primeira raiz (x1) é: %.2f%n", x1);
      System.out.printf("A segunda raiz (x2) é: %.2f%n", x2);
	}
}
