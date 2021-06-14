package br.com.fuctura.intermediario.threads;

public class MinhaThread extends Thread { // Thread é uma forma de iniciar uma thread mais existe a runnuble

	private String nome; // nome da thread
	private int tempo;

	public MinhaThread(String nome, int tempo) {

		this.nome = nome;
		this.tempo = tempo;
		start();
		/*
		 * start(ele está aqui mas estava na classe teste que está comentada pois aqui
		 * eu não preciso ficar chamando ele várias vezes) toda vez que instanciar uma thread,
		 *  então vai iniciar a thread deixa-la pronta para execução por debaixo dos panos e faze-la
		 *  executar o método run
		 */
	}

	public void run() {// método run sendo sobreescrito observe a seta ao lado

		// aqui dentro nós criamos o progama que quisermos usando as funcionalidades da thread
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo); 
				/*
				 * sleep coloca a thread pra dormir em alguns milisegundos e foi sugerido o try
				 * catch por que pode dar alguma exceção.Olha o nome de exceção faz um analogia 
				 * com os milisegundos diferentes de cada instância d eobjeto, essa variável tempo 
				 * foi usada depois, por que antes tinhamos (900)por ex. quanto mais tempo colocado mais lenta 
				 * será a execução da thread
				 */
			}
		} catch (InterruptedException e) {
			// quando usei o .sleep(tempo) essa exceção InterruptedException passou a ter chance de ocorrer
			// essa exceção informa que a thread foi interrompida

			e.printStackTrace(); //imprimir rastreamento de pilhas
		}
		System.out.println(nome + " terminou a execução");
	}
}
