package br.com.fuctura.projetosPessoais.materiasEscolares;

import br.com.fuctura.projetosPessoais.AprovadosInterfaces.*;
import br.com.fuctura.projetosPessoais.aprovados.AprovadosMatematicaManha;

public class MatematicaTurnoManha extends Disciplina implements iApprovedMorningA {

    public MatematicaTurnoManha(String nomeDaDisciplina, String turnoDasProvas, String serieDosAlunos) {
        super(nomeDaDisciplina, turnoDasProvas, serieDosAlunos);
    }

    @Override
    public void aprovadosTurnoDaManhaPrimeiraSerie() {

        if ((super.nomeDaDisciplina.equalsIgnoreCase("matemática"))
                && (super.turnoDasProvas.equalsIgnoreCase("manhã"))
                && (super.serieDosAlunos.equalsIgnoreCase("primeira série"))) {

            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarPrimeiraSerieAManha();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarPrimeiraSerieBManha();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarPrimeiraSerieCManha();
            System.exit(0);
        }

    }

    //Primeira série manhã
    @Override
    public void aprovadosTurnoDaManhaSegundaSerie() {
        if ((super.nomeDaDisciplina.equalsIgnoreCase("matemática"))
                && (super.turnoDasProvas.equalsIgnoreCase("manhã"))
                && (super.serieDosAlunos.equalsIgnoreCase("segunda série"))) {

            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarSegundaSerieAManha();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarSegundaSerieBManha();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarSegundaSerieCManha();
            System.exit(0);
        }

    }

    @Override
    public void aprovadosTurnoDaManhaTerceiraSerie() {
        if ((super.nomeDaDisciplina.equalsIgnoreCase("matemática"))
                && (super.turnoDasProvas.equalsIgnoreCase("manhã"))
                && (super.serieDosAlunos.equalsIgnoreCase("terceira série"))) {

            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarTerceiraSerieAManha();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarTerceiraSerieBManha();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarTerceiraSerieCManha();
            System.exit(0);
        }

    }

    @Override
    public void aprovadosTurnoDaManhaQuartaSerie() {

        if ((super.nomeDaDisciplina.equalsIgnoreCase("matemática"))
                && (super.turnoDasProvas.equalsIgnoreCase("manhã"))
                && (super.serieDosAlunos.equalsIgnoreCase("quarta série"))) {

            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostarQuartaSerieAManha();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostarQuartaSerieBManha();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostarQuartaSerieCManha();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostarQuartaSerieDManha();
            System.exit(0);
        }

    }

    @Override
    public void aprovadosTurnoDaManhaQuintaSerie() {

        if ((super.nomeDaDisciplina.equalsIgnoreCase("matemática"))
                && (super.turnoDasProvas.equalsIgnoreCase("manhã"))
                && (super.serieDosAlunos.equalsIgnoreCase("quinta série"))) {

            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarQuintaSerieA();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarQuintaSerieB();
            new AprovadosMatematicaManha(nomeDaDisciplina, 0).mostrarQuintaSerieC();

        } else {

            System.out.println("Erro! verifica se digitou algo errado ou deixou de adicionar acênto.");
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
