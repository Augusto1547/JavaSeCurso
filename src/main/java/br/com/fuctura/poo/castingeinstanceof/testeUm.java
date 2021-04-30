package br.com.fuctura.poo.castingeinstanceof;

public class testeUm {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //upcasting exemplo1 
        //pessoaAluno só tem acesso aos dados da classe pai

        Pessoa aluno2 = new Aluno();//upcasting
        
        //mesma coisa que a de cima só acessa da pai
        
        
        Pessoa aluno3 = (Pessoa) new Aluno();//upcasting
        //esse processo é chamado de conversão java
        //tem acesso aos dados da classe pai e filha
        //e coloque pessoa como abstrata e ainda tive acesso
        //a ela esse tipo aqui é muito usado no hibernate
        
        
        /*            Down Casting       */
    
        Pessoa aluno4 = new Pessoa();
        Aluno aluno5 = (Aluno) aluno4; //naturalmenteo o menor não
        //recebe o maior
        System.out.println(aluno5);
        Aluno aluno6 = (Aluno) new Pessoa(); //naturalmente o menor não
        //recebe o maior
        Aluno aluno7 = (Aluno) new Pessoa();//erro de conversão
     
        
        if(aluno6 instanceof Pessoa){
            System.out.println("Aluno 6 é uma instância de pessoa");
        }else{
            System.out.println("não é inst");
        }
       
    }

}
