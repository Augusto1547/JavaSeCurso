package br.com.javase.poo.aulas.sobrecargaDeMetodos;
//conversão implícita e conversão explícita 

public class Matematica {

    public double media(int x) {

        System.out.println("media(int x)");
        return x;
    }

    public double media(int x, int y) {

        System.out.println("media(int x, int y)");
        return (x + y) / 2;

    }

    public double media(double... numeros) {

        System.out.println("media(int ... numeros)");
        return this.soma(numeros) / numeros.length;

    }

    public double media(String x, String y) {

        System.out.println("media(String x, String y)");
        int ix = Integer.parseInt(x);
        int iy = Integer.parseInt(y);

        return (ix + iy) / 2;

    }

    private double soma(double... numeros) {

        double total = 0;
        
        for (double n : numeros) {

            total += n;

        }
        return total;
    }

}
