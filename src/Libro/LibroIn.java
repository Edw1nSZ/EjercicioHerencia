package Libro;

public interface LibroIn {
    String getTitulo();
    String getAutor();
    String getCategoria();
    String getPrecio();
    void mostrarDetalles();
    void actualizarPrecio(String nuevoPrecio);
}
