import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un lado del rectangulo en cm:");
        float lado1 = scanner.nextFloat();
        System.out.println("Introduzca el otro lado del rectangulo en cm:");
        float lado2 = scanner.nextFloat();
        float area = lado1 * lado2;
        System.out.println("El area del rectangulo es de " + area + "cm2");
    }
}
