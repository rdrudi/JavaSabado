package util;

import java.util.Scanner;

public class Conversao {

	// trazer para a classe Conversao
	// os seguintes m�todos:
	//	X diaDaSemana();
	//	X nomeDoMes();
	// 	X classeIMC();

	/**
	 * O m�todo <b>classeIMC(double imc)</b> retorna o 
	 * classifica��o do IMC conforme a tabela padr�o do IMC.
	 * @param imc o �ndice IMC a ser classificado.
	 * @return uma <i>string</i> com a classifica��o do IMC.
	 */
	public static String classeIMC(double imc) {
		String classe;
		if (imc < 18.5) classe = "Peso baixo.";
		else if (imc < 25) classe = "Peso normal.";
		else if (imc < 30) classe = "Sobrepeso.";
		else if (imc < 35) classe = "Obesidade (grau I).";
		else if (imc < 40) classe = "Obesidade severa (grau II).";
		else classe = "Obesidade m�rbida (grau III).";
		return classe;
	}
	
	/**
	 * O m�todo <b>nomeDoMes(int num)</b> recebew um inteiro
	 * e retorna o nome do m�s equivalente. Caso o valor informado
	 * esteja fora dos limites o m�todo retorna a string "M�s inv�lido!".
	 * @param num o n�mero do m�s - deve estar entre 1 e 12.
	 * @return o nome do m�s respectivo ao par�metro informado.
	 */
	public static String nomeDoMes(int num) {
		String mes;
		
		if (num == 1) mes = "Janeiro";
		else if (num == 2) mes = "Fevereiro";
		else if (num == 3) mes = "Mar�o";
		else if (num == 4) mes = "Abril";
		else if (num == 5) mes = "Maio";
		else if (num == 6) mes = "Junho";
		else if (num == 7) mes = "Julho";
		else if (num == 8) mes = "Agosto";
		else if (num == 9) mes = "Setembro";
		else if (num == 10) mes = "Outubro";
		else if (num == 11) mes = "Novembro";
		else if (num == 12) mes = "Dezembro";
		else mes = "M�s inv�lido!";
		
		return mes;
	}
	
	/**
	 * O m�todo <b>diaDaSemana(int num)</b> recebe um inteiro 
	 * e retorna o nome do dia da semana equivalente. Caso
	 * seja informado um n�mero fora do limite o m�todo
	 * retorna a string "N�mero inv�lido!".
	 * @param num um inteiro entre 1 e 7.
	 * @return o nome do dia da semana respectivo.
	 */
	public static String diaDaSemana(int num) {
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
		
		return dia;
	}	
	
}
