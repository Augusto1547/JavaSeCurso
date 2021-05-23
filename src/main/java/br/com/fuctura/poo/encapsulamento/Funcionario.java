package br.com.fuctura.poo.encapsulamento;

public class Funcionario {
    //pergunta: a variavel nome pode ser acessada e alterada por qualquer um?
    //ela tem algum tipo de limite?

    String nome;
    int idade;
    private double salario;

    public double getSalario() {

        return this.salario;
    }

    public void setSalario(double salario) {

        if (salario != 100.00 && salario > 100.00) {

            this.salario = salario;

        } else {

            System.out.println("Essa porra é um salário de fome");
        }

    }
     

}
