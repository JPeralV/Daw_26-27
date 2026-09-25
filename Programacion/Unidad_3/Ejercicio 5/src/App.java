import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cantidad de pesetas:");
        float pesetas = scanner.nextFloat();
        float euros = pesetas / 166.386f;
        System.out.println(pesetas +" pesetas" + " son " + euros + " euros");
    }
}