import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculo de velocidad de caida.");
        System.out.println("Por favor, introduzca la altura desde la que cae el objeto en metros:");
        double altura = scan.nextDouble();
        double gravedad = 9.81f;
        double velocidad = (Math.sqrt((2*altura)/gravedad));
        if (altura < 0){
        System.out.println("No puedo calcular una caida desde altura negativa");}
        
        else{
            System.out.println("El objeto tarda " + velocidad + " segundos en caer.");}
        }
        
    }
    

