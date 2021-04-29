
package br.com.javase.logica.aulas;

public class OperadoresLogicos {
    
    /*
    
      operadores lógicos(opções(| ||, 
      
    */
    
    public static void main(String[] args) {
        
       boolean one = false;
       boolean two = true;
       String system = "linux ubuntu";
       
       if((one = true && two == true) | system == "linux ubuntu") {
           
           System.out.println("I cought my sister fuck with my best friend");
       } else {
           
           System.out.println("I think error");
       }
        
    }
    
}
