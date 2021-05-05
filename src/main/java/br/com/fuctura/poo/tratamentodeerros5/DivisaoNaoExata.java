 
package br.com.fuctura.poo.tratamentodeerros5;


public class DivisaoNaoExata extends Exception{
    
    private int num;
    private int den;

    public DivisaoNaoExata(int num, int den) {
        super();
        this.num = num;
        this.den = den;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + " / " + den + " Não é um número inteiro";
    }
    
    

}
