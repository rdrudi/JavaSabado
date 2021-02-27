package aula03;

import java.util.Scanner;

public class RevisaoCondicional {
	
    public static void main(String[] args) {
		//exemploIf();
		//exemploIfElse();
		exemploIfElseEncadeado();
	}
	
    /* 
     * Ler 1 n�mero e informar se
     * � positivo, negativo ou nulo
     */
    public static void exemploIfElseEncadeado() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();    
		if (num > 0) System.out.println(num + " � positivo");
		else if (num < 0) System.out.println(num + " � negativo");
		else if (num == 0) System.out.println(num + " � nulo");		
    }
    
    /*
     * Ler 1 n�mero e informar se
     * � positivo ou n�o.
     */
    public static void exemploIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();
		if (num > 0) System.out.println(num + " � positivo!");
		else System.out.println(num + " n�o � positivo!");
    }
    
    /*
     * Ler 1 n�mero e informar se � 
     * positivo.
     */
	public static void exemploIf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();
		if (num > 0) System.out.println(num + " � positivo!");
	}

}
