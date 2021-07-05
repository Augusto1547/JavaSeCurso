package br.com.fuctura.intermediario.threadsNotifyWaitNotifyAll;

public interface Ponte {

    public void set(int valor) throws InterruptedException;
	
	public int get(int valor) throws InterruptedException;
	
	
}

//define valor e recebe valor do tipo inteiro e lança exceção
