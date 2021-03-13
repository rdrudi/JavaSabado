package aula05;

import java.util.Scanner;

public class SistemaHuber {
	
	public static void main(String[] args) {
		pegaDados();
		gravaDados();
	}
	
	public static void pegaDados() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do Passageiro: ");
		String nome = sc.nextLine();
		System.out.print("Telefone do Passageiro: ");
		String fone = sc.nextLine();
		System.out.print("Destino: ");
		String destino = sc.nextLine();
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		System.out.print("Avaliação [1-5]: ");
		int nota = sc.nextInt();
	}
	
	public static void gravaDados() {
		
	}

}
