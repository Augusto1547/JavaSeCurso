package br.com.fuctura.projetospessoais.aprovados.turnomanha;

import br.com.fuctura.projetospessoais.aprovados.escola.SalaDeAula;
import br.com.fuctura.projetospessoais.aprovados.materias.AprovadosHistoriaManha;
import br.com.fuctura.projetospessoais.aprovados.materias.AprovadosMatematicaManha;
import br.com.fuctura.projetospessoais.aprovados.materias.AprovadosPortuguesManha;

public final class PrimeiraSerieB extends SalaDeAula {

	public PrimeiraSerieB() {
		super();
	}

	public void acessarAprovadosPrimeiraSerieBMatematica() {

		if (this.getInstrutor().equalsIgnoreCase("joão") && this.getMateria().equalsIgnoreCase("matemática")
				&& this.getSerie().equalsIgnoreCase("primeira série") && this.getIdSala().equalsIgnoreCase("b")
				&& this.getTurno().equalsIgnoreCase("manhã")) {

			AprovadosMatematicaManha.aprovadosPrimeiraBManha();
			System.exit(0);

		} else {

			System.out.printf("%-70s",
					"Veja se digitou algum desses valores erredos: professor,matéria,série, sala ou turno");
		}
	}

	public void acessarAprovadosPrimeiraSerieBPortugues() {

		if (this.getInstrutor().equalsIgnoreCase("pedro") && this.getMateria().equalsIgnoreCase("português")
				&& this.getSerie().equalsIgnoreCase("primeira série") && this.getIdSala().equalsIgnoreCase("b")
				&& this.getTurno().equalsIgnoreCase("manhã")) {

			AprovadosPortuguesManha.aprovadosPrimeiraBManha();
			System.exit(0);

		} else {

			System.out.printf("%-70s",
					"Veja se digitou algum desses valores erredos: professor,matéria,série, sala ou turno");
		}
	}

	public void acessarAprovadosPrimeiraSerieBHistoria() {

		if (this.getInstrutor().equalsIgnoreCase("mateus") && this.getMateria().equalsIgnoreCase("história")
				&& this.getSerie().equalsIgnoreCase("primeira série") && this.getIdSala().equalsIgnoreCase("b")
				&& this.getTurno().equalsIgnoreCase("manhã")) {

			AprovadosHistoriaManha.aprovadosPrimeiraBManha();
			System.exit(0);

		} else {

			System.out.printf("%-70s",
					"Veja se digitou algum desses valores erredos: professor,matéria,série, sala ou turno");
		}
	}

}
