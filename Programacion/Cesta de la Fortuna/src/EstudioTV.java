
import java.util.Scanner;

import javax.imageio.stream.ImageInputStreamImpl;

import java.util.InputMismatchException;
public class EstudioTV {
   private static Scanner scan = new Scanner(System.in);
    private static String nombre;
    private static boolean plantado = false;
    private static boolean ruina = false;

    public static void main(String[] args) throws Exception {
        System.out.println("¡Bienvenido a la Cesta de la Fortuna!");
        System.out.println("¿Cual es su nombre?");
        nombre = scan.next();
        
        Concursante concursante = new Concursante(nombre, 0);
        Cesta cesta = new Cesta();

        System.out.println("Bienvenido " + concursante.getNombre() + ".");
        System.out.println("En la cesta hay " + cesta.getTotalBolas() + " bolas.");
        System.out.println("La blanca vale " + Concursante.getValorbolablanca() + " €");
        System.out.println("La azul " + Concursante.getValorbolaazul() + " €.");
        System.out.println("Y la negra te hace perder todo lo acumulado.");
        System.out.println("¿Empezamos a jugar?");

        do {
            System.out.println("Pulsa 1 para sacar una bola o 2 para plantarte.");
            int opcion = leerEntero();
            if (opcion ==1) {
                    char bola = cesta.sacarBola();
                    switch (bola) {
                        case 'B':
                            concursante.sumarPremio(Concursante.getValorbolablanca());
                            System.out.println("Has sacado una bola blanca. Acumulas " + concursante.getPremioAcumulado() + " € en el bote.");
                            System.out.println("Quedan " + cesta.getTotalBolas() + " bolas en la cesta.");
                            break;
                        case 'A':
                            concursante.sumarPremio(Concursante.getValorbolaazul());
                            System.out.println("Has sacado una bola azul. Acumulas " + concursante.getPremioAcumulado() + " € en el bote.");
                            System.out.println("Quedan " + cesta.getTotalBolas() + " bolas en la cesta.");
                            break;
                        case 'N':
                            concursante.bancarrota();
                            ruina = true;
                            System.out.println("Has sacado una bola negra. Ruina.");
                            break;
                        default:
                            System.out.println("No quedan bolas en la cesta.");
                    }
                
                }else{
                    plantado = true;
                    System.out.println("Tu bote final es de " + concursante.getPremioAcumulado() + " €.");
              
            }
        }while (!plantado && !ruina && cesta.getTotalBolas() > 0);

      }
      
    
     //Control de excepciones

 private static int leerEntero(){
            boolean esCorrecto = false;
            int entero = 0;
            do{
                try{
                    entero = scan.nextInt();
                    esCorrecto = true;
                }
                catch(InputMismatchException ex){
                    scan.next();
                    System.out.println("El presentador no te ha entendido, por favor pulsa 1 o 2");
                }
            }while (!esCorrecto);
            return entero;
        }
}
