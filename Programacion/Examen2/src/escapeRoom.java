import java.util.Scanner;
import java.util.InputMismatchException;

public class escapeRoom {
    

   
    //Generar pista
     public static int generarPista() {
        return (int) (Math.random()*9)+1;
    }

    // Generar codigo



    //Lectura segura
    private static int lecturaSegura(){
         Scanner scan = new Scanner(System.in);
        int digito = 0;
        boolean esCorrecto = false;
        do{
            try{
                digito = scan.nextInt();
                esCorrecto = true;
            }catch (InputMismatchException ex){
                System.out.println("Opcion no reconocida por el sistema o la caja");
                scan.next();
            }
        }while (!esCorrecto);
        return digito;
    }

    


    public static void main(String[] args) throws Exception {
       

        new habitacion ( generarPista(), generarPista(), generarPista());
        int cs = habitacion.getPistaAlfombra() + habitacion.getPistaCajon() + habitacion.getPistaCuadro();
        new cajaFuerte(cs, 3);
        
        do{ 
            System.out.println("¿Como quieres afrontar el misterio?");
            System.out.println("1. Mirar detras del cuadro");
            System.out.println("2. Abrir el cajon del escritorio");
            System.out.println("3. Levantar la alfombra");
            System.out.println("4. Ir a la caja fuerte e introducir el codigo");
            int opcion = lecturaSegura();

            switch (opcion) {
                case 1:
                    habitacion.inspreccionarCuadro();
                    break;
                
                case 2:
                    habitacion.inspreccionarCajon();
                    break;
                
                case 3:
                    habitacion.inspreccionarAlfombra();
                    break;

                case 4:
                    System.out.println("¿Cual es la suma de los 3 digitos?");
                   
                    int combinacion = lecturaSegura();

                    cajaFuerte.intentarAbrir(combinacion);
                    
                    break;
            
                default:
                    System.out.println("Solo tienes 4 opciones");
                    break;
            }

        }while (!cajaFuerte.isEstaAbierta() && !cajaFuerte.bloqueada());

        if (cajaFuerte.isEstaAbierta() == true){
            System.out.println("¡Felicidades! Has escapado");
        }
        if (cajaFuerte.bloqueada() == true){
            System.out.println("Lo siento, has bloqueado la caja fuerte. Se acabo el juego.");
        }
      



   

   
}
}