package br.com.fuctura.logica.desafios;

import java.util.ArrayList;
//: 27
import java.util.Scanner;

@Cabecalho(

//		@formatter:off
		instituicao = "Fuctura tecnologia",
		projeto = "lógica de progamação", 
		dataCriacao = "5/jun/2021", 
		numeroErros = 0,
		autor = "Fernando Santos"
//		@formatter:on

)

@QuantidadeErros(erros = { "0001", "0002" })
public class mostraPositivos {

	public static void main(String[] args) {

		Scanner recebe = new Scanner(System.in);

		System.out.println("Valor 1");
		Integer v1 = recebe.nextInt();

		System.out.println("Valor 2");
		Integer v2 = recebe.nextInt();

		System.out.println("Valor 3");
		Integer v3 = recebe.nextInt();

		System.out.println("Valor 4");
		Integer v4 = recebe.nextInt();

		System.out.println("Valor 5");
		Integer v5 = recebe.nextInt();

		System.out.println("Valor 6");
		Integer v6 = recebe.nextInt();

		Integer[] recebeValores = new Integer[6];

		recebeValores[0] = v1;
		recebeValores[1] = v2;
		recebeValores[2] = v3;
		recebeValores[3] = v4;
		recebeValores[4] = v5;
		recebeValores[5] = v6;

		int count = 0;
		for (int i = 0; i < recebeValores.length; i++) {

			if (recebeValores[i].equals(null)) {

				System.out.println("O valor é nulo");

			} else if (recebeValores[i] > 0) {

                break;
                
			}

		}
		 

		 
	}

}
// receba 6 valores > descarte valores nulos e receba positivos e negativos 
// mostre quantidade de positivos com mensagem ao lado

//entender o problema, criar uma estratégia, dividir o probema
