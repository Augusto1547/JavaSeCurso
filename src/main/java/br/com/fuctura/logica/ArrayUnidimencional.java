package br.com.fuctura.logica;

public class ArrayUnidimencional {


	public static void main(String[] args) {
		//    	Se não houvesse uma sintaxe própria na linguagem, seria escrito assim:
		//
		//      Array<int> a = new Array<int>(10);

		int[] number = new int[4];

		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;

		System.out.println("Value : " + number[3] + "\n" + number[1]);

		System.out.println("\n==============================\n");

		String[] name = {"james", "jane", "berry", "jesse pinckman"};

		for (int i = 0; i < name.length; i++) {

			System.out.println("Names :" + name[i]);
		}

		System.out.println("\n================================\n");

		String[] fruits = {"Banana", "orange", "avacaro", "strawbarry", "pear"};

		for (String fruit : fruits) {

			System.out.println("Fruits :" + fruit);
		}

		//arranjo,array,vetor, indeixe/chave, Array unidimencional, Array bidimensional  

		int tam = 5;
        double[] notas = new double[tam];
        notas[0] = 10;
        notas[1] = 7.5;
        notas[2] = 9;
        notas[3] = 1.6;
        notas[4] = 10;

        for (int i = 0; i < notas.length; i++) {

            if (notas[0] == 10 ^ notas[3] == 2) {

                System.out.println(notas[i]);

            } else {

                System.out.println("Valor não encontrado");
            }

        }
	}


}
