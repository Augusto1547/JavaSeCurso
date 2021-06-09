package br.com.fuctura.projetospessoais.aprovados.escola;

public class AlunosAprovados {

	String nomeAlunos;
	Double notaAlunos;

	public AlunosAprovados() {
		super();
	}

	public AlunosAprovados(String nomeAlunos, Double notaAlunos) {
		super();
		this.nomeAlunos = nomeAlunos;
		this.notaAlunos = notaAlunos;
	}

	public String getNomeAlunos() {
		return nomeAlunos;
	}

	public void setNomeAlunos(String nomeAlunos) {
		this.nomeAlunos = nomeAlunos;
	}

	public Double getNotaAlunos() {
		return notaAlunos;
	}

	public void setNotaAlunos(Double notaAlunos) {

		if (notaAlunos >= 6 && notaAlunos == 10) {

			this.notaAlunos = notaAlunos;

		} else {

			System.out.printf("Erro! %s", " Apenas maiores que 6 e menores que 11");
		}
	}

}