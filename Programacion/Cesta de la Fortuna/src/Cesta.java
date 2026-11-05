import java.util.Random;
public class Cesta {
    //Atributos
private static int bolasBlancas;
private static int bolasAzules;
private static int bolasNegras;

//Constructos
public Cesta (){
    this.bolasBlancas = 10;
    this.bolasAzules = 1;
    this.bolasNegras = 1;
}
//Metodos
private static int obtenerTotalBolas(){
   return  bolasAzules + bolasBlancas + bolasNegras;

}

public char sacarBola(){
 char bola = extraerBola(bolasBlancas,bolasAzules,bolasNegras);
 switch (bola) {
    case 'B':
        bolasBlancas--;
        break;
    case 'A':
        bolasAzules--;
        break;
    case 'N':
        bolasNegras--;
        
        
 }
 return bola;
}
private static char extraerBola (int b, int a, int n) {
    Random rand = new Random();
    int totalBolas = b + a + n;
    if (totalBolas == 0) return 'V';

    int tirada = rand.nextInt(totalBolas) +1;

    if (tirada <= b) {
        return 'B';
    } else if (tirada <= b + a){
        return 'A';
    }else{
        return 'N';
    }
}

//Getters
public static int getBolasBlancas() {
    return bolasBlancas;
}
public static int getBolasAzules() {
    return bolasAzules;
}
public static int getBolasNegras() {
    return bolasNegras;
}public static int getTotalBolas() {
    return obtenerTotalBolas();
}

}
