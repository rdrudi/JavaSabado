package aula04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Metodos {

	public static void main(String[] args) {
		//testaDiaDaSemana();
		//diaDaSemanaScanner();
		//diaDaSemanaFor();
		testaMod();
	}
	
	public static void testaMod() {
		for (int i=-2 ; i<3 ; i++) {
			System.out.println("mod(" + i + ") = " + mod(i));
			// mod(-2) = 2
		}
	}
	
	/*
	 * mod(int num): recebe um inteiro e 
	 * retorna o seu módulo.
	 */
	public static int mod(int num) {
		if (num < 0) num = -num;
		return num;
	}
	
	
	public static void diaDaSemanaFor() {
		for (int i=0 ; i<10 ; i++) {
			System.out.println(i + ": " + diaDaSemana(i));
		}
	}
	
	public static void diaDaSemanaScanner() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número:");
		int dia = sc.nextInt();
		String str = diaDaSemana(dia);
		System.out.println(str);
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
	public static void testaDiaDaSemana() {
		String str = JOptionPane.showInputDialog("Número do Dia da Semana:");
		int num = Integer.parseInt(str);
		String dia = diaDaSemana(num);
		JOptionPane.showMessageDialog(null, dia);		
	}
	
	/* 
	 * diaDaSemana(int num): Recebe um inteiro num
	 * e retorna o nome do dia da semana equivalente.
	 */
	public static String diaDaSemana(int num) {
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
		
		return dia;
	}	
}


