package br.com.fuctura.intermediario.passagemvalorreferencia;

public class App3 {

	public static void main(String[] args) {

		int[] vetor = new int[] { 6, 2, -1, 4, 5 };
		
		int[] vetor2 = vetor;
		
		vetor2[0] = 999;
		
		System.out.println(vetor2[0]);
		
		Pessoa pessoaA = new Pessoa("Goku");
		
		Pessoa pessoaB = pessoaA;
		
		pessoaB.setNome("Vegita");
		System.out.println(pessoaA.getNome());
		
	}
}
