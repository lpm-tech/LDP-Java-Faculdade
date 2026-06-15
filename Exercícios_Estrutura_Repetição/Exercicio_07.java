/* Estrutura de Repetição 
Exercício 7 - Faça um programa que leia as notas de 5 alunos, e que exiba a maior e menor notas entre elas.
*/

import java.util.Scanner;
public class Exercicio_07
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
        double maiorNota = 0.0;
        double menorNota = 0.0;
        
      //Entrada e Processamento
      System.out.println("--- Analisador de Notas ---");
        
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite a nota do %dº aluno: ", i);
            double notaAtual = sc.nextDouble();
            // SE for o primeiro aluno, a nota dele é tanto a maior quanto a menor
            if (i == 1) {
                maiorNota = notaAtual;
                menorNota = notaAtual;
            } 
            // A partir do segundo aluno, fazemos as comparações normais
            else {
                if (notaAtual > maiorNota) {
                    maiorNota = notaAtual; // Temos um novo recorde de maior nota!
                }
                if (notaAtual < menorNota) {
                    menorNota = notaAtual; // Temos um novo recorde de menor nota!
                }
            }
        }
        
        //Saída
        System.out.println("\n========================");
        System.out.printf("A MAIOR nota digitada foi: %.1f%n", maiorNota);
        System.out.printf("A MENOR nota digitada foi: %.1f%n", menorNota);
        System.out.println("========================");
    }
}
