package br.com.fuctura.projetospessoais.aprovados.turnomanha;

import br.com.fuctura.projetospessoais.aprovados.escola.SalaDeAula;
import br.com.fuctura.projetospessoais.aprovados.materias.AprovadosMatematica;

public final class PrimeiraSerieB extends SalaDeAula {

	public PrimeiraSerieB() {
		super();
	}

	public void acessarAprovadosPrimeiraSerieBMatematica() {

		if (this.getInstrutor().equalsIgnoreCase("pedro") && this.getMateria().equalsIgnoreCase("matemática")
				&& this.getSerie().equalsIgnoreCase("primeira série") && this.getIdSala().equalsIgnoreCase("b")
				&& this.getTurno().equalsIgnoreCase("manhã")) {

			AprovadosMatematica.aprovadosPrimeiraBManha();
			System.exit(0);
		}
	}

}
