public class Ejercicio6 {
    public static void main(String[] args) {
        float base = 22.75f;
        float iva = 4.78f;
        float total = base + (base*iva);

        System.out.println("Base imposible: " + base);
        System.out.println("IVA: " +iva);
        System.out.println("-------------------");
        System.out.println("Total: " + total);
    }
}
