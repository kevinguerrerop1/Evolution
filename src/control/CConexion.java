package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CConexion {
     //Atributos
    private String usuario = "root";
    private String password = "";
    //Protocolo------->
    private String url = "jdbc:mysql://127.0.0.1/gymevolution";
    //Atributo que soporte una cadena de conexión
    private Connection con = null;
    //Conectar

    public void conectar() {
        try {
            //Driver de conexión
            Class.forName("com.mysql.jdbc.Driver");
            //Establecer la conexion
            con = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar al Servidor" + ex);
        }

    }

    //Desconectar
    public void cerrar() {
        con = null;
    }

    //Ver Estado
    public Connection estado() {
        return con;

    }
    
}
