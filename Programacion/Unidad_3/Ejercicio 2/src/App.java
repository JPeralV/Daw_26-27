import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        String nombre = scan.next();
        System.out.println("Introduzca su primer apellido:");
        String apellido1 = scan.next();
        System.out.println("Introduzca su segundo apellido:");
        String apellido2 = scan.next();
        System.out.println( apellido1 + " " + apellido2 + ", " + nombre);
    }
}

