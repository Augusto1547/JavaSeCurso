package br.com.fuctura.poo.tratamentodeerrostiposdeerros;

public class Informacoes {

    // Throwable é a super classe de todas as outras classes de erro do java
    // abaixo dela tempos duas subclasses importantes que é a Erro e a Exception
    /*
    Erro é um erro que vai acontecer em tempo de execução e vai fazer com que o
    programa termine a sua execução.
    *Tipos de erros dessa classe outOfMemoryError (seu programa esgota a memória tanto da jvm quanto do java)
    ele é um erro não verificado e não tem como agente tratar os tipos Erros no java
    
    
    Exception: podem ser tratadas e existe de tois tipos as chicked(verificadas e as
    unchicket(não verificadas)).
    *as excessões não verificadas são aquelas que ocorrem no tempo de exexução
    do programa ou seja é o que nós chamamos de RuntimeException
    Exemplos: Exemplos: ArrayIndexOutOfBoundsExeption, arithmeticException(divisão por zero não tem como o compilador prever isso) somente em tempo de execução que ele vê se eu erro ai ele lança 
    * nullPointException : Quando você chama o método de um objeto que ainda não foi instanciado
    * classCastException :O corre ao fazer o casting de objetos elas podem ocorrer
     
                EXCEÇÕES CHECKED(o compilador vai reclamar e pedir que você trate)
    
    Existem também as excessões verificadas as duas mais famosas são as 
    exceções de IOException pode acontecer em leitura e escrita de arquivos e 
    nós temos que tratar a IDE já pede isso. 
    
    Temos também as exceções de SQLException que veremos no módulo de acesso a
    banco de dados
    
    */
    
}
