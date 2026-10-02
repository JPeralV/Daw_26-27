import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int hora = 0;
        int minutos = 0;
        final int segundosDia = 86_400;
        final int segundosHoraTotales = 3_600;
        final int segungosMinutoTotales = 60;
        int segundosHora = 0;
        int segundosMinuto = 0;
        int segundosTotales = 0;
        System.out.println("A continuación deberá introducir una hora del día, primero introducirá la hora y luego los minutos.");
        System.out.println("Hora:");
        hora = scan.nextInt();
        System.out.println("Minutos:");
        minutos = scan.nextInt();
        segundosHora = hora * segundosHoraTotales;
        segundosMinuto = minutos * segungosMinutoTotales;
        segundosTotales = segundosDia - (segundosHora + segundosMinuto);

        if ((hora < 0 || minutos < 0) || (hora >= 24 || minutos > 60) ){

            System.out.println("La hora introducida no es valida");
            
        }
        else{
        System.out.println("Desde las " +hora+":"+minutos + " hasta la medianoche faltan " + segundosTotales + " segundos.");
        }
    }
}
