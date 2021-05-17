package br.com.fuctura.intermediario.enumeradores;

//além de variáveis, métodos e construtores podemos ter também métodos abstratos em enums
//posso fazer isso através de interfaces ou aqui dentro do enum mesmo.
public enum TipoDocumento {

    CPF {
        @Override
        public String geraNumeroTeste() {

            return GeraCpfCnpj.imprimeCNPJ();
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {

            return GeraCpfCnpj.imprimeCNPJ();
        }
    };

    public abstract String geraNumeroTeste();
}
