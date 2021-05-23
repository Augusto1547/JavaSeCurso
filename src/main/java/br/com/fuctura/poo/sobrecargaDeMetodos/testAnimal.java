package br.com.fuctura.poo.sobrecargaDeMetodos;

    class testAnimal {

    static void barulho(Animal animal) {

        animal.fazerBarulho();
    }

    static void main(String[] args) {

        Galinha galinha = new Galinha();

        galinha.setTipoDeAnimal("Garnize");

        barulho(galinha);

        Cao cachorro = new Cao();
        
        cachorro.setTipoDeAnimal("Pitbull");

        barulho(cachorro);

    }
}
