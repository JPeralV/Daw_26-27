import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int seg = 0;
        int hora = 0;
        int min = 0;
        final int hSeg = 3600;
        final int mSeg = 60;
        System.out.println("Introduce una cantidad de segundos:");
        seg = scan.nextInt();
        hora = seg/hSeg;
        
        System.out.println( hora );


}
}