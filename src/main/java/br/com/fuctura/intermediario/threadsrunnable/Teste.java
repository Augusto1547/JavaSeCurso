package br.com.fuctura.intermediario.threadsrunnable;

public class Teste {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
//	    Thread t1 = new Thread(thread1);
//	    t1.start();

		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);

		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);

		/*
		 * OBS: uso thread ou runnable? vai depender do seu projeto e de seu gosto
		 * quando agente usa a classe Runnable agente pode extender qualquer outra
		 * classe por que já vimos que e possível extender várias interfaces já a classe
		 * não, só existe apenas uma única extensão se você não for sobrepor qualquer
		 * outro método da classe Thread (onde tem vários outros métodos) é melhor então
		 * usar a classe Runnable
		 */

	}

}
