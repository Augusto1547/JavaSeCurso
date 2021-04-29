package br.com.javase.projetosPessoais.MediaDeAprovados;

public class PeopleDisapproved {

    private String[] disapproved = {"Henrique Araujo", "Gustavo Serbasi", "Maria Eloísa"};
    private double[] gradesDisapproved = {2.4, 3.8, 9.7};

    private String matter;
    private String shift;
    private String grade;

    char separator = 45;

    public PeopleDisapproved() {

    }

    public PeopleDisapproved(String matter, String shift, String grade) {
        this.matter = matter;
        this.shift = shift;
        this.grade = grade;
    }

    public String[] getDisapproved() {
        return disapproved;
    }

    public void setDisapproved(String[] disapproved) {
        this.disapproved = disapproved;
    }

    public double[] getGradesDisapproved() {
        return gradesDisapproved;
    }

    public void setGradesDisapproved(double[] gradesDisapproved) {
        this.gradesDisapproved = gradesDisapproved;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public char getSeparator() {
        return separator;
    }

    public void setSeparator(char separator) {
        this.separator = separator;
    }

    public void listarReprovados() {

        System.out.println("ALUNOS QUE FORAM REPROVADOS \n");

        if (disapproved != null) {

            System.out.println(disapproved[0] + " " + separator
                    + " Nota de " + disapproved[0] + " " + gradesDisapproved[0]);

            System.out.println(disapproved[1] + " " + separator
                    + " Nota de " + disapproved[1] + " " + gradesDisapproved[1]);

            System.out.println(disapproved[2] + " " + separator
                    + " Nota de " + disapproved[2] + " " + gradesDisapproved[2]);
        }

    }

}
