package br.com.fuctura.projetospessoais.aprovados.escola;

import br.com.fuctura.projetospessoais.aprovados.excecoes.NotaInvalida;

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

		if (notaAlunos <= 10) {

			this.notaAlunos = notaAlunos;

		} else {

			System.out.printf("%s : Mensagem : ", "Vai tomar no cú caralho");

		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunosAprovados other = (AlunosAprovados) obj;
		if (nomeAlunos == null) {
			if (other.nomeAlunos != null)
				return false;
		} else if (!nomeAlunos.equals(other.nomeAlunos))
			return false;
		if (notaAlunos == null) {
			if (other.notaAlunos != null)
				return false;
		} else if (!notaAlunos.equals(other.notaAlunos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AlunosAprovados [nomeAlunos=" + nomeAlunos + ", notaAlunos=" + notaAlunos + "]";
	}

}