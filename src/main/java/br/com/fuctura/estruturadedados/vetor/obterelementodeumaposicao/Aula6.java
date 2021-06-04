package br.com.fuctura.estruturadedados.vetor.obterelementodeumaposicao;

//21
public class Aula6 {

	String[] elementos;
	int tamanho;

	public Aula6(int quantidade) {

		this.elementos = new String[quantidade];
		this.tamanho = 0;
	}

	public boolean adiciona(String elemento) {

		if (this.tamanho < this.elementos.length) {
			return true;
		}
		return false;

	}

}
