package paquete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Libros listadoLibros [] = new Libros[7];
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
                            if(todoComics == null) {
                                break;
                            }else {
                                System.out.println(todoComics.toString());
                            }
                        }
                        break;
                    case 3:
                        for(Revistas todoRevistas:listadoRevista){
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
                        System.out.println(" ");
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
                        System.out.println(" ");
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
                        System.out.println(" ");
                        break;
                    case 4:
                        Scanner scannerTitulo = new Scanner(System.in);
                        System.out.print("Escribe el título del libro que desea buscar : ");
                        String titulos = scannerTitulo.nextLine().toUpperCase();
                        contador = 0;
                        for(Libros listadoTitulos: listadoLibros){
                            if(listadoTitulos != null) {
                                if(listadoTitulos.getTitulo().toUpperCase().equals(titulos)){
                                    System.out.println(listadoTitulos.toString());
                                    contador++;
                                }
                            }
                        }
                        for(Libros listadoTitulosComics: listadoComics){
                            if(listadoTitulosComics != null) {
                                if(listadoTitulosComics.getTitulo().toUpperCase().equals(titulos)){
                                    System.out.println(listadoTitulosComics.toString());
                                    contador++;
                                }
                            }
                        }
                        if(contador==0){
                            System.out.println("No se ha encontrado ningun libro con ese titulo");
                        }
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

                switch (agregar){
                    case 1:
                        int contadorArray = 0;
                        // el for each cuenta los elementos no nulos del array, despues se lo compara con el length
                        // del array para comprobar que no este lleno y se pueden agregar mas elementos
                        for(Libros listadol: listadoLibros){
                            if (listadol != null){
                                contadorArray++;
                            }
                        }
                        if(contadorArray < listadoLibros.length){
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

                          listadoLibros[contadorArray] = new Libros(nuevoTitulo,nuevoAutor,nuevoPrecio,nuevoGenero,nuevoEditorial,nuevoAño);
                            System.out.println("Elemento agregado correctamente");
                        } else{
                            System.out.println("El array está lleno. No se pueden agregar más elementos");
                        }
                        System.out.println(" ");
                        break;
                    case 2:
                         contadorArray = 0;
                        for(Revistas listadoR: listadoRevista){
                            if (listadoR != null){
                                contadorArray++;
                            }
                        }
                        if(contadorArray < listadoRevista.length){
                            System.out.print(" Ingresa el nombre de la revista: ");
                            String nuevoNombre = nuevoProducto.nextLine();
                            nuevoNombre = nuevoProducto.nextLine();
                            System.out.print(" Ingresa el precio de la revista: ");
                            float nuevoPrecioR = nuevoProducto.nextFloat();
                            System.out.print(" Ingresa la fecha de publicación(yyyy-mm-dd): ");
                            String nuevaFecha = nuevoProducto.nextLine();
                            nuevaFecha = nuevoProducto.nextLine();

                            listadoRevista[contadorArray] = new Revistas(nuevoNombre,nuevoPrecioR,nuevaFecha);
                            System.out.println("Elemento agregado correctamente");
                        } else{
                            System.out.println("El array está lleno. No se pueden agregar más elementos");
                        }
                        System.out.println(" ");
                        break;
                    case 3:
                        contadorArray = 0;
                        for(Comics listadoC: listadoComics){
                            if (listadoC != null){
                                contadorArray++;
                            }
                        }
                        if(contadorArray < listadoComics.length){
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
                            String nuevoColorista= nuevoProducto.nextLine();
                            System.out.print(" Ingresa el nombre del colorista: ");
                            nuevoColorista= nuevoProducto.nextLine();

                            listadoComics[contadorArray] = new Comics(nuevoTitulo,nuevoAutor,nuevoPrecio,nuevoGenero,nuevoEditorial,nuevoAño,nuevoDibujante,nuevoColorista);
                            System.out.println("Elemento agregado correctamente");
                        } else{
                            System.out.println("El array está lleno. No se pueden agregar más elementos");
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

                if(respuestaSalida == 1)
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
