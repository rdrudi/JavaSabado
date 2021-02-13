package aula01;

import java.util.Scanner;

/* 
 * crie rotinas para ler os dados das figuras
 * e imprimir sua área e seu perímetro
 */
public class FigurasPlanas {
	public static void main(String[] args) {
		//quadrado();
		//retangulo();
		circulo();
	}

	/*
	 * entrada: double lado
	 * saída: área = lado * lado
	 * 		  perímetro = 4 * lado  
	 */
	public static void quadrado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quadrado ===============");
		System.out.print("Lado: ");
		double lado = sc.nextDouble();
		double area = lado * lado;
		double perimetro = 4 * lado;
		System.out.println("Área = " + area);
		System.out.println("Perímetro = " + perimetro);
	}

	/*
	 * entrada: double base 
	 * 			double altura
	 * saída: área = base * altura
	 * 		  perímetro = 2 * (base + altura)
	 */
	public static void retangulo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Retângulo ===============");
		System.out.print("Base: ");
		double base = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		System.out.println("Área = " + area);
		System.out.println("Perímetro = " + perimetro);
	}
	/*
	 * entrada: double raio
	 * saída: área = raio * raio * pi
	 * 		  perímetro = 2 * raio * pi
	 * double pi = 3.1416
	 */
	public static void circulo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Círculo ===============");
		System.out.print("Raio: ");
		double pi = Math.PI;
		double raio = sc.nextDouble();
		double area = raio * raio * pi;
		double perimetro = 2 * raio * pi;
		System.out.println("Área = " + area);
		System.out.println("Perímetro = " + perimetro);		
	}
}
