package br.com.fuctura.poo.relacionamentos.entidades.exemplostackoverflow;

public class ContaBancaria {

	private String titular;
	private double saldo = 0.00;
	private static double LIMITE_DO_DIA = 1_200.00;

	public ContaBancaria(String titular, double saldo) {

		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void exibirSaldo() {

		System.out.println("Saldo de " + getTitular() + " : " + getSaldo() + " R$");
	}

	public void depositar(double valor) throws Exception {
		if (this.titular.equalsIgnoreCase("Augusto") || this.titular.equalsIgnoreCase("Fernando")) {
			this.saldo += valor;
		} else {

			throw new Exception(this.getTitular() + " não é o dono da conta");

		}
	}

	public void sacar(double valor) throws Exception{

		if (this.titular.equalsIgnoreCase("Augusto") || this.titular.equalsIgnoreCase("Fernando")) {
			this.saldo -= valor;

		} else {

			throw new Exception(this.getTitular() + " não conseguiu sacar valor sem saldo");

		}
	}

	public void transferePara(ContaBancaria contaFernando, double valor) {

		try {
			this.sacar(valor);
			contaFernando.depositar(valor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
