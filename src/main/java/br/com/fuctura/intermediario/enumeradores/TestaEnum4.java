package br.com.fuctura.intermediario.enumeradores;

/*
*testa a classe DiaSemana sem valores
*para gravar no banco de dados o próprio valor do enum ex: SEGUNDA etc
*a classe Enum é a super classe de todos os enums
 */

public class TestaEnum4 {

    public static void main(String[] args) {

        //.class é por que o enum também pode ser tratado como uma classe
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "SEGUNDA");
        System.out.println(dia);
    }

}
