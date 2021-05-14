package br.com.fuctura.intermediario.enumeradores;

public class Formulario {

    /*
    *Dependendo do projeto você decide se deixa esse enum numa 
    *classe separada ou não
     */
    enum Genero {

        FEMININO('F'), MASCULINO('M');

        private char valor;

        private Genero(char valor) {
            this.valor = valor;
        }

    }

    private String nome;
    private Genero genero;

    public static void main(String[] args) {

        Formulario cadastro = new Formulario();
        cadastro.nome = "Roberto";
        
        System.out.println(cadastro.nome + Genero.MASCULINO.valor);

    }

}
