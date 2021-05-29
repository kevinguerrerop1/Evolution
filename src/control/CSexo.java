package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Sexo;

public class CSexo {

    ArrayList<Sexo> lista = new ArrayList<>();

    CConexion con = new CConexion();

    public ArrayList MostraSexo(String f_termino) {
        try {
            lista.clear();
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "SELECT * FROM sexo WHERE valSexo LIKE '%" + f_termino + "%'");
            ResultSet res = sql.executeQuery();
            while (res.next()) {
                lista.add(new Sexo(res.getInt("codSexo"), res.getString("valSexo")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return lista;
    }

}
