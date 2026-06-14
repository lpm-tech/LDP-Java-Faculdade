//Estrutura Condicional
/*Exercicio 12.2 - Faça um programa para resolver equações de 2 grau (ax^2+bx+c=0).
delta = b^2 - 4*a*c

1- delta < 0 não existe raiz real
2- delta = 0 existe somente uma raiz real
x = (-b)/(2*a)
3- delta > 0 existem 2 raízes reais. 
x1 = (-b + raiz(delta)/(2*a)
x2 = (-b - raiz(delta)/(2*a)*/

import java.util.Scanner;
public class Exercicio_12_2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double a, b, c, delta, x, x1, x2;
	    
	    //Entrada
		  System.out.println("Digite o valor de a:");
		  a = sc.nextDouble();
		  System.out.println("Digite o valor de b:");
		  b = sc.nextDouble();
		  System.out.println("Digite o valor de c:");
		  c = sc.nextDouble();
		
		  //Processamento e Saída
		  delta = (b*b)-(4*a*c);
		  if (delta < 0) {
		      System.out.println("Não existe raiz real!");
		  } else if (delta == 0){
		      x= -b/(2*a);
		      System.out.println("Existe somente uma raiz real: "+x);
		  } else {
		      x1 = (-b + Math.sqrt(delta))/(2*a);
		      x2 = (-b - Math.sqrt(delta))/(2*a);
		      System.out.println("Existem duas raízes reais: ");
		      System.out.println("x1 = "+x1);
		      System.out.println("x2 = "+x2);
	 	  } 
	}
}
