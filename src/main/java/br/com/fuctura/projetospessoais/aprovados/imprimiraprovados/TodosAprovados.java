package br.com.fuctura.projetospessoais.aprovados.imprimiraprovados;

import java.util.Scanner;

import br.com.fuctura.projetospessoais.aprovados.escola.SalaDeAula;
import br.com.fuctura.projetospessoais.aprovados.turnomanha.PrimeiraSerieA;

public class TodosAprovados {

	public static void main(String[] args) {

		Scanner recebe = new Scanner(System.in);

		System.out.println("Qual nome do professor?");
		String professor = recebe.nextLine();

		System.out.println("Qual é a matéria?");
		String materia = recebe.nextLine();

		System.out.println("Qual é a série?");
		String serie = recebe.nextLine();

		System.out.println("Qual é a sala?");
		String sala = recebe.nextLine();

		System.out.println("Qual é o turno?");
		String turno = recebe.nextLine();

		PrimeiraSerieA matematicaManha = new PrimeiraSerieA();
		matematicaManha.setInstrutor(professor);
		matematicaManha.setMateria(materia);
		matematicaManha.setSerie(serie);
		matematicaManha.setIdSala(sala);
		matematicaManha.setTurno(turno);

		matematicaManha.acessarAprovadosPrimeiraSerieAMatematica();

	}

}
