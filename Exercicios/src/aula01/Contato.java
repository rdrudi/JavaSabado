package aula01;

import java.util.Scanner;

/*
 * Criar uma rotina que leia
 * o nome(String), a idade(int) 
 * e a altura(double) 
 * de uma pessoa e imprima os
 * dados lidos.
 */
public class Contato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		System.out.println("Nome = " + nome + 
						   "\tIdade = " + idade + 
						   "\tAltura = " + altura);
	}
}
