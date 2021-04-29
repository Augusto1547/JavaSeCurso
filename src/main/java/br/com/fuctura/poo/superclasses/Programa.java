package br.com.javase.poo.aulas.superclasses;

public class Programa {

    public static void main(String[] args) {

        Cachorro pitbull = new Cachorro("Pitbull", 10);

        System.out.println(pitbull.getRaca());
        System.out.println(pitbull.getIdade());
        pitbull.verificarAcesso();

        Cachorro dobman = new Cachorro("Dobman", 12);
        System.out.println(dobman.getRaca());
        System.out.println(dobman.getIdade());
        dobman.verificarAcesso();

        Gato felix = new Gato("Felix", 1);

        System.out.println(felix.getRaca());
        System.out.println(felix.getIdade());

    }

}
