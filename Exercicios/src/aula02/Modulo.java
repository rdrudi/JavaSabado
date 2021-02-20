package aula02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Modulo {
	
	public static void main(String[] args) {
		//divisaoInteiros();
		parOuImpar();
	}
	
	public static void parOuImpar() {
		String str = JOptionPane.showInputDialog("Digite um n�mero inteiro:");
		int num = Integer.parseInt(str);
		
		int resto = num % 2;  // resto da divis�o por 2
		if (resto == 0) { // n�mero � par
			JOptionPane.showMessageDialog(null,num + " � par!",
					                      "Resultado",
					                      JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,num + " � �mpar!",
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
