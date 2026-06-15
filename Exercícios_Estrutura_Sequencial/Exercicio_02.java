/* Estrutura Sequencial 
//Exercício 2 - Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e imprima:
- A idade da pessoa no ano atual
- A idade que a pessoa terá em 2050
*/

import java.util.Scanner;
public class Exercicio_02
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int nasc, ano, idade_atual, idade_2050;
	    
	    //Entrada
		  System.out.println("Digite o ano de seu nascimento:");
		  nasc=sc.nextInt();
		  System.out.println("Digite o ano atual:");
		  ano=sc.nextInt();
		
		  //Processamento
		  idade_atual = ano-nasc;
		  idade_2050 = 2050-nasc;
		
		  //Saída
		  System.out.println("Idade atual: "+idade_atual);
		  System.out.println("Idade em 2050: "+idade_2050);
	}
}
