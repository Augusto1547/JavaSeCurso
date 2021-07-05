package br.com.fuctura.projetospessoais.aprovados.escola;

public class AlunosAprovados {
	private String nomeAlunos;
	private Double notaAlunos;

	public AlunosAprovados() {
		super();
	}

	public AlunosAprovados(String nomeAlunos, Double notaAlunos) {
		super();
		this.nomeAlunos = nomeAlunos;

		if (notaAlunos >= 11 && notaAlunos < 0) {
			System.out.println("nota precisa ficar entre 0 a 10 ");

		} else {
			this.notaAlunos = notaAlunos;

		}
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

		this.notaAlunos = notaAlunos;
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