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
    }
}
