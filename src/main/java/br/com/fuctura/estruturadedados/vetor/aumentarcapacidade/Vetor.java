package br.com.fuctura.estruturadedados.vetor.aumentarcapacidade;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {

        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //vamos fazer um overload(sobrecarregar o método adiciona)
    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    public boolean adiciona(int posicao, String elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];

        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }

    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {

            String[] elementosNovos = new String[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {

                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
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
