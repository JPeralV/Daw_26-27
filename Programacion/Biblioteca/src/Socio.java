public class Socio {
//Atributos
private static String nombre;
private static int numeroSocio;
private static int contrasenia;
private static int librosPrestados;
//Constantes
private static final int maxPrestamos = 2;

//Constructores

public Socio (String nombre, int numeroSocio, int contrasenia){
    
    this.nombre = nombre;
    this.numeroSocio = numeroSocio;
    this.contrasenia = contrasenia;
    this.librosPrestados = 0;
}

//Metodos

private boolean comprobarContrasenia (int pin){
   return pin == contrasenia;
}

private boolean puedePedir(){
    return librosPrestados < maxPrestamos;
}

private void pedirLibro (Libro libro){
    if(!puedePedir()){
        System.out.println("No puedes pedir más libros, has alcanzado el límite de préstamos.");
    }else if (Biblioteca.prestar(libro)) {
            librosPrestados++;
            System.out.println("Préstamo realizado");
    }else{
        System.out.println("El libro ya está prestado");
    }
    }

private void devolverLibro (Libro libro){
    if(puedePedir()){
        System.out.println("No puedes devolver un libro que no has pedido");
        return;
    }else{ Biblioteca.devolver(libro);
        if(librosPrestados > 0){
            librosPrestados--;
            System.out.println("Libro devuelto");
        }

    }
}

private void mostrarDatos(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Número de Socio: " + numeroSocio);
    System.out.println("Libros Prestados: " + librosPrestados);
}


}
