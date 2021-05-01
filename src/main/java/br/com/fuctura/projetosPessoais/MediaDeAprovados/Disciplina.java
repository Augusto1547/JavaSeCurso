package br.com.fuctura.projetosPessoais.MediaDeAprovados;

public abstract class Disciplina {

    String nomeDaDisciplina;
    String turnoDasProvas;
    AlunosAprovados alunos;

    public Disciplina(){
        
        super();
    }

    public Disciplina(String nomeDaDisciplina, String turnoDasProvas) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.turnoDasProvas = turnoDasProvas;
    }
    
    public abstract void mostrarAprovadosTurnoManha();

}
