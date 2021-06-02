package br.com.fuctura.intermediario.printf;

import java.math.BigDecimal;

public class ExemploPrintf {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/module-summary.html
		String nome = "Faustão";
		String sobrenome = "Silva Ferreira";
		Integer idade = 58;
		BigDecimal salario = new BigDecimal("33200.567");

		System.out.printf("%20s \n", nome);
		System.out.printf("%-20s \n", sobrenome);
		System.out.printf("%3d \n", idade);
		System.out.printf("%.2f \n", salario);
		System.out.printf("R$%10.2f \n", salario);

		System.out.printf("Nome: %s, Idade: %d, Salário: %.2f", nome, idade, salario);

		System.out.printf("%n");
		System.out.printf("%n");
		/* ================================================================ */

		// expressões regulares a topic who pode to be search depois
		// %n is more indicate who \n
		System.out.printf("Hello:%s %n", " Olá mundo");
		System.out.printf("hellow: %S %n", "olá mundo");

		System.out.printf("%c %n", 'c');
		System.out.printf("%C %n", 'c');

		System.out.printf("%n");

		int valor1 = 31456789;
		System.out.printf("%+d", valor1);
		System.out.printf("%n");

		int valor2 = 31456789;
		System.out.printf("%015d", valor2);// until on formatação of numbers
		System.out.printf("%n");

		System.out.printf("%,d %n", valor2);
		System.out.printf("%n");

		int valor3 = -123456789;
		System.out.printf("% d", valor3);
		System.out.println();

		int valor4 = 123456789;
		System.out.printf("% d", valor4);
        System.out.printf("%n");
		/* ===================================== */
		testeMaisCompleto();

	}

	private static void testeMaisCompleto() {

		double[] precos = { 10000, 123.54, 7843.567, 1, 4.54789 };

		for (int i = 0; i < precos.length; i++) {

			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}
//on life real not aplicamos esse printf de cima uses the class Java.util.Formater
		/*
		 * the method printf it is apenas a atalho for o System.out.format(null, null);
		 * use qualquer a dos two
		 */

	}

}
