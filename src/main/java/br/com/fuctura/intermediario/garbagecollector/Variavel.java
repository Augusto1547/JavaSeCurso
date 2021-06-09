package br.com.fuctura.intermediario.garbagecollector;

public class Variavel {

	public static void main(String[] args) {

		// Variável primitiva
		int x = 7;
		x = 9;
		System.out.println(x);

//		nove vai substituir e ocupar o mesmo espaço na memória que 7

		// Variável de referência
		String y = "XTI";
		y = "xti.com.br";
		y = null;
		/*
		 * Os três valores existem e estão oculpando espaço na memória só que apenas o
		 * null está sendo utilizado e os outros estão mortos e apenas estão ocupando
		 * espaço na memória é ai que o garbage collector vai limpa-los e liberar espaço
		 */
		System.out.println(y);
	}

}
