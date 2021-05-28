package br.com.fuctura.intermediario.passagemvalorreferencia;

public class TestaValorEReferencia {

	public static void main(String[] args) {

		PassagemPorValorEReferencia pvr = new PassagemPorValorEReferencia();
		
		int valor = 89;
	    pvr.referencia = 50;
		pvr.somarValor(valor);
		System.out.println("Valores " + valor);
	}

}
