
package Vehiculo;


public class Principal {
      public static void main(String[] args) {
          //imstanciar = invcar = llamar a un objeto
          Moto moto = new Moto("1700", 2, "Honda yaris","Honda","gris",4,2075);
          moto.encerder();
          moto.transportar();
          moto.frenar();
          moto.acelerar();
          moto.girar();
          moto.detener();
          moto.informacion();
          
          //imstanciar = invcar = llamar a un objeto
          Moto moto1 = new Moto("1700", 2, "Pulsar yaris","Pulsar","gris",4,2025);
          //moto.encerder();
          //moto.transportar();
          //moto.frenar();
          //moto.acelerar();
          //moto.girar();
          //moto.detener();
          moto.informacion();
          
        //imstanciar = invcar = llamar a un objeto
        Auto autito = new Auto("700", 4, "Toyota yaris","Toyota","gris",10,2025,6);
        autito.informacion();

  
      }
}
