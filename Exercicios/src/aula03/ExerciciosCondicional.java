package aula03;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class ExerciciosCondicional {
	
	public static void main(String[] args) {
		//imprimeMenor();
		//detectaCovid();
		classificaIMC();
	}
	
	/* 
	 * Leia o nome, o peso (kg) e a altura (m) 
	 * de uma pessoa e informe sua classifica��o 
	 * IMC conforme a tabela
	 * imc = peso / (altura * altura)
	 */
	public static void classificaIMC() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Peso: ");
		double peso = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura	* altura);
		
		System.out.print("Classifica��o IMC: ");
		if (imc < 18.5) System.out.println("peso baixo.");
		else if (imc < 25) System.out.println("peso normal.");
		else if (imc < 30) System.out.println("sobrepeso.");
		else if (imc < 35) System.out.println("obesidade (grau I).");
		else if (imc < 40) System.out.println("obesidade severa (grau II).");
		else System.out.println("obesidade m�rbida (grau III).");
	}
	
	/*
	 * Leia a temperatura de uma pessoa e classifique 
	 * seu risco de estar com Covid:
	 * temperatura at� 37,0 => risco zero
	 * temperatura entre 37,1 e 37,5 => risco baixo
	 * temperatura entre 37,6 e 38,5 => risco m�dio
	 * temperatura acima de 38,5 => risco alto  
	 */
	public static void detectaCovid() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Temperatura: ");
		double temp = sc.nextDouble();
		if (temp <= 37) System.out.println("Risco zero! Parab�ns!");
		else if (temp <= 37.5) System.out.println("Risco baixo. Cuidado.");
		else if (temp <= 38.5) System.out.println("Risco m�dio. Procure um m�dico.");
		else System.out.println("Samu j�!!!!!");
	}
	
	/*
	 * Leia 2 n�meros inteiros e 
	 * imprima o menor
	 */
	public static void imprimeMenor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro n�mero: ");
		int n1 = sc.nextInt();
		System.out.print("Segundo n�mero: ");
		int n2 = sc.nextInt();
		if (n1 < n2) System.out.println(n1 + " � menor que " + n2);
		else if (n2 < n1) System.out.println(n2 + " � menor que " + n1);
		else System.out.println(n1 + " � igual a " + n2);
	}

}
