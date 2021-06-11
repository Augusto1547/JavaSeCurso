package br.com.fuctura.projetospessoais.aprovados.escola;

import br.com.fuctura.poo.sobrecargaDeMetodos.Matematica;
import br.com.fuctura.projetospessoais.aprovados.excecoes.IdentificacaoInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.MateriaInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.ProfessorInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.SerieInexistente;
import br.com.fuctura.projetospessoais.aprovados.excecoes.TurnoInexistente;

@Cabecalho(
//@formatter:off
		autor = "Augusto",
		dataCriacao = "05/06/2021",
        projeto = "Sistema de mostragem de alunos aprovados"
//@formatter:on
)
public abstract class SalaDeAula {

	private String instrutor;
	private String materia;
	private String serie;
	private String idSala;
	private String turno;

	public AlunosAprovados alunosAprovados;
	public Matematica matematica;

	public SalaDeAula() {
		super();
	}

	public SalaDeAula(String instrutor, String materia, String serie, String turno, String idSala) {
		super();
		this.instrutor = instrutor;
		this.materia = materia;
		this.serie = serie;
		this.turno = turno;
		this.idSala = idSala;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) throws ProfessorInexistente {// informa para o método que ele pode
																			// disparar essa exceção

		if (instrutor.equalsIgnoreCase("pedro") || instrutor.equalsIgnoreCase("mateus")
				|| instrutor.equalsIgnoreCase("felipe") || instrutor.equalsIgnoreCase("joão")
				|| instrutor.equalsIgnoreCase("roberto") || instrutor.equalsIgnoreCase("andré")
				|| instrutor.equalsIgnoreCase("fernando") || instrutor.equalsIgnoreCase("alexandre")
				|| instrutor.equalsIgnoreCase("maria") || instrutor.equalsIgnoreCase("joana")) {

			this.instrutor = instrutor;

		} else {

			throw new ProfessorInexistente();
		}
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) throws MateriaInexistente {

		if (materia.equalsIgnoreCase("matemática") || materia.equalsIgnoreCase("português")
				|| materia.equalsIgnoreCase("história") || materia.equalsIgnoreCase("geofrafia")
				|| materia.equalsIgnoreCase("química") || materia.equalsIgnoreCase("física")
				|| materia.equalsIgnoreCase("biologia") || materia.equalsIgnoreCase("sociologia")
				|| materia.equalsIgnoreCase("filosofia") || materia.equalsIgnoreCase("artes")) {

			this.materia = materia;

		} else {

			throw new MateriaInexistente();
		}
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) throws SerieInexistente {
		if (serie.equalsIgnoreCase("primeira série") || serie.equalsIgnoreCase("segunda série")
				|| serie.equalsIgnoreCase("terceira série") || serie.equalsIgnoreCase("quarta série")
				|| serie.equalsIgnoreCase("quinta série") || serie.equalsIgnoreCase("sexta série")
				|| serie.equalsIgnoreCase("sétima série") || serie.equalsIgnoreCase("oitava série")
				|| serie.equalsIgnoreCase("primeiro ano") || serie.equalsIgnoreCase("segundo ano")
				|| serie.equalsIgnoreCase("terceiro ano")) {

			this.serie = serie;

		} else {

			throw new SerieInexistente();
		}
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) throws TurnoInexistente {

		if (turno.equalsIgnoreCase("manhã") || turno.equalsIgnoreCase("tarde") || turno.equalsIgnoreCase("noite")) {

			this.turno = turno;

		} else {
			
			throw new TurnoInexistente();
		}
	}

	public String getIdSala() {
		return idSala;
	}

	public void setIdSala(String idSala) throws IdentificacaoInexistente {

		if (idSala.equalsIgnoreCase("a") || idSala.equalsIgnoreCase("b")) {

			this.idSala = idSala;

		} else {
			
			throw new IdentificacaoInexistente();

		}
	}

}
