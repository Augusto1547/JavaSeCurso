package br.com.javase.projetosPessoais.MediaDeAprovados;

public class PeopleApproved{
    //tava ok preenchido e sem colocar peter e outros nomes em inglês

    private String[] approvedMathMorningA = {"Pedro Henrique", "João Bosco Silva", "Eduardo Santorini"};
    private double[] gradeMathApprovedMorningA = {10, 9.8, 9};
    
    private String matterMath;
    private String shiftMath;
    private String gradeMath;

    private char separator = 45;

    public PeopleApproved() {

    }

    public PeopleApproved(String matterMat, String shiftMat, String gradeMat) {
        this.matterMath = matterMat;
        this.shiftMath = shiftMat;
        this.gradeMath = gradeMat;
    }

    public char getSeparator() {
        return separator;
    }

    public void setSeparator(char separator) {
        this.separator = separator;
    }

    public String[] getApproved() {
        return approvedMathMorningA;
    }

    public void setApproved(String[] approvedMathMorningA) {
        this.approvedMathMorningA = approvedMathMorningA;
    }

    public double[] getGradeMathApproved() {
        return gradeMathApprovedMorningA;
    }

    public void setGradeMathApproved(double[] gradeMathApprovedMorningA) {
        this.gradeMathApprovedMorningA = gradeMathApprovedMorningA;
    }

    public String getMatterMath() {
        return matterMath;
    }

    public void setMatterMath(String matterMath) {
        this.matterMath = matterMath;
    }

    public String getShiftMath() {
        return shiftMath;
    }

    public void setShiftMath(String shiftMath) {
        this.shiftMath = shiftMath;
    }

    public String getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(String gradeMath) {
        this.gradeMath = gradeMath;
    }

    public void listApprovedMathMorningA() {

        System.out.println("MATEMÁTICA PRIMEIRA SÉRIE A TURNO MANHÃ, ALUNOS APROVADOS \n");

        if (approvedMathMorningA != null && gradeMathApprovedMorningA != null) {

            System.out.println(approvedMathMorningA[0] + " " + separator
                    + " Nota de " + approvedMathMorningA[0] + " " + gradeMathApprovedMorningA[0]);

            System.out.println(approvedMathMorningA[1] + " " + separator
                    + " Nota de " + approvedMathMorningA[1] + " " + gradeMathApprovedMorningA[1]);

            System.out.println(approvedMathMorningA[2] + " " + separator
                    + " Nota de " + approvedMathMorningA[2] + " " + gradeMathApprovedMorningA[2]);
        }

    }
    
    public void listApprovedMathMorningB(){}

}
