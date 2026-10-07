import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        System.out.println("Introduzca un numero natural mayor que 0");
        numero = scan.nextInt();
        int suma = 0;
        int indice = 1;
        while (indice <= numero){
            suma = suma + indice;
            indice++;
        }
        System.out.printf("La suma desde 0 hasta %d es %d",numero,suma);

        //Igual pero con for
        for (int i=1; i <= numero; i++){
            suma = suma + i;
        }
    }
}
