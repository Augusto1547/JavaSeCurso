package br.com.fuctura.projetospessoais.aprovados.excecoes;

public class NotaInvalida extends Exception {
	
	private String mensagem;
	
	public NotaInvalida() {
		
		this.mensagem = "Nota inválida! somente notas igual ou menor que dez";
	}

}
