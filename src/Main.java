import com.sun.org.apache.bcel.internal.generic.LUSHR;

import java.util.Scanner;

public class Main {
    static Scanner scan;

    public static void main(String[] args) {
        // write your code here
        /*1. Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
    precio, stock y Autor, este último posee las características de nombre, apellido,
    email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
    único autor. Ejecute las siguientes instrucciones:
    a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
    b. Imprima por pantalla al autor previamente instanciado.
    c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
    pesos con una cantidad de 150 copias.
    d. Imprima por pantalla el libro instanciado.
    e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
    cantidad en 50 copias.
    f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
    Libro “Effective Java”.
    g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
    siguiente mensaje:
            “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
    h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
    cambios necesarios en el método del punto g, para imprimir un nuevo
    mensaje que liste los autores que contribuyeron a ese libro.*/
        Libro m=IngresarLibro();
        Printear(m);

    }

    public static void PrintearAutor(Autor[] autors) {
        for (int i = 0; i < autors.length; i++) {
            System.out.println("Nombre: " + autors[i].getNombre());
            System.out.println("Apellido: " + autors[i].getApellido());
            System.out.println("Email: " + autors[i].getEmail());
            System.out.println("Genero: " + autors[i].getGenero());
        }
    }

    public static void Printear(Libro m) {
        System.out.println("Titulo: " + m.getTitulo());
        PrintearAutor(m.getAutor());
        System.out.println("Precio: " + m.getPrecio());
        System.out.println("Stock" + m.getStock());
    }

    public static Autor[] IngresarAutores() {
        scan = new Scanner(System.in);
        Autor[] autors = new Autor[10];
        char s = 's';
        int i = 0;

        while (s == 's') {
            System.out.println("Ingrese el Nombre del autor");
            autors[i].setNombre(scan.nextLine());
            System.out.println("Ingrese el Apellido del autor");
            autors[i].setApellido(scan.nextLine());
            System.out.println("Ingrese el Email del autor");
            autors[i].setEmail(scan.nextLine());
            System.out.println("Ingrese el Genero del autor");
            autors[i].setGenero(scan.next().charAt(0));
            System.out.println("Aprete S si desea seguir agregando autores ");
            s = scan.next().charAt(0);

        }

        return autors;
    }

    public static Libro IngresarLibro() {
        Libro libro = new Libro();
        scan = new Scanner(System.in);
        System.out.println("Ingrese Titulo");
        libro.setTitulo(scan.nextLine());
        libro.setAutor(IngresarAutores());

        System.out.println("Ingrese Precio");
        libro.setPrecio(scan.nextDouble());

        System.out.println("Ingrese Stock");
        libro.setStock(scan.nextInt());
        return libro;
    }
}


