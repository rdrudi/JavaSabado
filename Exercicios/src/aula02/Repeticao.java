package aula02;

import java.util.Scanner;

public class Repeticao {
	
	public static void main(String[] args) {
		//nomeFor();
		//lerAteZero();
		//tabuadaComFor();
		//tabuadaComWhile();
		tabuadaComDoWhile();
	}

	/*
	 * Leia um inteiro e imprima sua tabuada.
	 * Entrada: 4
	 * Saída: 4 X 1 = 4
	 * 		  4 X 2 = 8
	 * 			...
	 * 		  4 X 10 = 40
	 */
	public static void tabuadaComDoWhile() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inteiro: ");
		int num = sc.nextInt();

		int i=1; 
		do {
			int valor = num * i;
			System.out.println(num + " X " + i + " = " + valor);
			i++;
		} while (i<=10);
	}
	
	public static void tabuadaComWhile() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inteiro: ");
		int num = sc.nextInt();

		int i=1; 
		while (i<=10) {
			int valor = num * i;
			System.out.println(num + " X " + i + " = " + valor);
			i++;
		}
	}
	
	public static void tabuadaComFor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inteiro: ");
		int num = sc.nextInt();
		
		for (int i=1 ; i<=10 ; i++) {
			int valor = num * i;
			System.out.println(num + " X " + i + " = " + valor);
		}		
	}
	
	public static void lerAteZero() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("Numero [zero para finalizar]: ");
			n = sc.nextInt();
		} while (n != 0);
		System.out.println("saindo do loop.");
	}
	
	public static void nomeFor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		for (int i = 0 ; i < 10 ; i = i + 1) {
			System.out.println("i=" + i + " - " + nome);
		}
		
		System.out.println("Saiu do for");
	}

}
