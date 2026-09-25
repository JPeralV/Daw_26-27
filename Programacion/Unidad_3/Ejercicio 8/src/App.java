import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la base del triangulo:");
        float base = scanner.nextFloat();
        System.out.println("Introduzca la altura del triangulo:");
        float altura = scanner.nextFloat();
        float area = (altura * base)/2;
        System.out.println("El area del triangulo es " + area + "cm2");
        //Base por altura entre 2
    }
}
