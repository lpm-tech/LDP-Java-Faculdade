/* Estrutura de Repetição 
//Exercício 3 - Faça um programa que faça a leitura de 5 valores, e para cada valor, mostre o seu dobro na tela. 
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double valor, dobro;

      //Processamento e Saída
	    for(int i = 0; i<5; i++){
	        System.out.println("Digite um valor:");
	        valor=sc.nextDouble();
	        dobro = valor * 2;
	        System.out.printf("O dobro de %.2f é %.2f%n", valor, dobro);
	    }
	    System.out.println("Programa finalizado! Todos os 5 valores foram processados.");
    }
}
