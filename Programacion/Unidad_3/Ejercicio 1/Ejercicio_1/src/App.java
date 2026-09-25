import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Introduzca dos numeros enteros separados por un espacio: ");
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    System.out.println(" x = " + X);
    System.out.println("Y = " + Y);
    System.out.println("x + y = " + (X+Y));
    System.out.println("x - y = " + (X-Y));
    System.out.println("x/y = " + (float)X/Y);
     System.out.println(X*Y);
    }
}
