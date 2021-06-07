//11:04
package br.com.fuctura.logica.desafios;

import java.util.Scanner;

@Cabecalho(

//@formatter:off
	instituicao = "Fuctura tecnologia",
	projeto = "lógica de progamação", 
	dataCriacao = "5/jun/2021", 
	numeroErros = 0,
	autor = "Fernando Santos"
//@formatter:on	
)

@ErrosCorrigidos(erros = { "0001", "0002" })

public class AulaFuctura1 {

	public static void main(String[] args) {
		
		Scanner recebe = new Scanner(System.in);
		System.out.println("Infome um valor");
		int valor1 = recebe.nextInt();
		System.out.println("Informe outro valor");
		int valor2 = recebe.nextInt();
		
		StringBuffer concat = new StringBuffer();
	    
		int soma = valor1 + valor2;
		int multiplicacao = valor1 * valor2;
		
	    if(soma == multiplicacao) {
	    	
	    	System.out.printf("Mensagem : %s"," A soma não é igual a multiplicação");
	    	
	    } else {
	    	
	    	System.out.println("Não são iguais");
	    }
	}

}
