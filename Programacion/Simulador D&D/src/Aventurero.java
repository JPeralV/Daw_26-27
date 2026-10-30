public class Aventurero {

//Atributos
private static String heroNom;
public static int heroHP;
private static int heroMaxHP;
private static int heroDano;
private static int potis;

//Constante
private static final int POTICURA = 20;

//Constructor
public Aventurero (String heroNom, int heroMaxHP, int heroDano, int potis){
    this.heroNom = heroNom;
    this.heroMaxHP = heroMaxHP;
    this.heroHP = heroMaxHP;
    this.potis = potis;
}

//Metodos
public void heroAtac(Enemigo objetivo){
    objetivo.monHP = objetivo.monHP - heroDano;

}

}
