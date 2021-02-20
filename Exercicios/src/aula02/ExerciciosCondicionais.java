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
	 * Caso o n�mero esteja fora do intervalo 
	 * informar n�mero inv�lido.
	 * Entrada:  2
	 * Sa�da: Segunda-Feira
	 * Entrada: 8
	 * Sa�da: N�mero inv�lido!
	 */
	public static void diaDaSemana() {
		String str = JOptionPane.showInputDialog("N�mero do Dia da Semana:");
		int num = Integer.parseInt(str);
		String dia;
		
		switch (num){
		case 1: dia = "Domingo"; break;
		case 2: dia = "Segunda-Feira"; break;
		case 3: dia = "Ter�a-Feira"; break;
		case 4: dia = "Quarta-Feira"; break;
		case 5: dia = "Quinta-Feira"; break;
		case 6: dia = "Sexta-Feira"; break;
		case 7: dia = "S�bado"; break;
		default: dia = "N�mero inv�lido!";
		}
		
		JOptionPane.showMessageDialog(null, dia);		
	}
	
	/*
	 * Leia 2 inteiros e informe se s�o divisores.
	 * Divisor: um n�mero � divisor de outro se o 
	 *          resto da divis�o � zero.
	 * Entrada: 10 2
	 * Sa�da: 2 � divisor de 10
	 * Entrada: 3 9
	 * Sa�da: 3 � divisor de 9
	 * Entrada: 10 3
	 * Sa�da: N�o s�o divisores
	 */
	public static void divisores() {
		// ler 2 inteiros a e b
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		// pegar o resto da divis�o de a por b
		int resto = a % b;
		// se for zero - b � divisor de a
		if (resto == 0) {
			JOptionPane.showMessageDialog(null, b + " � divisor de " + a);
		} else {  // sen�o
			// pegar o resto da divis�o de b por a
			// se for zero - a � divisor de b
			if ((b % a) == 0) {
				JOptionPane.showMessageDialog(null, a + " � divisor de " + b);
			} else {  // sen�o
				// n�o s�o divisores
				JOptionPane.showMessageDialog(null, "N�o s�o divisores");
			}
		}
	}
	
	/*
	 * Leia 3 inteiros e imprima-os
	 * em ordem crescente.
	 * Entrada: 2 6 3
	 * Sa�da: 2 - 3 - 6
	 */
	public static void imprimir3emOrdem() {
		Scanner sc = new Scanner(System.in);
		//1) Crie quatro espa�os de mem�ria para guardar
		//valores, chamando-os de A, B, C e AUX;
		int a,b,c,aux;
		//2) Leia um n�mero inteiro e guarde-o no 
		//espa�o de mem�ria A;
		System.out.print("Primeiro n�mero: ");
		a = sc.nextInt();
		//3) Leia um n�mero inteiro e guarde-o no 
		//espa�o de mem�ria B;
		System.out.print("Segundo n�mero: ");
		b = sc.nextInt();
		//4) Leia um n�mero inteiro e guarde-o no 
		//espa�o de mem�ria C;
		System.out.print("Terceiro n�mero: ");
		c = sc.nextInt();
		//5) Se o valor da mem�ria A for maior que o valor da
		//mem�ria B, fa�a as seguintes opera��es;
		//	5.1) coloque o valor de A na mem�ria AUX;
		//	5.2) coloque o valor de B na mem�ria A;
		//	5.3) coloque o valor de AUX na mem�ria B.
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		//6) Se o valor da mem�ria B for maior que o valor da
		//mem�ria C, fa�a as seguintes opera��es;
		//	6.1) coloque o valor de B na mem�ria AUX;
		//	6.2) coloque o valor de C na mem�ria B;
		//	6.3) coloque o valor de AUX na mem�ria C.
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		//7) Se o valor da mem�ria A for maior que o valor da
		//mem�ria B, fa�a as seguintes opera��es;
		//	7.1) coloque o valor de A na mem�ria AUX;
		//	7.2) coloque o valor de B na mem�ria A;
		//	7.3) coloque o valor de AUX na mem�ria B.
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		//8) Imprima o valor da mem�ria A, 
		//   seguido de um h�fen.
		System.out.print(a + " - ");
		//9) Imprima o valor da mem�ria B, 
		//   seguido de um	h�fen.
		System.out.print(b + " - ");
		//10) Imprima o valor da mem�ria C.
		System.out.println(c);
	}
	
	
	/*
	 * Leia 1 inteiro e informe se
	 * � positivo, negativo ou nulo.
	 * Entrada: 1
	 * Sa�da: Positivo 
	 * Entrada: -4
	 * Sa�da: Negativo
	 * Entrada: 0
	 * Sa�da: Nulo
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
	 * Leia 2 n�meros inteiros e imprima-os 
	 * em ordem crescente.
	 * Entrada: 3 2
	 * Sa�da: 2 - 3 
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
