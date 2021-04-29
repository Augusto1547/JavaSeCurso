package br.com.javase.poo.aulas.recursividade;

public class Recursividade {

    public static int soma(int x) {

        if (x == 0) {

            return x;

        } else {

            System.out.println(x);
            return x + soma(x - 1);
        }
    }

    public static int potencia(int x, int e) {

        if (e == 1) {

            return x;

        } else {

            System.out.println(e);
            return x * potencia(x, e - 1);

        }
    }

    public static void main(String[] args) {

        System.out.println("soma recursiva " + Recursividade.soma(10));
        System.out.println("Potenciação recursiva " + Recursividade.potencia(3, 4));

    }

}
