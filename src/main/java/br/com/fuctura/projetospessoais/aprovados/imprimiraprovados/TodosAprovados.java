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
		PrimeiraSerieA portuguesManhaPrimeiraSeA = new PrimeiraSerieA();
		PrimeiraSerieB historiaManhaPrimeiraSeA = new PrimeiraSerieB();
		PrimeiraSerieB matematicaManhaPrimeiraSeB = new PrimeiraSerieB();
		PrimeiraSerieB portuguesManhaPrimeiraSeB = new PrimeiraSerieB();
		PrimeiraSerieB historiaManhaPrimeiraSeB = new PrimeiraSerieB();

		try {

			matematicaManhaPrimeiraSeA.setInstrutor(professor);
			matematicaManhaPrimeiraSeB.setInstrutor(professor);
			portuguesManhaPrimeiraSeA.setInstrutor(professor);
			portuguesManhaPrimeiraSeB.setInstrutor(professor);
			historiaManhaPrimeiraSeA.setInstrutor(professor);
			historiaManhaPrimeiraSeB.setInstrutor(professor);

		} catch (ProfessorInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);
		}
		try {

			matematicaManhaPrimeiraSeA.setMateria(materia);
			matematicaManhaPrimeiraSeB.setMateria(materia);
			portuguesManhaPrimeiraSeA.setMateria(materia);
			portuguesManhaPrimeiraSeB.setMateria(materia);
			historiaManhaPrimeiraSeA.setMateria(materia);
			historiaManhaPrimeiraSeB.setMateria(materia);

		} catch (MateriaInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);

		}
		try {

			matematicaManhaPrimeiraSeA.setSerie(serie);
			matematicaManhaPrimeiraSeB.setSerie(serie);
			portuguesManhaPrimeiraSeA.setSerie(serie);
			portuguesManhaPrimeiraSeB.setSerie(serie);
			historiaManhaPrimeiraSeA.setSerie(serie);
			historiaManhaPrimeiraSeB.setSerie(serie);

		} catch (SerieInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);
		}
		try {

			matematicaManhaPrimeiraSeA.setIdSala(sala);
			matematicaManhaPrimeiraSeB.setIdSala(sala);
			portuguesManhaPrimeiraSeA.setIdSala(sala);
			portuguesManhaPrimeiraSeB.setIdSala(sala);
			historiaManhaPrimeiraSeA.setIdSala(sala);
			historiaManhaPrimeiraSeB.setIdSala(sala);

		} catch (IdentificacaoInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);
		}
		try {

			matematicaManhaPrimeiraSeA.setTurno(turno);
			matematicaManhaPrimeiraSeB.setTurno(turno);
			portuguesManhaPrimeiraSeA.setTurno(turno);
			portuguesManhaPrimeiraSeB.setTurno(turno);
			historiaManhaPrimeiraSeA.setTurno(turno);
			historiaManhaPrimeiraSeB.setTurno(turno);

		} catch (TurnoInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
			System.exit(0);
		}

		matematicaManhaPrimeiraSeA.acessarAprovadosPrimeiraSerieAMatematica();
		matematicaManhaPrimeiraSeB.acessarAprovadosPrimeiraSerieBMatematica();
		portuguesManhaPrimeiraSeA.acessarAprovadosPrimeiraSerieAPortugues();
		portuguesManhaPrimeiraSeB.acessarAprovadosPrimeiraSerieBPortugues();
		historiaManhaPrimeiraSeA.acessarAprovadosPrimeiraSerieBHistoria();
		historiaManhaPrimeiraSeB.acessarAprovadosPrimeiraSerieBHistoria();
	}

}
