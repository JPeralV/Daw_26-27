import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String cliente;
        int entradasA = 0;
        final float precioA = 9.6f;
        int entradasN = 0;
        final float precioN = 4.95f;
        int audioguias = 0;
        final float precioAudio = 3.5f;
        final  int descuento = 17;
        float totalN = 0;
        float totalA = 0;
        float totalAudioguias = 0;
        float totalDescuento = 0;
        float subtotal = 0;
        float total = 0;
        System.out.println("Nombre del cliente:");
        cliente = scan.next();
        System.out.println("Numero de entradas adultos:");
        entradasA = scan.nextInt();
        System.out.println("Numero de entradas niños:");
        entradasN = scan.nextInt();
        System.out.println("Numero de audioguias:");
        audioguias = scan.nextInt();
        totalA = precioA * entradasA;
        totalN = precioN * entradasN;
        totalAudioguias = precioAudio * audioguias;
        totalDescuento = (totalAudioguias * descuento) / 100;
        subtotal = totalA + totalN + totalAudioguias;
        total = subtotal - totalDescuento;

        System.out.println("==================================================");
        System.out.printf("%10s %10s \n", "Cliente", cliente );
        System.out.println("Adultos: " + entradasA + " " + totalA + " €");
        System.out.println("Niños: " + entradasN + " " + totalN + " €");
        System.out.println("Guias: " + audioguias + " " + totalAudioguias + " €");
        System.out.println("Subtotal: " + subtotal + " " +  " €");
        System.out.println("Descuento guias: " + totalDescuento + " " +  " €");
        System.out.println("TOTAL A PAGAR: " + total + " " +  " €");
    }
}
