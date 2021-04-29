 
package br.com.javase.poo.aulas.heranca;


public class Programa {

    public static void main(String[] args){

//Respeite o é um ou é uma pois cachorro não é uma pessoa        

        Aluno aluno = new Aluno();
        System.out.println(aluno instanceof Aluno);
        System.out.println(aluno instanceof Pessoa); //solicita veementemente?
        
        
        
        Pessoa professor = new Professor(); //isso terá utilidade mais à frente
        professor.setNome("Eduardo Santorini");
//        não consigo acessar a profissao do professor por causa do tipo Pessoa
        System.out.println(professor instanceof Pessoa);
    }
}
