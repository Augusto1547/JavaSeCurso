package br.com.javase.logica.aulas;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Tipos_de_dados {

    public static void main(String[] args) {

        /*
        byte one = 120; //aproximadamente 120 carcteres
        short two = 192;
        int three = 9;
        long four = 39348944;
      
        float five = 893.5F;
        double six = 983.837;
        
        char seven = '@';
        boolean casado =  true;
         */
        BigDecimal one = new BigDecimal("25.50");
        BigDecimal two = new BigDecimal("13.89");
        BigDecimal res = one.subtract(two);
        BigDecimal res2 = one.add(two);
        BigDecimal res3 = one.multiply(two);
        BigDecimal res4 = one.divide(new BigDecimal(2));

        System.out.println("Substract: " + res);
        System.out.println("Somar " + res2);
        System.out.println("Multiplicar " + res3);
        System.out.println("Divisão " + res4);

        System.out.println("\n=======================================\n");

        BigInteger bi = new BigInteger("839287399940059928838840008287373");
        System.out.println(bi);
        
        //com.facebook.nomedoprojeto.pastaextrasequiser (.separa as pastas, tem que ser minúscula)
        char ans = 46;//lista de caracteres ascii
        char unicode = 0x378;
        long creditCard = 3492_234;//underscor
        int ex = 032; //exadecimal
        int oct = 0x116; //octal
        int bin = 0b011101; //binário
        int oi = (int)3894;
        long ola =  (long)387399888;
        
        System.out.println("\"hellow world\"");
        System.out.println("1\\4");

        //o big decimal é ideal para usarmos em valores monetários por que o double as vezes apresentam algumas casas a mais
    }

}
