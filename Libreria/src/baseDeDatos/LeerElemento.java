package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeerElemento {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public void listarLibros() {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection
            //System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // STEP 3: Execute a query
            //System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            String sql = "SELECT id_libro, titulo, autor, precio, genero, editorial, anioPublicacion FROM Libro";
            ResultSet rs = stmt.executeQuery(sql);

            // STEP 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id_libro");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                float precio = rs.getFloat("precio");
                String genero = rs.getString("genero");
                String editorial = rs.getString("editorial");
                int anioPublicacion = rs.getInt("anioPublicacion");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Titulo: " + titulo);
                System.out.print(", Autor: " + autor);
                System.out.print(", Precio: " + precio);
                System.out.print(", Genero: " + genero);
                System.out.print(", Editorial: " + editorial);
                System.out.println(", Año de publicacion: " + anioPublicacion);
            }
            // STEP 5: Clean-up environment
            rs.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
        //System.out.println("Goodbye!");
    }

    public void listarComics() {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection
            //System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // STEP 3: Execute a query
            //System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            String sql = "SELECT id_comic, titulo, autor, precio, genero, editorial, anioPublicacion,dibujante,colorista FROM Comic";
            ResultSet rs = stmt.executeQuery(sql);

            // STEP 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id_comic");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                float precio = rs.getFloat("precio");
                String genero = rs.getString("genero");
                String editorial = rs.getString("editorial");
                int anioPublicacion = rs.getInt("anioPublicacion");
                String dibujante = rs.getString("dibujante");
                String colorista = rs.getString("colorista");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Titulo: " + titulo);
                System.out.print(", Autor: " + autor);
                System.out.print(", Precio: " + precio);
                System.out.print(", Genero: " + genero);
                System.out.print(", Editorial: " + editorial);
                System.out.print(", Año de publicacion: " + anioPublicacion);
                System.out.print(", Dibujante: " + dibujante);
                System.out.println(", Colorista: " + colorista);
            }
            // STEP 5: Clean-up environment
            rs.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
        //System.out.println("Goodbye!");
    }

    public void listarRevistas() {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection
            //System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // STEP 3: Execute a query
            //System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            String sql = "SELECT id_revista, titulo, precio, fechaPublicacion FROM Revista";
            ResultSet rs = stmt.executeQuery(sql);

            // STEP 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id_revista");
                String titulo = rs.getString("titulo");
                float precio = rs.getFloat("precio");
                String fecha = rs.getString("fechaPublicacion");


                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Titulo: " + titulo);
                System.out.print(", Precio: " + precio);
                System.out.println(", Fecha de Publicacion: " + fecha);

            }
            // STEP 5: Clean-up environment
            rs.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
        //System.out.println("Goodbye!");
    }

    public void busquedaPorAutores(String buscarautor) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT id_libro, titulo, autor, precio, genero, editorial, anioPublicacion FROM Libro WHERE UPPER(autor) = " + "'" + buscarautor + "';";
            ResultSet rs = stmt.executeQuery(sql);

            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id_libro");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                float precio = rs.getFloat("precio");
                String genero = rs.getString("genero");
                String editorial = rs.getString("editorial");
                int anioPublicacion = rs.getInt("anioPublicacion");

                System.out.print("ID: " + id);
                System.out.print(", Titulo: " + titulo);
                System.out.print(", Autor: " + autor);
                System.out.print(", Precio: " + precio);
                System.out.print(", Genero: " + genero);
                System.out.print(", Editorial: " + editorial);
                System.out.println(", Año de publicacion: " + anioPublicacion);
                contador++;
            }

            sql = "SELECT id_comic, titulo, autor, precio, genero, editorial, anioPublicacion,dibujante,colorista FROM Comic WHERE UPPER(autor) = " + "'" + buscarautor + "';";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {

                int id = rs.getInt("id_comic");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                float precio = rs.getFloat("precio");
                String genero = rs.getString("genero");
                String editorial = rs.getString("editorial");
                int anioPublicacion = rs.getInt("anioPublicacion");
                String dibujante = rs.getString("dibujante");
                String colorista = rs.getString("colorista");

                System.out.print("ID: " + id);
                System.out.print(", Titulo: " + titulo);
                System.out.print(", Autor: " + autor);
                System.out.print(", Precio: " + precio);
                System.out.print(", Genero: " + genero);
                System.out.print(", Editorial: " + editorial);
                System.out.print(", Año de publicacion: " + anioPublicacion);
                System.out.print(", Dibujante: " + dibujante);
                System.out.println(", Colorista: " + colorista);
                contador++;
            }

            if (contador == 0) {
                System.out.println("No existen libros de ese autor");
            }

            rs.close();
        } catch (SQLException se) {

            se.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public void busquedaPorGeneros(String buscargenero) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT id_libro, titulo, autor, precio, genero, editorial, anioPublicacion FROM Libro WHERE UPPER(genero) = " + "'" + buscargenero + "';";
            ResultSet rs = stmt.executeQuery(sql);

            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id_libro");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                float precio = rs.getFloat("precio");
                String genero = rs.getString("genero");
                String editorial = rs.getString("editorial");
                int anioPublicacion = rs.getInt("anioPublicacion");

                System.out.print("ID: " + id);
                System.out.print(", Titulo: " + titulo);
                System.out.print(", Autor: " + autor);
                System.out.print(", Precio: " + precio);
                System.out.print(", Genero: " + genero);
                System.out.print(", Editorial: " + editorial);
                System.out.println(", Año de publicacion: " + anioPublicacion);
                contador++;
            }

            sql = "SELECT id_comic, titulo, autor, precio, genero, editorial, anioPublicacion,dibujante,colorista FROM Comic WHERE UPPER(genero) = " + "'" + buscargenero + "';";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {

                int id = rs.getInt("id_comic");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                float precio = rs.getFloat("precio");
                String genero = rs.getString("genero");
                String editorial = rs.getString("editorial");
                int anioPublicacion = rs.getInt("anioPublicacion");
                String dibujante = rs.getString("dibujante");
                String colorista = rs.getString("colorista");

                System.out.print("ID: " + id);
                System.out.print(", Titulo: " + titulo);
                System.out.print(", Autor: " + autor);
                System.out.print(", Precio: " + precio);
                System.out.print(", Genero: " + genero);
                System.out.print(", Editorial: " + editorial);
                System.out.print(", Año de publicacion: " + anioPublicacion);
                System.out.print(", Dibujante: " + dibujante);
                System.out.println(", Colorista: " + colorista);
                contador++;
            }

            if (contador == 0) {
                System.out.println("No existen libros de ese genero");
            }

            rs.close();
        } catch (SQLException se) {

            se.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public void busquedaDePrecio(String tituloproducto) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT precio FROM Libro WHERE UPPER(titulo) = " + "'" + tituloproducto + "';";
            ResultSet rs = stmt.executeQuery(sql);
            int contador = 0;
            while (rs.next()) {
                float precio = rs.getFloat("precio");
                System.out.println("El precio de " + tituloproducto + " es: " + precio);
                contador++;
            }

            sql = "SELECT precio FROM Comic WHERE UPPER(titulo) = " + "'" + tituloproducto + "';";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                float precio = rs.getFloat("precio");
                System.out.println("El precio de: " + tituloproducto + " es de " + precio);
                contador++;
            }

            if (contador == 0) {
                System.out.println("No se encontró un producto con ese titulo");
            }

            rs.close();
        } catch (SQLException se) {

            se.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public void busquedaPorTitulo(String buscartitulo) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT id_libro, titulo, autor, precio, genero, editorial, anioPublicacion FROM Libro WHERE UPPER(titulo) = " + "'" + buscartitulo + "';";
            ResultSet rs = stmt.executeQuery(sql);

            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id_libro");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                float precio = rs.getFloat("precio");
                String genero = rs.getString("genero");
                String editorial = rs.getString("editorial");
                int anioPublicacion = rs.getInt("anioPublicacion");

                System.out.print("ID: " + id);
                System.out.print(", Titulo: " + titulo);
                System.out.print(", Autor: " + autor);
                System.out.print(", Precio: " + precio);
                System.out.print(", Genero: " + genero);
                System.out.print(", Editorial: " + editorial);
                System.out.println(", Año de publicacion: " + anioPublicacion);
                contador++;
            }

            sql = "SELECT id_comic, titulo, autor, precio, genero, editorial, anioPublicacion,dibujante,colorista FROM Comic WHERE UPPER(titulo) = " + "'" + buscartitulo + "';";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {

                int id = rs.getInt("id_comic");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                float precio = rs.getFloat("precio");
                String genero = rs.getString("genero");
                String editorial = rs.getString("editorial");
                int anioPublicacion = rs.getInt("anioPublicacion");
                String dibujante = rs.getString("dibujante");
                String colorista = rs.getString("colorista");

                System.out.print("ID: " + id);
                System.out.print(", Titulo: " + titulo);
                System.out.print(", Autor: " + autor);
                System.out.print(", Precio: " + precio);
                System.out.print(", Genero: " + genero);
                System.out.print(", Editorial: " + editorial);
                System.out.print(", Año de publicacion: " + anioPublicacion);
                System.out.print(", Dibujante: " + dibujante);
                System.out.println(", Colorista: " + colorista);
                contador++;
            }

            if (contador == 0) {
                System.out.println("No existen productos con ese titulo");
            }

            rs.close();
        } catch (SQLException se) {

            se.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }


    }


    public int busquedaPorID(int buscarID, int tabla) {
        Connection conn = null;
        Statement stmt = null;
        int contador = 0;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql;
            ResultSet rs;

            switch (tabla) {
                case 1:
                     sql = "SELECT id_libro, titulo, autor, precio, genero, editorial, anioPublicacion FROM Libro WHERE id_libro = " + buscarID;
                     rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        int id = rs.getInt("id_libro");
                        String titulo = rs.getString("titulo");
                        String autor = rs.getString("autor");
                        float precio = rs.getFloat("precio");
                        String genero = rs.getString("genero");
                        String editorial = rs.getString("editorial");
                        int anioPublicacion = rs.getInt("anioPublicacion");

                        System.out.print("ID: " + id);
                        System.out.print(", Titulo: " + titulo);
                        System.out.print(", Autor: " + autor);
                        System.out.print(", Precio: " + precio);
                        System.out.print(", Genero: " + genero);
                        System.out.print(", Editorial: " + editorial);
                        System.out.println(", Año de publicacion: " + anioPublicacion);
                        contador++;
                    }
                    rs.close();
                    return contador;

                case 2:
                    sql = "SELECT id_comic, titulo, autor, precio, genero, editorial, anioPublicacion,dibujante,colorista FROM Comic WHERE id_comic = " + buscarID;
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        int id = rs.getInt("id_comic");
                        String titulo = rs.getString("titulo");
                        String autor = rs.getString("autor");
                        float precio = rs.getFloat("precio");
                        String genero = rs.getString("genero");
                        String editorial = rs.getString("editorial");
                        int anioPublicacion = rs.getInt("anioPublicacion");
                        String dibujante = rs.getString("dibujante");
                        String colorista = rs.getString("colorista");

                        System.out.print("ID: " + id);
                        System.out.print(", Titulo: " + titulo);
                        System.out.print(", Autor: " + autor);
                        System.out.print(", Precio: " + precio);
                        System.out.print(", Genero: " + genero);
                        System.out.print(", Editorial: " + editorial);
                        System.out.print(", Año de publicacion: " + anioPublicacion);
                        System.out.print(", Dibujante: " + dibujante);
                        System.out.println(", Colorista: " + colorista);
                        contador++;
                    }
                    rs.close();
                    return contador;

                case 3:
                    sql = "SELECT id_revista, titulo, precio, fechaPublicacion FROM Revista WHERE id_revista = "+ buscarID;
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        int id = rs.getInt("id_revista");
                        String titulo = rs.getString("titulo");
                        float precio = rs.getFloat("precio");
                        String fecha = rs.getString("fechaPublicacion");

                        System.out.print("ID: " + id);
                        System.out.print(", Titulo: " + titulo);
                        System.out.print(", Precio: " + precio);
                        System.out.println(", Fecha de Publicacion: " + fecha);
                        contador++;
                    }

                    rs.close();
                    return contador;

            }

        } catch (SQLException se) {

            se.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return contador;

    }
}