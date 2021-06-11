package br.com.fuctura.intermediario.threadsdefinindoprimoridades;

public class MinhaThreadRunnable implements Runnable {
	// diferente das Threads Runnable implementa uma interface e não precisa do
	// método start() por que
	// ela não tem esse método já que é uma interface mas mesmo assim preciso chamer
	// o método start()
	// de alguma outra maneira

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {

		this.nome = nome;
		this.tempo = tempo;
		 
//		Thread t = new Thread(this);
//		t.start();
		
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 6; i++) {

				System.out.println(nome + " contador " + i);


				Thread.sleep(tempo);

			} 
		}catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execução");
	}
}