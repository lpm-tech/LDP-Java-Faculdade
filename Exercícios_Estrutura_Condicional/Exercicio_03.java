//Estrutura Condicional
/*Exercício 3 - Faça um programa que receba 3 notas de um aluno, calcule e mostre uma mensagem de acordo com sua média:

|  MEDIA     |   MENSAGEM  |
| >=0 E <3   |   REPROVADO |
|>=3 E <7    |   EXAME     |
|>=7 E <=10  |   APROVADO  |
*/

import java.util.Scanner;
public class Exercicio_03
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double nota1, nota2, nota3, media;
	    
	    //Entrada
		  System.out.println("Digite a Nota 1:");
		  nota1=sc.nextDouble();
		  System.out.println("Digite a Nota 2:");
		  nota2=sc.nextDouble();
		  System.out.println("Digite a Nota 3:");
		  nota3=sc.nextDouble();
		
		  //Processamento
		  media=(nota1+nota2+nota3)/3;
		
		  //Saída
		  if (media >= 0 && media < 3) {
		      System.out.println("Aluno(a) Reprovado!");
		  } else if (media>=3 && media<7) {
		      System.out.println("Aluno(a) Exame!");
		  } else {
		      System.out.println("Aluno(a) Aprovado!");
		  }
  }
}
