package br.com.fuctura.poo.tratamentodeerros3;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Entre com um número decimal");
        try {

            double num = leNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception ex) {

            System.out.println("Entrada inválida");
            ex.printStackTrace();
//printStrackTrace(); é usado para os programadores mas os usuários não podem ver a mensagem de erro
        }
    }

    public static double leNumero() throws Exception {

        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }

}
