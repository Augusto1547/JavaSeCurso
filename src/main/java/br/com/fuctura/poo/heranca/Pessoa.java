package br.com.fuctura.poo.heranca;

public class Pessoa {
    
    protected int senha; //só vai aparecer para as subclasse
    private int serial; //está sem get e set
    private String nome;
    private String endereco;
    private int idade;
    char sexo;

    public Pessoa(String nome, String endereco, int idade, char sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public void mostrarDados(){
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    
}
