package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fantasma-Enginner
 */
public class ConexionMYSQL {

    private final String bd = "farmacia";
    private final String login = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost/" + bd;
    private Connection conn = null;

    public ConexionMYSQL() {
        try {
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexión
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("OK base de datos " + bd + " listo");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    public void Desconectar() {
        conn = null;
    }
}
