package Libro;

public abstract class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private String categoria;
    private String precio;
    //TODO agrega más atributos de los libros relevantes para tienda

    // Constructor con parámetros
    public Libro(String titulo, String autor, String categoria, String precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.precio = precio;
    }

    // Métodos
    public void mostrarDetalles() {
        // Implementa este método para mostrar los detalles del libro
        System.out.println("------Datos del Libro-------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor" + autor);
        System.out.println("Categoria: "+ categoria);
        System.out.println("Precio" + precio);

    }

    public void actualizarPrecio(double nuevoPrecio) {
        // Implementa este método para actualizar el precio del libro
    }

    //getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
