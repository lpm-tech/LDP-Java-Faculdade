/* Estrutura de Repetição 
//Exercício 8 - Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
- a quantidade de pessoas com mais de 90 kg
- a média das idades das sete pessoas
*/

import java.util.Scanner;
public class Exercicio_08
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
       int maisDe90kg = 0;
       int somaIdades = 0;
       
       //Entrada e Processamento 
       System.out.println("--- Analisador de Idade e Peso (7 Pessoas) ---");
        
        // O laço roda exatamente 7 vezes
        for (int i = 1; i <= 7; i++) {
            System.out.printf("\n--- %dª PESSOA ---%n", i);
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.print("Digite o peso (kg): ");
            double peso = sc.nextDouble();
            // 1. Acumula a idade desta pessoa no total
            somaIdades += idade;
            // 2. Verifica se a pessoa pesa mais de 90 kg
            if (peso > 90.0) {
                maisDe90kg++;
            }
        }
        //Processamento
        // Dividimos por 7.0 para garantir que a média venha com casas decimais
        double mediaIdades = somaIdades / 7.0; 
        
        //Saída
        System.out.println("\n=========================================");
        System.out.printf("Pessoas com mais de 90 kg: %d%n", maisDe90kg);
        System.out.printf("Média de idade das 7 pessoas: %.1f anos%n", mediaIdades);
        System.out.println("=========================================");
    }
}
