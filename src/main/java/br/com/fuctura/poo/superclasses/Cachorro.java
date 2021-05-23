package br.com.fuctura.poo.superclasses;

public class Cachorro extends Animal {

    public Cachorro(String raca, int idade) {
        super(raca, idade);

    }

    public void verificarAcesso(){
        System.out.println(super.cor = "Pelo : Preto");
        System.out.println(this.tamanho = 0.58);
        System.out.println();
    }
}
