package br.com.fuctura.intermediario.escopodevariaveis;

public class EscopoDeVariaveis {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor) {

		valor = valor + 10;
		return valor;
	}

	public int teste() {

		int valor = 5;

		if (true) {

			valor--;
		}
		// this.valor = valor; referencial valor global/atributo da classe
		return valor;
	}

	public void maisUmTeste() {
//quando declaramos uma variável dentro de um escopo ela só pode ser impressa dentro dele 

		boolean flag = true;

		if (flag) {

			int umaVariavel = 10;

			umaVariavel++;

			System.out.println(umaVariavel);

		}
//System.out.println(umaVariavel); deu erro por que estou chamando a variável fora do seu escopo

	}

	public void maisUmOutroTeste(int num) {

		int total = 0;

		try {

			int outroNum = 0;

			total = num / outroNum;

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			total++;
//    		outroNum++; erro de compilação
//    		e.printStackTrace();  erro de compilação
		}

		num++;

//    	outroNum++; erro de compilação
//    	e.printStackTrace(); erro de compilação
	}

}
