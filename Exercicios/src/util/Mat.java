package util;

public class Mat {
	
	/**
	 * O m�todo <b>mmc(a,b)</b> calcula o 
	 * M�nimo M�ltiplo Comum dos inteiros <b>a</b> e <b>b</b>.
	 * @param a o primeiro inteiro.
	 * @param b o segundo inteiro.
	 * @return o <i>MMC</i> de <b>a</b> e <b>b</b>.
	 */
	public static int mmc(int a, int b) {
		// encontrar o maior dos 2
		int div = 0;
		if (a>b) div = a;
		else div = b;
		// verifica se resto � zero
		while ((div%a!=0) || (div%b!=0)) {
			// se n�o for, soma 1 e repete
			div++;
		}
		return div;
	}	
	
	/**
	 * O m�todo <b>mdc(a,b)</b> calcula o 
	 * M�ximo Divisor Comum dos inteiros <b>a</b> e <b>b</b>.
	 * @param a o primeiro inteiro.
	 * @param b o segundo inteiro.
	 * @return o <i>MDC</i> de <b>a</b> e <b>b</b>.
	 */
	public static int mdc(int a, int b) {
		// encontrar o menor dos 2
		int div = 0;
		if (a<b) div = a;
		else div = b;
		// pegar o resto da divis�o dos 2 n�meros
		// se os dois restos forem 0 -> achou
		while ((a%div!=0) || (b%div!=0)) {
			// se n�o, subtrai 1 e repete
			div--;
		}
		return div;
	}
	
	/**
	 * O m�todo <b>pot(base,exp)</b> calcula o valor
	 * de base^exp.
	 * @param base a base da potencia��o.
	 * @param exp o expoente da potencia��o.
	 * @return o valor de <b>base^exp</b> como <i>double</i>.
	 */
	public static double pot(double base, int exp) {
		double total = 1;
		for (int i=1; i<=exp ; i++) {
			total *= base;
		}
		return total;
	}
	
	/**
	 * O m�todo <b>fat(num)</b> calcula o fatorial de um n�mero.
	 * @param num um inteiro a ser calculado o fatorial.
	 * @return o fatorial de <b>num</b> como <i>double</i>.
	 */
	public static double fat(int num) {
		double total = 1; // come�a com 1
		for (int i=1; i<=num ; i++) {  
			total *= i; 
		}
		return total;
	}
	
	/**
	 * O m�todo mod retorna o valor absoluto
	 * de um inteiro.
	 * @param num o inteiro de entrada.
	 * @return o valor absoluto de num.
	 */
	public static int mod(int num) {
		if (num < 0) num = -num;
		return num;
	}	

	/**
	 * Calcula a diferen�a entre dois n�meros.
	 * @param a o primeiro n�mero.
	 * @param b o segundo n�mero.
	 * @return a diferen�a absoluta entre os n�meros.
	 */
	public static double dif(double a, double b) {
		double dif;
		if (a>b) dif = a - b;
		else dif = b - a;
		return dif;
	}
	
}
