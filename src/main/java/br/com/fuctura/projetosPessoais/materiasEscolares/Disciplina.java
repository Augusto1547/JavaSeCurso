package br.com.fuctura.projetosPessoais.materiasEscolares;

import br.com.fuctura.projetosPessoais.aprovados.ListaAprovados;

public abstract class Disciplina {

    String nomeDaDisciplina;
    String turnoDasProvas;
    ListaAprovados alunos;

    public Disciplina(String nomeDaDisciplina, String turnoDasProvas) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.turnoDasProvas = turnoDasProvas;
    }

}
