package br.com.fuctura.projetosPessoais.AlunosAprovados;

import br.com.fuctura.projetosPessoais.AprovadosInterfaces.*;

public class Portuguese extends Disciplina implements iApprovedMorningB, iApprovedMorningA{

    public Portuguese(String nomeDaDisciplina, String turnoDasProvas) {
        super(nomeDaDisciplina, turnoDasProvas);
    }

    @Override
    public void aprovadosTurnoDaManhaPrimeiraSerieB() {
        System.out.println("vai tomar no cu");
    }

    @Override
    public void mostrarAprovadosManhaSalaB() {

        this.aprovadosTurnoDaManhaPrimeiraSerieB();

    }

    @Override
    public void aprovadosTurnoDaManhaPrimeiraSerieA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aprovadosTurnoDaManhaSegundaSerieA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aprovadosTurnoDaManhaTerceiraSerieA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aprovadosTurnoDaManhaQuartaSerieA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aprovadosTurnoDaManhaQuintaSerieA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarAprovadosManhaSalaA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
