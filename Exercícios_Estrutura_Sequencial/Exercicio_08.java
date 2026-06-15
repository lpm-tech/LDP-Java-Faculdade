/* Estrutura Sequencial 
//Exercício 8 - Leia um número e imprima a tabuada de multiplicar deste número. Por exemplo, para o número 5:
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50
*/

import java.util.Scanner;
public class Exercicio_08
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    int n;
	    
	    //Entrada
		  System.out.println("Digite um número para ver sua tabuada:");
		  n=sc.nextInt();
		
		  //Processamento e saída
		  System.out.println("---Tabuada do "+n+"---");
		  System.out.println(n+" X 1 = "+(n*1));
		  System.out.println(n+" X 2 = "+(n*2));
		  System.out.println(n+" X 3 = "+(n*3));
		  System.out.println(n+" X 4 = "+(n*4));
		  System.out.println(n+" X 5 = "+(n*5));
		  System.out.println(n+" X 6 = "+(n*6));
		  System.out.println(n+" X 7 = "+(n*7));
		  System.out.println(n+" X 8 = "+(n*8));
		  System.out.println(n+" X 9 = "+(n*9));
		  System.out.println(n+" X 10 = "+(n*10));
	}
}
