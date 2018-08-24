/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Z_Compras;

import A_conexion.ConexionBD;
import Template.Login;
import Template.Principal_Norm;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
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
            ps.setString(1, uc.getDescripcion());
            ps.setString(2, uc.getIdProveedor());
            ps.setString(3, uc.getFecha());
            ps.setDouble(4, uc.getTotal());
            ps.setString(5, uc.getPdf());
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
            ps.setString(1, uc.getDescripcion());
            ps.setString(2, uc.getFecha());
            ps.setString(3, uc.getIdProveedor());
            ps.setDouble(4, uc.getTotal());
            ps.setString(5, uc.getPdf());
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
         System.out.println(sql);
        return rsu;
    }
    
    public static void totalGastos() {
        int filas = paneles.Z_Compras.pnlCompras.tabla.getRowCount();
        double totalE = 0.0;
        for (int i = 0; i < filas; i++) {
            totalE = totalE + Double.parseDouble(paneles.Z_Compras.pnlCompras.tabla.getValueAt(i, 3).toString());
        }
        paneles.Z_Compras.pnlCompras.lblTotal1.setText(String.valueOf(totalE));
    }

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) pnlCompras.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Sentencias.LISTAR;
            pnlCompras.txtDescripcion.setText("");
        } else {
            sql = "SELECT * FROM compras WHERE ("
                    + "idcompra LIKE'" + busca 
                    + "%' OR descripcion LIKE'" + busca 
                    + "%' OR fechacompra LIKE'" + busca 
                    + "%' OR idproveedor LIKE'" + busca 
                    + "%' OR total LIKE'" + busca 
                    + "%' OR pdf LIKE'" + busca +"%')"
                    + "ORDER BY idcompra";
            pnlCompras.txtDescripcion.setText("");
        }
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idcompra");
                datos[1] = rs.getString("idproveedor");
                datos[2] = rs.getString("fechacompra");
                datos[3] = rs.getString("total");
                modelo.addRow(datos);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void extraerDescripcion(String id) {
        String c = null;
        String SQL = "SELECT * FROM compras WHERE idcompra = "+id;

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(2);
            }     
            paneles.Z_Compras.pnlCompras.txtDescripcion.setText(c);
            

        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Consultar_Proveedores(JComboBox Proveedor){
        String c = null;
        String SQL = "SELECT nombre from proveedores ORDER BY nombre ASC;";
        
        try {  
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            Proveedor.addItem("Seleccione un Proveedor");
            while(rs.next()){
                Proveedor.addItem(rs.getString("nombre"));
            }
          
        }
        catch (SQLException ex){
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
