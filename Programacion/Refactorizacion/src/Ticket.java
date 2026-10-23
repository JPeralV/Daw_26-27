public class Ticket {
//Atributos
private static int cantidadEntraAdulto;
private static int cantidadEntradaNinio;
private static int cantidadAudioguia;
//Constantes
private static final double PEADULTO = 9.6d;
private static final double PENINIO = 4.95d;
private static final double PAUDIOGUIA = 3.50d;
private static final double DESCUENTO = 0.17d;
//Constructores
public Ticket (int cantidadEntraAdulto, int cantidadEntradaNinio, int cantidadAudioguia){
    this.cantidadEntraAdulto = cantidadEntraAdulto;
    this.cantidadEntradaNinio = cantidadEntradaNinio;
    this.cantidadAudioguia = cantidadAudioguia;
}
//Metodos
public double calcularSubtotal(){
return (cantidadEntraAdulto * PEADULTO) + (cantidadEntradaNinio * PENINIO) + (cantidadAudioguia * PAUDIOGUIA);
}
public double calcularDescuentoAudioguias(){
return (cantidadAudioguia * PAUDIOGUIA) * DESCUENTO;
}
public double calcularTotal(){
return calcularSubtotal() - calcularDescuentoAudioguias(); 
}

public void imprimirTicket(){
    System.out.printf("==============================\n");
    System.out.printf("%s-15 %s15\n", "Entradas adulto:", cantidadEntraAdulto);
    System.out.printf("%s-15 %s15\n", "Entradas niño:", cantidadEntradaNinio);
    System.out.printf("%s-15 %s15\n", "Audioguias:", cantidadAudioguia);
    System.out.printf("---------------------------------\n");
    System.out.printf("%s-15 %s15\n","Subtotal:", calcularSubtotal());
    System.out.printf("---------------------------------\n");
    System.out.printf("\033[107m\033[m31 %s-15 %15\u001b[0m\n","Total:", calcularTotal());
    System.out.printf("==============================\n");


}
//Getters
public int getEntradaAdulto(){
        return this.cantidadEntraAdulto;
    }

public int getEntradaNinio(){
    return this.cantidadEntradaNinio;
}

public int getAudioguia(){
    return this.cantidadAudioguia;
}
}
