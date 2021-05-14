package br.com.fuctura.extras;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa[] = new Pessoa[2];
        pessoa[0] = new Pessoa("João", 2);
        pessoa[1] = new Pessoa("Carlos", 33);

        System.out.println("Nome : " + pessoa[0].getNome() + " Idade : " + pessoa[0].getIdade());
        System.out.println("Nome : " + pessoa[1].getNome() + " Idade : " + pessoa[1].getIdade());

    }
}
