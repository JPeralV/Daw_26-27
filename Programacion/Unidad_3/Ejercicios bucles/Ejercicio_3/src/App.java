import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        final int pass = 4242;
        int tryPass = 4;
        int passIn = 0;
       

        System.out.println("Introduzca la contraseña: ");
        passIn = scan.nextInt();
        

        if (passIn == pass){
            System.out.println("Contraseña correcta, abriendo caja.");
        }else{
        
      do{
        tryPass--;
        System.out.println("Contraseña incorrecta. Le quedan " + tryPass + " intentos.");
        System.out.println("Introduzca la contraseña: ");
        passIn = scan.nextInt();
        if(passIn == pass){
            System.out.println("Contraseña correcta, abriendo caja.");
        }
      }

    while (pass != passIn && tryPass >1);
    if (tryPass == 1){
        System.out.println("Bloqueando la caja por cuestiones de seguridad.");
    }
       
        
        
    }
    }
}
