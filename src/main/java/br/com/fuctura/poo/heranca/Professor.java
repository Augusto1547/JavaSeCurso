package br.com.javase.poo.aulas.heranca;

public class Professor extends Pessoa {
   
    private String profissao;
    private int idade;

   public Professor(){
        
        super("oi", "ola", 33, 'f');
        
        super.setNome("Professor ramos");
        super.mostrarDados();
        super.setIdade(34);
        //super.serial = 384995; no pai está private
        this.idade = 22;
    }

    
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    

}
