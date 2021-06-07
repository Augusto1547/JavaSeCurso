package br.com.fuctura.intermediario.anotations;

import java.io.Serializable;

/*
 * Instituição:         Uiversidade XTI
 * Projeto:             Sistema de Avaliaçãos
 * Data de Criação:     04/06/2021
 * Criador:             Augusto César
 * Revisão:             2
 */

//Esse tipo de comentário gera uma série de problemas para ferramentas de
//processamento automático as anotations facilita o acesso por essas ferramentas

@Cabecalho(// essa anotação de cabeçalho deve ser usada apenas em classes como faço pra
			// restringir isso apenas pra classes

//		@formatter:off
		instituicao = "Universidade XTI",
		projeto = "Sistema de Avaliações",
		dataCriacao = "04/06/2021", 
		criador = "Ricardo Lopes Costa", 
		revisao = 2)
//      @formatted:on

//essa de erros pode ser usada em classes e métodos 
@ErrosCorrigidos(erros = { "0001", "0002" }) // @ErrosCorrigidos("0001")assim se tivesse apenas um elemento
@SuppressWarnings({"serial", "unused"}) //suplimir o erro serial que estou recebendo da classe Serializable você poderia sobescrever vários outros tipos de erros que podem acontecer nas classes
public class Anotacao implements Serializable { //transforma essa classe em um elemento serializavel e exige que agente informe um número serial a essa classe mas eu quero que esse número serial seja ignorado nessa classe pelo compilador
	
	// Anotações específicas da linguagem java
	/*
	 * esse método não vai ser mais utilizado esse método vai ser depresiado nas
	 * próximas versões do seu progama provavelmente você vai eliminar esse método
	 * dai eu uso a anotação essa anotação vai indicar pras pessoas que estão usando
	 * essa classe que provavelmente no futuro você vai eliminar esse método
	 */

	//@SuppressWarnings("unused") //posso colocar aqui quanto poderia colocar ali na classe
	private int x; //essa variável não está sendo utilizada em outras parte da minha classe então agente poderia SupressWarnings para informar que nós sabemos que essa variável não está sendo utilizada
	
	//@SuppressWarnings("unused")
	@Deprecated // Descontinuado
	private void anotar() {

		System.out.println();
	}

	@Override
	public String toString() {
		return null;
	}

}
