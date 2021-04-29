 
package br.com.javase.poo.aulas.objectclasse;


public class Pessoa {
    
    private String nome;
    private String email;
    
    public Pessoa(){
        
        
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
  

    @Override
    public String toString(){
        return "Nome : " + nome + " , " + "Email : " + email;
    }

    
    
    
    
}
