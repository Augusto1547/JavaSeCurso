package br.com.fuctura.logica.desafios;

import java.math.BigDecimal;
import java.util.Scanner;

@Cabecalho(

//@formatter:off
	instituicao = "Fuctura tecnologia",
	projeto = "lógica de progamação", 
	dataCriacao = "5/jun/2021", 
	numeroErros = 0,
	autor = "Fernando Santos"
//@formatter:on	
)

@QuantidadeErros(erros = { "0001", "0002" })

public class Conta {

	private String donoDaConta;
	private short numeroDaConta;
	private Double saldoDaConta = 1200.0;

	private Conta(String dono, short numero) {

		this.donoDaConta = dono;
		this.numeroDaConta = numero;
	}

	private void verificaSaldo() {

		if (this.donoDaConta.equals("Augusto César") && numeroDaConta == 123) {

			BigDecimal saldo = new BigDecimal(this.saldoDaConta);
			System.out.println("Seu saldo antes do saque era :" + saldo + " R$");

		} else {

			System.out.printf("%s Erro!", "tente um nome ou um número diferente");
		}

	}

	private void sacarValor(double valor) {

		if ((this.donoDaConta.equals("Augusto César") && numeroDaConta == 123)
				&& (this.saldoDaConta > 0 && this.saldoDaConta <= 1200) && (valor < this.saldoDaConta)) {

			Double totalAposSacar = this.saldoDaConta - valor;
			System.out.println("Seu saldo após o saque é : " + totalAposSacar);
			BigDecimal saldo = new BigDecimal(totalAposSacar);
			System.out.println(saldo);

		} else {

			System.out.println("Saldo insuficiente para saque!");
		}

	}

	private void depositarValor(double valor) {

		this.sacarValor(valor);

		if ((this.donoDaConta.equals("Augusto César") && numeroDaConta == 123) && (this.saldoDaConta >= 0)) {

			BigDecimal totalAposDepositar = new BigDecimal(this.saldoDaConta += valor);
			System.out.println("Seu saldo após o depósito é : " + totalAposDepositar);

		} else {

			System.out.println("Digite um valor positivo");
		}
	}

	private void sacarOuDepositar(String escolher) {

		if (escolher.equalsIgnoreCase("sacar")) {

			sacarValor(numeroDaConta);

		} else if (escolher.equalsIgnoreCase("depositar")) {

			depositarValor(numeroDaConta);
		}
	}

	public static void main(String[] args) {

		Scanner recebe = new Scanner(System.in);
		
		System.out.println("Qual o seu nome ?");
		String nome = recebe.nextLine();
		
		System.out.println("Qual o número da conta?");
		Short conta = Short.parseShort(recebe.nextLine());

		System.out.println("Você deseja sacar ou depositar?");
		String escolha = recebe.nextLine();
		
		System.out.println("Quanto você deseja sacar?");
		Double saque = Double.parseDouble(recebe.nextLine());

		Conta cliente = new Conta(nome, conta);
		cliente.sacarOuDepositar(escolha);

	}

}
