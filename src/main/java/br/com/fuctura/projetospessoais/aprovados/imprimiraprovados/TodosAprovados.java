package br.com.fuctura.projetospessoais.aprovados.imprimiraprovados;

import java.util.Scanner;

import br.com.fuctura.projetospessoais.aprovados.excecoes.ProfessorInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.SerieInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.TurnoInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.MateriaInexistente;
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
		try {
			
			matematicaManha.setInstrutor(professor);
		
		} catch (ProfessorInexistente e) {

			System.out.println("Mensagem = " + e.mensagem);
		}
		try {
			
			matematicaManha.setMateria(materia);
			
		} catch (MateriaInexistente e) {
			
			System.out.println("Mensagem = " + e.mensagem );
			
		}
		try {
			matematicaManha.setSerie(serie);
		} catch (SerieInexistente e) {
			System.out.println("Mensagem = " + e.mensagem );
		}
		matematicaManha.setIdSala(sala);
		try {
			
			matematicaManha.setTurno(turno);
			
		} catch (TurnoInexistente e) {
			
			System.out.println("Mensagem = " + e.mensagem);
		}

		matematicaManha.acessarAprovadosPrimeiraSerieAMatematica();

	}

}
