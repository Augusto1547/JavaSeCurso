package br.com.fuctura.poo.interfaces;

public class Galinha implements AreaCalculavel {

    public void fazerBarulho() {

        System.out.println("Có, Có");
    }

    @Override
    public double calculaArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
