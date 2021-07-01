package br.com.fuctura.logica.desafios;

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
		Integer v1 = Integer.parseInt(recebe.nextLine());
		System.out.println("Valor 2");
		Integer v2 = Integer.parseInt(recebe.nextLine());
		System.out.println("Valor 3");
		Integer v3 = Integer.parseInt(recebe.nextLine());
		System.out.println("Valor 4");
		Integer v4 = Integer.parseInt(recebe.nextLine());
		System.out.println("Valor 5");
		Integer v5 = Integer.parseInt(recebe.nextLine());
		System.out.println("Valor 6");
		Integer v6 = Integer.parseInt(recebe.nextLine());

		Integer[] valores = { v1, v2, v3, v4, v5, v6 };

		Integer soma = 0;
		for (int i = 0; i < valores.length; i++) {

			if (valores[i] > 0) {

				soma = (soma + valores[i])/(soma) ;
				System.out.println(soma);
			

			} else if (valores[i] == null) {

				System.out.println("Não aceitamos valores negativos ou vazios");
			}

		}

		/*
		 * if (v1.equals(null) || v2.equals(null) || v3.equals(null) || v4.equals(null)
		 * || v5.equals(null) || v6.equals(null)) {
		 * 
		 * System.out.println("Não é aceito valores nulos");
		 * 
		 * } else {
		 * 
		 * Integer[] valor = new Integer[6]; valor[0] = v1; valor[1] = v2; valor[2] =
		 * v3; valor[3] = v4; valor[4] = v5; valor[5] = v6;
		 * 
		 * Integer soma = 0; for (int i = 0; i < valor.length; i++) { if (valor[i] > 0)
		 * { Integer recebeInteiros = valor[i]; System.out.println(recebeInteiros); } }
		 * 
		 * 
		 * }
		 */

	}
}
/*
 * Dicas: tenha muito claro o que o problema tá querendo(a história que o
 * problema está apontando, que dados o problema tá apresentando(o que ele quer
 * e como ele quer) -quebre o problema em problemas menores após entender o
 * problema bem, pegar um maior e quebra-lo em menores -Tente reduzir o problema
 * a um problema que você já conhece( transformar em outro para enchergar de
 * nova pespectiva) -Não teve jeito vá atrás de conteúdo para aprender para
 * resolver o problema (mentoria ajuda) resolva muitos problemas
 */

// receba 6 valores > descarte valores nulos e receba positivos e negativos 
// mostre quantidade de positivos com mensagem ao lado

//entender o problema, criar uma estratégia, dividir o probema
