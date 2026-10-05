import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Vehiculo Bici = new Bicicleta();
        Vehiculo Arona = new Coche();
        int instruccion = 0;

        System.out.println("1. Anda con la bicicleta.");
        System.out.println("2. Haz el caballito con la bicicleta.");
        System.out.println("3. Anda con el coche.");
        System.out.println("4. Quema rueda con el coche.");
        System.out.println("5. Ver kilometraje de la bicicleta.");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total.");
        System.out.println("Elija una accion del 1 al 7:");

        instruccion = scan.nextInt();

        switch (instruccion) {
            case 1:{
                System.out.println("¿Cuantos km quieres reccorrer?");
                int kilometros = scan.nextInt();
                Bici.anda(kilometros);
            }
                
            
        }

        
       

    }
}
