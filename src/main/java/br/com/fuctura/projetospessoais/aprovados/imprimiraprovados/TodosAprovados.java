package br.com.fuctura.projetospessoais.aprovados.imprimiraprovados;

import java.util.Scanner;

import br.com.fuctura.projetospessoais.aprovados.excecoes.IdentificacaoInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.MateriaInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.ProfessorInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.SerieInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.TurnoInexistente;
import br.com.fuctura.projetospessoais.aprovados.turnomanha.PrimeiraSerieA;
import br.com.fuctura.projetospessoais.aprovados.turnomanha.PrimeiraSerieB;

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

		PrimeiraSerieA matematicaManhaPrimeiraSeA = new PrimeiraSerieA();
		PrimeiraSerieB matematicaManhaPrimeiraSeB = new PrimeiraSerieB();

		try {

			matematicaManhaPrimeiraSeA.setInstrutor(professor);
			matematicaManhaPrimeiraSeB.setInstrutor(professor);

		} catch (ProfessorInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);
		}
		try {

			matematicaManhaPrimeiraSeA.setMateria(materia);
			matematicaManhaPrimeiraSeB.setMateria(materia);

		} catch (MateriaInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);

		}
		try {

			matematicaManhaPrimeiraSeA.setSerie(serie);
			matematicaManhaPrimeiraSeB.setSerie(serie);

		} catch (SerieInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);
		}
		try {

			matematicaManhaPrimeiraSeA.setIdSala(sala);
			matematicaManhaPrimeiraSeB.setIdSala(sala);

		} catch (IdentificacaoInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);
		}
		try {

			matematicaManhaPrimeiraSeA.setTurno(turno);
			matematicaManhaPrimeiraSeB.setTurno(turno);

		} catch (TurnoInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);
		}

		matematicaManhaPrimeiraSeA.acessarAprovadosPrimeiraSerieAMatematica();
		matematicaManhaPrimeiraSeB.acessarAprovadosPrimeiraSerieBMatematica();

	}

}
