package br.com.fuctura.projetospessoais.aprovados.turnomanha.materias;

import java.util.Arrays;
import java.util.List;

import br.com.fuctura.projetospessoais.aprovados.escola.AlunosAprovados;

public class AprovadosHistoriaManha {

	public static void aprovadosPrimeiraAManha() {

		AlunosAprovados aprovadoUm = new AlunosAprovados("Primeira série A manhã história", 10D);
		AlunosAprovados aprovadoDois = new AlunosAprovados("João Christofonile", 8.6D);
		AlunosAprovados aprovadoTres = new AlunosAprovados("Pedro Cardoso Ferrais", 6.5D);
		AlunosAprovados aprovadoQuatro = new AlunosAprovados("Maria Joaquina Silvestre", 10D);
		AlunosAprovados aprovadoCinco = new AlunosAprovados("João Bosco de Vasconcelos", 9D);
		AlunosAprovados aprovadoSeis = new AlunosAprovados("Maria Eduarda", 8D);
		AlunosAprovados aprovadoSete = new AlunosAprovados("Tarcíla Gusmões", 10D);
		AlunosAprovados aprovadoOito = new AlunosAprovados("Joaquim Bosco Ferreira", 7.5D);
		AlunosAprovados aprovadoNove = new AlunosAprovados("Gustavo Fernandes Pedrosa Solsa", 9.8D);
		AlunosAprovados aprovadoDez = new AlunosAprovados("Gabriela Cravo e Canela", 10D);
		AlunosAprovados aprovadoOnze = new AlunosAprovados("Sandra de Sá Oliveira", 8.9D);
		AlunosAprovados aprovadoDoze = new AlunosAprovados("Julío César Ferreira", 9D);
		AlunosAprovados aprovadoTreze = new AlunosAprovados("Sandro Almeida Pedrosa", 6D);

		List<AlunosAprovados> aprovados = Arrays.asList(aprovadoUm, aprovadoDois, aprovadoTres, aprovadoQuatro,
				aprovadoCinco, aprovadoSeis, aprovadoSete, aprovadoOito, aprovadoNove, aprovadoDez, aprovadoOnze,
				aprovadoDoze, aprovadoTreze);

		for (AlunosAprovados alunosAprovados : aprovados) {
			StringBuffer con = new StringBuffer();
			
			System.out.println(con.append("Nome aluno: " + alunosAprovados.getNomeAlunos()).append(" ")
					.append("Nota aluno: " + alunosAprovados.getNotaAlunos()));

		}
	}

	public static void aprovadosPrimeiraBManha() {
		AlunosAprovados aprovadoUm = new AlunosAprovados("Primeira série B manhã história", 10D);
		AlunosAprovados aprovadoDois = new AlunosAprovados("João Christofonile", 8.6D);
		AlunosAprovados aprovadoTres = new AlunosAprovados("Pedro Cardoso Ferrais", 6.5D);
		AlunosAprovados aprovadoQuatro = new AlunosAprovados("Maria Joaquina Silvestre", 10D);
		AlunosAprovados aprovadoCinco = new AlunosAprovados("João Bosco de Vasconcelos", 9D);
		AlunosAprovados aprovadoSeis = new AlunosAprovados("Maria Eduarda", 8D);
		AlunosAprovados aprovadoSete = new AlunosAprovados("Tarcíla Gusmões", 10D);
		AlunosAprovados aprovadoOito = new AlunosAprovados("Joaquim Bosco Ferreira", 7.5D);
		AlunosAprovados aprovadoNove = new AlunosAprovados("Gustavo Fernandes Pedrosa Solsa", 9.8D);
		AlunosAprovados aprovadoDez = new AlunosAprovados("Gabriela Cravo e Canela", 10D);
		AlunosAprovados aprovadoOnze = new AlunosAprovados("Sandra de Sá Oliveira", 8.9D);
		AlunosAprovados aprovadoDoze = new AlunosAprovados("Julío César Ferreira", 9D);
		AlunosAprovados aprovadoTreze = new AlunosAprovados("Sandro Almeida Pedrosa", 6D);

		List<AlunosAprovados> aprovados = Arrays.asList(aprovadoUm, aprovadoDois, aprovadoTres, aprovadoQuatro,
				aprovadoCinco, aprovadoSeis, aprovadoSete, aprovadoOito, aprovadoNove, aprovadoDez, aprovadoOnze,
				aprovadoDoze, aprovadoTreze);

		for (AlunosAprovados alunosAprovados : aprovados) {
			StringBuffer con = new StringBuffer();
			
			System.out.println(con.append("Nome aluno: " + alunosAprovados.getNomeAlunos()).append(" ")
					.append("Nota aluno: " + alunosAprovados.getNotaAlunos()));

		}
	}
}
