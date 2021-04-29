package br.com.javase.projetosPessoais.MediaDeAprovados;
//professor, tipoDeMateria = matematica, turno = noite, sala = primeiro ano, 
//mostrar a média dos aprovados da manhã,tarde e noite and your matters

public class School {

    private String matter;
    private String shift;
    private String identificationOfHall;

    private PeopleApproved studentsApproved;
    private PeopleDisapproved studentsDisapproved;

    /*
    private String alunoAprovado;

    private String horarioDaProva;
    private String semestreDaProva;
    private String dataDaProva;
    private String totalDeAlunos;
    private String alunosPresentes;
    private String alunosFaltosos;

    private String alunosReprovados;
    private double notaMinima;
    private double notaMaxima;
    
    public abstract void listarAprovados();
     */
    public School() {

    }

    public School(String matter, String shift, String identificationOfHall, PeopleApproved studentsApproved, PeopleDisapproved studentsDisapproved) {
        this.matter = matter;
        this.shift = shift;
        this.identificationOfHall = identificationOfHall;
        this.studentsApproved = studentsApproved;
        this.studentsDisapproved = studentsDisapproved;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {

        this.matter = matter;

    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {

        this.shift = shift;

    }

    public String getIdentificationOfHall() {
        return identificationOfHall;
    }

    public void setIdentificationOfHall(String identificationOfHall) {
        this.identificationOfHall = identificationOfHall;
    }

    public PeopleApproved getStudentsApproved() {
        return studentsApproved;
    }

    public void setStudentsApproved(PeopleApproved studentsApproved) {
        this.studentsApproved = studentsApproved;
    }

    public PeopleDisapproved getStudentsDisapproved() {
        return studentsDisapproved;
    }

    public void setStudentsDisapproved(PeopleDisapproved studentsDisapproved) {
        this.studentsDisapproved = studentsDisapproved;
    }

    public void showApprovedMathMorning() {

        studentsApproved.listApprovedMathMorningA();
    }

}
