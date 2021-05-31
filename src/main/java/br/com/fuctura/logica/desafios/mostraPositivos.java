package br.com.fuctura.logica.desafios;

import java.util.Scanner;

public class mostraPositivos {

	public static void main(String[] args) {

		Scanner recebe = new Scanner(System.in);

		System.out.println("Valor 1");
		int v1 = recebe.nextInt();

		System.out.println("Valor 2");
		int v2 = recebe.nextInt();

		System.out.println("Valor 3");
		int v3 = recebe.nextInt();

		System.out.println("Valor 4");
		int v4 = recebe.nextInt();

		System.out.println("Valor 5");
		int v5 = recebe.nextInt();

		System.out.println("Valor 6");
		int v6 = recebe.nextInt();

		int[] recebeValores = new int[] { v1, v2, v3, v4, v5, v6 };

		for (int i = 0; i < recebeValores.length; i++) {

			if (!(recebeValores[i] == 0)) {

				if (recebeValores[i] % 2 == 0) {

					System.out.println(recebeValores[i] + " Valores");

				}
				
			} else {

				System.out.println("valores impares ou vazios");
			}
		}
	}

}
// receba 6 valores > descarte valores nulos e receba positivos e negativos 
// mostre quantidade de positivos com mensagem ao lado

//entender o problema, criar uma estratégia, dividir o probema
