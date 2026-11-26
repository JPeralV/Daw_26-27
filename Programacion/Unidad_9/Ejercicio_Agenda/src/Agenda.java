public class Agenda {
public static final int maxContactos = 20;
Contacto[] contactos = new Contacto [maxContactos];


public boolean estaVacia() {
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
    
    public boolean estaLlena(){ 
        return buscarHueco() > maxContactos;
    }

public void añadirContacto(Contacto nuevoContacto){
    
    if (buscarHueco() > maxContactos){
        System.out.println("La agenda esta llena");
    }else{
        contactos[buscarHueco()] = nuevoContacto;
    }
    }

    @Override 
    public String toString(){
        String agendaString = "";

        for (Contacto c: this.contactos){
            if (c != null){
                agendaString += c + "\n";
            }
        }
        return agendaString;
    }

}


