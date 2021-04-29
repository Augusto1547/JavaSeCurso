package br.com.javase.projetosPessoais.VendaDeAnimais;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class MostrarPets {
    
    public static void main(String[] args) {
        
        System.out.println("PET SHOP DOIS IRMÃOS");
        
        try {
            
            Scanner scan = new Scanner(System.in, "ISO-8859-1");
            System.out.println("Qual pets gostaria de comprar?: Cães, Gatos ou"
                    + " Passaros");
            String especie = scan.nextLine();
            
            if (especie.equals("cães") || especie.equals("Cães")
                    || especie.equals("CÃES")) {
                
                Cachorros pitBull = new Cachorros("Pit Bull",
                        "Macho e fêmeas", "Marrom e preto", "de 1 a 6 meses",
                        new BigDecimal("300.00"),
                        "São todos Castrados");
                
                String[] informacoesDoPitbull = {"\n" + "Raça do pet :" + "\n"
                    + pitBull.tipoDeEspecie + "\n", "Sexo do pet :" + "\n"
                    + pitBull.sexoDoPet + "\n", "Cor do pet :" + "\n"
                    + pitBull.corDoPet + "\n", "Preço do pet " + "\n"
                    + pitBull.precoDeVendaDoPet + "\n", "Castrado ou não? :" + "\n"
                    + pitBull.castradoOuNao + "\n"};
                
                System.out.println(Arrays.toString(informacoesDoPitbull));
                
                Cachorros viraLata = new Cachorros("Vira lata",
                        "Macho e fêmeas", "Branco malhado", "apartir de um ano",
                        new BigDecimal("20.00"),
                        "São todos Castrados");
                
                String[] informacoesViralata = {"\n" + "Raça do pet :" + "\n"
                    + viraLata.tipoDeEspecie + "\n", "Sexo do pet :" + "\n"
                    + viraLata.sexoDoPet + "\n", "Cor do pet :" + "\n"
                    + viraLata.corDoPet + "\n", "Preço do pet " + "\n"
                    + viraLata.precoDeVendaDoPet + "\n", "Castrado ou não? :" + "\n"
                    + viraLata.castradoOuNao + "\n" + "\n"};
                
                System.out.println(Arrays.toString(informacoesViralata));
                
                //CÃES
                
            } else if (especie.equals("gatos") || especie.equals("Gatos")
                    || especie.equals("GATOS")) {
                
                Cachorros gatoPersa = new Cachorros("Gato persa",
                        "Apenas Machos", "preto e temos branco",
                        "apartir de 5 meses", new BigDecimal("120"),
                        "Sem castração");
                
                String[] informacoesDoGatoPersa = {"\n" + "Raça do pet :" + "\n"
                    + gatoPersa.tipoDeEspecie + "\n", "Sexo do pet :" + "\n"
                    + gatoPersa.sexoDoPet + "\n", "Cor do pet :" + "\n"
                    + gatoPersa.corDoPet + "\n", "Preço do pet " + "\n"
                    + gatoPersa.precoDeVendaDoPet + "\n", "Castrado ou não? :" + "\n"
                    + gatoPersa.castradoOuNao + "\n"};
                
                System.out.println(Arrays.toString(informacoesDoGatoPersa));
                
                Cachorros gatoCiames = new Cachorros("Gato Ciames",
                        "Macho e fêmeas", "Cinza", "com 3 meses",
                        new BigDecimal("30.00"),
                        "São todos Castrados");
                
                String[] informacoesViralata = {"\n" + "Raça do pet :" + "\n"
                    + gatoCiames.tipoDeEspecie + "\n", "Sexo do pet :" + "\n"
                    + gatoCiames.sexoDoPet + "\n", "Cor do pet :" + "\n"
                    + gatoCiames.corDoPet + "\n", "Preço do pet " + "\n"
                    + gatoCiames.precoDeVendaDoPet + "\n", "Castrado ou não? :" + "\n"
                    + gatoCiames.castradoOuNao + "\n" + "\n"};
                
                System.out.println(Arrays.toString(informacoesViralata));
            }
            
        } catch (Exception erro) {
            
            System.out.println("Tipo de erro " + erro);
            
        } finally {
            
            System.out.println("Fim");
            
        }
        
    }
    
}
