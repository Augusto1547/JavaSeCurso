package br.com.fuctura.projetosPessoais.materiasEscolares;

import br.com.fuctura.projetosPessoais.aprovados.AprovadosMatematica;

public abstract class Disciplina {

    String nomeDaDisciplina;
    String turnoDasProvas;
    AprovadosMatematica aprovadosMatematica;

    public Disciplina(String nomeDaDisciplina, String turnoDasProvas) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.turnoDasProvas = turnoDasProvas;
    }

}
