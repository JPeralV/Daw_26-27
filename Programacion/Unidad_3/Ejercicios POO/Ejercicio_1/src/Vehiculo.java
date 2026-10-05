public class Vehiculo {
    
    public static int vehiculosCreados;
    public static int kilometrosTotales;

    public static int kilometrosFlota(){
        return kilometrosTotales;
    }

    public int kilometrosRecorridos;

    public Vehiculo (){
        this.kilometrosRecorridos = 0;
        vehiculosCreados++;
    }

    public void anda(int kilometros){
        this.kilometrosRecorridos += kilometros;
        kilometrosTotales = kilometrosTotales + kilometros;
    }



  /*  
  En caso de añadir vehiculos de segunda mano
  public Vehiculo(int kilometrosRecorridos){
        this();
        this.kilometrosRecorridos = kilometrosRecorridos;
        kilometrosTotales += kilometrosRecorridos;
    } */
}
