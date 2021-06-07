package br.com.fuctura.logica.desafios;

public @interface Cabecalho {

	String instituicao();

	String projeto();

	String dataCriacao();

	int numeroErros();
	
	String autor() default "Augusto César";
}
