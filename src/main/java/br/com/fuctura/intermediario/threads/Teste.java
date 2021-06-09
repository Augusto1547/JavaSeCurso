package br.com.fuctura.intermediario.threads;

public class Teste {

	public static void main(String[] args) {

		MinhaThread thread = new MinhaThread("Thread #1", 900); // 1000 equivale a um segundo
		//thread.start(); //esse estart chama o método run

		MinhaThread thread2 = new MinhaThread("Thread #2", 900);

		MinhaThread thread3 = new MinhaThread("Thread #3", 900);
		/*
		 * com isso acabamos de executar três tarefas ao mesmo tempo em nosso progama só
		 * que cada tarefa tem seu próprio passo. nesse progama temos uma thred que faz
		 * a mesma tarefa mas você poderia ter várias threds que executam várias tarefas
		 * diferentes em seu próprio tempo diferente também
		 */
	}
	/*
	 * Executar duas ou mais tarefas ao mesmo tempo é o que nós chamamos de threads
	 * a vantagem de se criar thread é que podemos deixar o progama mais eficiente
	 * nós podemos criar threas para o progama fazer mais uma atividade ao mesmo
	 * tempo
	 * Ciclo de vida das threads: existem 5 estados da threads que são importantes 
	 * New: quando criamos uma nova thread(instanciamos)
	 * Runnable: deixa a thread pronta pra execução pra isso usamos o método start();
	 * Run: após a thread pronta chamamos esse método para executa-la
	 * Quando a thread está sendo executada nós podemos fazer duas coias com ela ou 
	 * ela termina e vai para um estado de Dead(morta) ou agente coloca a thread para
	 * dormir ou esperar ou agente suspende essa thread. quando fazemos uma dessas 3 ações
	 * nós colocamos a thread em estado de espera.(Waiting) e quando está num estado de espera
	 * nós podemos acordar nós podemos notificar as threas  pra que saia do estado de espera
	 * 
	 */
}
