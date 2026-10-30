import java.util.Random;
public class Cesta {
    //Atributos
private static int bolasBlancas;
private static int bolasAzules;
private static int bolasNegras;
private static int totalBolas = 0;

//Constructos
public Cesta (int bolasBlancas, int BolasAzules, int bolasNegra){
    this.bolasBlancas = 10;
    this.bolasAzules = 1;
    this.bolasNegras = 1;
}

private void obtenerTotalBolas(){
    int totalBolas = bolasAzules + bolasBlancas + bolasNegras;

}

//public char
private static char extraerBola (int b, int a, int n) {
    Random rand = new Random();
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


}
