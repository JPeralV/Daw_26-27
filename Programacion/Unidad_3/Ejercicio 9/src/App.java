import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique una cantidad de KB:");
        float kb = scanner.nextFloat();
        float gb = kb / 1024;
        System.out.println("" + (int) kb + " Kb son " +  (float) gb + " GB");
    }
}