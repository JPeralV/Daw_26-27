import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado tipo ax^2 + bx + c = 0");
        System.out.println("Introduzca el valor de a");
        double a = scan.nextDouble();
        System.out.println("Introduzca el valor de b");
        double b = scan.nextDouble();
        System.out.println("Introduzca el valor de c");
        double c = scan.nextDouble();
        double d = (b*b) - (4*a*c); 
        double x1 = (-b + (Math.sqrt(d)))/(2*a);
        double x2 = (-b - (Math.sqrt(d)))/(2*a);

        System.out.println(x1);
        System.out.println(x2);
        //Si la raiz es negativa no tiene solucion (NaN), si raiz es 0 tiene infinitas soluciones (Infinite)
    }
}
//Si C es 0 una solucion es X = 0 y la otra solucion seria una ecuacion de primer grado
