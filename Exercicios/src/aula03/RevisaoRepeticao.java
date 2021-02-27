package aula03;

import java.util.Scanner;

public class RevisaoRepeticao {
	
	public static void main(String[] args) {
		//calculaSoma();
		//calculaMedia();
		calculaMediaDe4Numeros();
	}
	
	/*
	 * Leia 4 n�meros e imprima 
	 * a soma e a m�dia.
	 */
	public static void calculaMediaDe4Numeros() {
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double total = 0;
			
		for (int qtde = 0; qtde < 4 ; qtde++) {
			System.out.print("Numero: ");
			num = sc.nextDouble();
			total += num;
		}	
		
		System.out.println("Soma = " + total);
		System.out.println("M�dia = " + (total/4));
	}

	/* Calcula a soma dos n�meros digitados
	 * pelo usu�rio. Quando o usu�rio 
	 * digitar zero, o programa deve 
	 * parar de ler os n�meros.
	 */
	public static void calculaSoma() {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		double num = 0;

		do {
			System.out.print("N�mero: ");
			num = sc.nextDouble();
			total += num;
		} while (num != 0);
		
		System.out.println("Total = " + total);
	}
	
	/*
	 * Leia uma sequ�ncia de n�meros 
	 * e calcule a sua m�dia.
	 * O programa dever ler os n�meros
	 * at� que o usu�rio digite zero.
	 * Ex: media(3,5,7) = (3 + 5 + 7) / 3 
	 *  
	 */
	public static void calculaMedia() {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		double num = 0;
		int qtde = 0;

		do {
			System.out.print("N�mero: ");
			num = sc.nextDouble();
			qtde++; // qtde += 1; // qtde = qtde + 1;
			total += num;
		} while (num != 0);
		qtde--; // tira o zero que foi digitado
		
		System.out.println("Soma = " + total);
		System.out.println("Quantidade = " + qtde);
		System.out.println("M�dia = " + (total/qtde));
	}
}
