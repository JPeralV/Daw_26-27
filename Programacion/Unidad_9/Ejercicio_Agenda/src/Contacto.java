public class Contacto {
private static String apellido1;
private static String apellido2;
private static String nombre;
private static int telefono;
private static String mail;



public Contacto (String nombre, String apellido1, String apellido2,  int telefono, String mail){
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.telefono = telefono;
    this.mail = mail;
}

public Contacto (String nombre, String apellido1, int telefono, String mail){
    this(nombre, apellido1, "", telefono, mail);
}

public String getNombreCompleto(){
    return this.nombre + " " + this.apellido1 + " " + this.apellido2;
}


 @Override
    public String toString() {
       String tarjeta =  getNombreCompleto()+ "\n"
                + "Telf: " + telefono + "\n"
                + "@: " + mail + "\n";
        return tarjeta;
    }


}
