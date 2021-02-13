package aula01;

import java.util.Scanner;

/* 
 * crie rotinas para ler os dados das figuras
 * e imprimir sua �rea e seu per�metro
 */
public class FigurasPlanas {
	public static void main(String[] args) {
		//quadrado();
		//retangulo();
		circulo();
	}

	/*
	 * entrada: double lado
	 * sa�da: �rea = lado * lado
	 * 		  per�metro = 4 * lado  
	 */
	public static void quadrado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quadrado ===============");
		System.out.print("Lado: ");
		double lado = sc.nextDouble();
		double area = lado * lado;
		double perimetro = 4 * lado;
		System.out.println("�rea = " + area);
		System.out.println("Per�metro = " + perimetro);
	}

	/*
	 * entrada: double base 
	 * 			double altura
	 * sa�da: �rea = base * altura
	 * 		  per�metro = 2 * (base + altura)
	 */
	public static void retangulo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ret�ngulo ===============");
		System.out.print("Base: ");
		double base = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		System.out.println("�rea = " + area);
		System.out.println("Per�metro = " + perimetro);
	}
	/*
	 * entrada: double raio
	 * sa�da: �rea = raio * raio * pi
	 * 		  per�metro = 2 * raio * pi
	 * double pi = 3.1416
	 */
	public static void circulo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("C�rculo ===============");
		System.out.print("Raio: ");
		double pi = Math.PI;
		double raio = sc.nextDouble();
		double area = raio * raio * pi;
		double perimetro = 2 * raio * pi;
		System.out.println("�rea = " + area);
		System.out.println("Per�metro = " + perimetro);		
	}
}
