/* * PROJETO: LDP-Java-Faculdade
 // EXERCÍCIO 1 - Dias de Vida
 2. Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui. 
 Considere sempre anos completos, e que um ano possui 365 dias.
 Ex: uma pessoa com 19 anos possui 6935 dias de vida;
 veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS.

 //APRENDIZADO:
 * Leitura de Dados: Aprendi que "nextLine()" é melhor que o "next()" para ler nomes, 
 pois aceita mais espaços (nomes compostos e sobrenomes, por exemplo).
 * Manipulação de Texto: O método ".toUpperCase()" transforma qualquer String em letra maiúscula.
 * Saída Formatada: O uso do "printf" organiza melhor o código. Usei marcadores de posição:
   - %s: para Strings;
   - %d: para números inteiros Int;
   - %f: para números flutuantes (casas decimais) Float/Double (foi utilizado no Exercício 01);
   - %n: para pular linha (que também foi usado no Exercício 01);
   
   OBS: A ordem das variáveis deve ser a mesma ordem dos marcadores % dentro do texto. 
   Pode ter variáveis de mesmo tipo (String,Int...) desde que,
   a ordem esteja certa na construção da função. */
   
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Variáveis*/
		String nome;
		int idade, diasvida;
		
		/*Ação*/
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		/*Cálculo*/
		diasvida = idade * 365;
		
		/*Saída*/
		System.out.printf("%s, você já viveu %d dias.%n",nome.toUpperCase(), diasvida);
	}
}
