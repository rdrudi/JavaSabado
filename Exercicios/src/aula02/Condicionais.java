package aula02;

import java.util.Scanner;

public class Condicionais {
	
	public static void main(String[] args) {
		testeIF();
	}
	
	public static void testeIF() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("n1=" + n1 +
				           "\tn2=" + n2);
		
		if (n1 == n2) System.out.println("igual");
		else System.out.println("diferentes");
		if (n1 > n2) System.out.println("n1 � maior");
		if (n1 < n2) System.out.println("n1 � menor");
		if (n1 >= n2) System.out.println("n1 � maior ou igual");
		if (n1 <= n2) {
			System.out.println("n1 � menor ou igual");
		}
	}

}
