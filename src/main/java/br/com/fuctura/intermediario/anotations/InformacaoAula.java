package br.com.fuctura.intermediario.anotations;

public @interface InformacaoAula {

	String autor(); // eu quero que essa anotações traga informações sobre o nome do autor, se eu
					// quisezze poderia usar um valor padrão

	int aulaNumero();

	String blog() default "http://loiane.com";// isso é se eu tenho um valor padrão ou seja fixo

	String site() default "http://loiane.training";
}

