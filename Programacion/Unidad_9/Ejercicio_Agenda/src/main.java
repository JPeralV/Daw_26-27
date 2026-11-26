import java.util.Scanner;
import java.util.InputMismatchException;
public class main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcion = 0;

        do{ 
            try{ 
             System.out.println("1. Añadir contacto");
             System.out.println("2. Mostrar agenda");
            System.out.println("3. Salir");
            opcion = scan.nextInt();

            }catch (InputMismatchException e){
                System.out.println("Debes introducir un numero");
                scan.next();
            }
        

        switch (opcion){
            case 1: {
                if (!agenda.estaLlena()){ 
                    
                    System.out.println("Introduce el nombre del contacto");
                    String nombre = scan.next();
                    System.out.println("Introduce el primer apellido del contacto");
                    String apellido1 = scan.next();
                    System.out.println("Introduce el segundo apellido del contacto");
                    String apellido2 = scan.next();
                    System.out.println("Introduce el telefono del contacto");
                    int telefono = scan.nextInt();
                    System.out.println("Introduce el mail del contacto");
                    String mail = scan.next();

                    Contacto nuevoContacto = new Contacto(nombre, apellido1, apellido2, telefono, mail);
                    agenda.añadirContacto(nuevoContacto);
                }
                else{
                System.out.println("La agenda esta llena");
            }
            }
            break;
            case 2: {
                if (!agenda.estaVacia()){
                    System.out.println(agenda);
                }else{
                    System.out.println("La agenda esta vacia");
                }
            }
            break;

            case 3: {
                System.out.println("Saliendo del programa");
            }
            break;
            default: {
                System.out.println("Opcion no valida");
            }

        }
        }while (opcion != 3);
        
    }
}
