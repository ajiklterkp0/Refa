/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Z_Usuarios;

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
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import paneles.Productos.pnlProducto;
import paneles.Proveedores.pnlProveedor;
import paneles.Z_Usuarios.Sentencias;
import paneles.Z_Usuarios.pnlUsuario;

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
            ps.setString(1, uc.getNombre());
            ps.setString(2, uc.getApellido_P());
            ps.setString(3, uc.getApellido_M());
            ps.setString(4, uc.getDireccion());
            ps.setString(5, uc.getNumero());
            ps.setString(6, uc.getUsuario());
            ps.setString(7, uc.getPassword());
            ps.setString(8, uc.getTipo());
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
            ps.setString(1, uc.getNombre());
            ps.setString(2, uc.getApellido_P());
            ps.setString(3, uc.getApellido_M());
            ps.setString(4, uc.getDireccion());
            ps.setString(5, uc.getNumero());
            ps.setString(6, uc.getUsuario());
            ps.setString(7, uc.getPassword());
            ps.setString(8, uc.getTipo());
            ps.setInt(9, uc.getId());
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
        DefaultTableModel modelo = (DefaultTableModel) pnlUsuario.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Sentencias.LISTAR;
        } else {
            sql = "SELECT * FROM usuarios WHERE ("
                    + "idusuario LIKE'" + busca 
                    + "%' OR nombre LIKE'" + busca 
                    + "%' OR apellido_p LIKE'" + busca 
                    + "%' OR apellido_m LIKE'" + busca 
                    + "%' OR direccion LIKE'" + busca 
                    + "%' OR numero LIKE'" + busca
                    + "%' OR usuario LIKE'" + busca 
                    + "%' OR tipousuario LIKE'" + busca 
                    + "%') AND idusuario!=1 "
                    + "ORDER BY idusuario";
        }
        String datos[] = new String[9];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idusuario");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellido_p");
                datos[3] = rs.getString("apellido_m");
                datos[4] = rs.getString("direccion");
                datos[5] = rs.getString("numero");
                datos[6] = rs.getString("usuario");
                datos[7] = rs.getString("password");
                datos[8] = rs.getString("tipousuario");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public static boolean verificaUsuario(String usuario) {
        boolean existe = false;
        String user = "";
        try {
            String sql = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                user = rs.getString(7);
            }

            if (user.equals(usuario)) {
                existe = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

    public static void verifica(String usuario, String pas, JFrame login) {
        String nombre = "", apellido_p = "", apellido_m = "", direccion = "", user = "", pass = "", tipo_us = "", numero = "";
       
        try {
            String sql = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                nombre = rs.getString(2);
                apellido_p = rs.getString(3);
                apellido_m = rs.getString(4);
                direccion = rs.getString(5);
                numero = rs.getString(6);
                user = rs.getString(7);
                pass = rs.getString(8);
                tipo_us = rs.getString(9);
            }

            if (user.equals(usuario) && pass.equals(pas)) {
                if (tipo_us.equals("ADMINISTRADOR")) {
                    login.dispose();
                    new Template.Principal_Norm().setVisible(true);
                    Principal_Norm.info.setText("Administrador");
                }

                if (tipo_us.equals("NORMAL")) {
                    login.dispose();
                    new Template.Principal_Norm().setVisible(true);
                }
            } else {
                Login.info.setText("¡Usuario y/o contraseña incorrectos!");
                Login.txtUsuario.setText("");
                Login.txtPassword.setText("");
                Login.txtUsuario.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
