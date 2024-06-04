import Libro.Libro;
import Libro.libro1;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro libroA = new libro1("Wigetta","Willyrex y Vegetta 777","aventuras","Q250.00");

        ArrayList<Libro> Libros = new ArrayList<>();
        Libros.add(libroA);
        for (Libro a : Libros){
            System.out.println(a.getTitulo());
            System.out.println(a.getAutor());
            System.out.println(a.getCategoria());
            System.out.println(a.getPrecio());
        }
    }
}