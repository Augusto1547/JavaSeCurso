package br.com.fuctura.projetospessoais.aprovados.escola;

import java.util.Scanner;

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

			System.out.printf("Erro! %s", "Este professor não existe neste escola.");
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

			System.out.printf("Erro! %s", "Esta matéria não existe nesta escola.");
		}
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {

		if (turno.equalsIgnoreCase("manhã") || turno.equalsIgnoreCase("tarde") || turno.equalsIgnoreCase("noite")) {

			this.turno = turno;

		} else {

			System.out.printf("Erro! %s", "Este turno não existe neste escola.");
		}
	}

	public String getIdSala() {
		return idSala;
	}

	public void setIdSala(String idSala) {

		if (idSala.equalsIgnoreCase("a") || idSala.equalsIgnoreCase("b")) {

			this.idSala = idSala;

		} else {

			System.out.printf("Erro! %s", "Somente letra a ou b minúscula ou maiúscula");
		}
	}

	public static void main(String[] args) {
		
		SalaDeAula oi = new SalaDeAula();
		Scanner recebe = new Scanner(System.in);
 
		System.out.println("diga o professor");
		String professor = recebe.nextLine();
		oi.setInstrutor(professor);
		System.out.println("Diga a máteria");
		String materia = recebe.nextLine();
		oi.setMateria(materia);
		
		
		if(professor == "joão" && materia == "matemática") {
			
			System.out.printf("%s",oi.getInstrutor());
		}
	}
}
