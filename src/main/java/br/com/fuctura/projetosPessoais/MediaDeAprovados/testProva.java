package br.com.javase.projetosPessoais.MediaDeAprovados;

import java.util.Scanner;

public class testProva  {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Informe a : Matter");
        String matter = scan.nextLine();

        System.out.println("Informe o : Shift");
        String shift = scan.nextLine();

        System.out.println("Informe a : Grade");
        String grade = scan.nextLine();

        School firstGradeA = new School();
        
        PeopleApproved mathMorningFirstGrade = new PeopleApproved();

        if (matter.equals("matemática") && shift.equals("manhã") && grade.equals("primeira série")) {
            
            
            mathMorningFirstGrade.setMatterMath(matter);
            mathMorningFirstGrade.setShiftMath(shift);
            mathMorningFirstGrade.setGradeMath(grade);

            mathMorningFirstGrade.listApprovedMathMorningA();
            System.out.println();
            System.out.println("Professor : Fernando Aguiar");
            System.out.println("Primeira série A");
        }

    }
}
