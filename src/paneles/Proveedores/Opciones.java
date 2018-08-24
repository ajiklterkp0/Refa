/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Proveedores;

import A_conexion.ConexionBD;
import Template.Login;
import Template.Principal_Norm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jona
 */

public class Opciones {

    static ConexionBD cc = new ConexionBD();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;

    public static int registrar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getRfc());
            ps.setString(2, uc.getNombre());
            ps.setString(3, uc.getDireccion());
            ps.setString(4, uc.getNumero());
            ps.setString(5, uc.getEmail());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.ACTUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getRfc());
            ps.setString(2, uc.getNombre());
            ps.setString(3, uc.getDireccion());
            ps.setString(4, uc.getNumero());
            ps.setString(5, uc.getEmail());
            ps.setInt(6, uc.getId());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminar(int id) {
        int rsu=0;
        String sql = Sentencias.ELIMINAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rsu = ps.executeUpdate();
            System.out.println(rsu);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return rsu;
    }

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) pnlProveedor.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Sentencias.LISTAR;
        } else {
            sql = "SELECT * FROM proveedores WHERE ("
                    + "idproveedor LIKE'" + busca 
                    + "%' OR rfc LIKE'" + busca 
                    + "%' OR nombre LIKE'" + busca 
                    + "%' OR direccion LIKE'" + busca 
                    + "%' OR telefono LIKE'" + busca 
                    + "%' OR email LIKE'" + busca
                    + "%')"
                    + " ORDER BY idproveedor";
        }
        String datos[] = new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idproveedor");
                datos[1] = rs.getString("rfc");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("direccion");
                datos[4] = rs.getString("telefono");
                datos[5] = rs.getString("email");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public static boolean verificaProveedor(String proveedor) {
        boolean existe = false;
        String prove = "";
        try {
            String sql = "SELECT * FROM proveedores WHERE  rfc = '" + proveedor + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                prove = rs.getString(2);
            }

            if (prove.equals(proveedor)) {
                existe = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

}
