package br.com.fuctura.extras;

public class Builder {

    String nome;
    int idade;

    public Builder(String n, int i) {

        this.nome = n;
        this.idade = i;
    }

    public static void main(String[] args) {

        Builder oi = new Builder("Augusto César", 35);
        StringBuilder con = new StringBuilder();

        con.append("Nome :").append(oi.nome);
        con.append("Idade :").append(oi.idade);

        System.out.println(con.toString());
    }

}
