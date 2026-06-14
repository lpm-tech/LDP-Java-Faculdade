//Estrutura Condicional
/*Exercicio 7 - Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores a R$1000,00.
Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem,
caso o funcionário não tenha direito ao aumento.
*/

import java.util.Scanner;
public class Exercicio_07
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double salario;
	    
	    //Entrada
		  System.out.println("Digite o valor do seu salário:");
		  salario = sc.nextDouble();
		
		  //Processamento e Saída
		  if (salario < 1000) {
		      salario = salario + (salario*0.30);
		      System.out.println("Seu novo salário é: R$"+salario);
		  } else {
		      System.out.println("Não haverá ajuste em seu salário!");
		  }
	}
}
