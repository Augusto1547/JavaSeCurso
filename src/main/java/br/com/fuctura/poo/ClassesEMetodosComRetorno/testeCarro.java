package br.com.javase.poo.aulas.ClassesEMetodosComRetorno;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class testeCarro {

    public static void main(String[] args) {

        Carro ferrari = new Carro();

        System.out.println("A marca do carro é " + (ferrari.marca = "Ferrari"));
        System.out.println("Cor do carro é : " + (ferrari.cor = "Vermelha"));
        

        ferrari.nomeDoVendedor = "João";
        ferrari.salarioDoVendedor = new BigDecimal("2.500");
        ferrari.mostrarSalario();

        System.out.println();

        System.out.println("Preço do carro avista : "
                + (ferrari.precoAvista = 32.456)
                + " R$");
        System.out.println("Número de parcelas " + (ferrari.numDeParcelas = 12));
        

        double valorDasParcelas = ferrari.calcularValorDasParcelas();
        
        System.out.println(ferrari.numDeParcelas + " parcelas de " + valorDasParcelas);
        
      
        
        
        
//marca, cor, precoAvista, numDeParcelas, nomeDoVendedor, salarioDoVendedor, nome(dele) e
  //senha com o get e set já que é privado
    }

}
