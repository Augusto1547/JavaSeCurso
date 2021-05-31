package br.com.fuctura.projetospessoais.aprovados.turnomanha;

import br.com.fuctura.projetospessoais.aprovados.escola.Sala;
import br.com.fuctura.projetospessoais.aprovados.materias.Matematica;

public class PrimeiraSerieA extends Sala {

	public void mostrarAprovadosMatematica() {

		Matematica oi = new Matematica();
		oi.aprovados();
	}

	public void acessarAprovados() {

		this.mostrarAprovadosMatematica();
	}

}
