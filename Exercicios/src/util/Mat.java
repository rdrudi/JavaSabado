package util;

public class Mat {
	
	/**
	 * O método <b>mmc(a,b)</b> calcula o 
	 * Mínimo Múltiplo Comum dos inteiros <b>a</b> e <b>b</b>.
	 * @param a o primeiro inteiro.
	 * @param b o segundo inteiro.
	 * @return o <i>MMC</i> de <b>a</b> e <b>b</b>.
	 */
	public static int mmc(int a, int b) {
		// encontrar o maior dos 2
		int div = 0;
		if (a>b) div = a;
		else div = b;
		// verifica se resto é zero
		while ((div%a!=0) || (div%b!=0)) {
			// se não for, soma 1 e repete
			div++;
		}
		return div;
	}	
	
	/**
	 * O método <b>mdc(a,b)</b> calcula o 
	 * Máximo Divisor Comum dos inteiros <b>a</b> e <b>b</b>.
	 * @param a o primeiro inteiro.
	 * @param b o segundo inteiro.
	 * @return o <i>MDC</i> de <b>a</b> e <b>b</b>.
	 */
	public static int mdc(int a, int b) {
		// encontrar o menor dos 2
		int div = 0;
		if (a<b) div = a;
		else div = b;
		// pegar o resto da divisão dos 2 números
		// se os dois restos forem 0 -> achou
		while ((a%div!=0) || (b%div!=0)) {
			// se não, subtrai 1 e repete
			div--;
		}
		return div;
	}
	
	/**
	 * O método <b>pot(base,exp)</b> calcula o valor
	 * de base^exp.
	 * @param base a base da potenciação.
	 * @param exp o expoente da potenciação.
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
	 * O método <b>fat(num)</b> calcula o fatorial de um número.
	 * @param num um inteiro a ser calculado o fatorial.
	 * @return o fatorial de <b>num</b> como <i>double</i>.
	 */
	public static double fat(int num) {
		double total = 1; // começa com 1
		for (int i=1; i<=num ; i++) {  
			total *= i; 
		}
		return total;
	}
	
	/**
	 * O método mod retorna o valor absoluto
	 * de um inteiro.
	 * @param num o inteiro de entrada.
	 * @return o valor absoluto de num.
	 */
	public static int mod(int num) {
		if (num < 0) num = -num;
		return num;
	}	

	/**
	 * Calcula a diferença entre dois números.
	 * @param a o primeiro número.
	 * @param b o segundo número.
	 * @return a diferença absoluta entre os números.
	 */
	public static double dif(double a, double b) {
		double dif;
		if (a>b) dif = a - b;
		else dif = b - a;
		return dif;
	}
	
}
