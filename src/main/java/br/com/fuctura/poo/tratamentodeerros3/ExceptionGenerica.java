package br.com.fuctura.poo.tratamentodeerros3;

public class ExceptionGenerica {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {

            try {
                System.out.println(numeros[i] + "/" + demon[i] + " = "
                        + (numeros[i] / demon[i]));

            } catch (Exception e) {

                System.out.println(e.getMessage());//Onde foi que aconteceu essa bem dia divisão por zero
                e.printStackTrace(); //aqui deixa mais legível
//Em projetos reais agente vai colocar as excessões em logs(agente não debuga um projeto em produção)agente vai olhar o log pra ver o que aconteceu

            }
        }

    }
}
