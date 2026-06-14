//Estrutura Condicional
/*Exercicio 8 - Faça um programa que receba a idade de um nadador e mostre a sua categoria.

IDADE             |     CATEGORIA
até 7 anos        |   Infantil
8 a 10 anos       |   Juvenil
11 a 15 anos      |   Adolescente
16 a 30 anos      |   Adulto
acima de 60 anos  |   Senior
*/

import java.util.Scanner;
public class Exercicio_08
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int idade;
	    
	    //Entrada
		  System.out.println("Digite a idade do nadador:");
		  idade = sc.nextInt();
		
		  //Processamento e Saída
		  if (idade <= 7) {
		      System.out.println("Nadador de categoria: Infantil.");
	  	} else if (idade >=8 && idade<=10){
		      System.out.println("Nadador de categoria: Juvenil.");
		  } else if (idade>=11 && idade<=15){
		      System.out.println("Nadador de categoria: Adolescente.");
		  } else if (idade>=16 && idade<=30){
		      System.out.println("Nadador de categoria: Adulto.");
		  } else {
		      System.out.println("Nadador de categoria: Senior.");
		  }
	}
}
