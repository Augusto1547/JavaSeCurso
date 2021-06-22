package br.com.fuctura.projetospessoais.aprovados.excecoes;

public class IdentificacaoInexistente extends Exception{
	
	public String mensagem;
	
	public IdentificacaoInexistente() {
		
		this.mensagem = "Nenhuma sala identificada com está letra, tente outra";
	}

}