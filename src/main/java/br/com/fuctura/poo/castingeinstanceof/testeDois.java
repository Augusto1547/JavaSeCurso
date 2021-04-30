package br.com.fuctura.poo.castingeinstanceof;

public class testeDois {

    public static void main(String[] args) {

        Object obj1 = obterString();
        String s1 = (String) obj1; //down casting
        //nesse caso aqui consigo executar com sucesso
        System.out.println(s1);

        Object obj2 = "Minha String";//upcasting
        String s = (String) obj2; //down casting
        System.out.println(s);

        Object obj3 = new Object();
        String s3 = (String) obj3;
        System.out.println(s3);//erro de execução 
        //objeto não pode ser convertido em string porque
        //ele não faz referência a uma string
        
        Object obj4 = obterInteiro();
        String s4 = (String) obj4;
        System.out.println(s4);//também vai dar erro de
        //execução não tem nada haver com uma instring
        
    }

    public static String obterString() {

        return "minha String";
    }

    public static int obterInteiro() {

        return 1;
    }
}
