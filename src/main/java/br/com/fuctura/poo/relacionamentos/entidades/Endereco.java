package br.com.fuctura.poo.relacionamentos.entidades;

public class Endereco {

    private String logradouro;
    private String complemento;
    private int numero;
    private String cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void imprimir() {

        System.out.println("DADOS DO ENDEREÇO \n"
                + "Logradouro :" + logradouro + "\n"
                + "Complemento :" + complemento + "\n"
                + "Número :" + numero + "\n"
                + "Cep :" + cep + "\n"
        );
        
    }

}
