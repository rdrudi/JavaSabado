package aula02;

import javax.swing.JOptionPane;

public class SwitchCase {
	
	public static void main(String[] args) {
		informaMesSwitch();
		//informaMesIfElse();
	}
	
	public static void informaMesIfElse() {
		String str = JOptionPane.showInputDialog("Número do Mês:");
		int num = Integer.parseInt(str);
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
		
		JOptionPane.showMessageDialog(null, mes);
	}
	
	
	/*
	 * ler um inteiro entre 1 e 12 e informar
	 * o nome do mês respectivo.
	 */
	public static void informaMesSwitch() {
		String str = JOptionPane.showInputDialog("Número do Mês:");
		int num = Integer.parseInt(str);
		String mes = diaDoMes(num);
		JOptionPane.showMessageDialog(null, mes);
	}
	
	// processamento = método (função)
	// public static  <saida> nome (entrada)
	public static String diaDoMes(int num) {
		String mes;
		switch (num){
		case 1: mes = "Janeiro"; break;
		case 2: mes = "Fevereiro"; break;
		case 3: mes = "Março"; break;
		case 4: mes = "Abril"; break;
		case 5: mes = "Maio"; break;
		case 6: mes = "Junho"; break;
		case 7: mes = "Julho"; break;
		case 8: mes = "Agosto"; break;
		case 9: mes = "Setembro"; break;
		case 10: mes = "Outubro"; break;
		case 11: mes = "Novembro"; break;
		case 12: mes = "Dezembro"; break;
		default: mes = "Mês inválido!";
		}	
		return mes;
	}

}
