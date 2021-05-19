package br.com.fuctura.intermediario.wrapersclasses;

public class TesteWrapper {

    public static void main(String[] args) {
        //O java é orientado a objetos mas não é 100% orientado a objetos
        //O ruby é cem por cento orientado a objetos por que até os tipos primitivos do ruby também são representados por objetos(classe) tudo no ruby é uma classe
        //No java 5 uma nova funcionalidade foi adicionada que são as classes wrapers que representam os tipos primitivos do java
        //ou seja temos classes representando short,byte,int,long,float,double,boolean,char só que ao inves de ser um tipo primitivo elas são classes

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';

        Short num7 = (short) 1;
        Byte num8 = new Byte((byte) 10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(10000l);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.5555);
        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');

        //posso adicionar tanto número como string
        //passe "10000hhh" vai dar erro por que o tipo é Integer então só aceita string com valor numérico
        Integer num13 = new Integer("100");

        Double num14 = new Double("3.5");

        System.out.println(num13.intValue());
        System.out.println(num13.longValue());
        //Ao converter um número mior para um menor você pode perder precisão ou valor tome cuidado
        Long num15 = num13.longValue();
        
        int num16 = Integer.parseInt("1000");//posso pegar uma classe scanner que tudo é string e converter para inteiro
        
        double num17 = Double.parseDouble("3.788");
        
        Integer num18 = Integer.valueOf(1356);//transforma essa valor em uma instância do objeto Integer
        
        System.out.println(num9 == num13); //vai dar false por que dois objetos são comparados o o método equals
        
        
    //As classes boolean e character extendem diretamente da classe Object e o resto
    //estendem indiretamente da classe Object e diretamente da classe Number(Float,Double,Byte,Short,Long,Integer)
    }

}
