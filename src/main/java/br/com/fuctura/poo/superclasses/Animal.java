package br.com.fuctura.poo.superclasses;

public abstract class Animal {

    protected String raca;
    protected int idade;
    protected String cor;
    double tamanho;
    protected String dono;

    public Animal() {

    }

    public Animal(String raca, int idade) {
        this.raca = raca;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
