package br.com.javase.logica.aulas;

public class Array_part2_multidimencional {

    public static void main(String[] args) {

        double[][] alunos = new double[3][4];

        alunos[0][0] = 10;
        alunos[0][1] = 5.5;
        alunos[0][2] = 6;
        alunos[0][3] = 9;

        alunos[1][0] = 8;
        alunos[1][1] = 8;
        alunos[1][2] = 6.5;
        alunos[1][3] = 10;

        alunos[2][0] = 2;
        alunos[2][1] = 8;
        alunos[2][2] = 9;
        alunos[2][3] = 10;

        for (int i = 0; i < alunos.length; i++) {

            // System.out.println(alunos[i]);
            for (int j = 0; j < alunos[i].length; j++) {

                System.out.println(alunos[i][j]);
            }
            System.out.println();
        }

        alunos[2][3] = 8;

        System.out.println();

        for (int i = 0; i < alunos.length; i++) {

            for (int j = 0; j < alunos[i].length; j++) {

                System.out.println(alunos[i][j]);

            }

            System.out.println();
        }

        System.out.println("Calculando a média de cada aluno");

        for (int i = 0; i < alunos.length; i++) {

            double soma = 0;

            for (int j = 0; j < alunos[i].length; j++) {

                soma += alunos[i][j];

            }
            
            System.out.println("Média do aluno " + i + " é = " + (soma/4));
        }
        
        System.out.println();
        
        double[][] notasAlunos2 = {{8, 10, 1, 6.9},{9, 8, 5.5, 4}}; //criar array único
        
        
        System.out.println("Output da matriz notasAlunos"); //Título da matriz notas 
        
        for(int i = 0; i < notasAlunos2.length; i++) {
            
            for(int j = 0; j < notasAlunos2[i].length; j++){// criar o for aninhado
                
                System.out.println(notasAlunos2[i][j] + " "); //mostrar o conteúdo
                
            }
        }
        
    }

}
