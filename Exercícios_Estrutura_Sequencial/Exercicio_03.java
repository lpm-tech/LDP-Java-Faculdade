/* Estrutura Sequencial 
//Exercício 3 - Faça um programa que receba a cotação do dólar em reais, e um valor que o usuário possui em dólares.
Imprima este valor em reais.*/

import java.util.Scanner;
public class Exercicio_03
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double cotacao, dolar, reais;
	    
	    //Entrada
		  System.out.println("Digite a cotação atual do dólar em reais:");
		  cotacao=sc.nextInt();
		  System.out.println("Digite o valor que possui em dólares:");
		  dolar=sc.nextInt();
		
		  //Processamento
		  reais = dolar*cotacao;
		
		  //Saída
		  System.out.println("Valor em dólares: "+dolar);
		  System.out.println("Valor em reais: "+reais);
	}
}
