package br.com.fuctura.estruturadedados.vetor.verificarseelementoexiste;

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

    //Verificar se elemento existe
    //O algoritimo de busca mais simples é o algoritimo de busca sequencial
    //O método iqualIgnoreCase() não vai levar em consideração se é letra maiuscula ou minuscula
    //existe uma maneira mais elegante de fazer esse método sem retornar true ou false que é retornando a própria posição do vetor
    /*public boolean busca(String elemento) {

        for (int i = 0; i < this.tamanho; i++) {

            if (this.elementos[i].equals(elemento)) {

                return true;
            }
        }
        return false;
    }*/
    //-1 informa que a posição não existe
    public int busca(String elemento) {

        for (int i = 0; i < this.tamanho; i++) {

            if (this.elementos[i].equals(elemento)) {

                return i;
            }
        }
        return -1;
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
