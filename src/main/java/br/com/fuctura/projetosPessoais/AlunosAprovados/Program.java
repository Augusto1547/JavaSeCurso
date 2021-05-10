package br.com.fuctura.projetosPessoais.AlunosAprovados;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner recebe = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Informe a matéria");
        String disciplina = recebe.nextLine();

        System.out.println("Informe o turno");
        String turno = recebe.nextLine();

        System.out.println();

        MatematicaTurnoManha aprovadosManha = new MatematicaTurnoManha(disciplina, turno);
        aprovadosManha.mostrarAprovadosManhaSalaA();
        
        Disciplina a = new Portuguese(disciplina, turno);
        
    }

}
