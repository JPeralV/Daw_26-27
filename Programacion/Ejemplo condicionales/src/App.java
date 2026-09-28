import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota = 0.0f;
        System.out.println("¿Que nota has sacado?");
        nota = scanner.nextFloat();
        if (nota <5.0){
            System.out.println("Estas suspenso");

        }
        else if (nota >=5 && nota < 7.0){
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Sobresaliente");
        }

    }
}
