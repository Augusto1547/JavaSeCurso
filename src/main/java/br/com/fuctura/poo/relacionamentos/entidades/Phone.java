package br.com.javase.poo.aulas.relacionamentos.entidades;

public class Phone {

    private String tipo;
    private String ddd;
    private String numero;

    public Phone() {

    }

    public Phone(String tipo, String ddd, String numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    /*public void printPhones() {
       
        
        System.out.println("Cellphone :" + tipo);
        System.out.println("Ddd : " + ddd);
        System.out.println("Number Phone : " + numero);

    }*/
}
