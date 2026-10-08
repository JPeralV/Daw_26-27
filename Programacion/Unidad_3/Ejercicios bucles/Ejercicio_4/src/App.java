import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int res = 0;
        int exp = 0;
        System.out.println("Introduzca un numero y le mostrare su tabla de multiplicar:");
        n = scan.nextInt();
        for ( int i = 0; i <= 10; i++){
        res = n * exp;
        System.out.println("" + n + " x " + exp + " = " + res);
        exp++;
        }
    }
}
