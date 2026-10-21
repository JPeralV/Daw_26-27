public class Ticket {
private static int cantidadEntraAdulto;
private static int cantidadEntradaNinio;
private static int cantidadAudioguia;
public static final double PEADULTO = 9.6f;
public static final double PENINIO = 4.95f;
public static final double PAUDIOGUIA = 3.50f;
public static final double DESCUENTO = 0.17f;

public Ticket (int cantidadEntraAdulto, int cantidadEntradaNinio, int cantidadAudioguia){
    this.cantidadEntraAdulto = cantidadEntraAdulto;
    this.cantidadEntradaNinio = cantidadEntradaNinio;
    this.cantidadAudioguia = cantidadAudioguia;
}

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
public int getEntradaAdulto(){
        return cantidadEntraAdulto;
    }

public int getEntradaNinio(){
    return cantidadEntradaNinio;
}

public int getAudioguia(){
    return cantidadAudioguia;
}

public double getIngreso(){
    return calcularTotal();
}

public double getDescuento(){
    return calcularDescuentoAudioguias();
}
}
