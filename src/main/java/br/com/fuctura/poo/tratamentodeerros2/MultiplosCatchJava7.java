package br.com.fuctura.poo.tratamentodeerros2;

public class MultiplosCatchJava7 {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            //blocos try só pode ter um, mas você pode telos aninhados
            try {
                System.out.println(numeros[i] + "/" + demon[i] + " = "
                        + (numeros[i] / demon[i]));

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//Por ser da mesma família apartir do java7 fica numa única linha

                System.out.println("Aconteceu um erro");

            }
        }
    }

}
