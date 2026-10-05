import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        final int modulo = 10;
        int n = 0;
        int n1 = 0;
        System.out.println("Por favor, introduzca un numero entero:");
        n = scan.nextInt();

            if ( n < -9 || n > 9){
                n1 = n%10;
                System.out.println("El ultimo digito de " + n + " es " + n1);
            }else{
                System.out.println("El ultimo digito de " + n + " es " + n);
            }
    }
}
