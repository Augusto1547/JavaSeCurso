
package br.com.fuctura.logica;

public class OperadoresLogicos {
    
    /*
    
      operadores lógicos(opções(| ||, 
      
    */
    // & verifica os dois mesmo que o primeiro já tenha um erro
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
