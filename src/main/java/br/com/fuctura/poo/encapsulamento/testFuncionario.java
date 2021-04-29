
package br.com.javase.poo.aulas.encapsulamento;

import java.math.BigDecimal;

public class testFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        
        BigDecimal salario = new BigDecimal(f.getSalario());
        
    }
    
}
