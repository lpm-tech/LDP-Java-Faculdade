/* Estrutura de Repetição
//Exercício 2 - A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e o número de filhos. A prefeitura deseja saber: 
a ) A média do salário da população; 
b ) A média do número de filhos. 
O final da leitura de dados dar-se-á com a entrada de salários negativos. 
*/

import java.util.Scanner;
public class Exercicio_2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double somaSalarios = 0.0;
      int somaFilhos = 0;
      int contadorPessoas = 0;
      double salario;
        
      //Entrada
      System.out.print("Digite o salário do habitante (ou um valor negativo para sair): ");
      salario = sc.nextDouble();
        
        //Entrada e Processamento
        while (salario >= 0) {
            System.out.print("Digite o número de filhos deste habitante: ");
            int numeroFilhos = sc.nextInt();
            
            somaSalarios += salario;       // Soma o salário atual ao total
            somaFilhos += numeroFilhos;    // Soma os filhos atuais ao total
            contadorPessoas++;             // Soma 1 no total de pessoas pesquisadas
            
            System.out.println("--------------------------------------------------\n");
            
            System.out.print("Digite o salário do PRÓXIMO habitante (ou negativo para sair): ");
            salario = sc.nextDouble();
        }
        
        //Condição e Saída
        if (contadorPessoas > 0) {
            double mediaSalario = somaSalarios / contadorPessoas;
            double mediaFilhos = somaFilhos / contadorPessoas;
            
            System.out.println("===== RESULTADO DA PESQUISA =====");
            System.out.printf("Quantidade de pessoas pesquisadas: %d%n", contadorPessoas);
            System.out.printf("Média do salário da população: R$%.2f%n", mediaSalario);
            System.out.printf("Média do número de filhos: %.1f%n", mediaFilhos);
        } else {
            System.out.println("Nenhum dado válido foi digitado.");
        }
    }
}
