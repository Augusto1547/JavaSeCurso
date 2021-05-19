package br.com.fuctura.intermediario.staticimport;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*;//isso não é muito utilizado fica mais elegante o de cima

public class StaticImport {

    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(Math.pow(a, b));//potência
        System.out.println(Math.sqrt(c));//raíz quadrada

        System.out.println(pow(a, b));
        System.out.println(sqrt(c));
    }

}
