package br.com.fuctura.intermediario.classesaninhadas;

public class Externa2 {
//Quando for trabalhar com swing na hora de implementar as apxans dos elementos 
//você pode ver que pode ser declarado classes locais mas também pode usar em outro cenários
	
	private String texto = "Texto que pertence a classe externa"; //aqui foi um incremento meu
	
	public void metodoQualquer() {
		
		class ClasseLocal{
			
			private String texto = "texto classe local";
			
			public void imprimeTexto() {
				
				System.out.println(texto);
				System.out.println(Externa2.this.texto);
			}
		}
		ClasseLocal local = new ClasseLocal();
		local.imprimeTexto();
		
	}

	public static void main(String[] args) {

		Externa2 externa = new Externa2();
		externa.metodoQualquer();//permite que a classe externa acesse o método que em volve a classe interna
		
	}

}
