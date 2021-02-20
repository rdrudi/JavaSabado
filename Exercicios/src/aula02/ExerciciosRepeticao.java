package aula02;

import java.util.Scanner;

public class ExerciciosRepeticao {
	
	public static void main(String[] args) {
		//exibir10vezes();
		//exibir1AteMax();
		//calculaTabuada();
		//somatoria();
		//fatorial();
		potencia();
		
	}
	
	
	/*
	 * Leia um double base e um inteiro expoente
	 * e imprima o valor de base^expoente.
	 * Entrada: base: 3
	 * 		    expoente: 4
	 * Sa�da: 3^4 = 81
	 * Extra: altere sua rotina para aceitar 
	 * 		  expoente 0 e expoente negativo. 
	 */
	public static void potencia() {
		
	}
	
	/*
	 * Leia um inteiro positivo e imprima
	 * o fatorial do n�mero.
	 * Entrada: 4
	 * Sa�da: 4! = 24
	 * C�lculo: 4 * 3 * 2 * 1 
	 */
	public static void fatorial() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inteiro: ");
		int num = sc.nextInt();
		
		double total = 1; // come�a com 1
		for (int i=1; i<=num ; i++) {  
			total *= i; 
		}
		System.out.println(num + "! = " + total);
	}
	
	/*
	 * Leia um inteiro e imprima
	 * a soma de 1 at� o n�mero, usando o while.
	 * Entrada: 4
	 * Sa�da: 1 + 2 + 3 + 4 = 10
	 */
	public static void somatoria() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inteiro: ");
		int num = sc.nextInt();
		
		int total = 0; // come�a com 0
		int i = 1;  // inicializa��o 
		while (i<=num) {  // teste
			total += i; // acumula os valores de 1 at� o num
			if (i == num) System.out.print(i);  // se for o �ltimo
			else System.out.print(i + " + ");  // sen�o imprime com +
			i++;   // incremento
		}
		System.out.println(" = " + total);
	}
	
	
	/*
	 * Leia um inteiro e imprima sua tabuada.
	 * Entrada: 4
	 * Sa�da: 4 X 1 = 4
	 * 		  4 X 2 = 8
	 * 			...
	 * 		  4 X 10 = 40
	 */
	public static void calculaTabuada() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inteiro: ");
		int num = sc.nextInt();
		
		for (int i=1 ; i<=10 ; i++) {
			int valor = num * i;
			System.out.println(num + " X " + i + " = " + valor);
		}		
	}
	
	/*
	 * Leia um inteiro e exiba o 
	 * n�mero lido 10 vezes
	 * Entrada: 3
	 * Sa�da: 3 - 3 - 3 - 3 - 3 - 3 - 3 - 3 - 3 - 3
	 */
	public static void exibir10vezes() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inteiro: ");
		int num = sc.nextInt();
		
		for (int i=0 ; i<10 ; i=i+1) {
			if (i == 9) System.out.print(num);  // se for o �ltimo
			else System.out.print(num + " - ");
		}
	}
	
	
	/*
	 * Leia um n�mero inteiro e mostre
	 * os n�meros de 1 at� o n�mero lido.
	 * Entrada: 5
	 * Sa�da: 1 - 2 - 3 - 4 - 5
	 */
	public static void exibir1AteMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inteiro: ");
		int num = sc.nextInt();
		
		for (int i=1 ; i<=num ; i++) {
			System.out.print(i + " - ");
		}	
	}

}
