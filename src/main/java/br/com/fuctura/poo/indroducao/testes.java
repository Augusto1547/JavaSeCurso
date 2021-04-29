package br.com.javase.poo.aulas.indroducao;

public class testes {

    public static void main(String[] args) {
        
        Carro fiat = new Carro();
        
        fiat.modelo = "Fiat";
        fiat.cor = "Azul";
        fiat.ano = 2020;
        fiat.preco = 10.987;
        fiat.pais = "Brasil";
        
        System.out.println(" Modelo " + fiat.modelo);
        System.out.println(" Cor " + fiat.cor);
        System.out.println(" Ano " + fiat.ano);
        System.out.println(" Preço " + fiat.preco);
        System.out.println(" País " + fiat.pais);
        
        fiat.fazerBarulho();

        Fiat novoFiat = new Fiat();
        
        novoFiat.modelo = "Fiat novo Estrada";
        novoFiat.cor = "Red";
        novoFiat.dono = "Augusto César dos Santos Cavalcanti";
        
        System.out.println("Modelo " + novoFiat.modelo);
        System.out.println("Cor " + novoFiat.cor);
        
        novoFiat.fazerBarulho1();
        
          
    }
    
}
    
   
