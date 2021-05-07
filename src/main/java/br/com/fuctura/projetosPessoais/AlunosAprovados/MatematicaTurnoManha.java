package br.com.fuctura.projetosPessoais.AlunosAprovados;

import br.com.fuctura.projetosPessoais.AprovadosInterfaces.iApprovedMorningA;

public class MatematicaTurnoManha extends Disciplina implements iApprovedMorningA {

    public MatematicaTurnoManha(String nomeDaDisciplina, String turnoDasProvas) {
        super(nomeDaDisciplina, turnoDasProvas);
    }

    @Override
    public void aprovadosTurnoDaManhaPrimeiraSerieA() {

        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {

            System.out.println("\t\t ALUNOS APROVADOS PRIMEIRA SÉRIE A\n");

            AlunosAprovados aluPriSerieManha1 = new AlunosAprovados("Nome: Augusto César \t Nota :", 9.6);
            AlunosAprovados aluPriSerieManha2 = new AlunosAprovados("Nome: Fernando Henrique Cardoso \t Nota :", 10);
            AlunosAprovados aluPriSerieManha3 = new AlunosAprovados("Nome: Guilherme Santana Marques \t Nota :", 7);
            AlunosAprovados aluPriSerieManha4 = new AlunosAprovados("Nome: Clóvis de Barros Filho \t Nota :", 9);
            AlunosAprovados aluPriSerieManha5 = new AlunosAprovados("Nome: Júlio César Brito Marquez \t Nota :", 10);
            AlunosAprovados aluPriSerieManha6 = new AlunosAprovados("Nome: Antônio Silveira \t Nota :", 10);
            AlunosAprovados aluPriSerieManha7 = new AlunosAprovados("Nome: Gustavo Borgis Pereira \t Nota :", 9.6);
            AlunosAprovados aluPriSerieManha8 = new AlunosAprovados("Nome: Cassandra Dias Fernandes \t Nota :", 8);
            AlunosAprovados aluPriSerieManha9 = new AlunosAprovados("Nome: Maria Cavalcanti Silvânia \t Nota :", 6.6);
            AlunosAprovados aluPriSerieManha10 = new AlunosAprovados("Nome: Juliete Atriz Guimarães Rocha \t Nota :", 8);
            AlunosAprovados aluPriSerieManha11 = new AlunosAprovados("Nome: Gutembergue Dias Morais Vasconcelos \t Nota :", 10);
            AlunosAprovados aluPriSerieManha12 = new AlunosAprovados("Nome: Juliano Pedrosa Richardes Amaranto \t Nota :", 10);
            AlunosAprovados aluPriSerieManha13 = new AlunosAprovados("Nome: Júlio Ferreira Pedrosa Souza \t Nota :", 9.6);

            AlunosAprovados[] aprovados = {aluPriSerieManha1, aluPriSerieManha2, aluPriSerieManha3, aluPriSerieManha4,
                aluPriSerieManha5, aluPriSerieManha6, aluPriSerieManha7, aluPriSerieManha8, aluPriSerieManha9,
                aluPriSerieManha10, aluPriSerieManha11, aluPriSerieManha12, aluPriSerieManha13};

            for (AlunosAprovados aprovado : aprovados) {

                System.out.println(aprovado.nomeAluno + aprovado.nota);
            }

            System.out.println("\t\t ALUNOS APROVADOS PRIMEIRA SÉRIE B\n");
            this.aprovadosTurnoDaManhaPrimeiraSerieA();
           
        } else {

            System.out.println("Você digitou alguma informação errada");
        }
        System.out.println();
    }


    //Primeira série
    @Override
    public void aprovadosTurnoDaManhaSegundaSerieA() {
        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {

            System.out.println("\t\t ALUNOS APROVADOS SEGUNDA SÉRIE A\n");

            AlunosAprovados aluSegSerieManha1 = new AlunosAprovados("Nome: Segunda César \t Nota :", 9.6);
            AlunosAprovados aluSegSerieManha2 = new AlunosAprovados("Nome: Fernando Henrique Cardoso \t Nota :", 10);
            AlunosAprovados aluSegSerieManha3 = new AlunosAprovados("Nome: Guilherme Santana Marques \t Nota :", 7);
            AlunosAprovados aluSegSerieManha4 = new AlunosAprovados("Nome: Clóvis de Barros Filho \t Nota :", 9);
            AlunosAprovados aluSegSerieManha5 = new AlunosAprovados("Nome: Júlio César Brito Marquez \t Nota :", 10);
            AlunosAprovados aluSegSerieManha6 = new AlunosAprovados("Nome: Antônio Silveira \t Nota :", 10);
            AlunosAprovados aluSegSerieManha7 = new AlunosAprovados("Nome: Gustavo Borgis Pereira \t Nota :", 9.6);
            AlunosAprovados aluSegSerieManha8 = new AlunosAprovados("Nome: Cassandra Dias Fernandes \t Nota :", 8);
            AlunosAprovados aluSegSerieManha9 = new AlunosAprovados("Nome: Maria Cavalcanti Silvânia \t Nota :", 6.6);
            AlunosAprovados aluSegSerieManha10 = new AlunosAprovados("Nome: Juliete Atriz Guimarães Rocha \t Nota :", 8);
            AlunosAprovados aluSegSerieManha11 = new AlunosAprovados("Nome: Gutembergue Dias Morais Vasconcelos \t Nota :", 10);
            AlunosAprovados aluSegSerieManha12 = new AlunosAprovados("Nome: Juliano Pedrosa Richardes Amaranto \t Nota :", 10);
            AlunosAprovados aluSegSerieManha13 = new AlunosAprovados("Nome: Júlio Ferreira Pedrosa Souza \t Nota :", 9.6);

            AlunosAprovados[] aprovadosSegundaSerieManha = {aluSegSerieManha1, aluSegSerieManha2, aluSegSerieManha3, aluSegSerieManha4,
                aluSegSerieManha5, aluSegSerieManha6, aluSegSerieManha7, aluSegSerieManha8, aluSegSerieManha9,
                aluSegSerieManha10, aluSegSerieManha11, aluSegSerieManha12, aluSegSerieManha13};

            for (AlunosAprovados aprovado : aprovadosSegundaSerieManha) {

                System.out.println(aprovado.nomeAluno + aprovado.nota);
            }

        } else {

            System.out.println("Você digitou alguma informação errada");
        }

        System.out.println();
    }

    @Override
    public void aprovadosTurnoDaManhaTerceiraSerieA() {
        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {

            System.out.println("\t\t ALUNOS APROVADOS TERCEIRA SÉRIE A\n");

            AlunosAprovados aluTerSerieManha1 = new AlunosAprovados("Nome: Terceira César \t Nota :", 9.6);
            AlunosAprovados aluTerSerieManha2 = new AlunosAprovados("Nome: Fernando Henrique Cardoso \t Nota :", 10);
            AlunosAprovados aluTerSerieManha3 = new AlunosAprovados("Nome: Guilherme Santana Marques \t Nota :", 7);
            AlunosAprovados aluTerSerieManha4 = new AlunosAprovados("Nome: Clóvis de Barros Filho \t Nota :", 9);
            AlunosAprovados aluTerSerieManha5 = new AlunosAprovados("Nome: Júlio César Brito Marquez \t Nota :", 10);
            AlunosAprovados aluTerSerieManha6 = new AlunosAprovados("Nome: Antônio Silveira \t Nota :", 10);
            AlunosAprovados aluTerSerieManha7 = new AlunosAprovados("Nome: Gustavo Borgis Pereira \t Nota :", 9.6);
            AlunosAprovados aluTerSerieManha8 = new AlunosAprovados("Nome: Cassandra Dias Fernandes \t Nota :", 8);
            AlunosAprovados aluTerSerieManha9 = new AlunosAprovados("Nome: Maria Cavalcanti Silvânia \t Nota :", 6.6);
            AlunosAprovados aluTerSerieManha10 = new AlunosAprovados("Nome: Juliete Atriz Guimarães Rocha \t Nota :", 8);
            AlunosAprovados aluTerSerieManha11 = new AlunosAprovados("Nome: Gutembergue Dias Morais Vasconcelos \t Nota :", 10);
            AlunosAprovados aluTerSerieManha12 = new AlunosAprovados("Nome: Juliano Pedrosa Richardes Amaranto \t Nota :", 10);
            AlunosAprovados aluTerSerieManha13 = new AlunosAprovados("Nome: Júlio Ferreira Pedrosa Souza \t Nota :", 9.6);

            AlunosAprovados[] aprovadoTerceiraSerieManha = {aluTerSerieManha1, aluTerSerieManha2, aluTerSerieManha3, aluTerSerieManha4,
                aluTerSerieManha5, aluTerSerieManha6, aluTerSerieManha7, aluTerSerieManha8, aluTerSerieManha9,
                aluTerSerieManha10, aluTerSerieManha11, aluTerSerieManha12, aluTerSerieManha13};

            for (AlunosAprovados aprovado : aprovadoTerceiraSerieManha) {

                System.out.println(aprovado.nomeAluno + aprovado.nota);
            }

        } else {

            System.out.println("Você digitou alguma informação errada");
        }
    }

    @Override
    public void aprovadosTurnoDaManhaQuartaSerieA() {

        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {

            System.out.println("\t\t ALUNOS APROVADOS QUARTA SÉRIE A\n");

            AlunosAprovados aluQuarSerieManha1 = new AlunosAprovados("Nome: Quarta César \t Nota :", 9.6);
            AlunosAprovados aluQuarSerieManha2 = new AlunosAprovados("Nome: Fernando Henrique Cardoso \t Nota :", 10);
            AlunosAprovados aluQuarSerieManha3 = new AlunosAprovados("Nome: Guilherme Santana Marques \t Nota :", 7);
            AlunosAprovados aluQuarSerieManha4 = new AlunosAprovados("Nome: Clóvis de Barros Filho \t Nota :", 9);
            AlunosAprovados aluQuarSerieManha5 = new AlunosAprovados("Nome: Júlio César Brito Marquez \t Nota :", 10);
            AlunosAprovados aluQuarSerieManha6 = new AlunosAprovados("Nome: Antônio Silveira \t Nota :", 10);
            AlunosAprovados aluQuarSerieManha7 = new AlunosAprovados("Nome: Gustavo Borgis Pereira \t Nota :", 9.6);
            AlunosAprovados aluQuarSerieManha8 = new AlunosAprovados("Nome: Cassandra Dias Fernandes \t Nota :", 8);
            AlunosAprovados aluQuarSerieManha9 = new AlunosAprovados("Nome: Maria Cavalcanti Silvânia \t Nota :", 6.6);
            AlunosAprovados aluQuarSerieManha10 = new AlunosAprovados("Nome: Juliete Atriz Guimarães Rocha \t Nota :", 8);
            AlunosAprovados aluQuarSerieManha11 = new AlunosAprovados("Nome: Gutembergue Dias Morais Vasconcelos \t Nota :", 10);
            AlunosAprovados aluQuarSerieManha12 = new AlunosAprovados("Nome: Juliano Pedrosa Richardes Amaranto \t Nota :", 10);
            AlunosAprovados aluQuarSerieManha13 = new AlunosAprovados("Nome: Júlio Ferreira Pedrosa Souza \t Nota :", 9.6);

            AlunosAprovados[] aprovadosQuartaSerieManha = {aluQuarSerieManha1, aluQuarSerieManha2, aluQuarSerieManha3, aluQuarSerieManha4,
                aluQuarSerieManha5, aluQuarSerieManha6, aluQuarSerieManha7, aluQuarSerieManha8, aluQuarSerieManha9,
                aluQuarSerieManha10, aluQuarSerieManha11, aluQuarSerieManha12, aluQuarSerieManha13};

            for (AlunosAprovados aprovado : aprovadosQuartaSerieManha) {

                System.out.println(aprovado.nomeAluno + aprovado.nota);
            }

        } else {

            System.out.println("Você digitou alguma informação errada");
        }
        System.out.println();
    }

    @Override
    public void aprovadosTurnoDaManhaQuintaSerieA() {

        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {

            System.out.println("\t\t ALUNOS APROVADOS QUINTA SÉRIE A\n");

            AlunosAprovados aluQuinSerieManha1 = new AlunosAprovados("Nome: Quingunda César \t Nota :", 9.6);
            AlunosAprovados aluQuinSerieManha2 = new AlunosAprovados("Nome: Fernando Henrique Cardoso \t Nota :", 10);
            AlunosAprovados aluQuinSerieManha3 = new AlunosAprovados("Nome: Guilherme Santana Marques \t Nota :", 7);
            AlunosAprovados aluQuinSerieManha4 = new AlunosAprovados("Nome: Clóvis de Barros Filho \t Nota :", 9);
            AlunosAprovados aluQuinSerieManha5 = new AlunosAprovados("Nome: Júlio César Brito Marquez \t Nota :", 10);
            AlunosAprovados aluQuinSerieManha6 = new AlunosAprovados("Nome: Antônio Silveira \t Nota :", 10);
            AlunosAprovados aluQuinSerieManha7 = new AlunosAprovados("Nome: Gustavo Borgis Pereira \t Nota :", 9.6);
            AlunosAprovados aluQuinSerieManha8 = new AlunosAprovados("Nome: Cassandra Dias Fernandes \t Nota :", 8);
            AlunosAprovados aluQuinSerieManha9 = new AlunosAprovados("Nome: Maria Cavalcanti Silvânia \t Nota :", 6.6);
            AlunosAprovados aluQuinSerieManha10 = new AlunosAprovados("Nome: Juliete Atriz Guimarães Rocha \t Nota :", 8);
            AlunosAprovados aluQuinSerieManha11 = new AlunosAprovados("Nome: Gutembergue Dias Morais Vasconcelos \t Nota :", 10);
            AlunosAprovados aluQuinSerieManha12 = new AlunosAprovados("Nome: Juliano Pedrosa Richardes Amaranto \t Nota :", 10);
            AlunosAprovados aluQuinSerieManha13 = new AlunosAprovados("Nome: Júlio Ferreira Pedrosa Souza \t Nota :", 9.6);

            AlunosAprovados[] aprovadosQuintaSerieManha = {aluQuinSerieManha1, aluQuinSerieManha2, aluQuinSerieManha3, aluQuinSerieManha4,
                aluQuinSerieManha5, aluQuinSerieManha6, aluQuinSerieManha7, aluQuinSerieManha8, aluQuinSerieManha9,
                aluQuinSerieManha10, aluQuinSerieManha11, aluQuinSerieManha12, aluQuinSerieManha13};

            for (AlunosAprovados aprovado : aprovadosQuintaSerieManha) {

                System.out.println(aprovado.nomeAluno + aprovado.nota);
            }

        } else {

            System.out.println("Você digitou alguma informação errada");
        }
        System.out.println();
    }

    @Override
    public void mostrarAprovadosManhaSalaA() {

        this.aprovadosTurnoDaManhaPrimeiraSerieA();

        this.aprovadosTurnoDaManhaSegundaSerieA();
        this.aprovadosTurnoDaManhaTerceiraSerieA();
        this.aprovadosTurnoDaManhaQuartaSerieA();
        this.aprovadosTurnoDaManhaQuintaSerieA();

    }

   

}
