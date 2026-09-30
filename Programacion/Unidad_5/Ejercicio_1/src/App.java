import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Que dia es?");
        String dia = scan.next();
        switch (dia) {
            case "Lunes":{
                System.out.println("Primera hora libre (IPE1 convalidada)");
                break;}
            case "Martes":{
                System.out.println("Entornos a primera");
                break;}
            case "Miercoles":{
                System.out.println("Entornos a primera");
                break;}
            case "Jueves":{
                System.out.println("BADAT a primera");
                break;}
            case "Viernes":{
                System.out.println("Sistemas a primera");
                break;}
            default: {
                System.out.println("Ese dia no hay clases");
            }
        }
    }
}
