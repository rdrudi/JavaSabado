package aula01;

import java.util.Scanner;

/*
 * criar uma rotina que leia 2 inteiros
 * e imprima o valor das quatro operações
 * entre os inteiros: +,-,*,/
 */
public class Calculadora {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro número: ");
		int n1 = sc.nextInt();
		System.out.print("Segundo número: ");
		int n2 = sc.nextInt();
		System.out.println("Soma = " + (n1+n2) + 
		           "\nSubtração = " + (n1-n2) + 
				   "\nMultiplicação = " + (n1*n2) +
				   "\nDivisão = " + ((double)n1/n2));		
	}

}
