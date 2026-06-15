/* Estrutura de Repetição 
//Exercício 1 - Faça um programa que solicite ao usuário que informe a matrícula e as três notas de um conjunto de alunos.
O programa deverá exibir a mensagem informando se o aluno foi aprovado (média maior ou igual a 70), 
exame (nota maior ou igual a 60 e menor que 70) ou reprovado (nota inferior a 60). 
O programa irá terminar quando o usuário informar uma matrícula negativa. 
*/

import java.util.Scanner;
public class Exercicio_01
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int matricula;
	    
	    //Entrada
	    System.out.println("Digite a matrícula do aluno (ou um número negativo para sair): ");
      matricula = sc.nextInt();
	
        while (matricula >= 0) {
            
            System.out.print("Digite a nota 1: ");
            double nota1 = sc.nextDouble();
            
            System.out.print("Digite a nota 2: ");
            double nota2 = sc.nextDouble();
            
            System.out.print("Digite a nota 3: ");
            double nota3 = sc.nextDouble();
            
            //Processamento
            double media = (nota1 + nota2 + nota3) / 3.0;
            
            //Condição e Saída
            System.out.printf("Matrícula: %d | Média: %.1f -> ", matricula, media);
            if (media >= 70.0) {
                System.out.println("SITUAÇÃO: APROVADO");
            } 
            else if (media >= 60.0 && media < 70.0) {
                System.out.println("SITUAÇÃO: EXAME");
            } 
            else {
                System.out.println("SITUAÇÃO: REPROVADO");
            }
            System.out.println("Digite a matrícula do PRÓXIMO aluno (ou um número negativo para sair): ");
            matricula = sc.nextInt();
        }
        System.out.printf("---Sessão Encerrada!---");
	}
}
