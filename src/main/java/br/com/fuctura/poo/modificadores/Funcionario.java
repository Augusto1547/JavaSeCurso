
package br.com.javase.poo.aulas.modificadores;

public class Funcionario {
    
    public String nome;
    String cor;
    protected int idade;
    private double tamanho;
    
    public Funcionario(){}
    
    public Funcionario(String nome, String cor, int idade, double tamanho){
        
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.tamanho = tamanho;
        
    }
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        f.tamanho = 3.3;
        System.out.println(f.tamanho);
        
        f.cor = "Negro"; //o package também pode ser acesado da qui
        System.out.println(f.cor);
    }
    
    
}
