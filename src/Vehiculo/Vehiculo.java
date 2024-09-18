
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
    public Vehiculo(String caballoFuerza,int ruedas, String modelo, String color, String marca, int capacidad, int añoFabrica){
        this.hp = caballoFuerza;
        this.ruedas = ruedas;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
        this.añoFabrica = añoFabrica;  
    }
    
    
    public void transportar(){
        System.out.println("El vehiculo esta en transporte");
    }
    
    public void encerder(){
        System.out.println("Vehiculo encendido");
        this.encendido = true;

    }
    public void informacion(){
        System.out.println("caballos de fuerza: " + hp );
        System.out.println("cantidad de ruedas: " + ruedas);
        System.out.println("Modelo: " + modelo);
        System.out.println("color: " + color);
        System.out.println("marca: " + marca);
        System.out.println("capacidad: " + capacidad);
        System.out.println("añoFabrica: " + añoFabrica);
        
    }

}
