package br.com.fuctura.poo.heranca;

public class Aluno extends Pessoa {

    private String serie;

    
    public Aluno(){
        
        super("oi", "ola", 33, 'f');
        
        super.setNome("Roberto Santos Carvalho");
        super.setIdade(34);
        super.senha = 3445;//eu sou subclasse por isso acesso a senha protected
        super.mostrarDados();
        
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {

        this.serie = serie;
    }
 

}
