package br.com.fuctura.poo.relacionamentos.entidades.exemplostackoverflow;

import java.util.ArrayList;
import java.util.List;

public class TesteCarro {

	public static void main(String[] args) {

		/*
		 * Carro1 ferrari = new Carro1("Ferrari", "Red");
		 * 
		 * Carro1 bmw = new Carro1("BMW", "Black");
		 * 
		 * Carro1 fusca = new Carro1("Fusca 76", "White");
		 * 
		 * List<Carro1> carros = new ArrayList<Carro1>();
		 * 
		 * carros.add(ferrari); carros.add(bmw); carros.add(fusca);
		 * 
		 * // Para cada carro dentro de carros faça o seguinte ... // Sem o toString()
		 * na moudura é assim que acesso todos os carros adicionados for(Carro1 carro :
		 * carros) {
		 * 
		 * System.out.println(carro);
		 * 
		 * }
		 * 
		 * for (Carro1 carro2 : carros) {
		 * 
		 * System.out.println(carro2.getMarca() + " " + carro2.getCor() + "\n"); }
		 * 
		 * for (int i = 0; i < carros.size(); i++) {
		 * 
		 * System.out.println(carros.get(i).getMarca() + " " + carros.get(i).getCor());
		 * }
		 */

		String nome = new String("Agusto César");
		String profissao = new String("Progamador Java");
		String endereco = new String("Rua 70, 360");
		String bairro = new String("Maranguape II");
		String cidade = new String("Paulista");

		List<String> dadosPessoais = new ArrayList<String>();

		dadosPessoais.add(nome);
		dadosPessoais.add(profissao);
		dadosPessoais.add(endereco);
		dadosPessoais.remove(2);

		List<String> dadosPessoais2 = new ArrayList<String>();
		dadosPessoais2.add("é o troinha caralho");
		dadosPessoais.addAll(dadosPessoais2);

		for (String dadoPessoal : dadosPessoais) {

			System.out.println(dadoPessoal.toString());
		}

	}

}
