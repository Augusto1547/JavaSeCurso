package br.com.javase.poo.aulas.sobrecargaDeMetodos;

class Galinha extends Animal {

    @Override
    public void fazerBarulho() {

        if (tipoDeAnimal.equals("Pedrez")) {

            System.out.println("A galinha pedrez");

        } else if (tipoDeAnimal.equals("Garnize")) {

            System.out.println("Galinha Garnizé");

        }
    }

}
