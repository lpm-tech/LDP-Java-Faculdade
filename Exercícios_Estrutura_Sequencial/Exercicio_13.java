/* Estrutura Sequencial 
//Exercício 13 - Faça o mesmo programa do item anterior, utilizando a fórmula para o cálculo do peso ideal para mulheres:
Peso ideal (P) = (62,1 * H) – 44,7
*/

import java.util.Scanner;
public class Exercicio_13
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double h, peso;
	    
	    //Entrada
		  System.out.println("Digite sua altura em metros:");
		  h=sc.nextDouble();
		
		  //Processamento
      peso = (62.1*h) - 44.7;
		
		  //Saída
		  System.out.println("O peso ideal é: "+peso+" kg.");
	}
}
