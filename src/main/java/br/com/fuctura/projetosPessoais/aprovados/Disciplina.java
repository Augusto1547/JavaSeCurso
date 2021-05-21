package br.com.fuctura.projetosPessoais.aprovados;

public abstract class Disciplina {

    public String nomeDaDisciplina;
    public String turnoDasProvas;
    public String serieDosAlunos;
    public AlunosAprovados alunosAprovados;

    public Disciplina(String nomeDaDisciplina, String turnoDasProvas, String serieDosAlunos) {

        this(nomeDaDisciplina, turnoDasProvas, serieDosAlunos, null);
    }

    public Disciplina(String nomeDaDisciplina, String turnoDasProvas, String serieDosAlunos, AlunosAprovados alunosAprovados) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.turnoDasProvas = turnoDasProvas;
        this.serieDosAlunos = serieDosAlunos;
        this.alunosAprovados = alunosAprovados;
    }

    public String getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public void setNomeDaDisciplina(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    public String getTurnoDasProvas() {
        return turnoDasProvas;
    }

    public void setTurnoDasProvas(String turnoDasProvas) {
        this.turnoDasProvas = turnoDasProvas;
    }

    public String getSerieDosAlunos() {
        return serieDosAlunos;
    }

    public void setSerieDosAlunos(String serieDosAlunos) {
        this.serieDosAlunos = serieDosAlunos;
    }

    public AlunosAprovados getAlunosAprovados() {
        return alunosAprovados;
    }

    public void setAlunosAprovados(AlunosAprovados alunosAprovados) {
        this.alunosAprovados = alunosAprovados;
    }

}
