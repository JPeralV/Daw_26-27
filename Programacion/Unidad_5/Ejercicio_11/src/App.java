import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int c = 0;
        System.out.println("Por favor, introduzca un número entero (5 cifras como máximo):");
        n = scan.nextInt();

        if (n>=-9 && n<=9){
            System.out.println("" + n + " tiene 1 cifra");
        }else if ((n>=-99 && n<=99)){
            System.out.println("" + n + " tiene 2 cifras");
        }else if((n>=-999 && n<=999)){
            System.out.println("" + n + " tiene 3 cifras");
        }else if((n>=-9999 && n<=9999)){
            System.out.println("" + n + " tiene 4 cifras");
        }else if((n>=-99999 && n<=99999)){
            System.out.println("" + n + " tiene 5 cifras");
        }else{
            System.out.println("Por favor, introduce solo un numero entero de 5 cifras o menos.");
        }


    }
}
