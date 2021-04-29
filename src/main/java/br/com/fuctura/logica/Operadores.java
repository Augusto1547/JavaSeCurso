package br.com.javase.logica.aulas;

public class Operadores {

    public static void main(String[] args) {

        // +, -, *, /, % (operadores aritiméticos)
        // >, <, >=, <=, != (operadores de comparação)
        // &&,&, ||, |, !, ^ (operadores lógicos)
        // +=, -=, *=, /=, %= (operadore de atribuição)
        
        
        int number = 8;
        int numbertwo = 8;
        
        //&&(curto circuito)

        /*if (number % numbertwo == 0) {

            System.out.println("Numbers pares " + number);
            
        } else {

            System.out.println("São impares ");
        }*/
        
        
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado = (verdadeiro && falso); //&(olha o primeiro e o segundo)
        //&&(curso circuíto nem olha o segundo pois já sabe que é falso)
        
        System.out.println(resultado);
       
        /*System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || verdadeiro);
        System.out.println(!verdadeiro ^ falso);*/

         
        
        
        
    }

}
