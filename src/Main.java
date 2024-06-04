import Libro.Libro;
import Libro.libro1;
import Libro.libro2;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro libroA = new libro1("Wigetta", "Willyrex y Vegetta 777", "aventuras", "Q250.00");
        libro2 libroB = new libro2("24Hrs Lemans", "Rxplayer", "Autos", "Q300.00");

        // Update details of libro2
        libroB.actualizarTitulo("Harry Potter");
        libroB.actualizarAutor("Harry Kane");
        libroB.actualizarCategoria("MAgia");
        libroB.actualizarPrecio("Q250.00");

        ArrayList<Libro> Libros = new ArrayList<>();
        Libros.add(libroA);
        Libros.add(libroB);

        for (Libro a : Libros) {
            System.out.println("-----------Libro------------");
            System.out.println("Título: " + a.getTitulo());
            System.out.println("Autor: " + a.getAutor());
            System.out.println("Categoría: " + a.getCategoria());
            System.out.println("Precio: " + a.getPrecio());
        }
    }
}