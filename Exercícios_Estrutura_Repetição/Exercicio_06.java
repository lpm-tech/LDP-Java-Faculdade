/* Estrutura de Repetição 
//Exercício 6 -  Faça um programa que leia o sexo e o peso de 10 pessoas, 
e mostre quantas pessoas do sexo masculino possuem peso entre 60 e 80 kg,
bem como a quantidade de mulheres que possuem peso entre 50 e 70 kg.
*/

import java.util.Scanner;
public class Exercicio_06
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
        int homensNoPeso = 0;
        int mulheresNoPeso = 0;
        
        //Entrada e Processamento
        System.out.println("--- Cadastro de Peso e Sexo (10 Pessoas) ---");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n--- %dª PESSOA ---%n", i);
            // Lendo o sexo como Texto (String)
            System.out.print("Digite o sexo (M para Masculino / F para Feminino): ");
            String sexo = sc.next().toUpperCase(); // .toUpperCase() transforma o texto em maiúsculo automaticamente
            System.out.print("Digite o peso (kg): ");
            double peso = sc.nextDouble();
            
            //Condição 1: VERIFICAÇÃO DOS HOMENS (60 a 80 kg)
            if (sexo.equals("M") && peso >= 60.0 && peso <= 80.0) {
                homensNoPeso++;
            }
            //Condição 2: VERIFICAÇÃO DAS MULHERES (50 a 70 kg)
            else if (sexo.equals("F") && peso >= 50.0 && peso <= 70.0) {
                mulheresNoPeso++;
            }
        }
        
        //Saída
        System.out.println("\n================ RESULTADO FINAL ================");
        System.out.printf("Homens com peso entre 60 e 80 kg: %d%n", homensNoPeso);
        System.out.printf("Mulheres com peso entre 50 e 70 kg: %d%n", mulheresNoPeso);
        System.out.println("=================================================");
    }
}
