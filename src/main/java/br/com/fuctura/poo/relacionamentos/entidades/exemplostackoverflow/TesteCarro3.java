package br.com.fuctura.poo.relacionamentos.entidades.exemplostackoverflow;

//https://www.youtube.com/watch?v=nmJ4txOdfPw&ab_channel=MayconGuedes (referência)
//https://www.youtube.com/watch?v=JaacesuuzYY&ab_channel=Rog%C3%A9rioAra%C3%BAjo (mensagem entre objetos)
//universidade xti
public class TesteCarro3 {

	public static void main(String[] args) {

		// Tem uma referência ferrari a um objeto do tipo Carro3
		// Metodo estático só pode ser acessado por outro método estatico 
		// Os métodos não estáticos só podem ser acessados pela a instância da classe
		Carro3 ferrari = new Carro3("Ferrari Enso", 220.00, new Motor3("V12",660));
        System.out.println(ferrari.getModelo() + " " + ferrari.getVeloMaxima() +
        		" " + ferrari.getMotor().getTipoMotor());
        
		//		System.out.println(ferrari + ferrari.getMotor().getTipoMotor());

	}
}
