package aula01;

import java.util.Scanner;

/*
 * criar uma rotina que leia 2 inteiros
 * e imprima o valor das quatro opera��es
 * entre os inteiros: +,-,*,/
 */
public class Calculadora {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro n�mero: ");
		int n1 = sc.nextInt();
		System.out.print("Segundo n�mero: ");
		int n2 = sc.nextInt();
		System.out.println("Soma = " + (n1+n2) + 
		           "\nSubtra��o = " + (n1-n2) + 
				   "\nMultiplica��o = " + (n1*n2) +
				   "\nDivis�o = " + ((double)n1/n2));		
	}

}
