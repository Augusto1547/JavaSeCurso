package br.com.fuctura.projetosPessoais.AlunosAprovados;

public abstract class Disciplina {

    String nomeDaDisciplina;
    String turnoDasProvas;
    AlunosAprovados alunos;

    public Disciplina(String nomeDaDisciplina, String turnoDasProvas) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.turnoDasProvas = turnoDasProvas;
    }

}
