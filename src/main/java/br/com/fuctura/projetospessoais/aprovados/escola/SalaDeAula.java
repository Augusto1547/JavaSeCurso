package br.com.fuctura.projetospessoais.aprovados.escola;

import br.com.fuctura.poo.sobrecargaDeMetodos.Matematica;

@Cabecalho(
//@formatter:off
		autor = "Augusto",
		dataCriacao = "05/06/2021",
        projeto = "Sistema de análise de alunos aprovados"
//@formatter:on
)
public class SalaDeAula {

	private String instrutor;
	private String materia;
	private String serie;
	private String turno;
	private String idSala;

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

	public void setInstrutor(String instrutor) {

		if (instrutor.equalsIgnoreCase("pedro") || instrutor.equalsIgnoreCase("mateus")
				|| instrutor.equalsIgnoreCase("felipe") || instrutor.equalsIgnoreCase("joão")
				|| instrutor.equalsIgnoreCase("roberto") || instrutor.equalsIgnoreCase("andré")
				|| instrutor.equalsIgnoreCase("fernando") || instrutor.equalsIgnoreCase("alexandre")
				|| instrutor.equalsIgnoreCase("maria") || instrutor.equalsIgnoreCase("joana")) {

			this.instrutor = instrutor;

		} else {

			System.out.printf("Mistake! %s %n", "Dont't exist this teacher on school");
			System.exit(0);
		}
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {

		if (materia.equalsIgnoreCase("matemática") || materia.equalsIgnoreCase("português")
				|| materia.equalsIgnoreCase("história") || materia.equalsIgnoreCase("geofrafia")
				|| materia.equalsIgnoreCase("química") || materia.equalsIgnoreCase("física")
				|| materia.equalsIgnoreCase("biologia") || materia.equalsIgnoreCase("sociologia")
				|| materia.equalsIgnoreCase("filosofia") || materia.equalsIgnoreCase("artes")) {

			this.materia = materia;

		} else {

			System.out.printf("Mistake!! %s %n", "This matéria not existe on school");
			System.exit(0);
		}
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		if (serie.equalsIgnoreCase("primeira série") || serie.equalsIgnoreCase("segunda série")
				|| serie.equalsIgnoreCase("terceira série") || serie.equalsIgnoreCase("quarta série")
				|| serie.equalsIgnoreCase("quinta série") || serie.equalsIgnoreCase("sexta série")
				|| serie.equalsIgnoreCase("sétima série") || serie.equalsIgnoreCase("oitava série")
				|| serie.equalsIgnoreCase("primeiro ano") || serie.equalsIgnoreCase("segundo ano")
				|| serie.equalsIgnoreCase("terceiro ano")) {

			this.serie = serie;

		} else {

			System.out.printf("Mistake! %s %n", "This série not exit on school");
			System.exit(0);
		}
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {

		if (turno.equalsIgnoreCase("manhã") || turno.equalsIgnoreCase("tarde") || turno.equalsIgnoreCase("noite")) {

			this.turno = turno;

		} else {

			System.out.printf("Mistake!! %s %n", "This turno not exist.");
			System.exit(0);
		}
	}

	public String getIdSala() {
		return idSala;
	}

	public void setIdSala(String idSala) {

		if (idSala.equalsIgnoreCase("a") || idSala.equalsIgnoreCase("b")) {

			this.idSala = idSala;

		} else {

			System.out.printf("Mistake!! %s %n", "This letter not exist tente a or b");
			System.exit(0);
		}
	}

}
