package br.com.fuctura.projetospessoais.aprovados.turnomanha;

import br.com.fuctura.projetospessoais.aprovados.escola.SalaDeAula;
import br.com.fuctura.projetospessoais.aprovados.materias.Matematica;

public class PrimeiraSerieA extends SalaDeAula {

	public PrimeiraSerieA() {
		super();
	}

	public PrimeiraSerieA(String instrutor, String materia, String serie, String turno, String idSala) {
		super(instrutor, materia, serie, turno, idSala);
	}

	public void acessarAprovadosPrimeiraSerieAMatematica() {

		if (this.getInstrutor().equalsIgnoreCase("joão") && this.getMateria().equalsIgnoreCase("matemática")
				&& this.getSerie().equalsIgnoreCase("primeira série") && this.getIdSala().equalsIgnoreCase("a")
				&& this.getTurno().equalsIgnoreCase("manhã")) {

			System.out.printf("%s %n", "Todos os dias quando acordo não tenho mais o tempo que passou");
			Matematica.aprovados();

		}
	}

}
