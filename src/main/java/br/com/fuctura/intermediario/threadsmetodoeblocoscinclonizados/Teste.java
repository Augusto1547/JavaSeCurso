package br.com.fuctura.intermediario.threadsmetodoeblocoscinclonizados;

public class Teste {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5};
		MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
		MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
		
		//15 o resultado dessa soma deveria dar 15 isso ocorreu por que nosso código não está sincronizado
		//pois estamos acessando com duas threads o mesmo recurso ai onde lá no método que vamos colocar 
		//a palavra chave syncronized
	}

}
