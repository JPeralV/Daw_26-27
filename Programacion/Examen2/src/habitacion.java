public class habitacion {
 private static boolean cuadroRevisado;
    private static boolean cajonRevisado;
    private static boolean alfombraRevisada;
    private static int pistaAlfombra;
    private static int pistaCuadro;
    private static int pistaCajon;

   

    public habitacion (int pistaAlfombra, int pistaCuadro, int pistaCajon){
        this.pistaAlfombra = pistaAlfombra;
        this.pistaCuadro = pistaCuadro;
        this.pistaCajon = pistaCajon;
        cuadroRevisado = false;
        cajonRevisado = false;
        alfombraRevisada = false;
    }

    public static void inspreccionarCuadro(){
        if (!cuadroRevisado){
            cuadroRevisado = true;
            System.out.println("Detras del lienzo ves el numero " + pistaCuadro);
        }else{
            System.out.println("Ya has mirado aqui, no hay nada mas");
        }
    }

    public static void inspreccionarCajon(){
        if (!cajonRevisado){
            cajonRevisado = true;
            System.out.println("Bajo unos papeles encuentras el numero " + pistaCajon);
        }else{
            System.out.println("Ya has mirado aqui, no hay nada mas");
        }
    }

    public static void inspreccionarAlfombra(){
        if (!alfombraRevisada){
            alfombraRevisada = true;
            System.out.println("Al levantarla, descubres un numero " + pistaAlfombra + " pintado en el suelo");
        }else{
            System.out.println("Ya has mirado aqui, no hay nada mas");
        }
    }

     public static void setPistaAlfombra(int pistaAlfombra) {
        habitacion.pistaAlfombra = pistaAlfombra;
    }

    public static void setPistaCuadro(int pistaCuadro) {
        habitacion.pistaCuadro = pistaCuadro;
    }

    public static void setPistaCajon(int pistaCajon) {
        habitacion.pistaCajon = pistaCajon;
    }

    public static int getPistaAlfombra() {
        return pistaAlfombra;
    }

    public static int getPistaCuadro() {
        return pistaCuadro;
    }

    public static int getPistaCajon() {
        return pistaCajon;
    }
}
