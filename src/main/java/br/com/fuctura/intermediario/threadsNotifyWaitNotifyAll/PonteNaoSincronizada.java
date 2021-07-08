package br.com.fuctura.intermediario.threadsNotifyWaitNotifyAll;

public class PonteNaoSincronizada implements Ponte {

	private int valor = -1;

	@Override
	public void set(int valor) throws InterruptedException {
		System.out.println("Produtor produzio " + valor);
		this.valor = valor;
	}

	@Override
	public int get(int valor) throws InterruptedException {
		System.err.println("Consumidor consumiu " + valor);
		return valor;

	}

}
