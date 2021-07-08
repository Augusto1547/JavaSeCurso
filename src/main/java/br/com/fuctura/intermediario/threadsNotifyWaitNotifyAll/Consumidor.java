package br.com.fuctura.intermediario.threadsNotifyWaitNotifyAll;

import java.util.Random;

public class Consumidor implements Runnable {

	private Random random = new Random(); // Objeto para gerar um número aleatório entre 0 e 3000 milisegundos

	private Ponte ponte;

	public Consumidor(Ponte ponte) {
		this.ponte = ponte;
	}

	@Override
	public void run() {// vai gerar informações pra adicionar nessa ponte

		int total = 0;
		for (int i = 0; i < 5; i++) {// quero armazenar 5 vezes informações na nossa ponte

			try {
				Thread.sleep(random.nextInt(3000));
				total += ponte.get(i);// num perido entre 0 e 3000 segundos vou adicionar os valores que estou gerando
								// dentro do meu for
				System.out.println("\t" + total);

			} catch (InterruptedException e) {
			}
		}

	}

}
