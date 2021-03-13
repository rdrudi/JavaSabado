package aula05.agenda;

public class Agenda {

	public static void main(String[] args) {
		criarContato();
	}
	
	public static void criarContato() {
		Contato c1 = new Contato();
		c1.nome = "William Gates III";
		c1.celular = "(11) 9 1234 5678";
		c1.email = "bill@microsoft.com";

		Contato c2 = new Contato();
		c2.nome = "Linus Torvalds";
		c2.celular = "(11) 9 1111 2222";
		c2.email = "linus@linux.com";
		
		System.out.println(c1.nome);
		System.out.println(c2);
		
	}
}
