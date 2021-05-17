package br.com.fuctura.estruturadedados.vetor.obterelementodeumaposicao;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {

        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {

        if (this.tamanho < elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //nova aula(Obter elemento de uma posição)
    public String busca(int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int tamanho() {//int por que atributo tamanho é int também

        return this.tamanho;

    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
        /*
        String s = "[";
        for (int i = 0; i < this.tamanho - 1; i++) {
            s += this.elementos[i];
            s += ", ";
        }
        if (this.tamanho > 0) {
            s += this.elementos[this.tamanho - 1];
        }
        s += "]";
         */
    }
}
