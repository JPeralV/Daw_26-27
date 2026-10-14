import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float km = 0;
    float consumo = 0;
    float ocupantes= 0;
    float precio = 1.98f;
    float consumoTotal = 0;
    float costeTotal = 0;
    float costeIndividual = 0;
    float gastoIndividual = 0;
    float ahorro = 0;
    System.out.println("Distancia trayecto (KM):");
    km = scan.nextFloat();
    System.out.println("Consumo (L/100KM):");
    consumo = scan.nextFloat();
    System.out.println("Ocupantes:");
    ocupantes = scan.nextFloat();
    System.out.println("Precio del combustible (€/L)");
    precio = scan.nextFloat();
    
    consumoTotal = (km/100) * consumo;
    costeTotal = consumoTotal * precio;
    costeIndividual = costeTotal / ocupantes;
    gastoIndividual = costeTotal * ocupantes;
    ahorro = gastoIndividual - costeTotal;

    System.out.println("==================================================");
    System.out.println("Parking CPIFP Alan Turing");
    System.out.println("==================================================");
     System.out.printf("Combustible consumido: " + consumoTotal + " litros");
     System.out.println("Coste viaje: " + costeTotal + " €");
     System.out.println("Coste por ocupante: " + costeIndividual + " €");
     System.out.println("Total ahorrado: " + ahorro + " €");
    
}
}