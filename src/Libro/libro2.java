package Libro;

public class libro2 extends Libro implements LibroIn {
    private String titulo;
    private String autor;
    private String categoria;
    private String precio;

    // No-argument constructor
    public libro2(String titulo, String autor, String categoria, String precio) {
        super(titulo, autor, categoria, precio);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: " + precio);
    }

    public void actualizarPrecio(String nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El nuevo precio es: " + nuevoPrecio);
    }

    public void actualizarTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

    public void actualizarAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
    }

    public void actualizarCategoria(String nuevaCategoria) {
        this.categoria = nuevaCategoria;
    }
}

