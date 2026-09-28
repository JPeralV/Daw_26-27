public class App {
    public static void main(String[] args) {
       Monitor bigMonitor = new Monitor /*Al crear un objeto se nos exige los atributos designados*/(30.0, 12);
       Monitor lilMonitor = new Monitor (19.5,3.2);
        //Invocacion del metodo
        bigMonitor.on();
        System.out.println("El tamaño del monitor grande es " + bigMonitor.size +"''");
        System.out.println("Y pesa" + bigMonitor.weight);
        //Destruir un objeto
        //bigMonitor = null;
    }

}
