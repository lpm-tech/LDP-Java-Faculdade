/* *PRATICANDO: Arrays, Vetores e Laços de Repetição

 // EXERCÍCIO 1 - Sistema de Filtro de Vendas
 - O que este código faz?
 Desenvolvi um programa que simula o controle de vendas diárias. Ele recebe valores pelo terminal, armazena em um Array e, ao final, gera um relatório filtrando 
 apenas as "Vendas Altas" (Acima de R$50,00).

 //APRENDIZADO:
 * Array e Vetores: Pratiquei como declarar e inicializar um array de double e a importância de usar o "int i" como índice para acessar cada posição da memória.
 * Laços de Repetição: Reforcei a lógica de percorrer uma lista do início ao fim usando a propriedade ".length", o que torna o código mais inteligente e adaptável.
 * Método Bandeira (Boolean Flag): Este foi o grande diferencial! Usei uma variável booleana (true/false) para servir como um "sensor". Ela monitora se alguma
 venda alta aconteceu durante o laço e, só depois que o laço termina, ela me diz se precisa exibir a mensagem "Nenhuma venda alta encontrada."
 * Escopo de Chaves: Aprendi na prática que o lugar onde fechamos as chaves "{}" muda tudo. Colocar a verificação final fora do "for" evitou que o sistema repetisse
 mensagens desnecessárias para o usuário.
 
 OBS: A maior lição aqui foi entender que programar não é só fazer o computador calcular, mas sim controlar o fluxo de informações para que o usuário receba a 
 resposta certa no momento certo. */

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Array/Vetor*/
		double [] vendas = new double[3];
		
		/*Condição 1*/
		for (int i = 0; i < vendas.length; i++){
		    System.out.println("Digite o valor da venda: ");
		    vendas[i] = sc.nextDouble();}
		    
		/*Variáveis*/
		boolean encontrou = false;
		
		/*Condição 2*/
		for (int i = 0; i < vendas.length; i++){
		    if (vendas[i] > 50.0){
		        System.out.println("Venda alta encontrada: R$" + vendas[i]);
		        encontrou = true;}}
	    if (encontrou == false){
	    System.out.println("Nenhuma venda alta encontrada.");}
	  }
	}
