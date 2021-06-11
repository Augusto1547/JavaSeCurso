package br.com.fuctura.projetospessoais.aprovados.excecoes;

public class MateriaInexistente extends Exception{

	public String mensagem;
	
	public MateriaInexistente() {
		
		this.mensagem = "Esta matéria não existe no sistema";
	}
}


