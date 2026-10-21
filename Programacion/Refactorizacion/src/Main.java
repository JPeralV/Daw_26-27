import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      boolean salir = false;
      int opcion = 0;
      
      do{
        try{
            System.out.printf("==============================\n");
            System.out.printf("%s-15\n", "SISTEMA DE TICKET:");
            System.out.printf("%s-15\n", "Seleccione una opcion:");
            System.out.printf("%s-15\n", "1.) Crear un ticket.");
            System.out.printf("%s-15\n", "2.) Imprimir resumen de ventas.");
            System.out.printf("%s-15\n", "3.) Salir del sistema.");
            System.out.printf("==============================\n");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    
            
            
                default:
                    break;
            }
        }
        catch(NumberFormatException e){
            System.out.println("Opcion no reconocida por el sistema.");
            scan.next();
            salir = false;
        }
      }while(salir == false);





    }
}
