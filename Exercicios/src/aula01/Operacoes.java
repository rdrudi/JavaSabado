package aula01;

public class Operacoes {

	public static void main(String[] args) {
		//operacoes();
		precedencia();
	}

	public static void precedencia() {
		int n1 = 10;
		int n2 = 20;
		long r1 = n1 + n2 * 3;  // 10 + 20 * 3
		long r2 = (n1 + n2) * 3; // (10 + 20) * 3
		System.out.println("Resultado 1 = " + r1);		
		System.out.println("Resultado 2 = " + r2);		
	}

	public static void operacoes() {
		int n1 = 10;
		int n2 = 20;
		int soma = n1 + n2;  // 10 + 20 
		int sub = n1 - n2;   // 10 - 20
		int mult = n1 * n2;  // 10 * 20 
		double div = (double) n1 / n2;   // 10 / 20
		System.out.println("Soma = " + soma + 
				           "\nSubtração = " + sub + 
						   "\nMultiplicação = " + mult +
						   "\nDivisão = " + div);
		
	}
}
