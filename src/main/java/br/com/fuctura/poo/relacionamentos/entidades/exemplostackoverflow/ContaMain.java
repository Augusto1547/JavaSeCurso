package br.com.fuctura.poo.relacionamentos.entidades.exemplostackoverflow;

import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o nome do cliente");
		String nomeCliente = scan.nextLine();

		ContaBancaria contaAugusto = new ContaBancaria(nomeCliente, 1_000.00);
		contaAugusto.exibirSaldo();

		try {
			contaAugusto.depositar(800.00);
		} catch (Exception e) {
			e.printStackTrace();
		}

		contaAugusto.exibirSaldo();

		try {
			contaAugusto.sacar(200.00);
		} catch (Exception e) {
			e.printStackTrace();
		}

		contaAugusto.exibirSaldo();

		ContaBancaria contaFernando = new ContaBancaria(nomeCliente, 500_000.00);
		contaFernando.exibirSaldo();

		try {
			contaFernando.depositar(500.00);
		} catch (Exception e) {
			e.printStackTrace();
		}
		contaFernando.exibirSaldo();

		try {
			contaFernando.sacar(2_000.00);
		} catch (Exception e) {
			e.printStackTrace();
		}
		contaFernando.exibirSaldo();

		contaAugusto.transferePara(contaFernando, 500.00);
		contaAugusto.exibirSaldo();
		contaFernando.exibirSaldo();
	}
}
