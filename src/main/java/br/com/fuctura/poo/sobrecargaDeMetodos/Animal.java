package br.com.fuctura.poo.sobrecargaDeMetodos;

abstract class Animal {

    String tipoDeAnimal;

    public abstract void fazerBarulho();

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

}
