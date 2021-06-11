package br.com.fuctura.projetospessoais.aprovados.excecoes;

public class TurnoInexistente extends Exception{

	public String mensagem;
	
	public TurnoInexistente() {
		
		this.mensagem = "Este turno não existe no sistema";
	}
}
