

import java.util.Scanner;
import java.util.UUID;

public class Main {
    static Scanner scan;

    public static void main(String[] args) {
        // write your code here
        System.out.println("Bienvenidos al tp numero 2 de objetos");
        System.out.println("Elija el ejercicio");
        System.out.println("1)libro-autor");
        System.out.println("2)Cliente");

        int opcion = 0;
        scan = new Scanner(System.in);
        opcion = scan.nextInt();
        switch (opcion) {
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
            case 1:
                Autor[] a = IngresarAutores();
                PrintearAutor(a);
                /*        Libro m=IngresarLibro();
                Printear(m);*/
                break;
       /* 2. Nos contratan para hacer un programa que lleve el control de las ventas de un
        local. Para esto es necesario modelar la clase Cliente, que posee un atributo id
        como identificador del cliente, el mismo debe ser un valor compuesto por letras y
        números aleatorios que se generan automáticamente al crear un Cliente. El Cliente
        también posee un nombre, un email y un porcentaje de descuento.
        Por otro lado vamos a tener el objeto Factura que representa una venta del
        local, cada Factura posee un identificador de las mismas características que el
        usado en Cliente. A su vez cada factura posee un monto total, una fecha y el Cliente
        que generó la compra. Para la fecha de la venta se le va a asignar la fecha y hora al
        momento de creación del objeto Factura. El tipo Factura debe contar con un
        método que calcule el monto final luego de aplicarle el descuento que posee el
        cliente.
                a. Investigue la clase UUID y sus métodos estáticos para la generación de los
        ids. Investigue la clase LocalDate y sus métodos estáticos para la generación
        de la fecha.
                b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto
        haga uso de un método que facilite la impresión del mismo.
                Cliente[id=?, nombre=?, email=?, descuento=?]
        c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
        monto total luego de aplicarle el descuento.
                d. Cree un método que facilite la impresión del objeto de tipo Factura y que
        siga el siguiente formato.
        Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
        email=?, descuento=?]]
        e. Analizar de agregar el tipo ItemVenta, que representa un producto que
        forma parte de la venta. El mismo contiene un id, un nombre, descripción y
        precio unitario. Considere las modificaciones necesarias en el tipo Factura
        para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
        calcular los montos totales con y sin el descuento aplicado.*/
            case 2:
                UUID id = UUID.randomUUID();
                System.out.println("id:" + id);
                break;

        }
    }

    public static void PrintearAutor(Autor[] autors) {
        System.out.println("okkk" + autors.length);
        Autor[] a = autors;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nombre: " + a[i].getNombre());
            System.out.println("Apellido: " + a[i].getApellido());
            System.out.println("Email: " + a[i].getEmail());
            System.out.println("Genero: " + a[i].getGenero());
        }
    }

    public static void Printear(Libro m) {
        System.out.println("Titulo: " + m.getTitulo());
        System.out.println("Precio: " + m.getPrecio());
        System.out.println("Stock" + m.getStock());
        PrintearAutor(m.getAutor());
    }

    public static Autor[] IngresarAutores() {
        scan = new Scanner(System.in);
        Autor[] a;
        int i = 0;
        a = new Autor[10];
        char s = 's';
        Scanner m = new Scanner(System.in);
        while (s == 's') {
            System.out.println("Ingrese el nombre del autor");
            String nombre = new String();
            nombre = scan.nextLine();
            System.out.println("Ingrese el apellido del autor");
            String Apellido = new String();
            Apellido = scan.nextLine();
            System.out.println("Ingrese el email del autor");
            String Email = new String();
            Email = scan.nextLine();
            System.out.println("Ingrese el genero del autor");
            char genero = scan.next().charAt(0);
            a[i] = new Autor(nombre, Apellido, Email, genero);
            System.out.println("Aprete S si desea seguir agregando autores ");
            i++;
            s = m.next().charAt(0);
        }
        Autor[] au = new Autor[i];

        for (int d = 0; d < i; d++) {
            au[d] = a[d];
        }
        System.out.println(au.length);
        return au;
    }

    public static Libro IngresarLibro() {

        scan = new Scanner(System.in);

        System.out.println("Ingrese Titulo");
        String titulo = new String();
        titulo = scan.nextLine();

        System.out.println("Ingrese Precio");
        double precio = scan.nextDouble();
        System.out.println("Ingrese Stock");
        int stock = scan.nextInt();
        Autor[] a;
        a = IngresarAutores();
        Libro libro = new Libro(titulo, a, precio, stock);
        return libro;
    }
}



