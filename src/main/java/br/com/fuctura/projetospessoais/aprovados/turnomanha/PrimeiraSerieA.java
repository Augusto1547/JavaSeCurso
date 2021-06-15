package br.com.fuctura.projetospessoais.aprovados.turnomanha;

import br.com.fuctura.projetospessoais.aprovados.escola.SalaDeAula;
import br.com.fuctura.projetospessoais.aprovados.materias.AprovadosMatematica;

public final class PrimeiraSerieA extends SalaDeAula {

	public PrimeiraSerieA() {
		super();
	}

	public void acessarAprovadosPrimeiraSerieAMatematica() {

		if (this.getInstrutor().equalsIgnoreCase("joão") && this.getMateria().equalsIgnoreCase("matemática")
				&& this.getSerie().equalsIgnoreCase("primeira série") && this.getIdSala().equalsIgnoreCase("a")
				&& this.getTurno().equalsIgnoreCase("manhã")) {

			AprovadosMatematica.aprovadosPrimeiraAManha();
			System.exit(0);
		}
	}

}
