package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.clientes;

public class CClientes {

    ArrayList<clientes> lista = new ArrayList<>();

    CConexion con = new CConexion();

    public ArrayList MostrarClientes(String f_termino) {
        try {
            lista.clear();
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "SELECT n_socio,nombre,apellido,n_con,rut,valSexo,f_inicio,f_termino,nomEstado,nomPlan,valorPlan FROM gym INNER JOIN sexo ON gym.codSexo = sexo.codSexo INNER JOIN estado ON gym.codEstado = estado.codEstado INNER JOIN planes ON gym.codPlan = planes.codPlan  WHERE rut LIKE '%" + f_termino + "%'");
            ResultSet res = sql.executeQuery();
            while (res.next()) {
                lista.add(new clientes(res.getInt("n_socio"), res.getString("nombre"), res.getString("apellido"), res.getString("n_con"), res.getString("rut"),
                        res.getString("f_inicio"), res.getString("f_termino"), res.getString("Valorplan"), res.getString("nomplan"), res.getString("valSexo"), res.getString("nomEstado")));

            }
        } catch (SQLException ex) {
            Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return lista;
    }

    public boolean modificarCliente(int codigo, String fecter) { //resive nombre del pais
        try {
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "UPDATE gym SET f_termino = '" + fecter + "',codEstado='1' WHERE `n_socio` = '" + codigo + "'");
            sql.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return false;
    }

    public boolean insertarCliente(String nombre, String apellido, String contacto, String rut, int sexo, String fecing, String fecter, int estado, int plan, String valor) { //resive nombre del pais
        try {
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "INSERT INTO gym (nombre, apellido, n_con, rut, codSexo, f_inicio, f_termino, codEstado,codPlan, valorPlan) VALUES ('" + nombre + "','" + apellido + "','" + contacto + "','" + rut + "','" + sexo + "','" + fecing + "','" + fecter + "','" + estado + "','" + plan + "','" + valor + "')");
            sql.execute();                         //('kevin','guerrero')  
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return false;
    }

    public void updateestado(String id) {
        try {
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "UPDATE gym SET codEstado='3' WHERE n_socio='" + id + "'");
            sql.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
    }

}
