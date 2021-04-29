package br.com.javase.poo.aulas.relacionamentos.entidades;
//Aparte do carro o que irá complementa-lo
//Associação e associação derivada
//Agregação simples ou agregação(o todo é destruído mas as partes existe)
//Agregação por composição ou composição(não consigo destruir o todo sem destruir também as partes)
//http://docs.oracle.com/javase/7/docs/api/
//não pertende aquele objeto
public class Carro {

    private String placa;
    private String modelo;
    private String fabricante;
    private String chassi;

    //Criada um associação com a classe pessoa
    private Pessoa condutor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Pessoa getCondutor() {
        return condutor;
    }

    public void setCondutor(Pessoa condutor) {
        this.condutor = condutor;
    }

    public void imprimir() {

        System.out.println("Dados pessoais \n"
                + "Número da placa " + placa + "\n"
                + "Modelo do carro " + modelo + "\n"
                + "Fabricante do carro " + fabricante + "\n"
                + "Chassi do carro " + chassi);

        if (condutor != null) {

            System.out.println("Dados do condutor \n");
            
            condutor.imprimir();
        }

    }

}
