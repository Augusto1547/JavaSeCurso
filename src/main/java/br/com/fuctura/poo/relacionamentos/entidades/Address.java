package br.com.fuctura.poo.relacionamentos.entidades;

public class Address {

    private String street;
    private String number;
    private String district;
    private String city;

    Address(String rua_70, String string, String maranguape_II, String paulista, String barraca_de_Ivonete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Address() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void printAddress(){
        
        System.out.println("Street : " + street + "\n");
        System.out.println("Number : " + number + "\n");
        System.out.println("District : " + district + "\n");
        System.out.println("City : " + city + "\n");
    }
}
