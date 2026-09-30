import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Del 0 al 23 ¿Que hora es?");
        int hora = scan.nextInt();
        
       if (hora >=6 && hora <=12){
        System.out.println("weno dia");
       }
       else if (hora >=13 && hora <=20 ){
        System.out.println("wena tarde");

       }
       else if (hora <=5 || hora >=21){
        System.out.println("wena noxe");
       }
       else{
        System.out.println("Esa hora no pertenece a este plano espacio-temporal");
       }
       
                
               
        }
                
                
        
    }

