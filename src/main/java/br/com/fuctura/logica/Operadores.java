package br.com.fuctura.logica;

public class Operadores {

	public static void main(String[] args) {

		// +, -, *, /, % (operadores aritiméticos)
		// >, <, >=, <=, != (operadores de comparação)
		// &&,&, ||, |, !, ^ (operadores lógicos)
		// +=, -=, *=, /=, %= (operadore de atribuição)

		int number = 8;
		int numbertwo = 8;

		// &&(curto circuito)

		/*
		 * if (number % numbertwo == 0) {
		 * 
		 * System.out.println("Numbers pares " + number);
		 * 
		 * } else {
		 * 
		 * System.out.println("São impares "); }
		 */

		boolean verdadeiro = true;
		boolean falso = true;
		boolean resultado = (verdadeiro && falso); // &(só aceita se o primeiro é verdadeiro)
		// &&(curso circuíto nem olha o segundo pois já sabe que é falso)

		System.out.println(resultado);

		boolean verdadeiro2 = true;
		boolean falso2 = false;

		if (verdadeiro2 == true && falso2 == true) {

			System.out.println("verdadeiro");

		} else {

			System.out.println("falso");
		}

		/*
		 * System.out.println(verdadeiro && falso); System.out.println(verdadeiro ||
		 * verdadeiro); System.out.println(!verdadeiro ^ falso);
		 */

	}

}
