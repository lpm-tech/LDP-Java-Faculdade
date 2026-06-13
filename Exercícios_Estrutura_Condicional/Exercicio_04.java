//Estrutura Condicional
/*Exercício 4 - Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um triângulo.
Se eles não formarem um triângulo escrever uma mensagem. 
Considerar que o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados.*/

import java.util.Scanner;
public class Exercicio_04
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double x, y, z;
	    
	    //Entrada
		  System.out.println("Digite o valor do lado X:");
		  x=sc.nextDouble();
		  System.out.println("Digite o valor do lado Y:");
		  y=sc.nextDouble();
		  System.out.println("Digite o valor do lado Z:");
		  z=sc.nextDouble();
		
		  //Processamento e Saída
		  if (x<(y+z) && y<(x+z) && z<(x+y)){
		      System.out.println("Os valores informados formam um triângulo!");
		  } else {
		      System.out.println("Os valores informados NÃO formam um triângulo!");
		  }
  }
}
