package br.com.fuctura.intermediario.enumeradores;
//faz parte da aula de value() e valueOf()

public class TestaEnum3 {

    public static void main(String[] args) {

        DiaSemana2[] dias = DiaSemana2.values();

        for (int i = 0; i < dias.length; i++) {

            System.out.println(dias[i]);
        }

        System.out.println();

        /*for(DiaSemana2 dia : DiaSemana2.values()){
            for melhorado
             System.out.println(dia);
        }*/
    }

}
