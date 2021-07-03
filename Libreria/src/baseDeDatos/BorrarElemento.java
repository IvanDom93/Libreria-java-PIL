package baseDeDatos;


import java.sql.*;

public class BorrarElemento {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";
    static final String USER = "sa";
    static final String PASS = "";

    public void eliminarElemento(int ID, int tabla) {
        Connection conn = null;
        Statement stmt = null;


        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql;
            ResultSet rs;

            switch (tabla) {
                case 1:
                    sql = "DELETE FROM Libro WHERE id_libro = "+ID;
                    stmt.executeUpdate(sql);
                    break;
                case 2:
                    sql = "DELETE FROM Revista WHERE id_revista = "+ID;
                    stmt.executeUpdate(sql);
                    break;
                case 3:
                    sql = "DELETE FROM Comic WHERE id_comic = "+ID;
                    stmt.executeUpdate(sql);
                    break;
            }
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
