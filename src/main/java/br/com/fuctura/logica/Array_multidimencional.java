package br.com.fuctura.logica;

public class Array_multidimencional {

    public static void main(String[] args) {

        String[][] galos = new String[30][4];

        galos[0][0] = "Pedres";
        galos[0][1] = "Caboco";
        galos[0][2] = "Preto";
        galos[0][3] = "Branco";
        
        galos[1][0] = "Roxo";
        galos[1][1] = "Marrom";
        galos[1][2] = "Amarelo";
        galos[1][3] = "Rosa";
        
        galos[2][0] = "Azul";
        galos[2][1] = "Metal";
        galos[2][2] = "Verde";
        galos[2][3] = "Dourado";
        
        
        System.out.println(galos[1][2]);
        
         
    }
    
}
