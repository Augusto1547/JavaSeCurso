package br.com.fuctura.projetospessoais.aprovados.excecoes;

public class ProfessorInexistente extends Exception {

	public String mensagem;

	public ProfessorInexistente() {

		this.mensagem = new String("Este professor informado não existe no sistema");
	}
}
