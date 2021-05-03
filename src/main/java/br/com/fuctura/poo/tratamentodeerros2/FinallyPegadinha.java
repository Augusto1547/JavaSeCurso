package br.com.fuctura.poo.tratamentodeerros2;

public class FinallyPegadinha {

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
//os blocos catch devem seguir a ordem lógica dos erros, também as mais específicas primeiro e as genéricas depois(se tiver)
                System.out.println("Erro ao dividir por zero");
                System.exit(0); //é um comando pra sair do programa ele barra o finally
                //como se eu puchasse o cabo da tomada.

            } catch (Throwable e2) {
//É a super classe de todas as excessões no java mas isso não é uma boa prática

                System.out.println("Ocorreu um erro");

                System.exit(0);

            } finally {
//finally serve para fechar uma conexão com o banco pra não deixar aberta,fechar um arquivo etc

                System.out.println("Executando finally");
            }
        }
    }

}
