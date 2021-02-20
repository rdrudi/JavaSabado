package aula02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Modulo {
	
	public static void main(String[] args) {
		//divisaoInteiros();
		parOuImpar();
	}
	
	public static void parOuImpar() {
		String str = JOptionPane.showInputDialog("Digite um número inteiro:");
		int num = Integer.parseInt(str);
		
		int resto = num % 2;  // resto da divisão por 2
		if (resto == 0) { // número é par
			JOptionPane.showMessageDialog(null,num + " é par!",
					                      "Resultado",
					                      JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,num + " é ímpar!",
					                      "Resultado",
					                      JOptionPane.PLAIN_MESSAGE);
		}	
	}
	
	
	public static void divisaoInteiros() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int quociente = n1 / n2;
		int resto = n1 % n2;
		
		System.out.println("Quociente = " + quociente);
		System.out.println("Resto = " + resto);
	}

}
