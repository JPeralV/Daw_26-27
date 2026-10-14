import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      int tamaño = 0;
      char caracter;
      String piso = "";
      System.out.println("Por favor, introduzca la altura de la pirámide: ");
      tamaño = scan.nextInt();
      System.out.println("Introduzca el carácter de relleno:");
      caracter = scan.next().charAt(0);
      
      for ( int i = 0; i < tamaño; i++){
        piso = piso + caracter;
        System.out.println(piso);
       

      }
}
}