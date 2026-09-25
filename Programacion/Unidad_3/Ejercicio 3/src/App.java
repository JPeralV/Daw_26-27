import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca su nombre completo:");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca su direccion:");
        String direccion = scanner.nextLine();
        System.out.println("Introduzca su numero de telefono:");
        int numero = scanner.nextInt();
        System.out.printf("\033[96m%s", nombre + "\n");
        System.out.printf("\033[95m%s", direccion + "\n");
        System.out.printf("\033[93m%s", numero + "\n");
    }
}
