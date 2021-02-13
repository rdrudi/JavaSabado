package aula01;

import java.util.Scanner;

public class Numeros {
	
	public static void main(String[] args) {
		//comparando();
		digitando();
	}
	
	public static void comparando() {
		int numeroInteiro = 10;
		double numeroDouble = 10;
		System.out.println("Inteiro = " + numeroInteiro);
		System.out.println("Double = " + numeroDouble);
	}
	
	public static void digitando() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("Digite um double: ");
		double num2 = sc.nextDouble();
		System.out.println("O inteiro digitado foi: " + num1);
		System.out.println("O double digitado foi: " + num2);
	}

}
