package br.com.fuctura.logica;
import java.util.Scanner;

public class MatrizIrregular {
//matriz quadrada(número de linhas igual o de colula), matriz irregular(número de linhas diferente do de colunas)
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
       
        
        System.out.println("Entre com o número de pessoas que serão entrevistadas");
        int numEntrevistados = scan.nextInt();
        
        String[][] nomesFilhos = new String[numEntrevistados][];
        //pede pro usuário a quantidade de pessoas que serão intrevistados e passa como índice da matriz
        
        
        for(int i = 0; i < nomesFilhos.length; i++) {//quantidade de linhas
            
            System.out.println("Entre com a quantidade de filhos");
            int qtdFilhos = scan.nextInt();
            
            
            nomesFilhos[i] = new String[qtdFilhos];//Criar a instânica se não o espaço não será alocado na memória e não poderemos guardar esses valores
            //instância para conseguirmos guardar os valores na memória
            
            for(int j=0; j<nomesFilhos[i].length; j++) {
                
                    System.out.println("Digite o nome do filho " + (j+1));
                    
                    nomesFilhos[i][j] = scan.next();
                
            }
            
        }//pegar quantidade pessoas entrevistas e a quantidade de filhos
        
        for (int i=0; i<nomesFilhos.length; i++) {
            
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            
            for (int j = 0; j<nomesFilhos[i].length; j++) {
              
                System.out.println(nomesFilhos[i][j]); 
            }
        }
        
    }

}
