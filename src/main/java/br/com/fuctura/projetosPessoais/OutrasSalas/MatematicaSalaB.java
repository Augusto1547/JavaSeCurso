package br.com.fuctura.projetosPessoais.OutrasSalas;

public class MatematicaSalaB {

    String nomeAluno;
    double nota;

    public MatematicaSalaB(String nomeAluno, double nota) {
        this.nomeAluno = nomeAluno;
        this.nota = nota;
    }

    public static void aprovadosTurnoDaManhaPrimeiraSerieB() {

        MatematicaSalaB oi = new MatematicaSalaB("João", 10);
        System.out.println(oi.nomeAluno);
        System.out.println(oi.nota);
        

    }
    
    

}
