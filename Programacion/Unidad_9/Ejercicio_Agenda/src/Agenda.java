public class Agenda {
public static final int maxContactos = 20;
Contacto[] contactos = new Contacto [maxContactos];


private boolean estaVacia() {
    int i = 0;
    boolean vacia = true;
    do{
        if (contactos[i] != null){
            vacia = false;
        } i++;

    }while ( i < contactos.length && vacia);
        return vacia;
    }

private int buscarHueco(){
    int i = 0;
    boolean hueco = false;
    do{
        if (contactos[i] == null){
            hueco = true;

        }i ++;

    }while (i < contactos.length && !hueco);

    if (hueco == true){
        return i;
    }else{
        return maxContactos + 1;
    }

    }

public void añadirContacto(){
    if (buscarHueco() > maxContactos){
        System.out.println("La agenda esta llena");
    }else{
        contactos[buscarHueco()] = 
    }
    }

}


