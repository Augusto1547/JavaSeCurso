package br.com.fuctura.poo.relacionamentos.entidades;

public class TestaCarro {

    public static void main(String[] args) {
        
        Pessoa ivan = new Pessoa();
        ivan.setNome("Ivan de Oliveira Moura");
        ivan.setIndade(42);
        ivan.setSexo('M');
        

        Carro kombi = new Carro();

        kombi.setPlaca("3566");
        kombi.setModelo("Kombi");
        kombi.setFabricante("Vowksvagen");
        kombi.setChassi("XXX");

        kombi.setCondutor(ivan);
        kombi.imprimir();
        ///aqui está tudo ok
    }
    
}
