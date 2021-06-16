/*
 *                 OUTRAS AULAS
 *digamos que você tem 3 threads cada uma executando tarefas diferentes e você quer que em determinado ponto
 *força que essas 3 threads espere umas pelas outras, quando chegar a determinado ponto você quer que aquela
 *thread fique parada esperando que outras mais threads atinjam aquele mesmo ponto ou um outro ponto se for
 *tarefas diferentes. Por exemplo 
 * 
 * 
 * */
package br.com.fuctura.intermediario.threadsmetodoeblocoscinclonizados;

/*
 * 	                      VAMOS APRENDER SOBRE MÉTODOS E BLOCOS SINCLONIZADOS
 * Quando duas ou mais threads tentam acessar o mesmo recurso ao mesmo tempo somente
 * uma thread que pode acessar o recurso por vez. Então para que duas ou mais threads
 * não possa acessar o mesmo recurso de uma vez - e com isso alterar a 
 * saída do progama que agente está esperando, pra isso agente tem que cincronizar o 
 * código para garantir que somente uma thread vai acessar aquele recurso. E pra fazer
 * isso no java nós utilizamos a palavra chave synchronized, nós podemos utilizar isso
 * num método ou agente pode usar num bloco de código passando qual que é o recurso que
 * pode ser compartilhado e acessado pelas threads
 */
public class Calculadora {// Pra que essa classe fique compartilhada entre duas ou mais threads nós vamos
	// mudar essa classe para stática(private static Calculadora calc = new Calculadora();) 
	// assim duas ou mais threads poderá acessar a mesma instância dessa classe e é nesse acesso 
	//que pode ocorrer o erro de o metodo ou o recurso não está sincronizado ai agente poderá ver a 
	//diferença entre um código sincronizado e um não sincronizado.

	private int soma;

	// depois que eu criei todo o código é que utilizei o synchronized para conseguir especificar o acesso
	public synchronized int somaArray(int[] array) {

		soma = 0;

		for (int i = 0; i < array.length; i++) {

			soma += array[i];

			//estou passando isso aqui para que essa soma seja compartilhada pelas threads então para cada 
			//passada de for pedimos que seja esperado um pouquinho.
			System.out.println("Executando a soma " + Thread.currentThread().getName() + " soma o valor " + array[i]
					+ " com total de " + soma);//essa saída sem ela já retorna um resultado qualquer(comentar)

			try {//esse bloco sem ele já retorna um resultado qualquer(comentar)

				Thread.sleep(100);

			} catch (Exception e) {

				e.printStackTrace(); //mostra que ouve um erro e onde esse erro ocorreu mas não é amigável ao usuário
			}

		}
		return soma;
	}

}
