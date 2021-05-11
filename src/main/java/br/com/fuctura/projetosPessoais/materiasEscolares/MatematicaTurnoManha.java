package br.com.fuctura.projetosPessoais.materiasEscolares;

import br.com.fuctura.projetosPessoais.AprovadosInterfaces.iApprovedMorningA;
import br.com.fuctura.projetosPessoais.aprovados.ListaAprovados;
import br.com.fuctura.projetosPessoais.aprovados.PrimeiraSerieB;
import com.sun.source.tree.BreakTree;
import jdk.nashorn.api.tree.ContinueTree;

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
            
            System.out.println("\t \t ALUNOS APROVADOS PRIMEIRA SÉRIE A MATEMÁTICA \n");
            
            ListaAprovados alunoPrimeiraSeManha1 = new ListaAprovados("Aluno: Augusto César  Nota :", 9.6);
            ListaAprovados alunoPrimeiraSeManha2 = new ListaAprovados("Aluno: Fernando Henrique Cardoso  Nota :", 10);
            ListaAprovados alunoPrimeiraSeManha3 = new ListaAprovados("Aluno: Guilherme Santana Marques  Nota :", 7);
            ListaAprovados alunoPrimeiraSeManha4 = new ListaAprovados("Aluno: Clóvis de Barros Filho  Nota :", 9);
            ListaAprovados alunoPrimeiraSeManha5 = new ListaAprovados("Aluno: Júlio César Brito Marquez  Nota :", 10);
            ListaAprovados alunoPrimeiraSeManha6 = new ListaAprovados("Aluno: Antônio Silveira  Nota :", 10);
            ListaAprovados alunoPrimeiraSeManha7 = new ListaAprovados("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
            ListaAprovados alunoPrimeiraSeManha8 = new ListaAprovados("Aluno: Cassandra Dias Fernandes  Nota :", 8);
            ListaAprovados alunoPrimeiraSeManha9 = new ListaAprovados("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
            ListaAprovados alunoPrimeiraSeManha10 = new ListaAprovados("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
            ListaAprovados alunoPrimeiraSeManha11 = new ListaAprovados("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
            ListaAprovados alunoPrimeiraSeManha12 = new ListaAprovados("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
            ListaAprovados alunoPrimeiraSeManha13 = new ListaAprovados("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);
            
            ListaAprovados[] aprovados = {alunoPrimeiraSeManha1, alunoPrimeiraSeManha2, alunoPrimeiraSeManha3, alunoPrimeiraSeManha4,
                alunoPrimeiraSeManha5, alunoPrimeiraSeManha6, alunoPrimeiraSeManha7, alunoPrimeiraSeManha8, alunoPrimeiraSeManha9,
                alunoPrimeiraSeManha10, alunoPrimeiraSeManha11, alunoPrimeiraSeManha12, alunoPrimeiraSeManha13};
            
            for (ListaAprovados aprovado : aprovados) {
                
                StringBuilder aluAprovados = new StringBuilder();
                System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
                
            }
            
        }
        this.aprovadosTurnoDaManhaPrimeiraSerieB();
        
        System.out.println();
    }
    
    public void aprovadosTurnoDaManhaPrimeiraSerieB() {
        
        PrimeiraSerieB aprovados = new PrimeiraSerieB();
        aprovados.ola();
        
    }

    //Primeira série manhã
    @Override
    public void aprovadosTurnoDaManhaSegundaSerieA() {
        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {
            
            System.out.println("\t \t ALUNOS APROVADOS SEGUNDA SÉRIE A MATEMÁTICA \n");
            
            ListaAprovados alunoSegundaSeManha1 = new ListaAprovados("Aluno: Segunda César  Nota :", 9.6);
            ListaAprovados alunoSegundaSeManha2 = new ListaAprovados("Aluno: Fernando Henrique Cardoso  Nota :", 10);
            ListaAprovados alunoSegundaSeManha3 = new ListaAprovados("Aluno: Guilherme Santana Marques  Nota :", 7);
            ListaAprovados alunoSegundaSeManha4 = new ListaAprovados("Aluno: Clóvis de Barros Filho  Nota :", 9);
            ListaAprovados alunoSegundaSeManha5 = new ListaAprovados("Aluno: Júlio César Brito Marquez  Nota :", 10);
            ListaAprovados alunoSegundaSeManha6 = new ListaAprovados("Aluno: Antônio Silveira  Nota :", 10);
            ListaAprovados alunoSegundaSeManha7 = new ListaAprovados("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
            ListaAprovados alunoSegundaSeManha8 = new ListaAprovados("Aluno: Cassandra Dias Fernandes  Nota :", 8);
            ListaAprovados alunoSegundaSeManha9 = new ListaAprovados("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
            ListaAprovados alunoSegundaSeManha10 = new ListaAprovados("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
            ListaAprovados alunoSegundaSeManha11 = new ListaAprovados("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
            ListaAprovados alunoSegundaSeManha12 = new ListaAprovados("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
            ListaAprovados alunoSegundaSeManha13 = new ListaAprovados("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);
            
            ListaAprovados[] aprovadosSegundaSerieManha = {alunoSegundaSeManha1, alunoSegundaSeManha2, alunoSegundaSeManha3, alunoSegundaSeManha4,
                alunoSegundaSeManha5, alunoSegundaSeManha6, alunoSegundaSeManha7, alunoSegundaSeManha8, alunoSegundaSeManha9,
                alunoSegundaSeManha10, alunoSegundaSeManha11, alunoSegundaSeManha12, alunoSegundaSeManha13};
            
            for (ListaAprovados aprovado : aprovadosSegundaSerieManha) {
                StringBuilder aluAprovados = new StringBuilder();
                System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
            }
            
        }
        
        System.out.println();
    }
    
    @Override
    public void aprovadosTurnoDaManhaTerceiraSerieA() {
        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {
            
            System.out.println("\t \t ALUNOS APROVADOS TERCEIRA SÉRIE A MATEMÁTICA\n");
            
            ListaAprovados alunoTerceiraSeManha1 = new ListaAprovados("Aluno: Terceira César  Nota :", 9.6);
            ListaAprovados alunoTerceiraSeManha2 = new ListaAprovados("Aluno: Fernando Henrique Cardoso  Nota :", 10);
            ListaAprovados alunoTerceiraSeManha3 = new ListaAprovados("Aluno: Guilherme Santana Marques  Nota :", 7);
            ListaAprovados alunoTerceiraSeManha4 = new ListaAprovados("Aluno: Clóvis de Barros Filho  Nota :", 9);
            ListaAprovados alunoTerceiraSeManha5 = new ListaAprovados("Aluno: Júlio César Brito Marquez  Nota :", 10);
            ListaAprovados alunoTerceiraSeManha6 = new ListaAprovados("Aluno: Antônio Silveira  Nota :", 10);
            ListaAprovados alunoTerceiraSeManha7 = new ListaAprovados("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
            ListaAprovados alunoTerceiraSeManha8 = new ListaAprovados("Aluno: Cassandra Dias Fernandes  Nota :", 8);
            ListaAprovados alunoTerceiraSeManha9 = new ListaAprovados("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
            ListaAprovados alunoTerceiraSeManha10 = new ListaAprovados("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
            ListaAprovados alunoTerceiraSeManha11 = new ListaAprovados("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
            ListaAprovados alunoTerceiraSeManha12 = new ListaAprovados("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
            ListaAprovados alunoTerceiraSeManha13 = new ListaAprovados("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);
            
            ListaAprovados[] aprovadoTerceiraSerieManha = {alunoTerceiraSeManha1, alunoTerceiraSeManha2, alunoTerceiraSeManha3, alunoTerceiraSeManha4,
                alunoTerceiraSeManha5, alunoTerceiraSeManha6, alunoTerceiraSeManha7, alunoTerceiraSeManha8, alunoTerceiraSeManha9,
                alunoTerceiraSeManha10, alunoTerceiraSeManha11, alunoTerceiraSeManha12, alunoTerceiraSeManha13};
            
            for (ListaAprovados aprovado : aprovadoTerceiraSerieManha) {
                
                StringBuilder aluAprovados = new StringBuilder();
                System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
            }
            
        }
        
        System.out.println();
    }
    
    @Override
    public void aprovadosTurnoDaManhaQuartaSerieA() {
        
        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {
            
            System.out.println("\t \t ALUNOS APROVADOS QUARTA SÉRIE A MATEMÁTICA\n");
            
            ListaAprovados alunoQuartaSeManha1 = new ListaAprovados("Aluno: Quarta César  Nota :", 9.6);
            ListaAprovados alunoQuartaSeManha2 = new ListaAprovados("Aluno: Fernando Henrique Cardoso  Nota :", 10);
            ListaAprovados alunoQuartaSeManha3 = new ListaAprovados("Aluno: Guilherme Santana Marques  Nota :", 7);
            ListaAprovados alunoQuartaSeManha4 = new ListaAprovados("Aluno: Clóvis de Barros Filho  Nota :", 9);
            ListaAprovados alunoQuartaSeManha5 = new ListaAprovados("Aluno: Júlio César Brito Marquez  Nota :", 10);
            ListaAprovados alunoQuartaSeManha6 = new ListaAprovados("Aluno: Antônio Silveira  Nota :", 10);
            ListaAprovados alunoQuartaSeManha7 = new ListaAprovados("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
            ListaAprovados alunoQuartaSeManha8 = new ListaAprovados("Aluno: Cassandra Dias Fernandes  Nota :", 8);
            ListaAprovados alunoQuartaSeManha9 = new ListaAprovados("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
            ListaAprovados alunoQuartaSeManha10 = new ListaAprovados("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
            ListaAprovados alunoQuartaSeManha11 = new ListaAprovados("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
            ListaAprovados alunoQuartaSeManha12 = new ListaAprovados("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
            ListaAprovados alunoQuartaSeManha13 = new ListaAprovados("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);
            
            ListaAprovados[] aprovadosQuartaSerieManha = {alunoQuartaSeManha1, alunoQuartaSeManha2, alunoQuartaSeManha3, alunoQuartaSeManha4,
                alunoQuartaSeManha5, alunoQuartaSeManha6, alunoQuartaSeManha7, alunoQuartaSeManha8, alunoQuartaSeManha9,
                alunoQuartaSeManha10, alunoQuartaSeManha11, alunoQuartaSeManha12, alunoQuartaSeManha13};
            
            for (ListaAprovados aprovado : aprovadosQuartaSerieManha) {
                
                StringBuilder aluAprovados = new StringBuilder();
                System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
            }
            
        }
        System.out.println();
    }
    
    @Override
    public void aprovadosTurnoDaManhaQuintaSerieA() {
        
        if ((super.nomeDaDisciplina.equals("matemática")
                || super.nomeDaDisciplina.equals("Matemática"))
                && (super.turnoDasProvas.equals("manhã")
                || super.turnoDasProvas.equals("Manhã"))) {
            
            System.out.println("\t \t ALUNOS APROVADOS QUINTA SÉRIE A MATEMÁTICA \n");
            
            ListaAprovados alunoQuintaSeManha1 = new ListaAprovados("Aluno: Quingunda César  Nota :", 9.6);
            ListaAprovados alunoQuintaSeManha2 = new ListaAprovados("Aluno: Fernando Henrique Cardoso  Nota :", 10);
            ListaAprovados alunoQuintaSeManha3 = new ListaAprovados("Aluno: Guilherme Santana Marques  Nota :", 7);
            ListaAprovados alunoQuintaSeManha4 = new ListaAprovados("Aluno: Clóvis de Barros Filho  Nota :", 9);
            ListaAprovados alunoQuintaSeManha5 = new ListaAprovados("Aluno: Júlio César Brito Marquez  Nota :", 10);
            ListaAprovados alunoQuintaSeManha6 = new ListaAprovados("Aluno: Antônio Silveira  Nota :", 10);
            ListaAprovados alunoQuintaSeManha7 = new ListaAprovados("Aluno: Gustavo Borgis Pereira  Nota :", 9.6);
            ListaAprovados alunoQuintaSeManha8 = new ListaAprovados("Aluno: Cassandra Dias Fernandes  Nota :", 8);
            ListaAprovados alunoQuintaSeManha9 = new ListaAprovados("Aluno: Maria Cavalcanti Silvânia  Nota :", 6.6);
            ListaAprovados alunoQuintaSeManha10 = new ListaAprovados("Aluno: Juliete Atriz Guimarães Rocha  Nota :", 8);
            ListaAprovados alunoQuintaSeManha11 = new ListaAprovados("Aluno: Gutembergue Dias Morais Vasconcelos  Nota :", 10);
            ListaAprovados alunoQuintaSeManha12 = new ListaAprovados("Aluno: Juliano Pedrosa Richardes Amaranto  Nota :", 10);
            ListaAprovados alunoQuintaSeManha13 = new ListaAprovados("Aluno: Júlio Ferreira Pedrosa Souza  Nota :", 9.6);
            
            ListaAprovados[] aprovadosQuintaSerieManha = {alunoQuintaSeManha1, alunoQuintaSeManha2, alunoQuintaSeManha3, alunoQuintaSeManha4,
                alunoQuintaSeManha5, alunoQuintaSeManha6, alunoQuintaSeManha7, alunoQuintaSeManha8, alunoQuintaSeManha9,
                alunoQuintaSeManha10, alunoQuintaSeManha11, alunoQuintaSeManha12, alunoQuintaSeManha13};
            
            for (ListaAprovados aprovado : aprovadosQuintaSerieManha) {
                
                StringBuilder aluAprovados = new StringBuilder();
                System.out.println(aluAprovados.append(aprovado.nomeAluno).append(aprovado.nota));
                
            }
            
        } else {
            
            System.out.println("Matéria ou turno foi digitado errado.");
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
    
    public void mostrarAprovadosManhaSalaB() {
        
        this.aprovadosTurnoDaManhaPrimeiraSerieB();
        
    }
    
}
