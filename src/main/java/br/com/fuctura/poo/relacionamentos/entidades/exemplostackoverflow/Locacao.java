package br.com.fuctura.poo.relacionamentos.entidades.exemplostackoverflow;

import java.util.List;
import java.util.ArrayList;

//https://www.linkedin.com/pulse/fabricas-est%C3%A1ticas-vs-construtores-em-java-felipe-neves/?articleId=6637839335020388353
//https://pt.stackoverflow.com/questions/379752/3-classes-em-java-uma-chamando-a-outra-como-chamar-metodos-da-primeira-pra-%C3%BAlt
public class Locacao {

	// Lista de carros.
	private List<Carro> carros;

	// Cria uma locacao com uma lista de carros vazia.
	public Locacao() {
		this.carros = new ArrayList<>();
	}

	// Métodos acessores

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

}
