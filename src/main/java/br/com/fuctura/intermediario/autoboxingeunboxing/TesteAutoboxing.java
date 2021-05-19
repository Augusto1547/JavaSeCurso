package br.com.fuctura.intermediario.autoboxingeunboxing;

public class TesteAutoboxing {

    public static void main(String[] args) {
        //AutoBoxing transforma um tipo primitivo em objeto 
        //e um tipo objeto em primitivo
        //foi introduzido apartir do java 5
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 100l;
        Float num11 = 2.5f;
        Double num12 = 3.5555;
        Boolean num13 = true;
        Character num14 = 'b';

        //O contrário agora: auto un-boxing
        int num15 = num9;  //num9.intValue();
        
        //autoboxing em expressões
        num9++;
        System.out.println(num9);
        
        //auto unboxing num9 -> autoboxing num15/num9 -> 15
        Integer num16 = num15 / num9;
        
        //cuidado para ao querer transformar o java em cem por cento objeto
        //e fazer com isso um mau uso do autoboxing e do auto unboxing
        
        //Isso é um mau uso do boxing e do unboxing
        //Ao trabalhar com expressões é melhor usar o tipo primitivo do java
        Double a, b, c;
        a = 10.0;
        b = 12.2;
        c = 4.7;
        
        Double media = (a+b+c)/3;
        
        
    }

}
