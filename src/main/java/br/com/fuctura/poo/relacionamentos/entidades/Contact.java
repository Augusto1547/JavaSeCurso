package br.com.javase.poo.aulas.relacionamentos.entidades;

public class Contact {

    private String nome;
    private Address endereco;
    private Phone[] telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Address getEndereco() {
        return endereco;
    }

    public void setEndereco(Address endereco) {
        this.endereco = endereco;
    }

    public Phone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Phone[] telefones) {
        this.telefones = telefones;
    }

}
