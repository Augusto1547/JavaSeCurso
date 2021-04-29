package br.com.javase.projetosPessoais.VendaDeAnimais;

import java.math.BigDecimal;

public abstract class Pets {

    public String tipoDeEspecie;
    public String sexoDoPet;
    public String corDoPet;
    public String idadeDoPet;
    public BigDecimal precoDeVendaDoPet;
    public String castradoOuNao;

    public Pets(){}

    public Pets(String tipoDeEspecie, String sexoDoPet, String corDoPet,
            String idadeDoPet, BigDecimal precoDeVendaDoPet, String castradoOuNao) {

        this.tipoDeEspecie = tipoDeEspecie;
        this.sexoDoPet = sexoDoPet;
        this.corDoPet = corDoPet;
        this.idadeDoPet = idadeDoPet;
        this.precoDeVendaDoPet = precoDeVendaDoPet;
        this.castradoOuNao = castradoOuNao;

    }

    

}
