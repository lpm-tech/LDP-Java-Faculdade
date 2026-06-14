//Estrutura Condicional
/*Exercicio 9 - Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral: 
- não eleitor (abaixo de 16 anos); 
- eleitor obrigatório (entre a faixa de 18 e menor de 65 anos); 
- eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int idade;
	    
	    //Entrada
		  System.out.println("Digite sua idade:");
		  idade = sc.nextInt();
		
		  //Processamento e Saída
		  if (idade < 16) {
		      System.out.println("Não Eleitor.");
		  } else if (idade >=18 && idade<65){
		      System.out.println("Eleitor Obrigatório.");
	  	} else {
		      System.out.println("Eleitor Facultativo");
		  } 
	}
}
