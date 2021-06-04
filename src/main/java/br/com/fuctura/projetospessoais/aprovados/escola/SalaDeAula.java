package br.com.fuctura.projetospessoais.aprovados.escola;

//import java.util.Scanner;

public class SalaDeAula {

	private String instrutor;
	private String materia;
	private String serie;
	private String turno;
	private String idSala;

	public AlunosAprovados alunosAprovados;

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
		if (serie.equalsIgnoreCase("primeira") || serie.equalsIgnoreCase("segunda")
				|| serie.equalsIgnoreCase("terceira") || serie.equalsIgnoreCase("quarta")
				|| serie.equalsIgnoreCase("quinta") || serie.equalsIgnoreCase("sexta")
				|| serie.equalsIgnoreCase("sétima") || serie.equalsIgnoreCase("oitava")
				|| serie.equalsIgnoreCase("primeiro") || serie.equalsIgnoreCase("segundo")
				|| serie.equalsIgnoreCase("terceiro")) {

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
/*
	public static void main(String[] args) {

		SalaDeAula oi = new SalaDeAula();
		Scanner recebe = new Scanner(System.in);

		System.out.println("diga o professor");
		String professor = recebe.nextLine();
		oi.setInstrutor(professor);

		System.out.println("Diga à matéria");
		String materia = recebe.nextLine();
		oi.setMateria(materia);

		System.out.println("diga à série");
		String serie = recebe.nextLine();
		oi.setSerie(serie);

		System.out.println("Qual é a sala");
		String sala = recebe.nextLine();
		oi.setIdSala(sala);

		System.out.println("Diga o turno");
		String turno = recebe.nextLine();
		oi.setTurno(turno);

		if (professor.equalsIgnoreCase("joão") || materia.equalsIgnoreCase("matemática")
				|| serie.equalsIgnoreCase("primeira") || turno.equalsIgnoreCase("manhã")
				|| sala.equalsIgnoreCase("a")) {

			System.out.printf("Nome : %s Nota : %-10.2f", "Augusto César dos Santos", 9.9);
		}

	}
	*/
}
