package br.com.fuctura.poo.relacionamentos.entidades.exemplostackoverflow;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Cria um cliente
		Cliente cliente1 = new Cliente("José");
		
		// Cria trẽs carros 
		Carro carro1 = new Carro("Bugatte Veiron","2019");
		Carro carro2 = new Carro("Ford Caeiro","2020");
		Carro carro3 = new Carro("Ferrari Enso","2021");
		
		// Pega a lista de carros que pertence a classe Locacao que pertence a classe Cliente.
		List<Carro> carros = cliente1.getLocacao().getCarros();
		
		carros.add(carro1);
		carros.add(carro2);
		carros.add(carro3);
		
		System.out.printf("A locação do cliente %s possui %d carros", cliente1.getNome(), carros.size());
		
		// para cada carro dentro de carros quero fazer o seguinte:
		for(Carro carro: carros){
            System.out.printf("Carro(marca=%s, ano=%s)\n", carro.getMarca(), carro.getAno());
        }
		
	}

}
