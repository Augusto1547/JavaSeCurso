package br.com.fuctura.intermediario.anotations;

//existem anotações que não precisamos passar nada mas nesse caso de autor e número de aula precisa
//podemos definir se uma anotação vai ser utilizada numa classe, método ou atributo
@InformacaoAula(
		
		autor = "Loiana",
		aulaNumero = 65, 
		blog = "loiane.com" //aqui estou sobreescrevendo o valor que já está lá na anotação
)
public class Teste {

	@InformacaoAula(//opcional estou complementando aqui
			
			autor = "Loiana",
			aulaNumero = 65, 
			blog = "loiane.com" //aqui estou sobreescrevendo o valor que já está lá na anotação
	)
	public static void main(String[] args) {
		/*
		 * Existem métodos mais avançados de se criar anotações como em tempo de de
		 * compilação e execução mas são casos mais específicos como na criação meu
		 * próprio frakework ou uma api caso contrário só usamos as anotações que os
		 * frameworks e as apis que vamos usar em nosso progama pedem para utilizarmos
		 * em nosso programa
		 */
		System.out.println("testando");
	}

}
