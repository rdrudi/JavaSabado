package aula04;

import java.util.Scanner;

import util.Mat;

public class TestaMat {
	
	public static void main(String[] args) {
		usaMat();
	}
	
	/*
	 * leia 2 inteiros e informe:
	 * - o valor absoluto dos números lidos
	 * - a diferença absoluta entre eles
	 */
	public static void usaMat() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro Número: ");
		int n1 = sc.nextInt();
		System.out.print("Segundo Número: ");
		int n2 = sc.nextInt();
		
		System.out.println("Valor absoluto de " + n1 + ": " + Mat.mod(n1));
		System.out.println("Valor absoluto de " + n2 + ": " + Mat.mod(n2));
		System.out.println("Diferença = " + Mat.dif(n1,n2));
		System.out.println("Fatorial de " + n1 + " = " + Mat.fat(n1));
		System.out.println("Fatorial de " + n2 + " = " + Mat.fat(n2));
		System.out.println(n1 + "^" + n2 + " = " + Mat.pot(n1,n2));
		System.out.println(n2 + "^" + n1 + " = " + Mat.pot(n2,n1));
		System.out.println("MDC(" + n1 + "," + n2 + ") = " + Mat.mdc(n1,n2));
		System.out.println("MMC(" + n1 + "," + n2 + ") = " + Mat.mmc(n1,n2));
		
	}

}
