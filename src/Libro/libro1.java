package Libro;

public class libro1 extends Libro implements Actualizar{

    public libro1(String titulo, String autor, String categoria, String precio) {
        super(titulo, autor, categoria, precio);
    }

    @Override
    public void cambiardatos() {
        System.out.println("Libro 1");
    }
}
