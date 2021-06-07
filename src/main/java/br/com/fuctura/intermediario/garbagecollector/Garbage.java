package br.com.fuctura.intermediario.garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	public static long carregarMemoria() {
		/*
		 * Essa função tem a meta de adicionar uma quantidade grande de valores para
		 * encher a memória e depois ver a diferença de quanto a memória tinha em Megas
		 * antes da adição e quanto ela terá ao subtrair os valores adicionados
		 */

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100_000; i++) {
			list.add(i); //adiciona à lista cada um dos números do nosso for e enche a memória com isso
		}
		return Runtime.getRuntime().freeMemory(); //Retorna a quantidade livre de memória
	}

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();// Runtime.getRuntime() vai servir para recuperar uma classe Runtime
		int MB = 1_048_576;// total de bytes em 1MB
		double total = rt.maxMemory() / MB; // maxMemory retorna a quantidade de memória total disponível para a jvm
		// Todo esse código mostra o total de memória da jvm que por padrão está em byte
		// em megabytes

		double inicio = total - (carregarMemoria() / MB);
		/*
		 * pega os 9 mil e pouco MB menos o total de memória restante em MB após a
		 * adição dos 100 mil números com isso eu tenho quanto de memória foi usada
		 * pelos 100 mil números adicionados
		 */
		
		/*
		 * a adição dos 100 mil MB só funciona dentro do método assim sendo quando o
		 * método terminar sua execução eu quero que todo peso que ele trás seja
		 * descarregado(finalizado)
		 */
		rt.runFinalization(); 
		rt.gc(); //da ordem para o garbage collector fazer a limpesa
		

		double fim = total - (rt.freeMemory() / MB); //ver qual total de memória utilizado após a coleta do lixo
		System.out.println("Início:" + inicio + " Fim:" + fim); //no início tinhamos uma quantidade x agora um y

	}

}
