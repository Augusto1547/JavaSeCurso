package br.com.fuctura.intermediario.threadsmetodoeblocoscinclonizados; //Universidade xti

//todas as outras threads deverá aguardar o desbloqueio da thread atual que está fazendo o saque.

public class ContaConjunta {
	private int saldo = 100;

	public int getSaldo() {
		return saldo;
	}

	//os blocos sincronizados : métodos, for, if etc. Eles mantém as threads sem interferir umas nas outras 
	//ninguém mais vai poder executar ele até que ele seja completamente executado ai uma outra thred pode iniciar sua execução novamente
	public synchronized void sacar(int valor, String cliente) { //quero que meu método de saque seja sincronizado entre as threads
		if (saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");

			try {
				System.out.println(cliente + " Esperando");
				Thread.sleep(1000);// Existe um tempo pro sistema acessar o banco de dados encontrar as
				// informações que ele precisa, saber se o cliente tem possibilidade de realizar
				// saque naquele dia, se aquele é um dia útil, se o limite daquele cliente para
				// saque não foi estourado e esse processamento leva algum tempo 1 segundo 2
				// segundos 3 segundos. Vamos simular esse tempo de espera com o método sleep da
				// classe Thread, o sleep está depois da validação que jera a espera para a
				// verificação
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			saldo -= valor;
			String msg = cliente + " SACOU " + valor + " [Saldo Original=" + saldoOriginal 
					+ ", Saldo Final=" + saldo + "]";
			System.out.println(msg);
		} else {
			System.out.println("Saldo insuficiente para " + cliente);
		}
	}

}
