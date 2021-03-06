package aula04;

import javax.swing.JOptionPane;

public class ExerciciosMetodos {
	
	public static void main(String[] args) {
		//testaNomeDoMes();
		testaDif();
	}
	

	public static void testaDif() {
		System.out.println(dif(3,5));
		System.out.println(dif(4,1));
		System.out.println(dif(6,6));
		System.out.println(dif(-3,5));
	}
	/*
	 * criar o método dif() que recebe dois doubles
	 * e retorna a diferença entre eles.
	 * Entrada: 3,2 => 1
	 * Entrada: 2,3 => 1
	 */
	public static double dif(double a, double b) {
		double dif;
		if (a>b) dif = a - b;
		else dif = b - a;
		return dif;
	}
	
	/*
	 * criar um método que leia o número do mês
	 * e informe o nome correspondente
	 */
	public static void testaNomeDoMes() {
		String str = JOptionPane.showInputDialog("Número do Mês:");
		int num = Integer.parseInt(str);
		String mes = nomeDoMes(num);
		JOptionPane.showMessageDialog(null, mes);		
	}
	
	/*
	 * criar um método nomeDoMes que recebe um inteiro
	 * e retorna o nome do mês correspondente.
	 */
	public static String nomeDoMes(int num) {
		String mes;
		
		if (num == 1) mes = "Janeiro";
		else if (num == 2) mes = "Fevereiro";
		else if (num == 3) mes = "Março";
		else if (num == 4) mes = "Abril";
		else if (num == 5) mes = "Maio";
		else if (num == 6) mes = "Junho";
		else if (num == 7) mes = "Julho";
		else if (num == 8) mes = "Agosto";
		else if (num == 9) mes = "Setembro";
		else if (num == 10) mes = "Outubro";
		else if (num == 11) mes = "Novembro";
		else if (num == 12) mes = "Dezembro";
		else mes = "Mês inválido!";
		
		return mes;
	}

}
