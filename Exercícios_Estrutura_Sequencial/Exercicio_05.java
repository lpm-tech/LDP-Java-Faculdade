/* Estrutura Sequencial 
//Exercício 5 - Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit 
(F = (C*1,8) + 32)
*/

import java.util.Scanner;
public class Exercicio_05
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double c, f;
	    
	    //Entrada
		System.out.println("Digite a temperatura em Celsius:");
		c=sc.nextDouble();
		
		//Processamento
		f = (c*1.8) + 32;
		
		//Saída
		System.out.println("Temperatura inserida em Celsius: "+c);
		System.out.println("A temperatura em Fahrenheit é: "+f);
	}
}
