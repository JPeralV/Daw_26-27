import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cantidad de euros:");
        float euros = scanner.nextFloat();
        float pesetas = euros * 166.386f;
        System.out.println(euros +" euros" + " son " + pesetas + " de las antiguas pesetas");
    }
}
