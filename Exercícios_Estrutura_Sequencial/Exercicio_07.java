/* Estrutura Sequencial 
//Exercício 7 - Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, 
calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double salario_m, salario_f, resultado;
	    
	    //Entrada
		  System.out.println("Digite o valor do salário mínimo:");
		  salario_m=sc.nextDouble();
		  System.out.println("Digite o valor do seu salário:");
		  salario_f=sc.nextDouble();
		
		  //Processamento
		  resultado = salario_f/salario_m;
		
		  //Saída
		  System.out.printf("O salário atual é equivalente a: %.2f salários mínimos %n",resultado);
	}
}
