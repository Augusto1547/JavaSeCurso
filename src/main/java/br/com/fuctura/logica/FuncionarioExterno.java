package br.com.javase.logica.aulas;
import br.com.javase.poo.aulas.modificadores.Funcionario;

public class FuncionarioExterno {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        
        f.nome = "Guilherme";
        System.out.println(f.nome);
        
        Funcionario fernando = new Funcionario("Jonatas","Brando",5,4.3);
        
        System.out.println("Nome " + fernando.nome);

    }
}
