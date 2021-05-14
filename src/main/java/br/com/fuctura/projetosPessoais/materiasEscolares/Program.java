package br.com.fuctura.projetosPessoais.materiasEscolares;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner recebe = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Informe à matéria");
        String disciplina = recebe.nextLine();

        System.out.println("Informe o turno");
        String turno = recebe.nextLine();

        System.out.println("Informe uma série(primeira séria ao terceiro ano");
        String serie = recebe.nextLine();
        recebe.close();

        System.out.println();

        MatematicaTurnoManha mostrarPrimeiraSerieAManha = new MatematicaTurnoManha(disciplina, turno, serie);
        mostrarPrimeiraSerieAManha.mostrarAprovadosManha();

    }

}
