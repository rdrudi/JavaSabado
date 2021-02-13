package aula01;

import java.util.Scanner;

public class DigitaNome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Seu nome é " + nome);
	}
}
