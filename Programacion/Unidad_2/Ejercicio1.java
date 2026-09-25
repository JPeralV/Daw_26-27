public class Ejercicio1 {
    
        public static void main(String[] args) {
        int x=144;
        int y = 999;
        
        System.out.println(" x = " + x);
        System.out.println("Y = " + y);
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        //Al realizar una operacion con enteros, Java ignora los decimales. Esto se revuelve forzando un casting.
        System.out.println("x/y = " + (float)x/y);
        System.out.println(x*y);
    }
    
    
}
