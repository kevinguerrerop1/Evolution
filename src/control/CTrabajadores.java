package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuarios;
import modelo.clientes;

public class CTrabajadores {

    ArrayList<Usuarios> lista = new ArrayList<>();

    CConexion con = new CConexion();

    public ArrayList MostrarTra(String f_termino) {
        try {
            lista.clear();
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "SELECT codUsu,nomUsu,Sueldo,nomCargo FROM usuarios INNER JOIN cargos ON usuarios.codcargo = cargos.codCargo WHERE codUsu LIKE '%" + f_termino + "%'");
            ResultSet res = sql.executeQuery();
            while (res.next()) {
                lista.add(new Usuarios(res.getInt("codUsu"), res.getString("nomUsu"), res.getString("Sueldo"), res.getString("nomCargo")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return lista;
    }

}
