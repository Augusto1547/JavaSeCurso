package br.com.fuctura.intermediario.threadsmetodoeblocoscinclonizados;

public class MinhaThreadSoma implements Runnable {

	private String nome;
	private int[] nums; // vamos receber os inteiros que vamos passar pro nosso array
	private static Calculadora calc = new Calculadora(); // aqui eu vou ter uma instância static da minha
	// calculadora que me permitirá que todos as instâncias que forem referentes a
	// MinhaThreadSoma tenha
	// acesso a classe Calculadora para manipular seus estados e comportamentos.
	
	public MinhaThreadSoma(String nome, int[] nums) {

		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start(); 
		// this passa a instância da classe Runnable podemos aproveitar e passar
		// o nome pra depois pegar essa nome OBS// esse código eu mesmo que está em
		// abaixo

//		Thread t = new Thread(this,nome);
//		t.start();
	}

	@Override
	public void run() {// o método run vai chamar o método somaArray da classe calculadora

		System.out.println(this.nome + " iniciada"); // threads 1(nome da thread) iniciada

		int soma = calc.somaArray(this.nums); // a tarefa de run é chamar o método somaArray epassar os
		// parâmetros simbolizado pelo referência nums(com valores representados por um
		// tipo array)

		System.out.println("Resultado da soma para thread " + this.nome + " é " + soma);

		System.out.println(this.nome + " terminada"); // threads 1(nome da thread) terminanda
	}

}
