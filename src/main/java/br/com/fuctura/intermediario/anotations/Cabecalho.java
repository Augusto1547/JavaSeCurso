package br.com.fuctura.intermediario.anotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//dei control + c e control + v lá em ErrosCorrigidos

//alvo   o tipo de elemento TYPE(faz referência a uma classe)
@Target(ElementType.TYPE)
@Documented //informa que minha anotação presisa ser documentada pelo java doc.Quando você estiver gerando a documentação do seu sistema você quer que essa interface apareça nessa documentação
public @interface Cabecalho {

	String instituicao();

	String projeto();

	String dataCriacao();

	String criador();

	int revisao() default 1;

}
