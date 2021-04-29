package br.com.javase.projetosPessoais.MediaDeAprovados;

public class Mathematics extends Matter {

    String[] approvedFirstGradeAMorning = {"Pedro Henrique Solza Leão",
        "João Fernandes Garcia",
        "Felipe Araújo Ghuilhere"};

    double[] scoreFirstGradeA = {10, 6.9, 9.8};

    String[] approvedFirstGradeBMorning = {"Leandro Silvestre Solsa",
        "Estavão Souza Araújo",
        "Maria Eduarda Silva Santos"};

    double[] scoreFirstGradeB = {10, 10, 10};

    //first grade morning
    String[] approvedSecondGradeAMorning = {"Leo Santana",
        "Gustavo Borges Silveira",
        "Maria Gabriela Sousa Pinto", "João Cabral de Melo Neto"};

    double[] scoreSecondGradeA = {9.5, 10, 7.6, 9};

    String[] approvedSecondGradeBMorning = {"Sílvio Amorin José",
        "Gabriel Diniz Fernandes",
        "Juliana Paes", "Roberto Jerferson Gonsalvez", "Sergio Portióli Junior", "Lucas Montano"};

    double[] scoreSecondGradeB = {10, 6, 10, 8, 9, 10};
    //second grade morning
    
    
    
    
    
    String[] approvedThirdGradeAMorning = {"Leo Santana",
        "Gustavo Borges Silveira",
        "Maria Gabriela Sousa Pinto", "João Cabral de Melo Neto", "Felipe Neto",
        "Gonsalvez Dias","Luciano Araújo","Gabriela Pontes Ferrais"};

    double[] scoreThirdGradeA = {9.5, 10, 7.6, 9, 8, 10, 10, 8};

    String[] approvedThirdGradeBMorning = {"Sílvio Amorin José",
        "Gabriel Diniz Fernandes",
        "Juliana Paes", "Roberto Jerferson Gonsalvez", "Sergio Portióli Junior",
        "Lucas Montano","Guto Guimarães Rosa","Roberto Jerferson","Mairo Vergara"};

    double[] scoreThirdGradeB = {10, 6, 10, 8, 9, 10, 6.6, 7, 9};
    //third grade morning
    
    
    
    
    
    
    
    
    String[] approvedFourthGradeAMorning = {"Leo Santana",
        "Samara Silva Marquez",
        "Gizelle Ferreira Larrissa", "Gabriella Santana de Vasconcelos", "Marcos Feliciano",
        "Eduardo Ferreira Santos Aguiar","José Ilbemer","Luan Santana Magalhães",
        "Juliana Paz", "Hugo Gelardino nobre"};

    double[] scoreFourthGradeA = {9.5, 10, 7.6, 9, 8, 10, 10, 8, 7, 10};

    String[] approvedFourthGradeBMorning = {"Sandra de Sá",
        "Lucas montano",
        "Pedro Calabrez", "Giordano Bruno", "Katiele Markes de Lira",
        "João Cabral de Melo Neto","Gugu Liberato","Ivanilda Souza Nobre",
        "Augusto César dos Santos Cavalcanti", "Pedro De Lara", "Rodrigo Faro",
        "Rivelino Gois Silva"};

    double[] scoreFourthGradeB = {10, 6, 10, 8, 9, 10, 6.6, 7, 9, 10, 10, 10};
    //fourth grade morning
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void showMathematicsFirstGradeAMorning() {

        System.out.println("\t \t  NOMES E NOTAS DOS APROVADOS PRIMEIRA SÉRIE A\n"
                + approvedFirstGradeAMorning[0] + " " + scoreFirstGradeA[0] + " \n"
                + approvedFirstGradeAMorning[1] + " " + scoreFirstGradeA[1] + " \n"
                + approvedFirstGradeAMorning[2] + " " + scoreFirstGradeA[2]);
        System.out.println();
    }

    @Override
    public void showMathematicsFirstGradeBMorning() {

        System.out.println("\t \t  NOMES E NOTAS DOS APROVADOS PRIMEIRA SÉRIE B\n"
                + approvedFirstGradeBMorning[0] + " " + scoreFirstGradeB[0] + " \n"
                + approvedFirstGradeBMorning[1] + " " + scoreFirstGradeB[1] + " \n"
                + approvedFirstGradeBMorning[2] + " " + scoreFirstGradeB[2]);
        System.out.println();
    }
    //first grade morning

    @Override
    public void showMathematicsSecondGradeAMorning() {

        System.out.println("\t \t  NOMES E NOTAS DOS APROVADOS SEGUNDA SÉRIE A\n"
                + approvedSecondGradeAMorning[0] + " " + scoreSecondGradeA[0] + " \n"
                + approvedSecondGradeAMorning[1] + " " + scoreSecondGradeA[1] + " \n"
                + approvedSecondGradeAMorning[2] + " " + scoreSecondGradeA[2] + " \n"
                + approvedSecondGradeAMorning[3] + " " + scoreSecondGradeA[3]);
        System.out.println();
    }

    @Override
    public void showMathematicsSecondGradeBMorning() {

        System.out.println("\t \t  NOMES E NOTAS DOS APROVADOS SEGUNDA SÉRIE B\n"
                + approvedSecondGradeBMorning[0] + " " + scoreSecondGradeB[0] + " \n"
                + approvedSecondGradeBMorning[1] + " " + scoreSecondGradeB[1] + " \n"
                + approvedSecondGradeBMorning[2] + " " + scoreSecondGradeB[2] + " \n"
                + approvedSecondGradeBMorning[3] + " " + scoreSecondGradeB[3] + " \n"
                + approvedSecondGradeBMorning[4] + " " + scoreSecondGradeB[4] + " \n"
                + approvedSecondGradeBMorning[5] + " " + scoreSecondGradeB[5] + " \n");
        System.out.println();
    }
    //second grade morning
    
    
    
    
    
    
    
    
    @Override
    public void showMathematicsThirdGradeAMorning() {
        
        System.out.println("\t \t  NOMES E NOTAS DOS APROVADOS TERCEIRA SÉRIE A\n"
                + approvedThirdGradeAMorning[0] + " " + scoreThirdGradeA[0] + " \n"
                + approvedThirdGradeAMorning[1] + " " + scoreThirdGradeA[1] + " \n"
                + approvedThirdGradeAMorning[2] + " " + scoreThirdGradeA[2] + " \n"
                + approvedThirdGradeAMorning[3] + " " + scoreThirdGradeA[3] + "\n" 
                + approvedThirdGradeAMorning[4] + " " + scoreThirdGradeA[4] + " \n"
                + approvedThirdGradeAMorning[5] + " " + scoreThirdGradeA[5] + " \n" 
                + approvedThirdGradeAMorning[6] + " " + scoreThirdGradeA[6] + " \n"
                + approvedThirdGradeAMorning[7] + " " + scoreThirdGradeA[7] + " \n");
    }
    //falta inserir a quarta série aqui nesses dois
    
    @Override
    public void showMathematicsThirdGradeBMorning() {
        
        System.out.println("\t \t  NOMES E NOTAS DOS APROVADOS TERCEIRA SÉRIE B\n"
                + approvedThirdGradeBMorning[0] + " " + scoreThirdGradeB[0] + " \n"
                + approvedThirdGradeBMorning[1] + " " + scoreThirdGradeB[1] + " \n"
                + approvedThirdGradeBMorning[2] + " " + scoreThirdGradeB[2] + " \n"
                + approvedThirdGradeBMorning[3] + " " + scoreThirdGradeB[3] + " \n"
                + approvedThirdGradeBMorning[4] + " " + scoreThirdGradeB[4] + " \n"
                + approvedThirdGradeBMorning[5] + " " + scoreThirdGradeB[5] + " \n"
                + approvedThirdGradeBMorning[6] + " " + scoreThirdGradeB[6] + " \n"
                + approvedThirdGradeBMorning[7] + " " + scoreThirdGradeB[7] + " \n"
                + approvedThirdGradeBMorning[8] + " " + scoreThirdGradeB[8]);
    }
    //third grade morning
    
    
    
    
    
    @Override
    public void showMathematicsFourthGradeAMorning() {
        
        
    }
    
    @Override
    public void showMathematicsFourthGradeBMorning() {
        
       
    }
    //fourth grade morning
   
    
    
    
    
    
    
    
    
    
    

    @Override
    public void showMathematicsFirstGradeAfternoon() {
        super.showMathematicsFirstGradeAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFirstGradeBafternoon() {
        super.showMathematicsFirstGradeBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFirstGradeAnight() {
        super.showMathematicsFirstGradeAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFirstGradeBnight() {
        super.showMathematicsFirstGradeBnight(); //To change body of generated methods, choose Tools | Templates.
    }
    //first grade

    @Override
    public void showMathematicsThirdYearBnight() {
        super.showMathematicsThirdYearBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsThirdYearAnight() {
        super.showMathematicsThirdYearAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsThirdYearBafternoon() {
        super.showMathematicsThirdYearBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsThirdYearAfternoon() {
        super.showMathematicsThirdYearAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSecondYearBnight() {
        super.showMathematicsSecondYearBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSecondYearAnight() {
        super.showMathematicsSecondYearAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSecondYearBafternoon() {
        super.showMathematicsSecondYearBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSecondYearAfternoon() {
        super.showMathematicsSecondYearAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFirstYearBnight() {
        super.showMathematicsFirstYearBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFirstYearAnight() {
        super.showMathematicsFirstYearAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFirstYearBafternoon() {
        super.showMathematicsFirstYearBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFirstYearAfternoon() {
        super.showMathematicsFirstYearAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsEighthGradeBnight() {
        super.showMathematicsEighthGradeBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsEighthGradeAnight() {
        super.showMathematicsEighthGradeAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsEighthGradeBafternoon() {
        super.showMathematicsEighthGradeBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsEighthGradeAfternoon() {
        super.showMathematicsEighthGradeAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsEighthGradeBMorning() {
        super.showMathematicsEighthGradeBMorning(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsEighthGradeAMorning() {
        super.showMathematicsEighthGradeAMorning(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSeventhGradeBnight() {
        super.showMathematicsSeventhGradeBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSeventhGradeAnight() {
        super.showMathematicsSeventhGradeAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSeventhGradeBafternoon() {
        super.showMathematicsSeventhGradeBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSeventhGradeAfternoon() {
        super.showMathematicsSeventhGradeAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSeventhGradeBMorning() {
        super.showMathematicsSeventhGradeBMorning(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSeventhGradeAMorning() {
        super.showMathematicsSeventhGradeAMorning(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSixthGradeBnight() {
        super.showMathematicsSixthGradeBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSixthGradeAnight() {
        super.showMathematicsSixthGradeAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSixthGradeBafternoon() {
        super.showMathematicsSixthGradeBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSixthGradeAfternoon() {
        super.showMathematicsSixthGradeAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSixthGradeBMorning() {
        super.showMathematicsSixthGradeBMorning(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSixthGradeAMorning() {
        super.showMathematicsSixthGradeAMorning(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFifthGradeBnight() {
        super.showMathematicsFifthGradeBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFifthGradeAnight() {
        super.showMathematicsFifthGradeAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFifthGradeBafternoon() {
        super.showMathematicsFifthGradeBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFifthGradeAfternoon() {
        super.showMathematicsFifthGradeAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFifthGradeBMorning() {
        super.showMathematicsFifthGradeBMorning(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFifthGradeAMorning() {
        super.showMathematicsFifthGradeAMorning(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFourthGradeBnight() {
        super.showMathematicsFourthGradeBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFourthGradeAnight() {
        super.showMathematicsFourthGradeAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFourthGradeBafternoon() {
        super.showMathematicsFourthGradeBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsFourthGradeAfternoon() {
        super.showMathematicsFourthGradeAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void showMathematicsThirdGradeBnight() {
        super.showMathematicsThirdGradeBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsThirdGradeAnight() {
        super.showMathematicsThirdGradeAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsThirdGradeBafternoon() {
        super.showMathematicsThirdGradeBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsThirdGradeAfternoon() {
        super.showMathematicsThirdGradeAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void showMathematicsSecondGradeBnight() {
        super.showMathematicsSecondGradeBnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSecondGradeAnight() {
        super.showMathematicsSecondGradeAnight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSecondGradeBafternoon() {
        super.showMathematicsSecondGradeBafternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMathematicsSecondGradeAfternoon() {
        super.showMathematicsSecondGradeAfternoon(); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        
        try{
        Mathematics oi = new Mathematics();

        oi.showMathematicsFirstGradeAMorning();
        oi.showMathematicsFirstGradeBMorning();

        oi.showMathematicsSecondGradeAMorning();
        oi.showMathematicsSecondGradeBMorning();
        
        oi.showMathematicsThirdGradeAMorning();
        oi.showMathematicsThirdGradeBMorning();
        
        }catch(Exception error) {
            
            System.out.println("Mensagem de erro: " + error);
        
        }finally{
            
            System.out.println("Fim");
        }
    }

}
