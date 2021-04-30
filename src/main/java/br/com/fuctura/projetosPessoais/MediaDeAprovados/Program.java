package br.com.fuctura.projetosPessoais.MediaDeAprovados;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Scanner recebe = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Informe a matéria");
        String nome = recebe.nextLine();

        System.out.println("Informe o turno");
        String turno = recebe.nextLine();

        System.out.println("Informe à série");
        String serie = recebe.nextLine();
        
        System.out.println();

        Mathematics matematicaManha = new Mathematics(nome, turno, serie);

    }

}
