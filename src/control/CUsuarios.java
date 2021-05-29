package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cargos;
import modelo.Usuarios;

public class CUsuarios extends Usuarios {

    ArrayList<Usuarios> lista = new ArrayList<>();
    ArrayList<Cargos> listaC = new ArrayList<>();

    CConexion con = new CConexion();

    public boolean login(String Usuario, String passwordUsuario) {
        try {
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "SELECT nomUsu, nomCargo FROM Usuarios INNER JOIN Cargos "
                    + "ON Usuarios.codCargo=Cargos.codCargo WHERE nomUsu='" + Usuario + "' AND claUsu='" + passwordUsuario + "'");
            ResultSet res = sql.executeQuery();
            if (res.next()) {
                this.setNomUsu(res.getString("nomUsu"));
                this.setNomCar(res.getString("nomCargo"));
                return true;
            }
            con.cerrar();
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
        return false;
    }

}
