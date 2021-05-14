package br.com.fuctura.projetosPessoais.aprovados;

public class AprovadosMatematica {

    public String nomeAluno;
    public double nota;

    public AprovadosMatematica(String nomeAluno, double nota) {
        this.nomeAluno = nomeAluno;
        this.nota = nota;
    }

    public void mostrarPrimeiraSerieAManha() {

        System.out.println("\t \t ALUNOS APROVADOS PRIMEIRA SÉRIE A MATEMÁTICA \n");

        AprovadosMatematica alunoPrimeiraSeManha1 = new AprovadosMatematica("Aluno: Augusto César  Nota :", 9.6);
        AprovadosMatematica alunoPrimeiraSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoPrimeiraSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoPrimeiraSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoPrimeiraSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoPrimeiraSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoPrimeiraSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoPrimeiraSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovados = {alunoPrimeiraSeManha1, alunoPrimeiraSeManha2, alunoPrimeiraSeManha3, alunoPrimeiraSeManha4,
            alunoPrimeiraSeManha5, alunoPrimeiraSeManha6, alunoPrimeiraSeManha7, alunoPrimeiraSeManha8, alunoPrimeiraSeManha9,
            alunoPrimeiraSeManha10, alunoPrimeiraSeManha11, alunoPrimeiraSeManha12, alunoPrimeiraSeManha13};

        for (AprovadosMatematica aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

        System.out.println();
    }

    public void mostrarPrimeiraSerieBManha() {

        System.out.println("\t \t ALUNOS APROVADOS PRIMEIRA SÉRIE B MATEMÁTICA \n");

        AprovadosMatematica alunoPrimeiraSeManha1 = new AprovadosMatematica("Aluno: Primeira série B :", 9.6);
        AprovadosMatematica alunoPrimeiraSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoPrimeiraSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoPrimeiraSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoPrimeiraSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoPrimeiraSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoPrimeiraSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoPrimeiraSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovados = {alunoPrimeiraSeManha1, alunoPrimeiraSeManha2, alunoPrimeiraSeManha3, alunoPrimeiraSeManha4,
            alunoPrimeiraSeManha5, alunoPrimeiraSeManha6, alunoPrimeiraSeManha7, alunoPrimeiraSeManha8, alunoPrimeiraSeManha9,
            alunoPrimeiraSeManha10, alunoPrimeiraSeManha11, alunoPrimeiraSeManha12, alunoPrimeiraSeManha13};

        for (AprovadosMatematica aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }
        System.out.println();
    }

    public void mostrarPrimeiraSerieCManha() {

        System.out.println("\t \t ALUNOS APROVADOS PRIMEIRA SÉRIE C MATEMÁTICA \n");

        AprovadosMatematica alunoPrimeiraSeManha1 = new AprovadosMatematica("Aluno: Primeira série c :", 7);
        AprovadosMatematica alunoPrimeiraSeManha2 = new AprovadosMatematica("Aluno: Osvaldo César  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoPrimeiraSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoPrimeiraSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoPrimeiraSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);

        AprovadosMatematica[] aprovados = {alunoPrimeiraSeManha1, alunoPrimeiraSeManha2, alunoPrimeiraSeManha3, alunoPrimeiraSeManha4,
            alunoPrimeiraSeManha5, alunoPrimeiraSeManha6};

        for (AprovadosMatematica aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

    }
    //Aprovados matematica PRIMEIRA SÉRIE da manhã

    public void mostrarSegundaSerieAManha() {

        System.out.println("\t \t ALUNOS APROVADOS SEGUNDA SÉRIE A MATEMÁTICA \n");

        AprovadosMatematica alunoSegundaSeManha1 = new AprovadosMatematica("Aluno: Augusto César  Nota :", 9.6);
        AprovadosMatematica alunoSegundaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoSegundaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoSegundaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoSegundaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoSegundaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoSegundaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoSegundaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovados = {alunoSegundaSeManha1, alunoSegundaSeManha2, alunoSegundaSeManha3, alunoSegundaSeManha4,
            alunoSegundaSeManha5, alunoSegundaSeManha6, alunoSegundaSeManha7, alunoSegundaSeManha8, alunoSegundaSeManha9,
            alunoSegundaSeManha10, alunoSegundaSeManha11, alunoSegundaSeManha12, alunoSegundaSeManha13};

        for (AprovadosMatematica aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

        System.out.println();
    }

    public void mostrarSegundaSerieBManha() {

        System.out.println("\t \t ALUNOS APROVADOS SEGUNDA SÉRIE B MATEMÁTICA \n");

        AprovadosMatematica alunoSegundaSeManha1 = new AprovadosMatematica("Aluno: Segunda série b Nota :", 9.6);
        AprovadosMatematica alunoSegundaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoSegundaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoSegundaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoSegundaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoSegundaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoSegundaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoSegundaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovados = {alunoSegundaSeManha1, alunoSegundaSeManha2, alunoSegundaSeManha3, alunoSegundaSeManha4,
            alunoSegundaSeManha5, alunoSegundaSeManha6, alunoSegundaSeManha7, alunoSegundaSeManha8, alunoSegundaSeManha9,
            alunoSegundaSeManha10, alunoSegundaSeManha11, alunoSegundaSeManha12, alunoSegundaSeManha13};

        for (AprovadosMatematica aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

        System.out.println();
    }

    public void mostrarSegundaSerieCManha() {

        System.out.println("\t \t ALUNOS APROVADOS SEGUNDA SÉRIE C MATEMÁTICA \n");

        AprovadosMatematica alunoSegundaSeManha1 = new AprovadosMatematica("Aluno: Augusto César  Nota :", 9.6);
        AprovadosMatematica alunoSegundaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoSegundaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoSegundaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoSegundaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoSegundaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoSegundaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoSegundaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoSegundaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovados = {alunoSegundaSeManha1, alunoSegundaSeManha2, alunoSegundaSeManha3, alunoSegundaSeManha4,
            alunoSegundaSeManha5, alunoSegundaSeManha6, alunoSegundaSeManha7, alunoSegundaSeManha8, alunoSegundaSeManha9,
            alunoSegundaSeManha10, alunoSegundaSeManha11, alunoSegundaSeManha12, alunoSegundaSeManha13};

        for (AprovadosMatematica aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

        System.out.println();
    }

    //Aprovados matematica SEGUNDA SÉRIE da manhã
    public void mostrarTerceiraSerieAManha() {

        System.out.println("\t \t ALUNOS APROVADOS TERCEIRA SÉRIE A MATEMÁTICA\n");

        AprovadosMatematica alunoTerceiraSeManha1 = new AprovadosMatematica("Aluno: Terceira César  Nota :", 9.6);
        AprovadosMatematica alunoTerceiraSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoTerceiraSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoTerceiraSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoTerceiraSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoTerceiraSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoTerceiraSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoTerceiraSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadoTerceiraSerieManha = {alunoTerceiraSeManha1, alunoTerceiraSeManha2, alunoTerceiraSeManha3, alunoTerceiraSeManha4,
            alunoTerceiraSeManha5, alunoTerceiraSeManha6, alunoTerceiraSeManha7, alunoTerceiraSeManha8, alunoTerceiraSeManha9,
            alunoTerceiraSeManha10, alunoTerceiraSeManha11, alunoTerceiraSeManha12, alunoTerceiraSeManha13};

        for (AprovadosMatematica aprovado : aprovadoTerceiraSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }
        System.out.println();
    }

    public void mostrarTerceiraSerieBManha() {

        System.out.println("\t \t ALUNOS APROVADOS TERCEIRA SÉRIE B MATEMÁTICA\n");

        AprovadosMatematica alunoTerceiraSeManha1 = new AprovadosMatematica("Aluno: Terceira César  Nota :", 9.6);
        AprovadosMatematica alunoTerceiraSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoTerceiraSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoTerceiraSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoTerceiraSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoTerceiraSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoTerceiraSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoTerceiraSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadoTerceiraSerieManha = {alunoTerceiraSeManha1, alunoTerceiraSeManha2, alunoTerceiraSeManha3, alunoTerceiraSeManha4,
            alunoTerceiraSeManha5, alunoTerceiraSeManha6, alunoTerceiraSeManha7, alunoTerceiraSeManha8, alunoTerceiraSeManha9,
            alunoTerceiraSeManha10, alunoTerceiraSeManha11, alunoTerceiraSeManha12, alunoTerceiraSeManha13};

        for (AprovadosMatematica aprovado : aprovadoTerceiraSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }
        System.out.println();
    }

    public void mostrarTerceiraSerieCManha() {

        System.out.println("\t \t ALUNOS APROVADOS TERCEIRA SÉRIE C MATEMÁTICA\n");

        AprovadosMatematica alunoTerceiraSeManha1 = new AprovadosMatematica("Aluno: Terceira César  Nota :", 9.6);
        AprovadosMatematica alunoTerceiraSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoTerceiraSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoTerceiraSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoTerceiraSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoTerceiraSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoTerceiraSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoTerceiraSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoTerceiraSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadoTerceiraSerieManha = {alunoTerceiraSeManha1, alunoTerceiraSeManha2, alunoTerceiraSeManha3, alunoTerceiraSeManha4,
            alunoTerceiraSeManha5, alunoTerceiraSeManha6, alunoTerceiraSeManha7, alunoTerceiraSeManha8, alunoTerceiraSeManha9,
            alunoTerceiraSeManha10, alunoTerceiraSeManha11, alunoTerceiraSeManha12, alunoTerceiraSeManha13};

        for (AprovadosMatematica aprovado : aprovadoTerceiraSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }
        System.out.println();
    }

    public void mostarQuartaSerieAManha() {

        System.out.println("\t \t ALUNOS APROVADOS QUARTA SÉRIE A MATEMÁTICA\n");

        AprovadosMatematica alunoQuartaSeManha1 = new AprovadosMatematica("Aluno: Quarta César  Nota :", 9.6);
        AprovadosMatematica alunoQuartaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoQuartaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoQuartaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoQuartaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoQuartaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoQuartaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoQuartaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadosQuartaSerieManha = {alunoQuartaSeManha1, alunoQuartaSeManha2, alunoQuartaSeManha3, alunoQuartaSeManha4,
            alunoQuartaSeManha5, alunoQuartaSeManha6, alunoQuartaSeManha7, alunoQuartaSeManha8, alunoQuartaSeManha9,
            alunoQuartaSeManha10, alunoQuartaSeManha11, alunoQuartaSeManha12, alunoQuartaSeManha13};

        for (AprovadosMatematica aprovado : aprovadosQuartaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }

        System.out.println();
    }

    public void mostarQuartaSerieBManha() {

        System.out.println("\t \t ALUNOS APROVADOS QUARTA SÉRIE B MATEMÁTICA\n");

        AprovadosMatematica alunoQuartaSeManha1 = new AprovadosMatematica("Aluno: Quarta César  Nota :", 9.6);
        AprovadosMatematica alunoQuartaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoQuartaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoQuartaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoQuartaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoQuartaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoQuartaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoQuartaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadosQuartaSerieManha = {alunoQuartaSeManha1, alunoQuartaSeManha2, alunoQuartaSeManha3, alunoQuartaSeManha4,
            alunoQuartaSeManha5, alunoQuartaSeManha6, alunoQuartaSeManha7, alunoQuartaSeManha8, alunoQuartaSeManha9,
            alunoQuartaSeManha10, alunoQuartaSeManha11, alunoQuartaSeManha12, alunoQuartaSeManha13};

        for (AprovadosMatematica aprovado : aprovadosQuartaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }

        System.out.println();
    }

    public void mostarQuartaSerieCManha() {

        System.out.println("\t \t ALUNOS APROVADOS QUARTA SÉRIE C MATEMÁTICA\n");

        AprovadosMatematica alunoQuartaSeManha1 = new AprovadosMatematica("Aluno: Quarta César  Nota :", 9.6);
        AprovadosMatematica alunoQuartaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoQuartaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoQuartaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoQuartaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoQuartaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoQuartaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoQuartaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadosQuartaSerieManha = {alunoQuartaSeManha1, alunoQuartaSeManha2, alunoQuartaSeManha3, alunoQuartaSeManha4,
            alunoQuartaSeManha5, alunoQuartaSeManha6, alunoQuartaSeManha7, alunoQuartaSeManha8, alunoQuartaSeManha9,
            alunoQuartaSeManha10, alunoQuartaSeManha11, alunoQuartaSeManha12, alunoQuartaSeManha13};

        for (AprovadosMatematica aprovado : aprovadosQuartaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }

        System.out.println();
    }

    public void mostarQuartaSerieDManha() {

        System.out.println("\t \t ALUNOS APROVADOS QUARTA SÉRIE D MATEMÁTICA\n");

        AprovadosMatematica alunoQuartaSeManha1 = new AprovadosMatematica("Aluno: Quarta César  Nota :", 9.6);
        AprovadosMatematica alunoQuartaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoQuartaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoQuartaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoQuartaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoQuartaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoQuartaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoQuartaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoQuartaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadosQuartaSerieManha = {alunoQuartaSeManha1, alunoQuartaSeManha2, alunoQuartaSeManha3, alunoQuartaSeManha4,
            alunoQuartaSeManha5, alunoQuartaSeManha6, alunoQuartaSeManha7, alunoQuartaSeManha8, alunoQuartaSeManha9,
            alunoQuartaSeManha10, alunoQuartaSeManha11, alunoQuartaSeManha12, alunoQuartaSeManha13};

        for (AprovadosMatematica aprovado : aprovadosQuartaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }

        System.out.println();
    }

    public void mostrarQuintaSerieA() {

        System.out.println("\t \t ALUNOS APROVADOS QUINTA SÉRIE A MATEMÁTICA \n");

        AprovadosMatematica alunoQuintaSeManha1 = new AprovadosMatematica("Aluno: Quingunda César  Nota :", 9.6);
        AprovadosMatematica alunoQuintaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoQuintaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoQuintaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoQuintaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoQuintaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoQuintaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoQuintaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadosQuintaSerieManha = {alunoQuintaSeManha1, alunoQuintaSeManha2, alunoQuintaSeManha3, alunoQuintaSeManha4,
            alunoQuintaSeManha5, alunoQuintaSeManha6, alunoQuintaSeManha7, alunoQuintaSeManha8, alunoQuintaSeManha9,
            alunoQuintaSeManha10, alunoQuintaSeManha11, alunoQuintaSeManha12, alunoQuintaSeManha13};

        for (AprovadosMatematica aprovado : aprovadosQuintaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }
        System.out.println();
    }

    public void mostrarQuintaSerieB() {

        System.out.println("\t \t ALUNOS APROVADOS QUINTA SÉRIE B MATEMÁTICA \n");

        AprovadosMatematica alunoQuintaSeManha1 = new AprovadosMatematica("Aluno: Quingunda César  Nota :", 9.6);
        AprovadosMatematica alunoQuintaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoQuintaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoQuintaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoQuintaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoQuintaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoQuintaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoQuintaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadosQuintaSerieManha = {alunoQuintaSeManha1, alunoQuintaSeManha2, alunoQuintaSeManha3, alunoQuintaSeManha4,
            alunoQuintaSeManha5, alunoQuintaSeManha6, alunoQuintaSeManha7, alunoQuintaSeManha8, alunoQuintaSeManha9,
            alunoQuintaSeManha10, alunoQuintaSeManha11, alunoQuintaSeManha12, alunoQuintaSeManha13};

        for (AprovadosMatematica aprovado : aprovadosQuintaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }
        System.out.println();
    }

    public void mostrarQuintaSerieC() {

        System.out.println("\t \t ALUNOS APROVADOS QUINTA SÉRIE C MATEMÁTICA \n");

        AprovadosMatematica alunoQuintaSeManha1 = new AprovadosMatematica("Aluno: Quingunda César  Nota :", 9.6);
        AprovadosMatematica alunoQuintaSeManha2 = new AprovadosMatematica("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha3 = new AprovadosMatematica("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematica alunoQuintaSeManha4 = new AprovadosMatematica("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematica alunoQuintaSeManha5 = new AprovadosMatematica("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha6 = new AprovadosMatematica("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha7 = new AprovadosMatematica("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematica alunoQuintaSeManha8 = new AprovadosMatematica("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematica alunoQuintaSeManha9 = new AprovadosMatematica("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematica alunoQuintaSeManha10 = new AprovadosMatematica("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematica alunoQuintaSeManha11 = new AprovadosMatematica("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha12 = new AprovadosMatematica("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematica alunoQuintaSeManha13 = new AprovadosMatematica("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematica[] aprovadosQuintaSerieManha = {alunoQuintaSeManha1, alunoQuintaSeManha2, alunoQuintaSeManha3, alunoQuintaSeManha4,
            alunoQuintaSeManha5, alunoQuintaSeManha6, alunoQuintaSeManha7, alunoQuintaSeManha8, alunoQuintaSeManha9,
            alunoQuintaSeManha10, alunoQuintaSeManha11, alunoQuintaSeManha12, alunoQuintaSeManha13};

        for (AprovadosMatematica aprovado : aprovadosQuintaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }
        System.out.println();
    }
}

//Aprovados matematica QUARTA QUINTA da manhã

