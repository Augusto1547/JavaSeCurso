package br.com.fuctura.intermediario.passagemvalorreferencia;

public class App2 {

	private static void calcular(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] *= 10;
		}
	}

	public static void main(String[] args) {

		int[] identificadores = new int[] { 6, 2, -1, 4, 5 };

		int[] miranha = identificadores;

		for (int i = 0; i < identificadores.length; i++) {

			System.out.println(identificadores[i]);
		}

		calcular(identificadores);

		for (int i = 0; i < identificadores.length; i++) {

			System.out.println(identificadores[i]);
		}

		System.out.println("\n Imprimindo o miranha");

		for (int i = 0; i < miranha.length; i++) {

			System.out.println(miranha[i]);
		}

	}
}
