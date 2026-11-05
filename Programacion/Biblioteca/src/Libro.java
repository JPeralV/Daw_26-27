public class Libro {
    //Atributos
    private static String titulo;
    private static String autor;
    private static int anioPublicacion;
    private static boolean disponible;
    private static int vecesPrestado;

    //Constructores

    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible, int vecesPrestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
        this.vecesPrestado = 0;
    }

    //Metodos

    private void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
    }

    //Getters y Setters
       public String getTitulo() {
        return titulo;
    }
 
 
    public String getAutor() {
        return autor;
    }
 
 
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
 
 
    public boolean isDisponible() {
        return disponible;
    }
 
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
 
    public int getVecesPrestado() {
        return vecesPrestado;
    }
 
    public void setVecesPrestado(int vecesPrestado) {
        this.vecesPrestado = vecesPrestado;
    }

}
