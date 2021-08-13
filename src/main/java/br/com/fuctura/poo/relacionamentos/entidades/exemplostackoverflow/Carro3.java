package br.com.fuctura.poo.relacionamentos.entidades.exemplostackoverflow;

// Universidade xti
public class Carro3 {
// atributos de instância e atributos de classe
	private String modelo;
	private Double veloMaxima;
	private Motor3 motor;
	
//    private static String tipoDeCombustivel = "Gasolina";
    
	public Carro3(String modelo, Double veloMaxima, Motor3 motor) {

		this.modelo = modelo;
		this.veloMaxima = veloMaxima;
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVeloMaxima() {
		return veloMaxima;
	}

	public void setVeloMaxima(Double veloMaxima) {
		this.veloMaxima = veloMaxima;
	}

	public Motor3 getMotor() {
		return motor;
	}

	public void setMotor(Motor3 motor) {
		this.motor = motor;

	}

	
}
