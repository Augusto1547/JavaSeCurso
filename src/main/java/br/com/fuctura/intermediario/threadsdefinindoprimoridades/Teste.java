package br.com.fuctura.intermediario.threadsdefinindoprimoridades;

public class Teste {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		/*
		 * Quando agente instancia as threads no java se agente não falar nada todas as
		 * threads terão prioridade normal porém agente consegue modificar a prioridade delas.
		 */
		
		//Esses atributos podem ter prioridade de 1 à 10 comente o NORM e execute e veja que a thread 1 por 
		//ter uma prioridade maior ela vai ser executada primeiro que os outros, mas isso não é uma regra
		//que está "escrita numa pedra" essa questão de prioridade depende de vários fatore como por exemplo
		//depende do sistema operacional mas na maioria das vezes essa prioridade é respeitada 
		t1.setPriority(5); 
		t2.setPriority(3);
     	t3.setPriority(1);
		
//    	t1.setPriority(Thread.NORM_PRIORITY);
//    	t2.setPriority(Thread.MIN_PRIORITY);
//    	t3.setPriority(Thread.MAX_PRIORITY);
    	//se não quiser usar os números podemos usar enumeradores  
    	//cuja classe Thread tem prioridades: máxima, mínima e normal
		
		t1.start();//Por essas três threds executarem ao mesmo tempo a ordem está variando comente os prioritys pra ver isso
		t2.start();
		t3.start();
	}

}
