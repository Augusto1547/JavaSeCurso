package br.com.fuctura.intermediario.threadsvarias;

import br.com.fuctura.intermediario.threadsrunnable.MinhaThreadRunnable;

public class Teste2 {

	//Esse código ainda não está bonito então vamos fazer um terceiro progama teste3
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

		while (t1.isAlive() || t2.isAlive() || t3.isAlive()) { // enquanto t1 estiver viva (is alive(viva))
			try {
				Thread.sleep(200); // Agente pede pra thread durma e garantir que a mensagem Progama finalizado
				//seja executado apenas no final
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Progama finalizado");
	}
}
