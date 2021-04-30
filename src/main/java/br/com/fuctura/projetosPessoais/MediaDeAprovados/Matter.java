package br.com.fuctura.projetosPessoais.MediaDeAprovados;

public abstract class Matter {

    private String name;
    private String shift;
    private String grade;


    public Matter(String name, String shift, String grade) {
        this.name = name;
        this.shift = shift;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
