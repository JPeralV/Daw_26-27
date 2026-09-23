public class Ejercicio7 {
    public static void main(String[] args) {
       char primeraletra = 'a';
        char ultimaletra = 'z';
        String abc = "abecedario";
        //Cuando se suman dos variables char con letras como valor, Java suma sus valores numericos.
        //Esto se puede evitar añadiendo una cadena vacia al principio de la suma.
        System.out.println("" + primeraletra +  ultimaletra + abc);
    }
}
