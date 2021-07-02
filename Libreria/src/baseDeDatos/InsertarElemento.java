package baseDeDatos;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import productos.Libro;

import java.sql.*;


public class InsertarElemento {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";
    private int id_libro = 0;
    private int id_comic = 0;
    private int id_revista = 0;

    public static void insertarDatos() {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            // STEP 3: Execute a query
            stmt = conn.createStatement();
            String sql;

            sql = "INSERT INTO LIBRO " + "VALUES (1, 'It', 'Stephen King', 1200,'Terror','Editorial Horror',1971)";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO LIBRO " + "VALUES (2, '1984', 'George Orwell', 1100,'Novela','Libros Clasicos',1949)";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO LIBRO " + "VALUES (3, 'El señor de los Anillos', 'J.R.R Tolkien', 1400,'Fantasia','De Bolsillo',1966)";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO LIBRO " + "VALUES(4, 'Juego de Tronos', 'George R.R Martin', 1400,'Fantasia','Vintage',1993)";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO LIBRO " + "VALUES(5, 'Mr Mercedes', 'Stephen King', 1500,'Terror','De Bolsillo',2011)";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO LIBRO " + "VALUES(6, 'El Tunel', 'Ernesto Sabato', 1600,'Novela','De Bolsillo',1948)";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO COMIC " + "VALUES(1,'Batman: The Dark Knight Returns', 'Frank Miller', 1000, 'Comics', 'DC comics', 1986, 'Frank Miller', 'Varley')";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO COMIC " + "VALUES(2, 'Watchmen', 'Alan Moore', 1400, 'Comics', 'DC comics', 1987, 'Dave Gibbons', 'Higgins')";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO COMIC " + "VALUES(3,'V de Vendetta', 'Alan Moore', 1200, 'Comics', 'DC comics', 1982, 'Whitaker', 'Doods')";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO REVISTA " + "VALUES(1,'Muy Interesante n830', 800, '2021-01-29')";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO REVISTA " + "VALUES(2,'Revista Caras Junio 2021', 600, '2021-06-03')";

            stmt.executeUpdate(sql);
            sql = "INSERT INTO REVISTA " + "VALUES(3,'Revista Rumbos n354', 400, '2021-02-16')";

            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
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
        System.out.println("Goodbye!");
    }

    //Busca el ultimo id de las tablas para asi sumarle 1 y poder agregar nuevos elementos
    private int busquedaDeId(int tabla) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rs;
            // 1 Libros - 2 Comics - 3 Revistas
            switch (tabla) {
                case 1:
                    String sql = "SELECT id_libro FROM Libro where id_libro = (SELECT MAX(id_libro) from Libro);";
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        int id = rs.getInt("id_libro");
                        id_libro = id + 1;
                        return id_libro;
                    }
                    rs.close();
                    break;
                case 2:
                    sql = "SELECT id_comic FROM Comic where id_comic = (SELECT MAX(id_comic) from Comic);";
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        int id = rs.getInt("id_comic");
                        id_comic = id + 1;
                        return id_comic;
                    }
                    rs.close();
                    break;
                case 3:
                    sql = "SELECT id_revista FROM Revista where id_revista = (SELECT MAX(id_revista) from Revista);";
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        int id = rs.getInt("id_revista");
                        id_revista = id + 1;
                        return id_revista;
                    }
                    rs.close();
                    break;
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
        return 0;
    }

    public void insertarNuevoLibro(String nuevoTitulo, String nuevoAutor, float nuevoPrecio, String nuevoGenero, String nuevoEditorial, int nuevoAño) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "INSERT INTO LIBRO " + "VALUES" + "(" + busquedaDeId(1) + ",'" + nuevoTitulo + "','" + nuevoAutor + "'," + nuevoPrecio + ",'" + nuevoGenero + "','" + nuevoEditorial + "'," + nuevoAño + ");";
            stmt.executeUpdate(sql);
            System.out.println("El producto se agregó correctamente");
            stmt.close();
            conn.close();
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

    public void insertarNuevoComic(String nuevoTitulo, String nuevoAutor, float nuevoPrecio, String nuevoGenero, String nuevoEditorial, int nuevoAño, String nuevoDibujante, String nuevoColorista) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "INSERT INTO COMIC " + "VALUES" + "(" + busquedaDeId(2) + ",'" + nuevoTitulo + "','" + nuevoAutor + "'," + nuevoPrecio + ",'" + nuevoGenero + "','" + nuevoEditorial + "'," + nuevoAño + ",'" + nuevoDibujante + "','" + nuevoColorista + "');";
            stmt.executeUpdate(sql);
            System.out.println("El producto se agregó correctamente");
            stmt.close();
            conn.close();
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

    public void insertarNuevaRevista(String nuevoNombre, float nuevoPrecioR, String nuevaFecha) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "INSERT INTO Revista " + "VALUES" + "(" + busquedaDeId(3) + ",'" + nuevoNombre+"'," + nuevoPrecioR + ",'" + nuevaFecha + "');";
            stmt.executeUpdate(sql);
            System.out.println("El producto se agregó correctamente");
            stmt.close();
            conn.close();
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


}
