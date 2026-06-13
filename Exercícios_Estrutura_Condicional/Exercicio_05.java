//Estrutura Condicional
/*Exercício 5 - Faça um programa que leia o sexo e a altura (H - em metros) de uma pessoa, calcule e apresente seu peso ideal utilizando as seguintes fórmulas: 
Peso ideal (homens) = (72,7 * H) – 58. 
Peso ideal (mulheres) = (62,1 * H) – 44,7
Sugestão: para identificar o sexo da pessoa, solicite ao usuário que informe 1 para homens, e 2 para mulheres.
*/

import java.util.Scanner;
public class Exercicio_05
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double h, pesom, pesoh;
	    int sexo;
	    
	    //Entrada
		  System.out.println("Digite o sexo: (1 para homens | 2 para mulheres):");
		  sexo=sc.nextInt();
		  System.out.println("Digite sua altura em metros:");
		  h=sc.nextDouble();
		
		  //Processamento e Saída
		  if (sexo == 1) {
		      pesoh = (72.7*h) - 58;
		      System.out.println("O peso ideal é: "+pesoh);
		  } else if (sexo == 2) {
		      pesom = (62.1*h) - 44.7;
		      System.out.println("O peso ideal é: "+pesom);
		  } else {
		      System.out.println("Opção inválida! Digite 1 para homens | 2 para mulheres!");
		  }
	}
}
