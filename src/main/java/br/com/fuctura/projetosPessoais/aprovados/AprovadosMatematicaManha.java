package br.com.fuctura.projetosPessoais.aprovados;

public class AprovadosMatematicaManha {

    public String nomeAluno;
    public double nota;

    public AprovadosMatematicaManha(String nomeAluno, double nota) {
        this.nomeAluno = nomeAluno;
        this.nota = nota;
    }

    public void mostrarPrimeiraSerieAManha() {

        System.out.println("\t \t ALUNOS APROVADOS PRIMEIRA SÉRIE A  \n");

        AprovadosMatematicaManha alunoPrimeiraSeManha1 = new AprovadosMatematicaManha("Aluno: Augusto César  Nota :", 9.6);
        AprovadosMatematicaManha alunoPrimeiraSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoPrimeiraSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoPrimeiraSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoPrimeiraSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoPrimeiraSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoPrimeiraSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoPrimeiraSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovados = {alunoPrimeiraSeManha1, alunoPrimeiraSeManha2, alunoPrimeiraSeManha3, alunoPrimeiraSeManha4,
            alunoPrimeiraSeManha5, alunoPrimeiraSeManha6, alunoPrimeiraSeManha7, alunoPrimeiraSeManha8, alunoPrimeiraSeManha9,
            alunoPrimeiraSeManha10, alunoPrimeiraSeManha11, alunoPrimeiraSeManha12, alunoPrimeiraSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

        System.out.println();
    }

    public void mostrarPrimeiraSerieBManha() {

        System.out.println("\t \t ALUNOS APROVADOS PRIMEIRA SÉRIE B  \n");

        AprovadosMatematicaManha alunoPrimeiraSeManha1 = new AprovadosMatematicaManha("Aluno: Primeira série B :", 9.6);
        AprovadosMatematicaManha alunoPrimeiraSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoPrimeiraSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoPrimeiraSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoPrimeiraSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoPrimeiraSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoPrimeiraSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoPrimeiraSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovados = {alunoPrimeiraSeManha1, alunoPrimeiraSeManha2, alunoPrimeiraSeManha3, alunoPrimeiraSeManha4,
            alunoPrimeiraSeManha5, alunoPrimeiraSeManha6, alunoPrimeiraSeManha7, alunoPrimeiraSeManha8, alunoPrimeiraSeManha9,
            alunoPrimeiraSeManha10, alunoPrimeiraSeManha11, alunoPrimeiraSeManha12, alunoPrimeiraSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }
        System.out.println();
    }

    public void mostrarPrimeiraSerieCManha() {

        System.out.println("\t \t ALUNOS APROVADOS PRIMEIRA SÉRIE C  \n");

        AprovadosMatematicaManha alunoPrimeiraSeManha1 = new AprovadosMatematicaManha("Aluno: Primeira série c :", 7);
        AprovadosMatematicaManha alunoPrimeiraSeManha2 = new AprovadosMatematicaManha("Aluno: Osvaldo César  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoPrimeiraSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoPrimeiraSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoPrimeiraSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);

        AprovadosMatematicaManha[] aprovados = {alunoPrimeiraSeManha1, alunoPrimeiraSeManha2, alunoPrimeiraSeManha3, alunoPrimeiraSeManha4,
            alunoPrimeiraSeManha5, alunoPrimeiraSeManha6};

        for (AprovadosMatematicaManha aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

    }
    //Aprovados matematica PRIMEIRA SÉRIE 

    public void mostrarSegundaSerieAManha() {

        System.out.println("\t \t ALUNOS APROVADOS SEGUNDA SÉRIE A  \n");

        AprovadosMatematicaManha alunoSegundaSeManha1 = new AprovadosMatematicaManha("Aluno: Augusto César  Nota :", 9.6);
        AprovadosMatematicaManha alunoSegundaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoSegundaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoSegundaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoSegundaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoSegundaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoSegundaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoSegundaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovados = {alunoSegundaSeManha1, alunoSegundaSeManha2, alunoSegundaSeManha3, alunoSegundaSeManha4,
            alunoSegundaSeManha5, alunoSegundaSeManha6, alunoSegundaSeManha7, alunoSegundaSeManha8, alunoSegundaSeManha9,
            alunoSegundaSeManha10, alunoSegundaSeManha11, alunoSegundaSeManha12, alunoSegundaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

        System.out.println();
    }

    public void mostrarSegundaSerieBManha() {

        System.out.println("\t \t ALUNOS APROVADOS SEGUNDA SÉRIE B  \n");

        AprovadosMatematicaManha alunoSegundaSeManha1 = new AprovadosMatematicaManha("Aluno: Segunda série b Nota :", 9.6);
        AprovadosMatematicaManha alunoSegundaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoSegundaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoSegundaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoSegundaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoSegundaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoSegundaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoSegundaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovados = {alunoSegundaSeManha1, alunoSegundaSeManha2, alunoSegundaSeManha3, alunoSegundaSeManha4,
            alunoSegundaSeManha5, alunoSegundaSeManha6, alunoSegundaSeManha7, alunoSegundaSeManha8, alunoSegundaSeManha9,
            alunoSegundaSeManha10, alunoSegundaSeManha11, alunoSegundaSeManha12, alunoSegundaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

        System.out.println();
    }

    public void mostrarSegundaSerieCManha() {

        System.out.println("\t \t ALUNOS APROVADOS SEGUNDA SÉRIE C  \n");

        AprovadosMatematicaManha alunoSegundaSeManha1 = new AprovadosMatematicaManha("Aluno: Augusto César  Nota :", 9.6);
        AprovadosMatematicaManha alunoSegundaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoSegundaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoSegundaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoSegundaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoSegundaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoSegundaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoSegundaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoSegundaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovados = {alunoSegundaSeManha1, alunoSegundaSeManha2, alunoSegundaSeManha3, alunoSegundaSeManha4,
            alunoSegundaSeManha5, alunoSegundaSeManha6, alunoSegundaSeManha7, alunoSegundaSeManha8, alunoSegundaSeManha9,
            alunoSegundaSeManha10, alunoSegundaSeManha11, alunoSegundaSeManha12, alunoSegundaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovados) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }

        System.out.println();
    }
    //Aprovados matemática SEGUNDA SÉRIE 

    public void mostrarTerceiraSerieAManha() {

        System.out.println("\t \t ALUNOS APROVADOS TERCEIRA SÉRIE A \n");

        AprovadosMatematicaManha alunoTerceiraSeManha1 = new AprovadosMatematicaManha("Aluno: Terceira César  Nota :", 9.6);
        AprovadosMatematicaManha alunoTerceiraSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoTerceiraSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoTerceiraSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoTerceiraSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoTerceiraSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoTerceiraSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoTerceiraSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadoTerceiraSerieManha = {alunoTerceiraSeManha1, alunoTerceiraSeManha2, alunoTerceiraSeManha3, alunoTerceiraSeManha4,
            alunoTerceiraSeManha5, alunoTerceiraSeManha6, alunoTerceiraSeManha7, alunoTerceiraSeManha8, alunoTerceiraSeManha9,
            alunoTerceiraSeManha10, alunoTerceiraSeManha11, alunoTerceiraSeManha12, alunoTerceiraSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadoTerceiraSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }
        System.out.println();
    }

    public void mostrarTerceiraSerieBManha() {

        System.out.println("\t \t ALUNOS APROVADOS TERCEIRA SÉRIE B \n");

        AprovadosMatematicaManha alunoTerceiraSeManha1 = new AprovadosMatematicaManha("Aluno: Terceira César  Nota :", 9.6);
        AprovadosMatematicaManha alunoTerceiraSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoTerceiraSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoTerceiraSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoTerceiraSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoTerceiraSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoTerceiraSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoTerceiraSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadoTerceiraSerieManha = {alunoTerceiraSeManha1, alunoTerceiraSeManha2, alunoTerceiraSeManha3, alunoTerceiraSeManha4,
            alunoTerceiraSeManha5, alunoTerceiraSeManha6, alunoTerceiraSeManha7, alunoTerceiraSeManha8, alunoTerceiraSeManha9,
            alunoTerceiraSeManha10, alunoTerceiraSeManha11, alunoTerceiraSeManha12, alunoTerceiraSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadoTerceiraSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }
        System.out.println();
    }

    public void mostrarTerceiraSerieCManha() {

        System.out.println("\t \t ALUNOS APROVADOS TERCEIRA SÉRIE C \n");

        AprovadosMatematicaManha alunoTerceiraSeManha1 = new AprovadosMatematicaManha("Aluno: Terceira César  Nota :", 9.6);
        AprovadosMatematicaManha alunoTerceiraSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoTerceiraSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoTerceiraSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoTerceiraSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoTerceiraSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoTerceiraSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoTerceiraSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoTerceiraSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadoTerceiraSerieManha = {alunoTerceiraSeManha1, alunoTerceiraSeManha2, alunoTerceiraSeManha3, alunoTerceiraSeManha4,
            alunoTerceiraSeManha5, alunoTerceiraSeManha6, alunoTerceiraSeManha7, alunoTerceiraSeManha8, alunoTerceiraSeManha9,
            alunoTerceiraSeManha10, alunoTerceiraSeManha11, alunoTerceiraSeManha12, alunoTerceiraSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadoTerceiraSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }
        System.out.println();
    }
    //Aprovados matemática TERCEIRA SÉRIE

    public void mostarQuartaSerieAManha() {

        System.out.println("\t \t ALUNOS APROVADOS QUARTA SÉRIE A \n");

        AprovadosMatematicaManha alunoQuartaSeManha1 = new AprovadosMatematicaManha("Aluno: Quarta César  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuartaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoQuartaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoQuartaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuartaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoQuartaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoQuartaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoQuartaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadosQuartaSerieManha = {alunoQuartaSeManha1, alunoQuartaSeManha2, alunoQuartaSeManha3, alunoQuartaSeManha4,
            alunoQuartaSeManha5, alunoQuartaSeManha6, alunoQuartaSeManha7, alunoQuartaSeManha8, alunoQuartaSeManha9,
            alunoQuartaSeManha10, alunoQuartaSeManha11, alunoQuartaSeManha12, alunoQuartaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadosQuartaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }

        System.out.println();
    }

    public void mostarQuartaSerieBManha() {

        System.out.println("\t \t ALUNOS APROVADOS QUARTA SÉRIE B \n");

        AprovadosMatematicaManha alunoQuartaSeManha1 = new AprovadosMatematicaManha("Aluno: Quarta César  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuartaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoQuartaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoQuartaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuartaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoQuartaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoQuartaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoQuartaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadosQuartaSerieManha = {alunoQuartaSeManha1, alunoQuartaSeManha2, alunoQuartaSeManha3, alunoQuartaSeManha4,
            alunoQuartaSeManha5, alunoQuartaSeManha6, alunoQuartaSeManha7, alunoQuartaSeManha8, alunoQuartaSeManha9,
            alunoQuartaSeManha10, alunoQuartaSeManha11, alunoQuartaSeManha12, alunoQuartaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadosQuartaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }

        System.out.println();
    }

    public void mostarQuartaSerieCManha() {

        System.out.println("\t \t ALUNOS APROVADOS QUARTA SÉRIE C \n");

        AprovadosMatematicaManha alunoQuartaSeManha1 = new AprovadosMatematicaManha("Aluno: Quarta César  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuartaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoQuartaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoQuartaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuartaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoQuartaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoQuartaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoQuartaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadosQuartaSerieManha = {alunoQuartaSeManha1, alunoQuartaSeManha2, alunoQuartaSeManha3, alunoQuartaSeManha4,
            alunoQuartaSeManha5, alunoQuartaSeManha6, alunoQuartaSeManha7, alunoQuartaSeManha8, alunoQuartaSeManha9,
            alunoQuartaSeManha10, alunoQuartaSeManha11, alunoQuartaSeManha12, alunoQuartaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadosQuartaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }

        System.out.println();
    }

    public void mostarQuartaSerieDManha() {

        System.out.println("\t \t ALUNOS APROVADOS QUARTA SÉRIE D \n");

        AprovadosMatematicaManha alunoQuartaSeManha1 = new AprovadosMatematicaManha("Aluno: Quarta César  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuartaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoQuartaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoQuartaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuartaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoQuartaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoQuartaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoQuartaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoQuartaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadosQuartaSerieManha = {alunoQuartaSeManha1, alunoQuartaSeManha2, alunoQuartaSeManha3, alunoQuartaSeManha4,
            alunoQuartaSeManha5, alunoQuartaSeManha6, alunoQuartaSeManha7, alunoQuartaSeManha8, alunoQuartaSeManha9,
            alunoQuartaSeManha10, alunoQuartaSeManha11, alunoQuartaSeManha12, alunoQuartaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadosQuartaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
        }

        System.out.println();
    }
    //Aprovados matemática QUARTA SÉRIE

    public void mostrarQuintaSerieA() {

        System.out.println("\t \t ALUNOS APROVADOS QUINTA SÉRIE A  \n");

        AprovadosMatematicaManha alunoQuintaSeManha1 = new AprovadosMatematicaManha("Aluno: Quingunda César  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuintaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoQuintaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoQuintaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuintaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoQuintaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoQuintaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoQuintaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadosQuintaSerieManha = {alunoQuintaSeManha1, alunoQuintaSeManha2, alunoQuintaSeManha3, alunoQuintaSeManha4,
            alunoQuintaSeManha5, alunoQuintaSeManha6, alunoQuintaSeManha7, alunoQuintaSeManha8, alunoQuintaSeManha9,
            alunoQuintaSeManha10, alunoQuintaSeManha11, alunoQuintaSeManha12, alunoQuintaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadosQuintaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }
        System.out.println();
    }

    public void mostrarQuintaSerieB() {

        System.out.println("\t \t ALUNOS APROVADOS QUINTA SÉRIE B  \n");

        AprovadosMatematicaManha alunoQuintaSeManha1 = new AprovadosMatematicaManha("Aluno: Quingunda César  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuintaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoQuintaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoQuintaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuintaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoQuintaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoQuintaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoQuintaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadosQuintaSerieManha = {alunoQuintaSeManha1, alunoQuintaSeManha2, alunoQuintaSeManha3, alunoQuintaSeManha4,
            alunoQuintaSeManha5, alunoQuintaSeManha6, alunoQuintaSeManha7, alunoQuintaSeManha8, alunoQuintaSeManha9,
            alunoQuintaSeManha10, alunoQuintaSeManha11, alunoQuintaSeManha12, alunoQuintaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadosQuintaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }
        System.out.println();
    }

    public void mostrarQuintaSerieC() {

        System.out.println("\t \t ALUNOS APROVADOS QUINTA SÉRIE C  \n");

        AprovadosMatematicaManha alunoQuintaSeManha1 = new AprovadosMatematicaManha("Aluno: Quingunda César  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuintaSeManha2 = new AprovadosMatematicaManha("Aluno: Fernando Henrique Cardoso  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha3 = new AprovadosMatematicaManha("Aluno: Guilherme Santana Marques  Nota :", 7);
        AprovadosMatematicaManha alunoQuintaSeManha4 = new AprovadosMatematicaManha("Aluno: Clóvis de Barros Filho  Nota :", 9);
        AprovadosMatematicaManha alunoQuintaSeManha5 = new AprovadosMatematicaManha("Aluno: Júlio César Brito Marquez  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha6 = new AprovadosMatematicaManha("Aluno: Antônio Silveira  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha7 = new AprovadosMatematicaManha("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
        AprovadosMatematicaManha alunoQuintaSeManha8 = new AprovadosMatematicaManha("Aluno: Cassandra Dias Fernandes  Nota :", 8);
        AprovadosMatematicaManha alunoQuintaSeManha9 = new AprovadosMatematicaManha("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
        AprovadosMatematicaManha alunoQuintaSeManha10 = new AprovadosMatematicaManha("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
        AprovadosMatematicaManha alunoQuintaSeManha11 = new AprovadosMatematicaManha("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha12 = new AprovadosMatematicaManha("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
        AprovadosMatematicaManha alunoQuintaSeManha13 = new AprovadosMatematicaManha("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);

        AprovadosMatematicaManha[] aprovadosQuintaSerieManha = {alunoQuintaSeManha1, alunoQuintaSeManha2, alunoQuintaSeManha3, alunoQuintaSeManha4,
            alunoQuintaSeManha5, alunoQuintaSeManha6, alunoQuintaSeManha7, alunoQuintaSeManha8, alunoQuintaSeManha9,
            alunoQuintaSeManha10, alunoQuintaSeManha11, alunoQuintaSeManha12, alunoQuintaSeManha13};

        for (AprovadosMatematicaManha aprovado : aprovadosQuintaSerieManha) {

            StringBuilder aluAprovados = new StringBuilder();
            System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));

        }
        System.out.println();
    }
}
//Aprovados matematica QUARTA QUINTA 

