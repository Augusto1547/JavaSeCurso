package br.com.fuctura.poo.tratamentodeerros2;

public class MultiplosCatch {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            //blocos try só pode ter um, mas você pode telos aninhados
            try {
                System.out.println(numeros[i] + "/" + demon[i] + " = "
                        + (numeros[i] / demon[i]));
            } //          você pode ter quantos blocos catch for necessários até mesmo aninhados
            catch (ArithmeticException e1) {

                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e2) {

                System.out.println("Posição do array inválida");

            } catch (Exception ex) {

//Excessão genérica: agora está protegido de alguns erros que agente não sabe que existem
            }
        }

    }

}
