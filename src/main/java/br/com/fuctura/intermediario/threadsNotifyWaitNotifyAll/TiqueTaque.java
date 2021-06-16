package br.com.fuctura.intermediario.threadsNotifyWaitNotifyAll;

public class TiqueTaque {

	boolean tique;

	synchronized void time(boolean estaExecutando) {

		if (!estaExecutando) {

			tique = true;
			notify();
			return;
		}
		System.out.println("Tique ");

		tique = true;

		notify();

		while (tique) {

			try {
				while (tique) {
					wait();
				}
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
	
	synchronized void taque(boolean estaExecutando) {

		if (!estaExecutando) {

			tique = false;
			notify();
			return;
		}
		System.out.println("Taque ");

		tique = false;

		notify();

		while (!tique) {

			try {
				while (tique) {
					wait();
				}
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
}
