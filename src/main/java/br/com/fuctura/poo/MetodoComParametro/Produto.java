//parâmetro ou argumento
package br.com.javase.poo.aulas.MetodoComParametro;

public abstract class Produto {//objeto do tipo café mas não objeto do tipo objeto

    public String nome_produto;
    public double preco_produto;
    public String data_de_validade;
    private double precoAtacado;

    public abstract void passarTroco(double valor_do_cliente);
    //pode ter outros métodos sem ser abstratos

    public double getPrecoAtacado() {
        return precoAtacado;
    }

    public void setPrecoAtacado(double precoAtacado) {
        this.precoAtacado = precoAtacado;
    }
    
    
}
