import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca un importe:");
        float importe = scanner.nextFloat();
        float iva = 4.78f;
        float total = importe + iva;
        System.out.println("Base imposible: " + importe);
        System.out.println("IVA: " + iva);
        System.out.println("-------------------");
        System.out.println("Total: " + total);
    }
}
