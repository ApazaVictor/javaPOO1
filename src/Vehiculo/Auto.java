/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Alumno-PB203
 */
public class Auto extends Vehiculo {
    private int numeroPuerta;
    
    public Auto(String caballoFuerza, int ruedas, String modelo, String color, String marca, int capacidad, int añoFabrica, int numeroPuerta) {
        super(caballoFuerza, ruedas, modelo, color, marca, capacidad, añoFabrica);
        this.numeroPuerta = numeroPuerta;
    }
    
    @Override
    public void informacion(){
        super.informacion();
        System.out.println("numeroPuerta:" + numeroPuerta);
    
    }
}
