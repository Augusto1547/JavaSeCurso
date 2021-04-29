package br.com.javase.logica.aulas;

public class Array_part3_multidimencional {

    public static void main(String[] args) {
        //teoria(jogos) 

        int[][][] matrizTridimencional = new int[3][3][3]; //criar matriz tridimencional (indice da linha, da coluna e da profundidade)

        for (int i = 0; i < matrizTridimencional.length; i++) {

            for (int j = 0; j < matrizTridimencional[i].length; j++) {

                for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
                    
                    System.out.println("- i = " + i + " - j = " + j + " - k = " + k);

                    matrizTridimencional[i][j][k] = i + j + k; //somar os três indices de cada dimensão 

                }//Criar for aninhado de três dimençãos(ordem alfabética, problema de performance, acessando posição)

            }

        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 0; i < matrizTridimencional.length; i++) {

            for (int j = 0; j < matrizTridimencional[i].length; j++) {

                for (int k = 0; k < matrizTridimencional[i][j].length; k++) {

                    soma += matrizTridimencional[i][j][k];

                    if (matrizTridimencional[i][j][k] % 2 == 0) {//verificar valores par da matriz 

                        somaPares += matrizTridimencional[i][j][k];
                    
                    } else {
                        
                        somaImpares += matrizTridimencional[i][j][k];

                    }

                }

            }

        }
        
        System.out.println("A soma total = " + soma);
        System.out.println("A soma dos pares = " + somaPares);
        System.out.println("A soma dos impares = " + somaImpares);

    }

}
