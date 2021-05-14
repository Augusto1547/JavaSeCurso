package br.com.fuctura.extras;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String n, int i) {

        
        this.nome = n;
        this.idade = i;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        if("Felipe".equals(this.nome)){
        this.nome = nome;
        }else{
            System.out.println("nome inválido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
