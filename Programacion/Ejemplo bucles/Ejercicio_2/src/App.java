import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuantos numeros de la secuencia de Fibonacci quieres ver?");
        int n = scan.nextInt();
        int i = 2;
        long n2 = 1;
        long n1 = 0;
        long nA = 0;
        if (n >= 2){
            System.out.print(n1 + ", " + n2);
        }
        while(i< n){
            nA = n1 + n2;
            n1 = n2;
            n2 = nA;
            System.out.print(", " + nA);
            i++;

        }


    }
}
