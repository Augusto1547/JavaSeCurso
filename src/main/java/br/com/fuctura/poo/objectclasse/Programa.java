package br.com.fuctura.poo.objectclasse;

public class Programa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Roberto Santos", "james@gmail.com");

        //System.out.println(p1);//chamando o toStrig implicitamente
        // System.out.println(p1.toString());//chamando explicitamente
        Pessoa p2 = new Pessoa("Felipe Melo", "negocios.augusto@gmail.com");
        //System.out.println(p2.toString());

        int x = 10;
        int y = 10;

        if (x == y) {

            System.out.println("É igual");

        } else {
            System.out.println("É diferente");
        }System.out.println();
        
         if (p1.equals(p2)) {//dois objetos usando espaços de memória diferentes

            System.out.println("É igual");

        } else {
            System.out.println("É diferente");
        }

    }
}
