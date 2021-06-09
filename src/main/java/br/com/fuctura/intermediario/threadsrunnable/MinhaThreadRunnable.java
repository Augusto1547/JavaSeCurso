package br.com.fuctura.intermediario.threadsrunnable;

public class MinhaThreadRunnable implements Runnable {
	// diferente Threads Runnable implementa e não precisa do método start() por que
	// ela não tem esse método
	// já que é uma interface

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {

		this.nome = nome;
		this.tempo = tempo;
		//MinhaThreadRunnable ela apenas implementa a classe Runnable ela não é de fato uma thred para ser uma
		//thread de verdade agente precisa passar essa classe runnable pra que classe thread possoa recebe-lo
		Thread t = new Thread(this);//como eu preciso passar uma estância da classe runnable eu posso passar o this(que faz referência a própria classe)
		t.start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {

			System.out.println(nome + " contador " + i);

			try {// ou pode deixar assim ou colocar esse try antes do for

				Thread.sleep(tempo);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(nome + " terminou a execução");
		}
	}

}
