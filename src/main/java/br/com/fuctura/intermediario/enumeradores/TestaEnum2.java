package br.com.fuctura.intermediario.enumeradores;

public class TestaEnum2 {
//https://pt.stackoverflow.com/questions/7360/por-que-e-quando-usar-enum-em-java

    public static void main(String[] args) {

        //enuns são classes do java por ser objetos deveria ser comparados
        //com o equals mas nesse caso das enumns podemos usar o ==
        //o new está sendo feito implicitamente aqui
        DiaSemana2 dia = DiaSemana2.SEGUNDA;

        //No bando de dados eu guardo o valor 1 e pro usuário imprimo SEGUNDA
        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(14, 05, 2021, DiaSemana2.SEXTA);

    }

}
