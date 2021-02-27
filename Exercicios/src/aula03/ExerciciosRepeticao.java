package aula03;

import java.util.Scanner;

public class ExerciciosRepeticao {
	
	public static void main(String[] args) {
		//produtoDe5();
		//fatorial();
		potencia();
	}
	
	/*
	 * Ler um double base e um inteiro expoente
	 * e calcular o valor de base^expoente.
	 * Base: 3
	 * Expoente: 4
	 * C�lculo: 3^4 = 3 * 3 * 3 * 3
	 * Sa�da: 3^4 = 81
	 */
	public static void potencia() {
		Scanner sc = new Scanner(System.in);
		double total = 1;
		double base = 0;
		int expoente = 0;
		
		System.out.print("Base: ");
		base = sc.nextDouble();
		System.out.print("Expoente: ");
		expoente = sc.nextInt();
		
		for (int i=1; i<=expoente ; i++) {
			//System.out.print(base + " * ");
			total *= base;
		}
		//System.out.println();
		
		System.out.println(base + "^" + expoente + " = " + total);	
	}
	
	/*
	 * Ler um inteiro n�o negativo 
	 * e calcular o seu fatorial
	 * N�mero: 5 
	 * Fatorial: 5! = 1 * 2 * 3 * 4 * 5 = 120 
	 */
	public static void fatorial() {
		Scanner sc = new Scanner(System.in);
		double total = 1;
		int num = 0;
		
		System.out.print("Numero: ");
		num = sc.nextInt();
		
		for (int i=1; i<=num ; i++) {
			//System.out.print(i + " * ");
			total *= i;
		}	
		
		System.out.println(num + "! = " + total);	
	}
	
	/*
	 * ler 5 n�meros e informar
	 * o produto entre eles.
	 * Entrada: 2 5 3 7 8
	 * Sa�da: 2 * 5 * 3 * 7 * 8 = 1680
	 */
	public static void produtoDe5() {
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double total = 1;
			
		for (int i=0; i<5 ; i++) {
			System.out.print("Numero: ");
			num = sc.nextDouble();
			total *= num;
		}	
		
		System.out.println("Produto = " + total);
	}
}
