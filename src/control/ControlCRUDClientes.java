package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.clientes;

public class ControlCRUDClientes {

    ArrayList<clientes> lista = new ArrayList<>();

    controlConexion con = new controlConexion();

    public ArrayList MostrarClientes(String f_termino) {
        try {
            lista.clear();
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "SELECT * FROM gym WHERE f_termino LIKE '%" + f_termino + "%'");
            ResultSet res = sql.executeQuery();
            while (res.next()) {
                lista.add(new clientes(res.getInt("n_socio"), res.getString("nombre"), res.getString("apellido"), res.getString("n_con"), res.getString("rut"), res.getString("f_inicio"), res.getString("f_termino"), res.getString("plan"), res.getString("estado")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCRUDClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return lista;
    }

    public boolean EliminarCliente(String codigo) { //resive nombre del pais
        try {
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "DELETE FROM gym WHERE n_socio= '" + codigo + "'");
            sql.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControlCRUDClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return false;
    }

    public boolean modificarCliente(String codigo, String nombre, String apellido, String contacto, String rut, String fecing, String fecter, String plan, String estado) { //resive nombre del pais
        try {
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "UPDATE gym SET nombre= '" + nombre + "',apellido='" + apellido + "',n_con='" + contacto + "',rut='" + rut + "',f_inicio='" + fecing + "',f_termino='" + fecter + "',plan='" + plan + "',estado='" + estado + "'WHERE n_socio='" + codigo + "'");
            sql.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControlCRUDClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return false;
    }

    public boolean insertarCliente(String nombre, String apellido, String contacto, String rut, String fecing, String fecter, String plan, String estado) { //resive nombre del pais
        try {
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "INSERT INTO gym(nombre, apellido,n_con,rut,f_inicio,f_termino,plan,estado) VALUES('" + nombre + "','" + apellido + "','" + contacto + "','" + rut + "','" + fecing + "','" + fecter + "','" + plan + "','" + estado + "')");
            sql.execute();                         //('kevin','guerrero')  
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControlCRUDClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return false;
    }
}
