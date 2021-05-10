 
package br.com.fuctura.estruturadedados.vetor;


public class testVetor2 {
    
    public static void main(String[] args) {
        
        Vetor2 vetor = new Vetor2(10);
        
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
   
    }

}
