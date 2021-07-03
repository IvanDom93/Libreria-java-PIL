package productos;


import java.util.Scanner;

import baseDeDatos.*;

public class Main {


    public static void main(String[] args) {

        CrearTabla.crearBaseDatos();
        InsertarElemento.insertarDatos();


        MenuPrincipal datos = new MenuPrincipal();
        LeerElemento leerElemento = new LeerElemento();

        int respuesta = datos.Inicializar();
// while para que se ejecute el menu nuevamente hasta que se decida salir, como nunca va a ser 5 se repite siempre
        while (respuesta != 6) {

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
                            break;
                        case 2:
                            leerElemento.listarComics();
                            break;
                        case 3:
                            leerElemento.listarRevistas();
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
                            System.out.println(" ");
                            break;
                        case 2:
                            Scanner scannerGenero = new Scanner(System.in);
                            System.out.print("Escribe el genero que desea buscar: ");
                            String nombreGenero = scannerGenero.nextLine().toUpperCase();

                            LeerElemento busquedageneros = new LeerElemento();
                            busquedageneros.busquedaPorGeneros(nombreGenero);
                            System.out.println(" ");
                            break;
                        case 3:
                            Scanner scannerPrecio = new Scanner(System.in);
                            System.out.print("Escribe el libro del que deseas saber el precio: ");
                            String tituloLibro = scannerPrecio.nextLine().toUpperCase();

                            LeerElemento buscarPrecio = new LeerElemento();
                            buscarPrecio.busquedaDePrecio(tituloLibro);
                            System.out.println(" ");
                            break;
                        case 4:
                            Scanner scannerTitulo = new Scanner(System.in);
                            System.out.print("Escribe el título del libro que desea buscar : ");
                            String titulos = scannerTitulo.nextLine().toUpperCase();

                            LeerElemento busquedaTitulos = new LeerElemento();
                            busquedaTitulos.busquedaPorTitulo(titulos);
                            System.out.println(" ");
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
                            InsertarElemento insertarLibro = new InsertarElemento();

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
                            int nuevoAnio = nuevoProducto.nextInt();

                            insertarLibro.insertarNuevoLibro(nuevoTitulo, nuevoAutor, nuevoPrecio, nuevoGenero, nuevoEditorial, nuevoAnio);

                            System.out.println(" ");
                            break;
                        case 2:

                            InsertarElemento insertarRevista = new InsertarElemento();

                            System.out.print(" Ingresa el nombre de la revista: ");
                            String nuevoNombre = nuevoProducto.nextLine();
                            nuevoNombre = nuevoProducto.nextLine();
                            System.out.print(" Ingresa el precio de la revista: ");
                            float nuevoPrecioR = nuevoProducto.nextFloat();
                            System.out.print(" Ingresa la fecha de publicación(yyyy-mm-dd): ");
                            String nuevaFecha = nuevoProducto.nextLine();
                            nuevaFecha = nuevoProducto.nextLine();

                            insertarRevista.insertarNuevaRevista(nuevoNombre, nuevoPrecioR, nuevaFecha);

                            System.out.println(" ");
                            break;
                        case 3:
                            InsertarElemento insertarComic = new InsertarElemento();

                            System.out.print(" Ingresa el título del cómic: ");
                            String nuevoTituloC = nuevoProducto.nextLine();
                            nuevoTituloC = nuevoProducto.nextLine();
                            System.out.print(" Ingresa el nombre del escritor: ");
                            String nuevoAutorC = nuevoProducto.nextLine();
                            System.out.print(" Ingresa el precio del cómic: ");
                            float nuevoPrecioC = nuevoProducto.nextFloat();
                            System.out.print(" Ingresa el genero del cómic: ");
                            String nuevoGeneroC = nuevoProducto.nextLine();
                            nuevoGeneroC = nuevoProducto.nextLine();
                            System.out.print(" Ingresa la editorial del cómic: ");
                            String nuevoEditorialC = nuevoProducto.nextLine();
                            System.out.print(" Ingresa el año de la publicación: ");
                            int nuevoAnioC = nuevoProducto.nextInt();
                            String nuevoDibujante = nuevoProducto.nextLine();
                            System.out.print(" Ingresa el nombre del dibujante: ");
                            String nuevoColorista = nuevoProducto.nextLine();
                            System.out.print(" Ingresa el nombre del colorista: ");
                            nuevoColorista = nuevoProducto.nextLine();

                            insertarComic.insertarNuevoComic(nuevoTituloC, nuevoAutorC, nuevoPrecioC, nuevoGeneroC, nuevoEditorialC, nuevoAnioC, nuevoDibujante, nuevoColorista);

                            System.out.println(" ");
                            break;

                        case 4:
                            respuesta = datos.Inicializar();
                    }

                    break;
                case 4:
                    System.out.println(" 1 - Elimina un libro");
                    System.out.println(" 2 - Elimina una revista");
                    System.out.println(" 3 - Elimina un cómic");
                    System.out.println(" 4 - Volver atrás");

                    Scanner borrarProducto = new Scanner(System.in);
                    System.out.print("Respuesta: ");
                    int borrar = borrarProducto.nextInt();

                    switch (borrar) {
                        case 1:
                            System.out.println(" Ingresa el codigo del libro a borrar:");
                            Scanner codigoBorrarlibro = new Scanner(System.in);
                            System.out.print("Respuesta: ");
                            int id_libro = codigoBorrarlibro.nextInt();
                            int contador_libro = leerElemento.busquedaPorID(id_libro, 1);
                            System.out.println(" ");

                            if (contador_libro != 0) {
                                System.out.println(" ¿Seguro desea eliminar este registro?: 1-SI 2-NO");
                                Scanner confirmar = new Scanner(System.in);
                                System.out.print("Respuesta: ");
                                int borrarSi = confirmar.nextInt();
                                if (borrarSi == 1) {
                                    BorrarElemento borrarLibro = new BorrarElemento();
                                    borrarLibro.eliminarElemento(id_libro,1);
                                    System.out.println(" Registro eliminado");
                                    System.out.println(" ");
                                }else{
                                    break;
                                }
                            }else{
                                System.out.println(" No existen productos con ese registro.");
                            }

                            break;
                        case 2:
                            System.out.println(" Ingresa el codigo de la revista a borrar:");
                            Scanner codigoBorrarRevista = new Scanner(System.in);
                            System.out.print("Respuesta: ");
                            int id_revista = codigoBorrarRevista.nextInt();
                            int contador_revista = leerElemento.busquedaPorID(id_revista, 3);
                            System.out.println(" ");

                            if (contador_revista != 0) {
                                System.out.println(" ¿Seguro desea eliminar este registro?: 1-SI 2-NO");
                                Scanner confirmarR = new Scanner(System.in);
                                System.out.print("Respuesta: ");
                                int borrarSiRevista = confirmarR.nextInt();
                                if (borrarSiRevista == 1) {
                                    BorrarElemento borrarRevista = new BorrarElemento();
                                    borrarRevista.eliminarElemento(id_revista,2);
                                    System.out.println(" Registro eliminado");
                                    System.out.println(" ");
                                }else{
                                    break;
                                }

                            }else{
                            System.out.println(" No existen productos con ese registro.");
                        }

                            break;
                        case 3:
                            System.out.println(" Ingresa el codigo del cómic a borrar:");
                            Scanner codigoBorrarComic = new Scanner(System.in);
                            System.out.print("Respuesta: ");
                            int id_comic = codigoBorrarComic.nextInt();

                            int codigo_comic = leerElemento.busquedaPorID(id_comic, 2);


                            if (codigo_comic != 0) {
                                System.out.println(" ¿Seguro desea eliminar este registro?: 1-SI 2-NO");
                                Scanner confirmarC = new Scanner(System.in);
                                int borrarSiComic = confirmarC.nextInt();
                                if (borrarSiComic == 1) {
                                    BorrarElemento borrarComic = new BorrarElemento();
                                    borrarComic.eliminarElemento(id_comic,3);
                                    System.out.println(" Registro eliminado");
                                    System.out.println(" ");
                                }else{
                                    break;
                                }

                            }else{
                                System.out.println(" No existen productos con ese registro.");
                            }

                            break;
                        case 4:
                            respuesta = datos.Inicializar();
                    }

                    break;
                case 5:
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
