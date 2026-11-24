public class Contacto {
private static String nombre;
private static int telefono;
private static String mail;



public Contacto (String nombre, int telefono, String mail){
    this.nombre = nombre;
    this.telefono = telefono;
    this.mail = mail;
}

 @Override
    public String toString() {
       String tarjeta =  this.nombre + "\n"
                + "Telf: " + this.telefono + "\n"
                + "@: " + this.mail + "\n";
        return tarjeta;
    }

public static String getNombre() {
    return nombre;
}

public static int getTelefono() {
    return telefono;
}

public static String getMail() {
    return mail;
}

}
