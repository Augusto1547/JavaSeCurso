package br.com.fuctura.intermediario.classesaninhadas;
//classes aninhadas devem ser usadas com cuidado, pode deixar código grande

public class ExternaMeu {

	String nome = "Augusto";
	int idade = 35;
	double salario = 1356.469;

	public class Interna {

		String titulo = "\t\t\t\t TRABALHANDO COM CLASSES ANINHADAS";

		double adicionaHoraExtra(double extra) {

			double total = ExternaMeu.this.salario + extra;
			return total;
		}

		public void retornaDados() {
			
			System.out.println(titulo + "\n");
			System.out.printf("Funcionário :%s, Idade : %d, Salário inicial: %.2f \n", nome, idade, salario);
			System.out.println("Com hora extra: " + adicionaHoraExtra(356.00));
		}

	}

	public static void main(String[] args) {

		ExternaMeu externa = new ExternaMeu();

		Interna interna = externa.new Interna();
		interna.retornaDados();
	}
}
