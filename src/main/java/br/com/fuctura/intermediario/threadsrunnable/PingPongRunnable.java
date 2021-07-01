package br.com.fuctura.intermediario.threadsrunnable;
//universidade xti

public class PingPongRunnable implements Runnable {
	String palavra;
	long tempo;

	public PingPongRunnable(String palavra, long tempo) {
		this.palavra = palavra; // quero imprimir essa palavra de 2 em 2 segundos
		this.tempo = tempo;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println(palavra + "");
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {

			return;
		}

	}

	public static void main(String[] args) {
		Runnable ping = new PingPongRunnable("ping", 1500);
		Runnable pong = new PingPongRunnable("PONG", 2000);
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		System.out.println("Ver threads");
	}

}
