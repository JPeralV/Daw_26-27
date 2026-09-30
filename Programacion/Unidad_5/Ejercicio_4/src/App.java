import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a");
        float a = scan.nextFloat();
        System.out.println("Por favor, introduzca el valor de b");
        float b = scan.nextFloat();
        float x = (-b/a);
       // if (Float.isInfinite(x)){
       if (a == 0){
        System.out.println("Esa ecuación no tiene solución real.");}
        else{
        System.out.println("x= " + x);
        }
    }
}
