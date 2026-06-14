//Estrutura Condicional
/*Exercicio 10 - Faça um programa que leia o um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. 
Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número.
*/

import java.util.Scanner;
public class Exercicio_10
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int dia;
	    
	    //Entrada
		  System.out.println("Digite um número inteiro de 1 a 7 para descobrir o dia da semana:");
		  dia = sc.nextInt();
		
		  //Processamento e Saída
		  if (dia == 1) {
		      System.out.println("Domingo.");
		  } else if (dia == 2){
		      System.out.println("Segunda - feira.");
		  } else if (dia == 3){
		      System.out.println("Terça - feira.");
		  } else if (dia == 4){
		      System.out.println("Quarta - feira.");
		  } else if (dia == 5){
		      System.out.println("Quinta - feira.");
		  } else if (dia == 6){
		      System.out.println("Sexta - feira.");
		  } else if (dia == 7){
		      System.out.println("Sábado.");
		  } else {
		      System.out.println("Não existe nenhum dia da semana com este número!");
		}
	}
}
