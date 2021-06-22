package br.com.fuctura.logica.desafios;

public class Conta2 {
	
	private String nome;
	private double saldoAtual;
	
	public Conta2(String nome, double saldo) {
		
		this.nome = nome;
		this.saldoAtual = saldo;
	}
	
	private double depositar(double deposito) {
		
		double total = 0;
		if(this.nome == "Fernado" && this.saldoAtual > 0 ) {
		total = this.saldoAtual += deposito;
		}else {
			
			System.out.println("Seu saldo não possui nenhum valor");
		}
		return total;
	}
	
	/// transferir um valor de uma conta para outra
	private double depositar(double meuSalario, double deposito) {
		
		double total = 0;
		total = deposito + 10 / 100 * meuSalario;
		
		System.out.println(total);
		return 0;
	}

	public static void main(String[] args) {

		Conta2 cliente = new Conta2("Feranndo",2000D);
		cliente.depositar(2000D);
		cliente.depositar(599D, 100D);
	}

}
