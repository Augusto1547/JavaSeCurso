package br.com.fuctura.intermediario.classesaninhadas;

public class Externa3Meu {

	public void metodoQualquer() {

		class Local {

			private String nome = "Augusto";
			private int idade = 35;
			private double salario = 2500.45;

			public void imprimeDados(int valor1, int valor2) {

				double total = (valor1 / valor2 * this.salario);
				if(nome == "Augusto" && idade == 35 && salario == 2500.45) {
					
					System.out.println(nome + " 10% de seu salário é : " +
					total + " e vai ser quardado na conta da economia");
				}
			}
			
		}
		Local oi = new Local();
		oi.imprimeDados(10,100);
	}

	public static void main(String[] args) {
         
		Externa3Meu externa = new Externa3Meu();
		externa.metodoQualquer();
	}

}
