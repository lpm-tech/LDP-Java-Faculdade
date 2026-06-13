//Estrutura Condicional
/*Exercício 6 - Construa um programa para determinar se o indivíduo está com um peso favorável.
Essa situação é determinada através do IMC (Índice de Massa Corpórea), 
que é definida como sendo a relação entre o peso (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo.
Ou seja, IMC= PESO/ALTURA2 e, a situação do peso é determinada pela tabela abaixo:

CONDIÇÃO          |     SITUAÇÃO
IMC abaixo de 20  |  Abaixo do Peso
IMC de 20 até 25  |  Peso Normal
IMC de 25 até 30  |  Sobre Peso
IMC de 30 até 40  |  Obeso
IMC de 40 e acima |  Obeso Mórbido
*/ 

import java.util.Scanner;
public class Exercicio_06
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Variáveis
	    double peso, altura, imc;
	    
	    //Entrada
		  System.out.println("Digite seu peso:");
		  peso=sc.nextDouble();
		  System.out.println("Digite sua altura em metros:");
		  altura=sc.nextDouble();
		
		  //Processamento e Saída
		  imc = peso/(altura*altura);
		
		  if (imc<20) {
		      System.out.println("Situação: Abaixo do peso!");
		  } else if (imc>=20 && imc<25) {
		      System.out.println("Situação: Peso normal!");
		  } else if (imc>=25 && imc<30) {
		      System.out.println("Situação: Sobre peso!");
		  } else if (imc>=30 && imc<40) { 
		      System.out.println("Situação: Obeso!");
		  } else {
		      System.out.println("Situação: Obeso Mórbido!");
	  	}
	}
}
