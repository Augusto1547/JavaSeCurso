package br.com.fuctura.intermediario.threadsvarias;

import br.com.fuctura.intermediario.threadsrunnable.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);

		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();

		for (int i = 0; i < 7; i++) {
			//a idéia aqui é finalizar a mensagem: Progama finalizado no final das threds mas 
			// foi ai que usamos o teste2 não deu muito certo
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Progama finalizado");
	}

}
