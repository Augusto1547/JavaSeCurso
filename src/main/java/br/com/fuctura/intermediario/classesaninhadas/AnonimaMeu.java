package br.com.fuctura.intermediario.classesaninhadas;

public class AnonimaMeu {
	
	
	public void imprimeMensagem() {
		
		System.out.println("mensagem que será sobreescrita");
	}

	public static void main(String[] args) {
		
		AnonimaMeu preparaSobreescrita = new AnonimaMeu() {
			
			public void imprimeMensagem() {
				
				System.out.println("Eu sobreescrevi esse método");
			}
			
		};
        preparaSobreescrita.imprimeMensagem();
		
	}

}
