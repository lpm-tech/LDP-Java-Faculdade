/* Estrutura Sequencial
Exercício 10 - Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom. 
Faça um programa que leia o valor gasto pelo cliente e informe o valor a ser pago de gorjeta.
*/

import java.util.Scanner;
public class Exercicio_10
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double valor, gorjeta, total;
	    
	    //Entrada
		  System.out.println("Digite o valor de consumo:");
		  valor=sc.nextDouble();
		
		  //Processamento
      gorjeta = valor*0.10;
      total = gorjeta+valor;
		
		  //Saída
		  System.out.println("---Comanda---");
		  System.out.printf("Valor de consumo: R$%.2f%n",valor);
		  System.out.printf("Valor gorjeta: R$%.2f%n",gorjeta);
		  System.out.printf("Valor total: R$%.2f%n",total);
	}
}
