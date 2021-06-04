package br.com.fuctura.intermediario.anotations;

/*
 * Instituição:         Uiversidade XTI
 * Projeto:             Sistema de Avaliaçãos
 * Data de Criação:     04/06/2021
 * Criador:             Augusto César
 * Revisão:             2
 */
//Esse tipo de comentário gera uma série de problemas para ferramentas de
//processamento automático as anotations facilita o acesso por essas ferramentas

@Cabecalho(//essa anotação de cabeçalho deve ser usada apenas em classes como faço pra restringir isso
  instituicao = "Universidade XTI",
  projeto = "Sistema de Avaliações",
  dataCriacao = "04/06/2021",
  criador = "Ricardo Lopes Costa",
  revisao = 2
)
//essa de erros pode ser usada em classes e métodos 
@ErrosCorrigidos(erros = {"0001","0002"}) //@ErrosCorrigidos(erros = "0001")assim se tivesse apenas um elemento
public class Anotacao {
	
	
}
