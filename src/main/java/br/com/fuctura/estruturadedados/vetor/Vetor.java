package br.com.fuctura.estruturadedados.vetor;

//Title: Adicionar elemento no final do vetor
public class Vetor {//Coloque na imaginação a direita de Vetor o nome da variável de referência vetor
	// A vantagem de analizar códigos de terceiros é que eu expando a minha maneira de pensar um
	// problema enquando que seguindo uma video aula eu fico limitado ao feijão com arroz para
	// entender apenas o que a ferramenta faz na sua base
	// Valor inicial de: String = null quando não boto nenhum sinal de atribuição
	// boolean: false, int,char,float, etc = 0, então String e boolean tem valor
	// padrão diferente do resto
	// obs: ao deparar com um programa visualiza-lo feito uma escada: classe(o que o nome da classe representa?
	//e o que é possível fazer por meio dessa classe?) ,
	// atributos e métodos em sequência e ver dentro dos métodos atributos compatíveis com os atributos iniciais
    //para entender atributos posso usar as palavras chaves: vai ser ou terá
	private String[] elementos;
	private int tamanho;

	//Esse construtor vai ajudar na construção da estrutura do vetor com seus respectivos indices
	//O corpo dos construtores e dos métodos servem para receber os atributos da classe e esses atributos servem 
	//para receber dentro de si os parâmetros dos construtores e dos métodos fornecidos pelo usuário
	public Vetor(int capacidade) {//coloque na imaginação a palavra new a esquerda de Vetor(int capacidade)

		this.elementos = new String[capacidade];//se não fosse um vetor seria apenas: this.elementos = capacidade
		this.tamanho = 0;
	}

	//Na outra página vou chamar adiciona para pedir o(s) valores que serão colocados dentro do Vetor
	public void adiciona(String elemento) {

		// iterar para adicionar elemento

		for (int i = 0; i < this.elementos.length; i++) {

			if (this.elementos[i] == null) {

				this.elementos[i] = elemento;
				break;

			}
			
		}
	} // Essa função adiciona dois elementos se encontrar um nulo

	public void adiciona2(String elemento) throws Exception {

		if (this.tamanho < this.elementos.length) {

			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

		} else {

			throw new Exception("Vetor está cheio não é possível adicionar mais elementos");
		}

	}

	public boolean adiciona3(String elemento) {

		if (this.tamanho < this.elementos.length) {

			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;

		}
		return false;
	}

}
