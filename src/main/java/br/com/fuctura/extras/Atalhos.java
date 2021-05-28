package br.com.fuctura.extras;

public class Atalhos {
//no google: eclipse color theme

	String cidade;
	int idade;

	public static void main(String[] args) {

		String nome = "Rodrigo";

		System.out.println();

		// @formatter:off
		       String nome2 = "pedro";
		// @formatter:on

		mostrarNome(nome);

		System.out.println("Rodrigo");
		/*
		 * windows > preferences > geral > key (para criar seu próprio atalho) ativar as
		 * opções ampliadas de código) 
		 * CTRL + Shift + O (importa o pacote)
		 * Contrl + shift + f (identa o código) 
		 * Control + e (navega entre as classes criadas)
		 * Control + Shift + x/y ( transforma o trecho selecionado em maiúscula ou
		 * Control + f (localizar e substituir) 
		 * Control + alt + pagedown (também navega entre as classes)
		 * Control + shift [ (Divide a mesma classe em duas janelas lado a lado) 
		 * Control + 1 (sugere alguma alternativa para a solução de um erro) 
		 * Control + 3 (ggas(gets e sets), ghcae(iquals e rache code), gcuf (construtores))
		 * Control + d (deleta uma linha) 
		 * Control + m (janela lateral) 
		 * Control + f11 (exibir a saída do console)
		 * Control + / (adiciona ou remove um comentário de linha única)
		 * Control + shift + seta (início e fim do documento) entre as classes) 
		 * Control + Shift + g (ver uma referência mais detalhada da classe, variável etc)
		 * Control + shift + l (listar todos os atalhos do eclipse) 
		 * Control + t (em cima de uma classe para ver quem é o pai daquela classe) 
		 * Control + shift + t (abre caixa, pesquisa nome de classe, aparece de onde estiver) 
		 * Control + shirf + r procura arquivos, ex: notas, também classes) 
		 * Control + . ou , (navega em meus erros(amarelos ou vermelhos);
		 * Control + n (criar uma nova classe ou arquivo, projeto etc)
		 * Alt + Shift + C (muda a assinatura do método); 
		 * Alt + shifit + A (seleciona e muda o nome de todos)
		 * Alt + shift + r (renomeia a variável em todos os lugares) programa) 
		 * Alt + f11 (expandir o tamnho da janela) 
		 * Windows > showviews > templates (criar um alias) 
		 * Alt + seta(cima,baixo) (vomer o trecho pela tela) 
		 * Alt + shift + m (seleciona o if e da o comando para criar uma
		 * função e colocar o if dentro)
		 * Alt + shift + x depois b (abilita uma aplicação spring boot)
		 */

	}

	public static void mostrarNome(String nome) {
		if (nome == "rodrigo") {

			System.out.println("olá rodriro");
		}
	}

}
