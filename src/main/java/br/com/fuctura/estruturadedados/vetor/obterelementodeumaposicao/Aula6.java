package br.com.fuctura.estruturadedados.vetor.obterelementodeumaposicao;

public class Aula6 {

	private String[] elementos;
	private int tamanho;

	public Aula6(int capacidade) {

		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	public void adiciona(String elemento) {
		
		if(this.tamanho < this.elementos.length) {
			
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			
		}
	
	}
}
