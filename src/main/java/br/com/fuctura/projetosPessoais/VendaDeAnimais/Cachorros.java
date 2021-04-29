package br.com.javase.projetosPessoais.VendaDeAnimais;

import java.math.BigDecimal;

public class Cachorros extends Pets {

    public Cachorros (String tipoDeEspecie, String sexoDoPet, String corDoPet,
            String idadeDoPet, BigDecimal precoDeVendaDoPet, String castradoOuNao) {

        this.tipoDeEspecie = tipoDeEspecie;
        this.sexoDoPet = sexoDoPet;
        this.corDoPet = corDoPet;
        this.idadeDoPet = idadeDoPet;
        this.precoDeVendaDoPet = precoDeVendaDoPet;
        this.castradoOuNao = castradoOuNao;

    }
}
