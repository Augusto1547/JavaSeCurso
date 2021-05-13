package br.com.fuctura.intermediario.enumeradores;

public class TestaEnum {

    public static void main(String[] args) {
        
        usandoEnum();
    }
    
    public static void imprimirDiaDaSemana(DiaSemana dia){
        
        switch(dia){
            
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábádo");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
        
    }

    private static void usandoEnum() {

        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
        
        System.out.println("Teste utilizando enum no java");
        
        imprimirDiaDaSemana(segunda);
        imprimirDiaDaSemana(terca);
        imprimirDiaDaSemana(quarta);
        imprimirDiaDaSemana(quinta);
        imprimirDiaDaSemana(sexta);
        imprimirDiaDaSemana(sabado);
        imprimirDiaDaSemana(domingo);
    }
}
