//Estrutura Condicional 
//Exercício 1 - Faça um programa que receba dois números e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.

import java.util.Scanner;
public class Exercicio_01
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n1;
	    int n2;
		System.out.println("Digite um número:");
		n1=sc.nextInt();
		System.out.println("Digite outro número:");
		n2=sc.nextInt();
		if (n1==n2){
		  System.out.println("Ambos os números são iguais!"); 
		}else {
		   if (n1>n2) {
		      System.out.println("O maior número é: "+n1);
		      System.out.println("O menor número é: "+n2);
		   } else {
		      System.out.println("O maior número é: "+n2);
		      System.out.println("O menor número é: "+n1);
		   }   
		}
	}
}
