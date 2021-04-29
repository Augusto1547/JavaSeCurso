package br.com.javase.logica.aulas;

import br.com.javase.poo.aulas.superclasses.*;


public class Externas extends Animal {
    
    public Externas(String raca, int idade) {
        super(raca, idade);
        

    }
    
    public void mostrarCorProtegida(){
        
        super.cor = "Azul";
        this.dono = "Fernandinho";
    }
     
     
}
