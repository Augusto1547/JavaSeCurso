package br.com.fuctura.logica;

public class Conversao_de_tipos {

    public static void main(String[] args) {

        int numberOne = Integer.parseInt("22");
        long numberTwo = Long.parseLong("22");
        byte numberThree = Byte.parseByte("22");

        String creditCard = String.valueOf(11);
        
        double k = 55.3;  
        String texto = Double.toString(k);

        System.out.println(creditCard + 2);

    }

}
