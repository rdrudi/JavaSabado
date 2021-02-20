package aula02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExerciciosCondicionais {
	
	public static void main(String[] args) {
		//imprimir2emOrdem();
		//sinalDoNumero();
		//imprimir3emOrdem();
		//divisores();
		diaDaSemana();
	}
	
	/*
	 * Leia um inteiro entre 1 e 7 e 
	 * informe o dia respectivo da semana.
	 * Caso o número esteja fora do intervalo 
	 * informar número inválido.
	 * Entrada:  2
	 * Saída: Segunda-Feira
	 * Entrada: 8
	 * Saída: Número inválido!
	 */
	public static void diaDaSemana() {
		String str = JOptionPane.showInputDialog("Número do Dia da Semana:");
		int num = Integer.parseInt(str);
		String dia;
		
		switch (num){
		case 1: dia = "Domingo"; break;
		case 2: dia = "Segunda-Feira"; break;
		case 3: dia = "Terça-Feira"; break;
		case 4: dia = "Quarta-Feira"; break;
		case 5: dia = "Quinta-Feira"; break;
		case 6: dia = "Sexta-Feira"; break;
		case 7: dia = "Sábado"; break;
		default: dia = "Número inválido!";
		}
		
		JOptionPane.showMessageDialog(null, dia);		
	}
	
	/*
	 * Leia 2 inteiros e informe se são divisores.
	 * Divisor: um número é divisor de outro se o 
	 *          resto da divisão é zero.
	 * Entrada: 10 2
	 * Saída: 2 é divisor de 10
	 * Entrada: 3 9
	 * Saída: 3 é divisor de 9
	 * Entrada: 10 3
	 * Saída: Não são divisores
	 */
	public static void divisores() {
		// ler 2 inteiros a e b
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		// pegar o resto da divisão de a por b
		int resto = a % b;
		// se for zero - b é divisor de a
		if (resto == 0) {
			JOptionPane.showMessageDialog(null, b + " é divisor de " + a);
		} else {  // senão
			// pegar o resto da divisão de b por a
			// se for zero - a é divisor de b
			if ((b % a) == 0) {
				JOptionPane.showMessageDialog(null, a + " é divisor de " + b);
			} else {  // senão
				// não são divisores
				JOptionPane.showMessageDialog(null, "Não são divisores");
			}
		}
	}
	
	/*
	 * Leia 3 inteiros e imprima-os
	 * em ordem crescente.
	 * Entrada: 2 6 3
	 * Saída: 2 - 3 - 6
	 */
	public static void imprimir3emOrdem() {
		Scanner sc = new Scanner(System.in);
		//1) Crie quatro espaços de memória para guardar
		//valores, chamando-os de A, B, C e AUX;
		int a,b,c,aux;
		//2) Leia um número inteiro e guarde-o no 
		//espaço de memória A;
		System.out.print("Primeiro número: ");
		a = sc.nextInt();
		//3) Leia um número inteiro e guarde-o no 
		//espaço de memória B;
		System.out.print("Segundo número: ");
		b = sc.nextInt();
		//4) Leia um número inteiro e guarde-o no 
		//espaço de memória C;
		System.out.print("Terceiro número: ");
		c = sc.nextInt();
		//5) Se o valor da memória A for maior que o valor da
		//memória B, faça as seguintes operações;
		//	5.1) coloque o valor de A na memória AUX;
		//	5.2) coloque o valor de B na memória A;
		//	5.3) coloque o valor de AUX na memória B.
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		//6) Se o valor da memória B for maior que o valor da
		//memória C, faça as seguintes operações;
		//	6.1) coloque o valor de B na memória AUX;
		//	6.2) coloque o valor de C na memória B;
		//	6.3) coloque o valor de AUX na memória C.
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		//7) Se o valor da memória A for maior que o valor da
		//memória B, faça as seguintes operações;
		//	7.1) coloque o valor de A na memória AUX;
		//	7.2) coloque o valor de B na memória A;
		//	7.3) coloque o valor de AUX na memória B.
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		//8) Imprima o valor da memória A, 
		//   seguido de um hífen.
		System.out.print(a + " - ");
		//9) Imprima o valor da memória B, 
		//   seguido de um	hífen.
		System.out.print(b + " - ");
		//10) Imprima o valor da memória C.
		System.out.println(c);
	}
	
	
	/*
	 * Leia 1 inteiro e informe se
	 * é positivo, negativo ou nulo.
	 * Entrada: 1
	 * Saída: Positivo 
	 * Entrada: -4
	 * Saída: Negativo
	 * Entrada: 0
	 * Saída: Nulo
	 */
	public static void sinalDoNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 1 inteiro: ");
		int num = sc.nextInt();
		if (num > 0) System.out.println("Positivo");
		else if (num < 0) System.out.println("Negativo");
		else if (num == 0) System.out.println("Nulo");
	}
	
	
	/*
	 * Leia 2 números inteiros e imprima-os 
	 * em ordem crescente.
	 * Entrada: 3 2
	 * Saída: 2 - 3 
	 */
	public static void imprimir2emOrdem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 < n2) {
			System.out.println(n1 + " - " + n2);
		} else {
			System.out.println(n2 + " - " + n1);
		}
	}

}
