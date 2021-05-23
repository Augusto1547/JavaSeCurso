package br.com.fuctura.poo.MetodoComParametro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularProdutos {

    public static void main(String[] args) {

        try { //eu tenho que observar aquilo que acho que pode ter erro ai inserir o try
            Vinho vinhoImportado = new Vinho();

            Scanner recebe = new Scanner(System.in, "ISO-8859-1");
            System.out.println("Informe o nome do produto");
            vinhoImportado.nome_produto = recebe.next();

            vinhoImportado.data_de_validade = "10/01/86";
            System.out.println("Data de validade : " + vinhoImportado.data_de_validade);

            vinhoImportado.preco_produto = 20.50;

            System.out.println("Informe o preço do pruduto");
            double dinheiro_do_cliente = recebe.nextDouble();

            vinhoImportado.passarTroco(dinheiro_do_cliente);

        } catch (InputMismatchException erro) {  //Exception pega qualquer tipo de erro

            System.out.println("Você deve inserir o valor com virgula :" + erro);
            //posso ter dois catch após o outro
            
        } finally {
            
            System.out.println("FIM");
        }
/*
         catch (Exception erro) {  //Exception pega qualquer tipo de erro

            System.out.println("O correu o erro :" + erro);

        }
        
 */

    }

}
