package br.com.fuctura.poo.relacionamentos.entidades;

public class executeProgramConctact {

    public static void main(String[] args) {

        try {

            Contact contato = new Contact();

            contato.setNome("Augusto César dos Santos Cavalcanti");

            Address endereco = new Address();
            endereco.setStreet("Rua 70");
            endereco.setNumber("360");
            endereco.setDistrict("Maranguape II");
            endereco.setCity("Paulista");

            if (contato != null && endereco != null) {
                endereco.printAddress();
            }

            contato.setEndereco(endereco);

            Phone telefone = new Phone();
            telefone.setTipo("Celular");
            telefone.setDdd("81");
            telefone.setNumero("98820-7988");

            Phone telefone2 = new Phone("Comercial", "11", "3433-1343");

            Phone[] telefones = {telefone, telefone2};

            for (Phone t : telefones) {

                if (contato != null && telefones != null) {

                    System.out.println(t.getTipo() + " " + t.getDdd() + " "
                            + t.getNumero());
                }
            }

        } catch (Exception erro) {

            System.out.println("Mensagem de erro : " + erro);
        }
    }

}
