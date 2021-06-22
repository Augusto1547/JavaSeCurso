package br.com.fuctura.logica.desafios;

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

		if (v1.equals(null) || v2.equals(null) || v3.equals(null) || v4.equals(null) || v5.equals(null)
				|| v6.equals(null)) {

			System.out.println("Não é aceito valores nulos");

		} else {

			Integer[] valor = new Integer[6];
			valor[0] = v1;
			valor[1] = v2;
			valor[2] = v3;
			valor[3] = v4;
			valor[4] = v5;
			valor[5] = v6;

			Integer soma = 0;
			for (int i = 0; i < valor.length; i++) {
				if (valor[i] > 0) {
					Integer recebeInteiros = valor[i];
                    System.out.println(recebeInteiros);
				}
			}

		    
		}

	}
}
// receba 6 valores > descarte valores nulos e receba positivos e negativos 
// mostre quantidade de positivos com mensagem ao lado

//entender o problema, criar uma estratégia, dividir o probema
