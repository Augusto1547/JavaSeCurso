package br.com.fuctura.intermediario.threadsmetodoeblocoscinclonizados;

public class ComprasEmFamilia implements Runnable {
//	Qual coisa em comum todos os membros da familía tem? a conta conjunta. pra ser compartilhada 
//	nessas compras em família

	ContaConjunta conta = new ContaConjunta(); // temos uma única conta pra ser compartilhada
	// nessas compras em família

	public static void main(String[] args) {
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia(); // implementando a nossa runnable

		new Thread(irAsCompras, "Pai").start(); // usando o objeto runnable pra abrir várias threads ao mesmo tempo
		new Thread(irAsCompras, "Mãe").start(); // shopping
		new Thread(irAsCompras, "Filha").start(); // park de diversão
		new Thread(irAsCompras, "Babá").start(); // mercado
		// várias pessoas fazendo compras em lugares diferentes com a mesma conta
		// conjunta
	}

	@Override
	public void run() {
		// é nosso método run() que vai levar essas pessoas efetivamente as compras
		String cliente = Thread.currentThread().getName();// pega na thread que está sendo executada o nome do cliente
															// que está fazendo aquela compra
		for (int i = 0; i < 5; i++) {
			conta.sacar(20, cliente);// todos vão fazer comprinhas de 20 reais cada um
			if (conta.getSaldo() < 0) {
				System.out.println("Estourou");
			}
		}
	}

}
