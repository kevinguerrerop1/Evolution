package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Estado;
import modelo.Plan;

public class CPlan {
    
     ArrayList<Plan> lista = new ArrayList<>();

    CConexion con = new CConexion();

    public ArrayList MostraPlan(String f_termino) {
        try {
            lista.clear();
            con.conectar();
            PreparedStatement sql = con.estado().prepareStatement(""
                    + "SELECT * FROM planes WHERE nomPlan LIKE '%" + f_termino + "%'");
            ResultSet res = sql.executeQuery();
            while (res.next()) {
                lista.add(new Plan(res.getInt("codPlan"), res.getString("nomPlan")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrar();
        }
        return lista;
    }
    
}
