
package br.com.fuctura.logica;
import java.util.Scanner;

public class Entrada_de_dados {
    
    
    public static void main(String[] args) {
        
        Scanner recebe = new Scanner(System.in);
        
        System.out.println("Digite um valor:");
        int one = recebe.nextInt();
        System.out.println("Digite outro valor");
        int two = recebe.nextInt();
        recebe.close();
        
        System.out.println("The soma among the values is: " + (one + two));
    }
    
}
