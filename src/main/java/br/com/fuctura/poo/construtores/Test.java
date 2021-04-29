package br.com.javase.poo.aulas.construtores;

public class Test {

    public static void main(String[] args) {

        Aluno superior = new Aluno();

        superior.nome = "Felipe Santos";
        superior.idade = 23;
        superior.sexo = "Masculino";

        System.out.println("Nome : " + superior.nome);
        System.out.println("Idade : " + superior.idade);
        System.out.println("Sexo " + superior.sexo);

        try {

            Aluno medio = new Aluno("Augusto", 35, "Masculino");

            System.out.println("Nome : " + medio.nome);
            System.out.println("Idade : " + medio.idade);
            System.out.println("Sexo " + medio.sexo);

        } catch (Exception erro) {

            System.out.println("tipo de erro : " + erro);
        }
    }

}
