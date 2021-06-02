package br.com.fuctura.intermediario.classesaninhadas;
//É utilizado muito com colections do java mas pode usar em outros cenários

public class Anonima {

	public void imprimeTexto() {
		System.out.println("qualquer texto");

	}

	public static void main(String[] args) {

		Anonima anonima = new Anonima() {

			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};
		anonima.imprimeTexto();

		Texto texto = new Texto() {

			@Override
			public void imprimeTexto() {

				System.out.println("essa sobreescrita será da interface");
			}

		};
		texto.imprimeTexto();
	}
}
