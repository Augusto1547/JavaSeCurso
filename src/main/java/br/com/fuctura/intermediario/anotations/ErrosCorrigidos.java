package br.com.fuctura.intermediario.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
public @interface ErrosCorrigidos {
   //Não é permitido usar tipos que não sejam primitivos
   //String apesar de parecer um objeto é considerado uma string
	
   String[] erros();
   //String[] value(); // alternativa ao de cima não precisa colcoar 
   //apenas coloca assim:@ErrosCorrigidos("0001")
	
}
