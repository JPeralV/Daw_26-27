import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int primero = 0;
        int segundo = 0;
        int tercero = 0;
        System.out.println("Este programa ordena tres números introducidos por teclado.");
        System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

           if (a == b || a == c){
            System.out.println("Los numeros no deben repetirse");
        }else if (b==c){
            System.out.println("Los numeros deben ser distintos");
        }else{

        if (a<b && a<c){
            primero = a;
            if (b<c){
                segundo = b;
                tercero = c;
                
            }else{
                segundo = c;
                tercero = b;
            }

        }else if (b<a && b<c){
            primero = b;
            if (a<c){
                segundo = a;
                tercero = c;
            }else{
                segundo = c;
                tercero = a;
            }

        }else if (c<a && c<b){
            primero = c;
            if (a<b){
                segundo = a;
                tercero = b;
            }else{
                segundo = b;
                tercero = a;
            }
        }
      
        System.out.println("Los números introducidos ordenados de menor a mayor son: " + primero + ", " + segundo + ", " + tercero );
    }

    }
}
