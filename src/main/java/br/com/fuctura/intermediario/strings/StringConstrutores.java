package br.com.fuctura.intermediario.strings;
// String: construtores

public class StringConstrutores {

	public static void main(String[] args) {

		String vazia = new String();// "ao clicar com control + espaço dentro do construtor o
		// intelecençe(o auto complite da ide vai mostrar todas as opções de contrutores
		// para gente)"
		System.out.println(vazia);

		String java = new String("JAVA");
		System.out.println(java);

		String java1 = new String(java);
		System.out.println(java1);

		char[] charsJava = { 'J', 'A', 'V', 'A' };
		String java2 = new String(charsJava);
		System.out.println(java2);

		char[] abcdef = { 'A', 'B', 'C', 'D', 'E', 'F' };
		String abc = new String(abcdef, 0, 3); // capitura o array da posição 0 a 3
		System.out.println(abc);

		byte[] ascii = { 65, 66, 67, 68, 69 }; // cada byte vai representar um caracter da tabela ascii
		// então podemos trabalhar tanto com array de caractere quando array de byte
		String abcde = new String(ascii);
		System.out.println(abcde);

		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);

		String java3 = "JAVA";
		String java4 = "JAVA";

		System.out.println(java3);
		System.out.println(java4);

		// Por debaixo dos panos existe uma grande diferença em passar o valor da string
		// pelo construtor e passar
		// de forma tradicional : "JAVA"

	}

}
