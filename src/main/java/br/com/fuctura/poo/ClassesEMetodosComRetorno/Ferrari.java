package br.com.javase.poo.aulas.ClassesEMetodosComRetorno;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ferrari extends DonoConcessionaria {

    Scanner scan = new Scanner(System.in, "ISO-8859-1");

    public String nomeDoVendedor;
    public BigDecimal salarioDoVendedor;

    public void mostrarSalario() {

        if (nomeDoVendedor == "Carlos" || nomeDoVendedor == "Pedro"
                || nomeDoVendedor == "Pedro" || nomeDoVendedor == "João") {

            System.out.println("Nome do vendedor é : "
                    + nomeDoVendedor + " Tem um salário de :"
                    + salarioDoVendedor);

        } else if (nomeDoVendedor == "Maria" || nomeDoVendedor == "Eduarda"
                || nomeDoVendedor == "Joana" || nomeDoVendedor == "Marlene") {

            System.out.println("Nome do vendedor é : "
                    + nomeDoVendedor + " Tem um salário de :"
                    + salarioDoVendedor);
        }
    }
}
