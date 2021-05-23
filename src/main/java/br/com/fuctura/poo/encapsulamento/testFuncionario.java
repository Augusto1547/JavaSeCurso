
package br.com.fuctura.poo.encapsulamento;

import java.math.BigDecimal;

public class testFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        
        BigDecimal salario = new BigDecimal(f.getSalario());
        
    }
    
}
