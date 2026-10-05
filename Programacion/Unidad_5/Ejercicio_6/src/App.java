import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado tipo ax^2 + bx + c = 0");
        System.out.println("Introduzca el valor de a");
        double a = scan.nextDouble();
        System.out.println("Introduzca el valor de b");
        double b = scan.nextDouble();
        System.out.println("Introduzca el valor de c");
        double c = scan.nextDouble();
        double d = (b*b) - (4*a*c); 
        double x1 = (-b + (Math.sqrt(d)))/(2*a);
        double x2 = (-b - (Math.sqrt(d)))/(2*a);
        double x3 = (-c/b);

       

        if (a==0) {
            if (b==0) {
                if (c==0){
                    System.out.println("La ecuacion tiene infinitas soluciones");
                }
                else{
                    System.out.println("La ecuacion carece de solucion");
                }
            }
            else /*b=!0*/{
                System.out.println("Es una ecuacion de primer grado, por lo que x= " + x3);
            }
            
        }
        else /*a!=0*/{
            if(d<0){
                System.out.println("La ecuacion no tiene soluciones reales");

            }else{
                System.out.println("x1 = " +x1);
                System.out.println("x2 = " +x2);
            }

        }
       
    }
}
