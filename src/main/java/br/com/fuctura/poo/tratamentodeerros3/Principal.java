package br.com.fuctura.poo.tratamentodeerros3;

public class Principal {

    public static void main(String[] args) {

        int resultado = 0;
        try {

            resultado = (int) Principal.dividir(10, 0);
            System.out.println("Resultado " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Erro de divisão por zero");
            e.printStackTrace();

        }

    }

    public static double dividir(double a, double b) throws ArithmeticException {

        if (b == 0) {

            throw new ArithmeticException("Divisor é um número zero, rever.");
        }

        return a / b;
    }
}
