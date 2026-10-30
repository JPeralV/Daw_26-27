public class Enemigo {

//Atributos
private static String monNombre;
public static int monHP;
private static int monMaxHP;
private static int monDano;

//Constructores
public Enemigo (String monNombre, int monMaxHP , int monDano){
    this.monNombre = monNombre;
    this.monMaxHP = monMaxHP;
    this.monHP = monMaxHP;
    this.monDano = monDano;
}

//Metodos
public void recibirDano(int dano){
    monHP = monHP - dano;
    if (monHP == 0){
        monHP = 0;
    }
}

public boolean estaDed(){
    return monHP <= 0;
    }

public void monAtac(Aventurero aventurero){
    aventurero.heroHP = aventurero.heroHP - monDano;
}
}


