/* * PROJETO: LDP-Java-Faculdade
 // EXERCÍCIO 1 - Padaria Hotpão
 1. A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. 
 Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50.
 Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), 
 e quanto deve guardar numa conta de poupança (10% do total arrecadado). 
 Você foi contratado para fazer os cálculos para o dono. 
 Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.

 // APRENDIZADO:
 * Neste código, descobri o "printf" (usado para formatação de decimais).
 * Não aceita sinal de "+" para juntar texto e variável. É necessário usar vírgula ",".
 * O uso do "+" causa um erro de sintaxe, pois o "printf" espera uma lista de argumentos separados. */

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Variáveis*/
		double pao = 0.12;
		double broa = 1.50;
		int qtpao, qtbroa;
		double total, poupança;
		
		/*Ação*/
		System.out.println("Quantas broas foram vendidas? ");
		qtbroa = sc.nextInt();
		System.out.println("Quantos pães foram vendidos? ");
		qtpao = sc.nextInt();
		
		/*Cálculo*/
		total = (qtbroa * broa) + (qtpao * pao);
		poupança = total * 0.10;
		
		/*Saída*/
		System.out.printf("O valor total arrecadado foi: R$ %.2f%n", total);
		System.out.printf("O valor que você deve depositar na poupança é: R$ %.2f%n", poupança);
	}
}

  
