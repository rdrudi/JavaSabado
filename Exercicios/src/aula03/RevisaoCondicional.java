package aula03;

import java.util.Scanner;

public class RevisaoCondicional {
	
    public static void main(String[] args) {
		//exemploIf();
		//exemploIfElse();
		exemploIfElseEncadeado();
	}
	
    /* 
     * Ler 1 número e informar se
     * é positivo, negativo ou nulo
     */
    public static void exemploIfElseEncadeado() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = sc.nextInt();    
		if (num > 0) System.out.println(num + " é positivo");
		else if (num < 0) System.out.println(num + " é negativo");
		else if (num == 0) System.out.println(num + " é nulo");		
    }
    
    /*
     * Ler 1 número e informar se
     * é positivo ou não.
     */
    public static void exemploIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		if (num > 0) System.out.println(num + " é positivo!");
		else System.out.println(num + " não é positivo!");
    }
    
    /*
     * Ler 1 número e informar se é 
     * positivo.
     */
	public static void exemploIf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		if (num > 0) System.out.println(num + " é positivo!");
	}

}
