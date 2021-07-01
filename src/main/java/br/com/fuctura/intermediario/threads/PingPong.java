package br.com.fuctura.intermediario.threads;

//universidade xti
public class PingPong extends Thread {

	String palavra;
	long tempo;

	public PingPong(String palavra, long tempo) {

		this.palavra = palavra; // quero imprimir essa palavra de 2 em 2 segundos
		this.tempo = tempo;
	}

	public void run() {

		try {
			
			for (int i = 0; i < 5; i++) {

				System.out.println(palavra);
				Thread.sleep(tempo);
				// sleep faz que sua thread vá para um estado esperando
			}
			
		} catch (InterruptedException e) {
			//e quando essa exceção acontecer eu quero encerrar a execução dessa thread
			return; //vai informar para o método que ele terminou a execução
		} 
	}

	public static void main(String[] args) {

		/*
		 * por debaixo dos panos a jvm utiliza a Thread[main] para executar a classe
		 * PingPong -usando threads você pode usufruir dos estados da thread: -colocar a
		 * thread para aguardar determinado tempo, pra que ela volte ao estado -pronta
		 * para ser executada novamente pode colocar ela pra dormir de novo
		 * 
		 */
		new PingPong("ping", 1500).start(); // sem o start é suficiente para criar uma thread mas só criar não
		new PingPong("PONG", 2000).start(); // a coloca num estado pronta para jvm recebe-la e ser executada ai entra o
											// start();
		// nesse estado(start) a jvm vai exexutar o método run dessa sua thread, é o
		// método run que vai ser
		// chamado pela sua jvm para executar a thred nunca chamo o run pela minha
		// própria conta

		System.out.println("Ver thread");

	}

}
