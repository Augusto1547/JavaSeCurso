package br.com.fuctura.logica;

public class ConversaoImplicitaExplicita {

	public static void main(String[] args) {

		//implicita: byte pode ir pro short, o short pro int,
		//o int pro long, o float pro double a de baixo não respeita isso
//		double a = 10.0;   
//		int b = a; 
		
		//explicíta : vonversão(casting) só vai retornar a parte inteira
		double c = 10.9;
		int d = (int)c;
		
		System.out.println(d);
		
		long e = 1083998839;
		int f = (int)e;
		
		System.out.println(f);
		
		
	}

}
