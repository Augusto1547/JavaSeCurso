package br.com.fuctura.poo.relacionamentos.entidades;

public class Funcionario {

    private String nome;
    private double salario;
    private Address[] enderecos;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Address[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Address[] enderecos) {
        this.enderecos = enderecos;
    }

    public void showEmployee() {

        System.out.println("Employee : " + nome);
        System.out.println("Wage : " + salario);

    }

}
