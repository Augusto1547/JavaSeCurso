 
package br.com.fuctura.intermediario.enumeradores;
/*
*testa a classe DiaSemana sem valores
*para gravar no banco de dados o próprio valor do enum ex: SEGUNDA etc
*a classe Enum é a super classe de todos os enumss
*/

public class TestaEnum4 {
    
    public static void main(String[] args) {
        
        DiaSemana dia;
        
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
    }

}
