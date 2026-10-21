public class Caja {
private static int totalEntradasAdultos = 0;
private static int totalEntradasNinio = 0;
private static int totalAudioguias = 0;
private static double ingresosAcumulados = 0;
private static double totalDescuentoAplicado = 0;

public void registrarTicket (Ticket ticket){
totalEntradasAdultos += ticket.getEntradaAdulto();
totalEntradasNinio += ticket.getEntradaNinio();
totalAudioguias += ticket.getAudioguia();
ingresosAcumulados += ticket.getIngreso();
totalDescuentoAplicado += ticket.getDescuento();
}

public void mostrarResumenDia(){
    System.out.printf("==============================\n");
    System.out.printf("%s-15 %s15\n", "Entradas adulto:", totalEntradasAdultos);
    System.out.printf("%s-15 %s15\n", "Entradas niño:", totalEntradasNinio);
    System.out.printf("%s-15 %s15\n", "Audioguias:", totalAudioguias);
    System.out.printf("---------------------------------\n");
    System.out.printf("%s-15 %s15\n","Descuento aplicado:", totalDescuentoAplicado);
    System.out.printf("---------------------------------\n");
    System.out.printf("%s-15 %15\u001b\n","Total del dia:", ingresosAcumulados);
    System.out.printf("==============================\n");
}
}
