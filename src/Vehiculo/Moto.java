
package Vehiculo;


public class Moto extends Vehiculo{
    
    //creando constructor (El constructor no tiene void)
    public Moto(String caballoFuerza,int ruedas, String modelo, String color, String marca, int capacidad, int añoFabrica){
        super(caballoFuerza,ruedas, modelo, color, marca, capacidad, añoFabrica);
        
    }
    
    public void frenar(){
        System.out.println("La Moto Frena");
    }
    public void acelerar(){
        System.out.println("La Moto acelerar");
    }
    public void girar(){
        System.out.println("La Moto girar");
    }
    public void detener(){
        System.out.println("La Moto detener");
    }
}
