package br.com.fuctura.logica;
//2
public class For {

	public static void main(String[] args) {

		for (int i = 0, j = 10; i < j; i++, j--) {

			System.out.println("i = " + i + ";  j = " + j);

		} // letras
		System.out.println();

		int count = 0;

		for (; count < 10;) {

			System.out.println("O valor de count é " + count);
			count++;
		} // diferente
		System.out.println();

		int soma = 0;
		for (int i = 1; i < 5; soma += i++)
			;
		System.out.println("O valor da soma é " + soma);
		// soma
		System.out.println();

		for (int i = 0; i < 5; i++)
			System.out.println("i é igual a " + i);
		// contra

		/*
		 * Dicas: o system é somente dentro do for, usar o for com partes ausentes não é
		 * muito comum loop sem corpo é mais comum quando agente quer somar valores
		 */

	}
}
