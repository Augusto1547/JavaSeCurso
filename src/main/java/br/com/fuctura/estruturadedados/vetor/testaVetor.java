package br.com.fuctura.estruturadedados.vetor;

public class testaVetor {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(5); //Esse new Vetor(5) não é a classe e sim o construtor
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		vetor.adiciona("Elemento 4");
		vetor.adiciona("Elemento 5");
		//a variável de referência vetor vai chamar os métodos da classe Vetor para trabalhar com
		//os valores do construtor new Vetor(5)
		
		Vetor vetor1 = new Vetor(2); // tem capacidade apenas para dois
		try {

//			vetor1.adiciona("Elemento 1");
//			vetor1.adiciona("Elemento 2");
//			vetor1.adiciona("Elemento 3"); aqui estava como padrão eu vou criar algo novo para testar

		} catch (Exception ex) {

			ex.printStackTrace();
		}
//		Vetor vetor2 = new Vetor(3);
//		System.out.println(vetor2.adiciona("Elemento 1"));
//		System.out.println(vetor2.adiciona("Elemento 2"));
//		System.out.println(vetor2.adiciona("Elemento 3"));

	}

}
