package br.com.fuctura.poo.relacionamentos.entidades.exemplostackoverflow;

public class Carro {

	private String marca, ano;

	public Carro(String marca, String ano) {
		this.marca = marca;
		this.ano = ano;
	}

	// Métodos acessores
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
}
