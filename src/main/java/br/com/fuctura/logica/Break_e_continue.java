package br.com.javase.logica.aulas;

import java.util.Scanner;

public class Break_e_continue {

    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {

            if (i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break;
            }
        }//interromper
         */

        for (int i = 0; i <= 4; i++) {

            rotulo1:
            {
                rotulo2:
                {

                    rotulo3:
                    {

                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println(i);
        }
        System.out.println();
        //rótulo
        
        
       Scanner scan = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {

            if (i % 7 == 0) {
               
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
        
        /*
        -break server para saída de loop(while,do while, for) e pode ser usado com
        o rótulo(label- que é muito pouco utilizado na programação de auto nível)
        -% mod
        -(em muitas linguagens de progamação o break com o rótulo é chamdo de 
        go to(vá para)
        -os rótulos são apenas uma identificação pode ter if e else mas não é necessário
        -Conhecimento de compiladores me permite criar uma programação de auto nível
        e entender como ela funciona por debaixo dos panos quem ver essa matéria é o 
        pessoal de ciência da computação
        -o continue vai ser um pouco mais raro é mais interessante quando está trabalhando
        com for aninhado e pode ser usado com label
        */
        
    }

}
