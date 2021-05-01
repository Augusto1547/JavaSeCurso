package br.com.fuctura.poo.tratamentodeerros1;

public class Excecao {

    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exceção");

            vetor[4] = 22;

            System.out.println("Esse texto não irá gerar texto");

        } catch (ArrayIndexOutOfBoundsException erro) {

            System.out.println("Excessão ao acessar o índice de um vetor que não existe");

        }

        System.out.println("Este texto será exibito após a exception");

    }

}
