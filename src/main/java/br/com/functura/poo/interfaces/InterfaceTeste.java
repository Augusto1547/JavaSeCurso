package br.com.functura.poo.interfaces;

public class InterfaceTeste {
    
    public static void area(AreaCalculavel o) {
        
        System.out.println(o.calculaArea());
    }
    
    public static void volume(VolumeCalculavel o) {
        
        System.out.println(o.calculaVolume());
    }
    
    public static void main(String[] args) {

        /*Quadrado q = new Quadrado(2);
        AreaCalculavel a = q;*/
        area(new Quadrado(2));
        
        area(new Quadrado(5));
        
        area(new Quadrado(6));
        
        Quadrado q4 = new Quadrado(8);
        System.out.println(q4.calculaArea());
        
        Cubo q = new Cubo(3);
        System.out.println(q.calculaVolume());
        
        volume(new Cubo(3));
    }
    
}
