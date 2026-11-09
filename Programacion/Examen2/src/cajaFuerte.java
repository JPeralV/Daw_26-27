public class cajaFuerte {
private static int codigoSecreto;
private static int intentosRestantes;
private static boolean estaAbierta;




public cajaFuerte (int codigoSecreto, int intentosRestantes){
    this.codigoSecreto = codigoSecreto;
    this.intentosRestantes = intentosRestantes;
    this.estaAbierta = false;
}

public static int intentarAbrir (int combinacion){

    if (intentosRestantes > 1){
         if (combinacion == codigoSecreto){
    estaAbierta = true;
        }else{
        intentosRestantes--;
        System.out.println("Contraseña incorrecta, quedan " + intentosRestantes);
        }}
    else{
    System.out.println("Caja bloqueada");
    }
    return combinacion;
}


public static boolean bloqueada(){
    return intentosRestantes == 0;
}

public static int getIntentosRestantes() {
    return intentosRestantes;
}

public static boolean isEstaAbierta() {
    return estaAbierta;
}


}

