public class Concursante {
    //Atributos
private static String nombre;
private static int premioAcumulado;


//Constantes
private static final int valorBolaBlanca = 100;
private static final int valorBolaAzul = 200;

//Constructor
public Concursante (String nombre, int premioAcumulado){
    this.nombre = nombre;
    this.premioAcumulado = 0;
}

//Metodos
private void sumarPremio (int cantidad){
    premioAcumulado += cantidad;
}

private void bancarrota(){
    premioAcumulado = 0;
}

//Getters
public static String getNombre() {
    return nombre;
}

public static int getPremioAcumulado() {
    return premioAcumulado;
}


}
