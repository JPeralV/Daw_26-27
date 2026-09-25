import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la nota del primer examen:");
        double nota1 = scanner.nextFloat();
        System.out.println("Introduzca la nota deseada");
        double notaFinal = scanner.nextFloat();
        double nota2 = notaFinal - ((nota1*0.4))/0.6;
        System.out.println("La nota necesaria en el segundo para alcanzar un " + notaFinal + " este trimestre teniendo un " + nota1 + " en el primer examen seria: " nota2);
    }
}
