package br.com.fuctura.projetosPessoais.MediaDeAprovados;

import br.com.fuctura.projetosPessoais.AprovadosInterfaces.*;

public class Mathematics extends Disciplina implements ApprovedMorning {

    public Mathematics(String nomeDaDisciplina, String turnoDasProvas) {
        super(nomeDaDisciplina, turnoDasProvas);
    }

    @Override
    public void aprovadosTurnoDaManhaPrimeiraSerie() {

        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {

            System.out.println("\t\t ALUNOS APROVADOS PRIMEIRA SÉRIE A\n");

            AlunosAprovados aluPriSerieManha = new AlunosAprovados("Nome: Augusto César \t Nota :", 9.6);
            System.out.println(aluPriSerieManha.nomeAluno + aluPriSerieManha.nota);

        } else {

            System.out.println("Você digitou alguma informação errada");
        }
    }

    @Override
    public void aprovadosTurnoDaManhaSegundaSerie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aprovadosTurnoDaManhaTerceiraSerie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aprovadosTurnoDaManhaQuartaSerie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aprovadosTurnoDaManhaQuintaSerie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarAprovadosTurnoManha() {

        this.aprovadosTurnoDaManhaPrimeiraSerie();

    }

}
