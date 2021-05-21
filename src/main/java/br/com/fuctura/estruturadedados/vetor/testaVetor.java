package br.com.fuctura.estruturadedados.vetor;

import java.util.Scanner;

public class testaVetor {

    public static void main(String[] args) {

        /*Vetor vetor = new Vetor(5);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");*/
 /*Vetor vetor = new Vetor(2); //tem capacidade apenas para dois
        try {

            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");

        } catch (Exception ex) {

            ex.printStackTrace();
        }*/
        Vetor vetor = new Vetor(3);
        System.out.println(vetor.adiciona("Elemento 1"));
        System.out.println(vetor.adiciona("Elemento 2"));
        System.out.println(vetor.adiciona("Elemento 3"));

    }

}
