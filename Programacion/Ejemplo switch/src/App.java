import java.util.Scanner;
public class App {
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Que nota tienes?");
       int nota = scan.nextInt();

       switch (nota) {
        
        case 5: {System.out.println("Aprobado");
            break;}
        case 6:{
            System.out.println("Bien");
            break;
        }
        //Debugging
        case 7:
        case 8:{
            System.out.println("Notable");
            break;
        }
        case 9:
        case 10: {
            System.out.println("Sobresaliente");
            break;
        }
        default:{
            if (nota < 5){
                System.out.println("Suspenso");
            }
            else{
                System.out.println("Nota no valida");
            }
        }
    }
            
        
            
           
       
        
       }
    }

