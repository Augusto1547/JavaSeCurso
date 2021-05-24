package br.com.fuctura.intermediario.escopodevariaveis;

public class Teste {

	public static void main(String[] args) {

		EscopoDeVariaveis escopo = new EscopoDeVariaveis();
		escopo.setValor(10);

		System.out.println(escopo.getValor()); // 10
		
		System.out.println(escopo.calculaValor(20));
		
		System.out.println(escopo.getValor());

        System.out.println(escopo.teste());
	}

}
