
package Vehiculo;

//Autor:Victor hugo

import java.util.Date;

// aracteristicas = Atributos
public class Vehiculo {
    private String hp;
    private int ruedas;
    private String modelo; 
    private String color;
    private String marca;
    private int capacidad;
    private int añoFabrica;
    private boolean encendido;
    
    //Constructor = Inicializar
    public Vehiculo(){
        this.hp = "100";
        this.ruedas = 2;
        this.modelo = "Huracan";
        this.color = "Rojo";
        this.marca = "Honda";
        this.capacidad = 2;
        this.añoFabrica = 2024;  
    }
    
    
    public void transportar(){
        System.out.println("El vehiculo esta en transporte");
    }
    
    public void encerder(){
        System.out.println("Vehiculo encendido");
        this.encendido = true;

    }

}
