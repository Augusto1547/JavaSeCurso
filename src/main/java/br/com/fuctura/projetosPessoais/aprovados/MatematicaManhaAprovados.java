package br.com.fuctura.projetosPessoais.aprovados;

import br.com.fuctura.projetosPessoais.AprovadosInterfaces.iApprovedMorningA;

public class MatematicaManhaAprovados extends Disciplina implements iApprovedMorningA {

    public MatematicaManhaAprovados(String nomeDaDisciplina, String turnoDasProvas, String serieDosAlunos) {
        super(nomeDaDisciplina, turnoDasProvas, serieDosAlunos);
    }

    public MatematicaManhaAprovados(String nomeDaDisciplina, String turnoDasProvas, String serieDosAlunos, AlunosAprovados alunosAprovados) {
        super(nomeDaDisciplina, turnoDasProvas, serieDosAlunos, alunosAprovados);
    }

    @Override
    public void aprovadosTurnoDaManhaPrimeiraSerie() {

        MatematicaManhaAprovados manhab = new MatematicaManhaAprovados("matemática", "tarde", "sexta");
        System.out.println(manhab.nomeDaDisciplina);

        MatematicaManhaAprovados manhac = new MatematicaManhaAprovados("matemática", "manha", "quinta", new AlunosAprovados("josé", 8.6));
        System.out.println(manhac.alunosAprovados.nota);
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
    public void mostrarAprovadosManha() {

        this.aprovadosTurnoDaManhaPrimeiraSerie();
    }

}
