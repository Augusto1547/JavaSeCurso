package br.com.fuctura.intermediario.classesaninhadas;
//classes internas é bem utilizada com jdb e hibernate mas você pode usar em outros contextos
//outro senário é quando você sabe que não vai utilizar a classe em outras partes do projeto
//em projetos novos não se usa muito jdbc mas em legados ainda tem muito uso
//a classe interna é o cenário mais utilizados dos três abordados nessa aula.
public class Externa {

	private String texto = "texto externo";

	public class Interna {// se essa classe for static não precisa instanciar a Externa

		private void imprimeTexto() {
			System.out.println(texto);

			// consegue ver membros da classe externa
			System.out.println(Externa.this.texto);
		}
	}

	public static void main(String[] args) {
		
		Externa externa = new Externa();
		Interna interna = externa.new Interna();

		interna.imprimeTexto();

	}
	/*
	 * O código que realiza uma tarefa em resposta a um evento é chamado de rotina
	 * de tratamento de evento e o processo total de responder a eventos é conhecido
	 * como tratamento de evento
	 */
}
