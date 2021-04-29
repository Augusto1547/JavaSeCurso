package br.com.javase.poo.aulas.relacionamentos.entidades;

public class Programa {

    public static void main(String[] args) {

        try {
            Funcionario john = new Funcionario("Jhon Silva Markes", 1200.00);
            john.showEmployee();

            Address addressJhon = new Address("Rua 70", "360", "Maranguape II", "Paulista", "Barraca de Ivonete");

            Address[] endereco = new Address[1];
            endereco[0] = addressJhon;

            if (john != null && john.getEnderecos() != null) {

                for (Address e : endereco) {

                }

                john.setEnderecos(endereco);
            }

        } catch (Exception erro) {

            System.out.println(erro);

        } finally {

            System.out.println("Fim dessa porra caralho!");
        }
    }

}
