package br.com.javase.poo.aulas.ClassesEMetodosComRetorno;
//42

//Carro superclasse, seus filhos Subclasesa
public class Carro extends Ferrari {

    public String marca;
    public String cor;
    public double precoAvista;
    public int numDeParcelas;
    private double precoAtacado;

    public double calcularValorDasParcelas() {

        return  (precoAvista / numDeParcelas);

    }

    public double getPrecoAtacado() {
        return precoAtacado;
    }

    public void setPrecoAtacado(double precoAtacado) {
        this.precoAtacado = precoAtacado;
    }

}
