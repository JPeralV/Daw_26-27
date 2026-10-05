import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int n1 = 0;
        System.out.println("Por favor, introduzca un numero entero positivo de 5 cifras o menos:");
        n = scan.nextInt();

            if ( n>=0 && n<=9){
                n1 = n;
                System.out.println("El primer digito de " + n + " es " + n);
            }else if(n>0 && n<=99){
                n1 = n/10;
                System.out.println("El primer digito de " + n + " es " + n1);
            }else if(n>0 && n<=999){
                n1 = n/100;
                System.out.println("El primer digito de " + n + " es " + n1);
            }else if(n>0 && n<=9999){
                n1 = n/1000;
                System.out.println("El primer digito de " + n + " es " + n1);
            }else if(n>0 && n<=99999){
                n1 = n/10000;
                System.out.println("El primer digito de " + n + " es " + n1);
            }else{
                System.out.println("Por favor, introduce solo numeros positivos de 5 cifras o menos.");
            }
    }
}
