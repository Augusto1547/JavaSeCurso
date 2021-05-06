package br.com.fuctura.projetosPessoais.SalasB;

import java.util.Scanner;

public abstract class SalaBTurnoManha {

    public static void main(String[] args) {

        Scanner recebe = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Informe Aluno e nota um");
        String nomeAluno = recebe.nextLine();
        double notaAluno = recebe.nextDouble();

        String[] aluno1 = {nomeAluno};
        double[] nota1 = {notaAluno};

        try {
            System.out.println("Informe Aluno e nota dois");
            String nomeAluno2 = recebe.nextLine();
            double notaAluno2 = recebe.nextDouble();

            String[] aluno2 = {nomeAluno2};
            double[] nota2 = {notaAluno2};
            recebe.close();

            System.out.println("oi porra");
            
        } catch (Exception e) {
            
            throw new Exception "caralho tudo errado porra";
        }
    }

    public abstract void porra();
}
