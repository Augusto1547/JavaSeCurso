package br.com.javase.poo.aulas.modificadores;

public class FuncionarioPacote {
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        
        f.cor = "Branco"; //sem modificador(packege)
        f.nome = "Frederíco"; //public
        f.idade = 3; //protected
        //private não tive acesso
        
        System.out.println(f.cor); //package pode ser acessado aqui
        //pois está no mesmo pacote
        
    }

}
