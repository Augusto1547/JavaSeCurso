package br.com.fuctura.estruturadedados.vetor;
//Title: Adicionar elemento no final do vetor
public class Vetor {
    //Valor inicial de:  String = null, 
    //boolean: false, int,char,float, etc = 0, 

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {

        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento) {

        //iterar para adicionar elemento
        
        for(int i = 0 ; i < this.elementos.length; i++){
            
            if(this.elementos[i] == null){
                
                this.elementos[i] = elemento;
                break;
                
            }
        }
    }*/ //Essa função adiciona dois elmentos se encontrar um nulo
    /*public void adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

        } else {

            throw new Exception("Vetor está cheio não é possível adicionar mais elementos");
        }

    }*/
    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;

        }
        return false;
    }

}
