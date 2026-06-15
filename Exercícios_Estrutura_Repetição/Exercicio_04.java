/* Estrutura de Repetição 
Exercício 4 -  Faça um programa que leia um número e que imprima os números ímpares de 1 até o número informado.*/

import java.util.Scanner;
public class Exercicio_04
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int limite;
	    
	   //Entrada
     System.out.print("Digite um número limite: ");
     limite = sc.nextInt(); 
     System.out.printf("--- Números ímpares de 1 até %d ---%n", limite);
        
        // Processamento e Saída
        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Fim do programa!");
    }
}
