package br.com.fuctura.intermediario.enumeradores;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private DiaSemana2 diaSemana;

    public Data() {
        super();
    }

    public Data(int dia, int mes, int ano, DiaSemana2 diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemana2 getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana2 diaSemana) {
        this.diaSemana = diaSemana;
    }

}
