package productos;


import java.util.Scanner;
import baseDeDatos.*;

public class Main {


    public static void main(String[] args) {

        //CrearTabla.crearBaseDatos();
        //InsertarElemento.insertarDatos();

        Libro listadoLibros[] = new Libro[7];
        /*listadoLibros[0] = new Libro("It", "Stephen King", 1200F, "Terror", "Editorial Horror", 1971);
        listadoLibros[1] = new Libro("1984", "George Orwell", 1100F, "Novela", "Libros Clasicos", 1949);
        listadoLibros[2] = new Libro("El señor de los Anillos", "J.R.R Tolkien", 1400F, "Fantasia", "De Bolsillo", 1966);
        listadoLibros[3] = new Libro("Juego de Tronos", "George R.R Martin", 1400F, "Fantasia", "Vintage", 1993);
        listadoLibros[4] = new Libro("Mr Mercedes", "Stephen King", 1400F, "Terror", "De Bolsillo", 2011);
        listadoLibros[5] = new Libro("El Tunel", "Ernesto Sabato", 1400F, "Novela", "De Bolsillo", 1948);*/

        Comic listadoComics[] = new Comic[5];
        /*listadoComics[0] = new Comic("Batman: The Dark Knight Returns ", "Frank Miller", 1000F, "Comics", "DC comics", 1986, "Frank Miller", "Varley");
        listadoComics[1] = new Comic("Watchmen", "Alan Moore", 1400F, "Comics", "DC comics", 1987, "Dave Gibbons", "Higgins");
        listadoComics[2] = new Comic("V de Vendetta", "Alan Moore", 1200F, "Comics", "DC comics", 1982, "Whitaker", "Doods");*/

        Revista listadoRevista[] = new Revista[5];
       /* listadoRevista[0] = new Revista("Muy Interesante n830", 800F, "2021-01-29");
        listadoRevista[1] = new Revista("Revista Caras Junio 2021", 600F, "2021-06-03");
        listadoRevista[2] = new Revista("Revista Rumbos n354", 400F, "2021-02-16");*/

        MenuPrincipal datos = new MenuPrincipal();
        LeerElemento leerElemento = new LeerElemento();

        int respuesta = datos.Inicializar();
// while para que se ejecute el menu nuevamente hasta que se decida salir, como nunca va a ser 5 se repite siempre
        while (respuesta != 5) {

            switch (respuesta) {
                case 1:
                    System.out.println("1 - Listado total de libros");
                    System.out.println("2 - Listado total de comics");
                    System.out.println("3 - Listado total de revistas");
                    System.out.println("4 - Volver atrás");
                    Scanner scannerTotal = new Scanner(System.in);
                    System.out.print("Opcion: ");
                    int listados = scannerTotal.nextInt();
                    switch (listados) {
                        case 1:

                            leerElemento.listarLibros();

                            /*for (Libro todoLibros : listadoLibros) {
                                //for each recorre todos los miembros del array, el if es para que no recorra los arrays vacios y no salte el .NullPointerException
                                if (todoLibros == null) {
                                    break;
                                } else {
                                    System.out.println(todoLibros.toString());
                                }
                            }*/
                            break;
                        case 2:
                            leerElemento.listarComics();
                            /*for (Comic todoComics : listadoComics) {
                                if (todoComics == null) {
                                    break;
                                } else {
                                    System.out.println(todoComics.toString());
                                }
                            }*/
                            break;
                        case 3:
                            leerElemento.listarRevistas();
                            /*for (Revista todoRevistas : listadoRevista) {
                                if (todoRevistas == null) {
                                    break;
                                } else {
                                    System.out.println(todoRevistas.toString());
                                }
                            }*/
                            break;
                        case 4:
                            //vuelve al metodo main
                            respuesta = datos.Inicializar();
                            break;

                        default:
                            System.out.println("No ha elegido una opcion disponible");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("1 - Búsqueda por autores");
                    System.out.println("2 - Búsqueda por géneros");
                    System.out.println("3 - Búsqueda del precio del libro");
                    System.out.println("4 - Búsqueda por titulo");
                    System.out.println("5 - Volver atrás");
                    Scanner scannerBusqeda = new Scanner(System.in);
                    System.out.print("Opcion: ");
                    int busquedas = scannerBusqeda.nextInt();
                    switch (busquedas) {
                        case 1:
                            Scanner scanner1 = new Scanner(System.in);
                            System.out.print("Escribe el nombre del autor: ");
                            String nombreAutor = scanner1.nextLine().toUpperCase();

                            LeerElemento busquedaAutor = new LeerElemento();
                            busquedaAutor.busquedaPorAutores(nombreAutor);
                            int contador = 0;
                            /*
                            for (Libro listadoAutores : listadoLibros) {
                                if (listadoAutores != null) {
                                    // to upper case para que compare los dos string en mayuscula siempre
                                    if (listadoAutores.getAutorNombre().toUpperCase().equals(nombreAutor)) {
                                        System.out.println(listadoAutores.toString());
                                        contador++;
                                    }
                                }
                            }
                            for (Comic listadoAutoresC : listadoComics) {
                                if (listadoAutoresC != null) {
                                    if (listadoAutoresC.getAutorNombre().toUpperCase().equals(nombreAutor)) {
                                        System.out.println(listadoAutoresC.toString());
                                        contador++;
                                    }
                                }
                            }
                            if (contador == 0) {
                                System.out.println("No se ha encontrado ningun libro con ese autor");
                            }*/
                            System.out.println(" ");
                            break;
                        case 2:
                            Scanner scannerGenero = new Scanner(System.in);
                            System.out.print("Escribe el genero que desea buscar: ");
                            String nombreGenero = scannerGenero.nextLine().toUpperCase();

                            LeerElemento busquedageneros = new LeerElemento();
                            busquedageneros.busquedaPorGeneros(nombreGenero);

                            /*contador = 0;
                            for (Libro listadoGeneros : listadoLibros) {
                                if (listadoGeneros != null) {
                                    if (listadoGeneros.getGenero().toUpperCase().equals(nombreGenero)) {
                                        System.out.println(listadoGeneros.toString());
                                        contador++;
                                    }
                                }
                            }
                            for (Comic listadoGenerosC : listadoComics) {
                                if (listadoGenerosC != null) {
                                    if (listadoGenerosC.getGenero().toUpperCase().equals(nombreGenero)) {
                                        System.out.println(listadoGenerosC.toString());
                                        contador++;
                                    }
                                }
                            }
                            if (contador == 0) {
                                System.out.println("No se ha encontrado ningun libro con ese genero");
                            }*/
                            System.out.println(" ");
                            break;
                        case 3:
                            Scanner scannerPrecio = new Scanner(System.in);
                            System.out.print("Escribe el libro del que deseas saber el precio: ");
                            String tituloLibro = scannerPrecio.nextLine().toUpperCase();

                            LeerElemento buscarPrecio = new LeerElemento();
                            buscarPrecio.busquedaDePrecio(tituloLibro);

                            /*contador = 0;
                            for (Libro listadoTitulos : listadoLibros) {
                                if (listadoTitulos != null) {
                                    if (listadoTitulos.getTitulo().toUpperCase().equals(tituloLibro)) {
                                        System.out.println("El precio de: " + listadoTitulos.getTitulo() + " es " + listadoTitulos.getPrecio());
                                        contador++;
                                    }
                                }
                            }
                            for (Libro listadoTitulosComics : listadoComics) {
                                if (listadoTitulosComics != null) {
                                    if (listadoTitulosComics.getTitulo().toUpperCase().equals(tituloLibro)) {
                                        System.out.println("El precio de: " + listadoTitulosComics.getTitulo() + " es " + listadoTitulosComics.getPrecio());
                                        contador++;
                                    }
                                }
                            }
                            if (contador == 0) {
                                System.out.println("No se ha encontrado ningun libro con ese titulo");
                            }
                            System.out.println(" ");*/
                            break;
                        case 4:
                            Scanner scannerTitulo = new Scanner(System.in);
                            System.out.print("Escribe el título del libro que desea buscar : ");
                            String titulos = scannerTitulo.nextLine().toUpperCase();

                            LeerElemento busquedaTitulos = new LeerElemento();
                            busquedaTitulos.busquedaPorTitulo(titulos);

                           /* contador = 0;
                            for (Libro listadoTitulos : listadoLibros) {
                                if (listadoTitulos != null) {
                                    if (listadoTitulos.getTitulo().toUpperCase().equals(titulos)) {
                                        System.out.println(listadoTitulos.toString());
                                        contador++;
                                    }
                                }
                            }
                            for (Libro listadoTitulosComics : listadoComics) {
                                if (listadoTitulosComics != null) {
                                    if (listadoTitulosComics.getTitulo().toUpperCase().equals(titulos)) {
                                        System.out.println(listadoTitulosComics.toString());
                                        contador++;
                                    }
                                }
                            }
                            if (contador == 0) {
                                System.out.println("No se ha encontrado ningun libro con ese titulo");
                            }
                            System.out.println(" ");*/
                            break;
                        case 5:
                            respuesta = datos.Inicializar();
                            break;
                    }
                    break;
                case 3:
                    System.out.println(" 1- Ingresa un nuevo libro");
                    System.out.println(" 2 - Ingresa una nueva revista");
                    System.out.println(" 3- Ingresa un nuevo cómic");
                    System.out.println(" 4- Volver atrás");

                    Scanner nuevoProducto = new Scanner(System.in);
                    System.out.print("Respuesta: ");
                    int agregar = nuevoProducto.nextInt();

                    switch (agregar) {
                        case 1:
                            int contadorArray = 0;
                            // el for each cuenta los elementos no nulos del array, despues se lo compara con el length
                            // del array para comprobar que no este lleno y se pueden agregar mas elementos
                            for (Libro listadol : listadoLibros) {
                                if (listadol != null) {
                                    contadorArray++;
                                }
                            }
                            if (contadorArray < listadoLibros.length) {
                                System.out.print(" Ingresa el título del libro: ");
                                String nuevoTitulo = nuevoProducto.nextLine();
                                nuevoTitulo = nuevoProducto.nextLine();
                                System.out.print(" Ingresa el nombre del autor: ");
                                String nuevoAutor = nuevoProducto.nextLine();
                                System.out.print(" Ingresa el precio del libro: ");
                                float nuevoPrecio = nuevoProducto.nextFloat();
                                System.out.print(" Ingresa el genero del libro: ");
                                String nuevoGenero = nuevoProducto.nextLine();
                                nuevoGenero = nuevoProducto.nextLine();
                                System.out.print(" Ingresa la editorial del libro: ");
                                String nuevoEditorial = nuevoProducto.nextLine();
                                System.out.print(" Ingresa el año de la publicación: ");
                                int nuevoAño = nuevoProducto.nextInt();

                                listadoLibros[contadorArray] = new Libro(nuevoTitulo, nuevoAutor, nuevoPrecio, nuevoGenero, nuevoEditorial, nuevoAño);
                                System.out.println("Elemento agregado correctamente");
                            } else {
                                System.out.println("No se pueden agregar más elementos");
                            }
                            System.out.println(" ");
                            break;
                        case 2:
                            contadorArray = 0;
                            for (Revista listadoR : listadoRevista) {
                                if (listadoR != null) {
                                    contadorArray++;
                                }
                            }
                            if (contadorArray < listadoRevista.length) {
                                System.out.print(" Ingresa el nombre de la revista: ");
                                String nuevoNombre = nuevoProducto.nextLine();
                                nuevoNombre = nuevoProducto.nextLine();
                                System.out.print(" Ingresa el precio de la revista: ");
                                float nuevoPrecioR = nuevoProducto.nextFloat();
                                System.out.print(" Ingresa la fecha de publicación(yyyy-mm-dd): ");
                                String nuevaFecha = nuevoProducto.nextLine();
                                nuevaFecha = nuevoProducto.nextLine();

                                listadoRevista[contadorArray] = new Revista(nuevoNombre, nuevoPrecioR, nuevaFecha);
                                System.out.println("Elemento agregado correctamente");
                            } else {
                                System.out.println(" No se pueden agregar más elementos");
                            }
                            System.out.println(" ");
                            break;
                        case 3:
                            contadorArray = 0;
                            for (Comic listadoC : listadoComics) {
                                if (listadoC != null) {
                                    contadorArray++;
                                }
                            }
                            if (contadorArray < listadoComics.length) {
                                System.out.print(" Ingresa el título del cómic: ");
                                String nuevoTitulo = nuevoProducto.nextLine();
                                nuevoTitulo = nuevoProducto.nextLine();
                                System.out.print(" Ingresa el nombre del escritor: ");
                                String nuevoAutor = nuevoProducto.nextLine();
                                System.out.print(" Ingresa el precio del cómic: ");
                                float nuevoPrecio = nuevoProducto.nextFloat();
                                System.out.print(" Ingresa el genero del cómic: ");
                                String nuevoGenero = nuevoProducto.nextLine();
                                nuevoGenero = nuevoProducto.nextLine();
                                System.out.print(" Ingresa la editorial del cómic: ");
                                String nuevoEditorial = nuevoProducto.nextLine();
                                System.out.print(" Ingresa el año de la publicación: ");
                                int nuevoAño = nuevoProducto.nextInt();
                                String nuevoDibujante = nuevoProducto.nextLine();
                                System.out.print(" Ingresa el nombre del dibujante: ");
                                String nuevoColorista = nuevoProducto.nextLine();
                                System.out.print(" Ingresa el nombre del colorista: ");
                                nuevoColorista = nuevoProducto.nextLine();

                                listadoComics[contadorArray] = new Comic(nuevoTitulo, nuevoAutor, nuevoPrecio, nuevoGenero, nuevoEditorial, nuevoAño, nuevoDibujante, nuevoColorista);
                                System.out.println("Elemento agregado correctamente");
                            } else {
                                System.out.println("No se pueden agregar más elementos");
                            }
                            System.out.println(" ");
                            break;

                        case 4:
                            respuesta = datos.Inicializar();
                    }

                    break;
                case 4:
                    System.out.println("¿Seguro que desea salir? 1) SI - 2) NO");
                    Scanner salida = new Scanner(System.in);
                    System.out.print("Respuesta: ");
                    int respuestaSalida = salida.nextInt();

                    if (respuestaSalida == 1)
                        System.exit(0);
                    else {
                        respuesta = datos.Inicializar();
                    }
                    break;
                default:
                    System.out.println("No ha elegido una opcion disponible");


            }
        }
    }
}
