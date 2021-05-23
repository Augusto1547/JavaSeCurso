package br.com.fuctura.poo.sobrecargaDeMetodos;

class Cao extends Animal {

    @Override
    public void fazerBarulho() {

        String res = (tipoDeAnimal.equals("Pitbull") ? "Pit bull faz au au"
                : "Esse cachorro é Léssi");

        System.out.println(res);
    }

}
