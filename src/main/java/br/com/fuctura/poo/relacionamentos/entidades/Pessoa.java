package br.com.fuctura.poo.relacionamentos.entidades;
//Associação e associação derivada
//Agregação simples ou agregação(o todo é destruído mas as partes existe)

import java.util.List;
//https://www.youtube.com/watch?v=CAP1IPgeJkw&ab_channel=DevSuperior (jpa)
//Agregação por composição ou composição(não consigo destruir o todo sem destruir também as partes)
//

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    private List<Endereco> listaDeEnderecos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIndade() {
        return idade;
    }

    public void setIndade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void imprimir() {

        System.out.println("Dados do condutor \n"
                + "Nome : " + nome + "\n" + "Idade :" + idade + "\n" + "Sexo :"
                + sexo);

        System.out.println("Endereços da pessoa \n");

        for (Endereco endereco : listaDeEnderecos) {

            endereco.imprimir();
        }

    }
    
    public void adicionarEnderecos(Endereco endereco){
        
        listaDeEnderecos.add(endereco);
        
    }

}
