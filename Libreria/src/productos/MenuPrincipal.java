package productos;

import java.util.Scanner;

public class MenuPrincipal {

    public MenuPrincipal() {
    }

    public int Inicializar() {
        int valor = 0;

        do {
            System.out.println("Seleccione la opción que desee realizar");
            System.out.println("1 - Listados totales de productos");
            System.out.println("2 - Búsquedas parciales");
            System.out.println("3 - Insertar nuevos elementos");
            System.out.println("4 - Salir del programa");


            Scanner scanner = new Scanner(System.in);
            System.out.print("Opcion: ");
            valor = scanner.nextInt();

        } while (valor < 1 || valor > 4);

        return valor;
    }
}
