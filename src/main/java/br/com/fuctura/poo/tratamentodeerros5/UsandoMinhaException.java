package br.com.fuctura.poo.tratamentodeerros5;

public class UsandoMinhaException {
//criando minhas próprias exceptions

    public static void main(String[] args) {

        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};//ao dividir 5 / 4
        //não vai dar inteiro
        int[] denom = {2, 0, 4, 8, 0, 2, 4};
        //aqui no denominador nós só temos números pares e os de cima são 
        //impar ao dividi-los também não irá dar número inteiro, através
        //desses dois erros queremos lançar nossas próprias exceptions

        for (int i = 0; i < numeros.length; i++) {

            try {
                //Criando minha exception
                if (numeros[i] % 2 != 0) {

                    throw new DivisaoNaoExata(numeros[i], denom[i]);

                }

                System.out.println(numeros[i] + "/" + denom[i] + " = "
                        + (numeros[i] / denom[i]));

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {

                System.out.println("Aconteceu um erro");
                e.printStackTrace();

            }

        }
    }

}
