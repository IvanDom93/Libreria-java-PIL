package paquete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Libros listadoLibros [] = new Libros[10];
        listadoLibros[0] = new Libros("It","Stephen King",1200F,"Terror","Editorial Horror",1971);
        listadoLibros[1] = new Libros("1984","George Orwell",1100F,"Novela","Libros Clasicos",1949);
        listadoLibros[2] = new Libros("El señor de los Anillos","J.R.R Tolkien",1400F,"Fantasia","De Bolsillo",1966);
        listadoLibros[3] = new Libros("Juego de Tronos","George R.R Martin",1400F,"Fantasia","Vintage",1993);
        listadoLibros[4] = new Libros("Mr Mercedes","Stephen King",1400F,"Terror","De Bolsillo",2011);

        Comics listadoComics [] = new Comics[5];
        listadoComics[0] = new Comics("Batman: The Dark Knight Returns ","Frank Miller",1000F,"Comics","DC comics",1986 ,"Frank Miller","Varley");
        listadoComics[1] = new Comics("Watchmen","Alan Moore",1400F,"Comics","DC comics",1987,"Dave Gibbons","Higgins");
        listadoComics[2] = new Comics("V de Vendetta","Alan Moore",1200F,"Comics","DC comics",1982,"Whitaker","Doods");

        Revistas listadoRevista [] = new Revistas[5];
        listadoRevista[0] = new Revistas("Muy Interesante n830",800F, "2021-01-29");
        listadoRevista[1] = new Revistas("Revista Caras Junio 2021",600F, "2021-06-03");
        listadoRevista[2] = new Revistas("Revista Rumbos n354",400F, "2021-02-16");

        MenuPrincipal datos = new MenuPrincipal();

        int respuesta = datos.Inicializar();
// while para que se ejecute el menu nuevamente hasta que se decida salir, como nunca va a ser 5 se repite siempre
     while(respuesta != 5) {

        switch (respuesta){
            case 1:
                System.out.println("1 - Listado total de libros");
                System.out.println("2 - Listado total de comics");
                System.out.println("3 - Listado total de revistas");
                System.out.println("4 - Volver atrás");
                Scanner scannerTotal = new Scanner(System.in);
                System.out.print("Opcion: ");
                int listados = scannerTotal.nextInt();
                switch (listados){
                    case 1:
                        for(Libros todoLibros:listadoLibros){
                            //for each recorre todos los miembros del array, el if es para que no recorra los arrays vacios y no salte el .NullPointerException
                            if(todoLibros == null) {
                                break;
                            }else {
                                System.out.println(todoLibros.toString());
                            }
                        }
                        break;
                    case 2:
                        for(Comics todoComics:listadoComics){
                            //for each recorre todos los miembros del array, el if es para que no recorra los arrays vacios y no salte el .NullPointerException
                            if(todoComics == null) {
                                break;
                            }else {
                                System.out.println(todoComics.toString());
                            }
                        }
                        break;
                    case 3:
                        for(Revistas todoRevistas:listadoRevista){
                            //for each recorre todos los miembros del array, el if es para que no recorra los arrays vacios y no salte el .NullPointerException
                            if(todoRevistas == null) {
                                break;
                            }else {
                                System.out.println(todoRevistas.toString());
                            }
                        }
                        break;
                    case 4:
                        //vuelve al metodo main
                       respuesta = datos.Inicializar();
                        break;

                    default:
                        System.out.println("No ha elegido una opcion disponible");

                }
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
                switch (busquedas){
                    case 1:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.print("Escribe el nombre del autor: ");
                        String nombreAutor = scanner1.nextLine().toUpperCase();

                        int contador = 0;
                        for(Libros listadoAutores: listadoLibros){
                            if(listadoAutores != null) {
                                // to upper case para que compare los dos string en mayuscula siempre
                                if(listadoAutores.getAutorNombre().toUpperCase().equals(nombreAutor)){
                                    System.out.println(listadoAutores.toString());
                                    contador++;
                                }
                            }
                        }
                        for(Comics listadoAutoresC: listadoComics){
                            if(listadoAutoresC !=null){
                                if(listadoAutoresC.getAutorNombre().toUpperCase().equals(nombreAutor)){
                                    System.out.println(listadoAutoresC.toString());
                                    contador++;
                                }
                            }
                        }
                        if(contador==0){
                            System.out.println("No se ha encontrado ningun libro con ese autor");
                        }
                        break;
                    case 2:
                        Scanner scannerGenero = new Scanner(System.in);
                        System.out.print("Escribe el genero que desea buscar: ");
                        String nombreGenero = scannerGenero.nextLine().toUpperCase();

                         contador = 0;
                        for(Libros listadoGeneros: listadoLibros){
                            if(listadoGeneros != null) {
                                if(listadoGeneros.getGenero().toUpperCase().equals(nombreGenero)){
                                    System.out.println(listadoGeneros.toString());
                                    contador++;
                                }
                            }
                        }
                        for(Comics listadoGenerosC: listadoComics){
                            if(listadoGenerosC !=null){
                                if(listadoGenerosC.getGenero().toUpperCase().equals(nombreGenero)){
                                    System.out.println(listadoGenerosC.toString());
                                    contador++;
                                }
                            }
                        }
                        if(contador==0){
                            System.out.println("No se ha encontrado ningun libro con ese genero");
                        }
                        break;
                    case 3:
                        Scanner scannerPrecio = new Scanner(System.in);
                        System.out.print("Escribe el libro del que deseas saber el precio: ");
                       String tituloLibro = scannerPrecio.nextLine().toUpperCase();
                        contador = 0;
                        for(Libros listadoTitulos: listadoLibros){
                            if(listadoTitulos != null) {
                                if(listadoTitulos.getTitulo().toUpperCase().equals(tituloLibro)){
                                    System.out.println("El precio de: " + listadoTitulos.getTitulo() + " es " + listadoTitulos.getPrecio());
                                    contador++;
                                }
                            }
                        }
                        for(Libros listadoTitulosComics: listadoComics){
                            if(listadoTitulosComics != null) {
                                if(listadoTitulosComics.getTitulo().toUpperCase().equals(tituloLibro)){
                                    System.out.println("El precio de: " + listadoTitulosComics.getTitulo() + " es " + listadoTitulosComics.getPrecio());
                                    contador++;
                                }
                            }
                        }
                        if(contador==0){
                            System.out.println("No se ha encontrado ningun libro con ese titulo");
                        }
                        break;
                    case 4:
                        //Hacer aca...
                    case 5:
                        respuesta = datos.Inicializar();
                        break;
                }
                break;
            case 3:
                break;
            case 4:
                System.out.println("¿Seguro que desea salir? Escriba SI - NO");
                Scanner salida = new Scanner(System.in);
                System.out.print("Respuesta: ");
                String respuestaSalida = salida.nextLine().toUpperCase();

                if(respuestaSalida.equals("SI"))
                    System.exit(0);
                else{
                    respuesta = datos.Inicializar();
                }
                break;
            default:
                System.out.println("No ha elegido una opcion disponible");


        }
     }
    }
}
