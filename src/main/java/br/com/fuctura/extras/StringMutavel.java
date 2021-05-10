package br.com.fuctura.extras;
import br.com.javase.logica.aulas.Break_e_continue;

final class StringMutavel {

    /*Essas duas classes possuem os mesmos conjuntos de métodos a única diferença
    é que os métodos da StringBuffer são sincronizados eles são muito úteis 
    quando você está num ambiente multiprocessado trabalhando com váries tredes 
    acessando os mesmos obetos StringBuffers.  Já o StringBuilder não tem esses
    métodos sincronizados então ele não pode funcionar muito bem no momento em 
    que milhares de requisições ao mesmo objeto estão sendo feitas.
   
     */
    public static void main(String[] args) {
//sei a quantidade de caracteres por isso o 60 para não usar espaço desnecessário
        StringBuffer s0 = new StringBuffer(60);
        StringBuilder s1 = new StringBuilder("java");
        
        
        /*System.out.println(s1.toString());
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        System.out.println(s1.reverse());*/
    
        //s1.append(" Trabalhando");
        
        s1.append(" Trabalhando ");
        char[] c = {'c','o','m'};
        s1.append(c).append("Textos.");
        System.out.println(s1);
        
        String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString(); 
        System.out.println(url);
        
//a jvm concatena em tempo de execução utilizando o objeto StringBuilder
//String s = "Oi " + " como " + "vai você?";
//ex: String sb = new StringBuilder("oi").append("como").append("Vai você?").toString();  

         StringBuffer cpf = new StringBuffer("08953222427");
         cpf.insert(3, ".");
         cpf.insert(7, ".");
         cpf.insert(11, "-");
         
         System.out.println(cpf);
         
         StringBuilder s2 = new StringBuilder();
         s2.append(new Break_e_continue()); //chamando à classe externa
         System.out.println(s2);
         
         StringBuilder s3 = new StringBuilder("Certificação java");
         s3.substring(13,17);//eu quero a subString da posição dezesseis à dezessete
         //sustring por si só não muda o texto
         System.out.println(s3.toString());
         //o código de baixo sim, usa o substring
         System.out.println(s3.substring(13,17));//substring uma palavra só no inglês dai não ser camel case
         System.out.println(s3.subSequence(13, 17));
         
         
    }

}
