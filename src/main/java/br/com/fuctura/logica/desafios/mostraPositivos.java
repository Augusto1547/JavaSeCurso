package br.com.fuctura.logica.desafios;

//4:45
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

		int[] v = { 64, 76, -98, 3, -10, 2 };

		int contador = contarImpares(v);

		System.out.println("Valores positivos " + contador);

	}

	private static int contarImpares(int[] v) {

		int contador = 0;

		for (int x : v) {

			if (x > 0) {

				contador++;
			}
		}

		return contador; //vai retornar para o método main o contador
	}
}

// receba 6 valores > descarte valores nulos e receba positivos e negativos 
// mostre quantidade de positivos com mensagem ao lado

/*
 * Dicas: tenha muito claro o que o problema tá querendo(a história que o
 * problema está apontando, que dados o problema tá apresentando(o que ele quer
 * e como ele quer) -quebre o problema em problemas menores após entender o
 * problema bem, pegar um maior e quebra-lo em menores -Tente reduzir o problema
 * a um problema que você já conhece( transformar em outro para enchergar de
 * nova pespectiva) -Não teve jeito vá atrás de conteúdo para aprender para
 * resolver o problema (mentoria ajuda) resolva muitos problemas
 */
//entender o problema, criar uma estratégia, dividir o probema
