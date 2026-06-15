/* Estrutura Sequencial 
//Exercício 12 - Faça um programa que, tendo como dados de entrada a altura (H - em metros) de um homem, 
calcule e apresente seu peso ideal utilizando a seguinte fórmula: 
Peso ideal (P) = (72,7 * H) – 58. 
*/

import java.util.Scanner;
public class Exercicio_12
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double h, peso;
	    
	    //Entrada
		  System.out.println("Digite sua altura em metros:");
		  h=sc.nextDouble();
		
		  //Processamento
      peso = (72.7*h) - 58;
		
		  //Saída
		  System.out.println("O peso ideal é: "+peso+" kg.");
	}
}
