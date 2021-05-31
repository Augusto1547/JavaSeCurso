package br.com.fuctura.intermediario.varargs;

public class ExemplosVarArgs {

	public static void main(String[] args) {

		System.out.println(soma1(8, 8, 9));

		int[] vetor = new int[] { 8, 5, 34, 98, 29, 12, 89, 77, 88, 21, 66, 34, 89, 12, 31, 89, 78, 98, 56, 83, 28, 77,
				88 };
		System.out.println(soma2(vetor));

		System.out.println(soma3("Soma : ", 4, 8, 19));

	}

	private static int soma1(int x, int y, int j) {

		int total = 0;

		total += x + y + j;

		return total;
	}

	private static int soma2(int[] vetor) {

		int total = 0;
		for (int i = 0; i < vetor.length; i++) {

			total += vetor[i];

		}
		return total;
	}

	private static int soma3(String titulo, Integer... vetor) { // só pode terminar com argumentos variáveis mas pode
																// iniciar com outros argumentos
		System.out.print(titulo);

		int total = 0;

		for (Integer m : vetor) {

			total += m;
		}

		return total;
	}
}
