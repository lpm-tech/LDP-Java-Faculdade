//Estrutura Condicional 
/*Exercicio 12.1 - Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:
1 – Somar
2 – Subtrair 
3 – Multiplicar
4 – Dividir
5 – Sair
Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção.
*/

import java.util.Scanner;
public class Exercicio_12_1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double n1, n2, resultado;
	    int operacao;
	    
	    //Entrada
		  System.out.println("Digite um número:");
		  n1 = sc.nextDouble();
		  System.out.println("Digite outro número:");
		  n2 = sc.nextDouble();
		  System.out.println("Escolha uma operação para prosseguir:");
		  System.out.println("1 - Somar.");
		  System.out.println("2 - Subtrair.");
		  System.out.println("3 - Multiplicar.");
		  System.out.println("4 - Dividir.");
		  System.out.println("5 - Sair.");
		  operacao = sc.nextInt();
		
		  //Processamento e Saída
		  if (operacao == 1) {
		      resultado = n1+n2;
		      System.out.println("Resultado Soma: "+resultado);
		  } else if (operacao == 2){
		      resultado = n1-n2;
		      System.out.println("Resultado Subtração: "+resultado);
		  } else if (operacao == 3){
		      resultado = n1*n2;
		      System.out.println("Resultado Multiplicação: "+resultado);
		  } else if (operacao == 4 && n2!=0){
		      resultado = n1/n2;
		      System.out.println("Resultado Divisão: "+resultado);
		  } else if (n2==0){
		      System.out.println("Divisão por 0 é inválida!");
		  } else if (operacao==5){
		      System.out.println("Sessão encerrada!");
		  } else {
		      System.out.println("Opção inválida!");
		  }
	}
}
