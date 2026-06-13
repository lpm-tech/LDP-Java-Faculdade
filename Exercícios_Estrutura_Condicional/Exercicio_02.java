//Estrutura Condicional 
/*Exercício 2 - Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação: 
>= 7 -> Aprovado
< 7 -> Reprovado */
 
import java.util.Scanner;
public class Exercicio_02
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double nota1, nota2, media;
	    
	    //Entrada
		  System.out.println("Digite a Nota 1:");
		  nota1=sc.nextDouble();
		  System.out.println("Digite a Nota 2:");
		  nota2=sc.nextDouble();
		
		  //Processamento
		  media=(nota1+nota2)/2;
		
		  //Saída
		  if (media>=7){
		      System.out.println("Aluno(a) Aprovado!");
	  	} else {
		      System.out.println("Aluno(a) Reprovado!");
		  }
	}
}
