/* Estrutura Sequencial 
//Exercício 15 - Considerando uma eleição de apenas dois candidatos, faça um programa que leia o número total de eleitores,
o número de votos do primeiro candidato e o número de votos do segundo candidato. 
Em seguida, o programa deverá apresentar o percentual de votos de cada um dos candidatos e o percentual de votos nulos.
*/

import java.util.Scanner;
public class Exercicio_15
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int eleitores, c1, c2, nulos;
	    double percentual_c1, percentual_c2, percentual_nulo;
	    //Entrada
		  System.out.println("Digite o número total de eleitores:");
		  eleitores=sc.nextInt();
	    System.out.println("Digite o número total de votos do Candidato 1:");
		  c1=sc.nextInt();
		  System.out.println("Digite o número total de votos do Candidato 2:");
		  c2=sc.nextInt();
		
		  //Processamento
      nulos = eleitores - (c1+c2);
      percentual_c1 = (c1*100.0)/eleitores;
		  percentual_c2 = (c2*100.0)/eleitores;
		  percentual_nulo = (nulos*100.0)/eleitores;
		
		  //Saída
		  System.out.println("---Resultado da Apuração---");
		  System.out.println("Percentual Votos Candidato 1: "+percentual_c1+"%");
		  System.out.println("Percentual Votos Candidato 2: "+percentual_c2+"%");
		  System.out.println("Percentual Votos Nulos: "+percentual_nulo+"%");
	}
}
