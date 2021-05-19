package br.com.fuctura.projetosPessoais.materiasEscolares;


public abstract class Disciplina {

    String nomeDaDisciplina;
    String turnoDasProvas;
    String serieDosAlunos;
     

    public Disciplina(String nomeDaDisciplina, String turnoDasProvas, String serieDosAlunos) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.turnoDasProvas = turnoDasProvas;
        this.serieDosAlunos = serieDosAlunos;
    }

}
