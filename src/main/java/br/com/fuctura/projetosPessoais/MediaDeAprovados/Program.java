package br.com.fuctura.projetosPessoais.MediaDeAprovados;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        try {

            Scanner recebe = new Scanner(System.in, "ISO-8859-1");

            System.out.println("Informe a matéria");
            String disciplina = recebe.nextLine();

            System.out.println("Informe o turno");
            String turno = recebe.nextLine();

            System.out.println();
            
            Mathematics priSerieManha = new Mathematics(disciplina, turno);

            priSerieManha.mostrarAprovadosTurnoManha();

        } catch (Exception erro) {

            System.out.println("Tipo de erro : " + erro);
        }
    }

}
