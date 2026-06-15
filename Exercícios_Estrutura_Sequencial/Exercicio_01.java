/* Estrutura Sequencial
//Exercício 1 - Leia três números inteiros e imprima a média aritmética entre esses números.*/

import java.util.Scanner;
public class Exercicio_01
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int n1, n2, n3, media;
	    
	    //Entrada
		  System.out.println("Digite um número inteiro para tirar a média aritmética:");
		  n1=sc.nextInt();
		  System.out.println("Digite outro número inteiro para tirar a média aritmética:");
		  n2=sc.nextInt();
		  System.out.println("Digite outro número inteiro para tirar a média aritmética:");
		  n3=sc.nextInt();
		
		  //Processamento
		  media = (n1+n2+n3)/3;
		
		  //Saída
		  System.out.println("A média aritmética é: "+media);	
	}
}
