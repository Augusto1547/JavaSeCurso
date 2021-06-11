package br.com.fuctura.projetospessoais.aprovados.excecoes;

public class SerieInexistente extends Exception{

	public String mensagem;
	
	public SerieInexistente() {
		
		this.mensagem = "Está série não existe no sistema";
	}
}
