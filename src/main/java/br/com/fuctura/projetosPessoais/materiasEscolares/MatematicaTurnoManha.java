package br.com.fuctura.projetosPessoais.materiasEscolares;

import br.com.fuctura.projetosPessoais.AprovadosInterfaces.*;
import br.com.fuctura.projetosPessoais.aprovados.AprovadosMatematica;

public class MatematicaTurnoManha extends Disciplina implements iApprovedMorningA {

    public MatematicaTurnoManha(String nomeDaDisciplina, String turnoDasProvas, String serieDosAlunos) {
        super(nomeDaDisciplina, turnoDasProvas, serieDosAlunos);
    }

    @Override
    public void aprovadosTurnoDaManhaPrimeiraSerie() {

        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))
                && (super.serieDosAlunos.equals("primeira")
                || super.nomeDaDisciplina.equals("Primeira"))) {

            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarPrimeiraSerieAManha();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarPrimeiraSerieBManha();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarPrimeiraSerieCManha();
            System.exit(0);
        }

    }

    //Primeira série manhã
    @Override
    public void aprovadosTurnoDaManhaSegundaSerie() {
        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))
                && (super.serieDosAlunos.equals("segunda")
                || super.nomeDaDisciplina.equals("Segunda"))) {

            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarSegundaSerieAManha();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarSegundaSerieBManha();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarSegundaSerieCManha();
            System.exit(0);
        }

    }

    @Override
    public void aprovadosTurnoDaManhaTerceiraSerie() {
        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))
                && (super.serieDosAlunos.equals("terceira")
                || super.nomeDaDisciplina.equals("Terceira")))  {

            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarTerceiraSerieAManha();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarTerceiraSerieBManha();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarTerceiraSerieCManha();
            System.exit(0);
        }

    }

    @Override
    public void aprovadosTurnoDaManhaQuartaSerie() {

        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))
                && (super.serieDosAlunos.equals("quarta")
                || super.nomeDaDisciplina.equals("Quarta")))  {

            new AprovadosMatematica(nomeDaDisciplina, 0).mostarQuartaSerieAManha();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostarQuartaSerieBManha();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostarQuartaSerieCManha();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostarQuartaSerieDManha();
            System.exit(0);
        }

    }

    @Override
    public void aprovadosTurnoDaManhaQuintaSerie() {

        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))
                && (super.serieDosAlunos.equals("quinta")
                || super.nomeDaDisciplina.equals("Quinta")))  {

            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarQuintaSerieA();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarQuintaSerieB();
            new AprovadosMatematica(nomeDaDisciplina, 0).mostrarQuintaSerieC();

        } else {

            System.out.println("Matéria ou turno foi digitado errado.");
        }

        System.exit(0);
    }

    @Override
    public void mostrarAprovadosManha() {

        this.aprovadosTurnoDaManhaPrimeiraSerie();
        this.aprovadosTurnoDaManhaSegundaSerie();
        this.aprovadosTurnoDaManhaTerceiraSerie();
        this.aprovadosTurnoDaManhaQuartaSerie();
        this.aprovadosTurnoDaManhaQuintaSerie();

    }

}
