package br.com.fuctura.poo.MetodoComParametro;

public class Vinho extends Produto {//se vinho fosse abstrata metodo seria abstrato
    //e carreteiro sobrescreveria de vinho

    @Override
    public void passarTroco(double valor_do_cliente) {
        
        if (valor_do_cliente > this.preco_produto) {

            double troco = valor_do_cliente - this.preco_produto;
            System.out.println("Obrigado pela compra! aqui está seu troco "
                    + troco + " R$");

        } else if (valor_do_cliente == this.preco_produto) {

            System.out.println("Obrigado pela compra");

        } else {

            double debito_do_cliente = this.preco_produto - valor_do_cliente;
            System.out.println("O cliente forneceu " + valor_do_cliente
                    + " R$ e está devendo " + debito_do_cliente);
        }

    }

}
