package br.com.fuctura.intermediario.passagemvalorreferencia;

public class PassagemPorValorEReferencia {
	
	int referencia = 10;

	public void somarValor(int valor) {
		
		int result = valor = 10 + 9;
		
		System.out.println(result);
		
	}
	
	public void somarReferencia(PassagemPorValorEReferencia pvr) {
		
		pvr.referencia = 300;
	}
	
	 
}
