/* Estrutura Sequencial 
//Exercício 4 - Faça um programa que calcule e mostre a área de um losango: 
AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2
*/

import java.util.Scanner;
public class Exercicio_04
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double diag1, diag2, area;
	    
	    //Entrada
	    System.out.println("Vamos calcular a área de um losango!");
		  System.out.println("Digite o valor da diagonal maior:");
		  diag1=sc.nextInt();
		  System.out.println("Digite o valor da diagonal menor:");
		  diag2=sc.nextInt();
		
		  //Processamento
		  area = (diag1*diag2)/2;
		
		  //Saída
		  System.out.println("A área do losango é: "+area);
	}
}
