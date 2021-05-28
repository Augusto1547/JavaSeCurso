package br.com.fuctura.intermediario.passagemvalorreferencia;

public class App1 {

	private static void calcular(int idade) {

		idade = idade + 50;
	}

	public static void main(String[] args) {

		int idade = 10;

		calcular(idade);
		System.out.println(idade);

	}

}
