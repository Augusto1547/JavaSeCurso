package br.com.fuctura.poo.relacionamentos.entidades.exemplostackoverflow;

public class Carro1 {

	private String marca, cor;

	public Carro1(String marca, String cor) {

		this.marca = marca;
		this.cor = cor;
	}

	public String getMarca() {
		return  marca;
	}

	public void setMarca(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Carro : " + marca + ", cor=" + cor + "\n";
	}
	
	

}
