/* Estrutura de Repetição
//Exercício 5 - Faça um programa que solicite ao usuário que informe o valor das temperaturas coletadas nos 10 primeiros dias do mês de janeiro de 2021,
em Belo Horizonte. Imprima em seguida a média dessas temperaturas.*/

import java.util.Scanner;
public class Exercicio_05
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
        double somaTemperaturas = 0.0;
        double temperatura, media;
        
        //Entrada e Condição
        System.out.println("--- Sensor de Temperatura - BH (Janeiro/2021) ---");
        
        for (int dia = 1; dia <= 10; dia++) {
            System.out.printf("Informe a temperatura do dia %d de janeiro (ºC): ", dia);
            temperatura = sc.nextDouble();
            // Acumula a temperatura digitada
            somaTemperaturas += temperatura;
        }
        
        //Processamento
        media = somaTemperaturas / 10.0;
        
        //Saída
        System.out.println("\n=========================================");
        System.out.printf("A média das temperaturas em BH foi: %.1fºC%n", media);
        System.out.println("=========================================");
    }
}
