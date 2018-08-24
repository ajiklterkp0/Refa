/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Productos;

import A_conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import paneles.Ventas.Productos;

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
            ps.setString(1, uc.getCodigo());
            ps.setString(2, uc.getNombre());
            ps.setString(3, uc.getDescripcion());
            ps.setString(4, uc.getIdCategoria());
            ps.setString(5, uc.getIdProveedor());
            ps.setDouble(6, uc.getPrecio_Compra());
            ps.setDouble(7, uc.getPrecio_Venta());
            ps.setInt(8, uc.getStock_Min());
            ps.setInt(9, uc.getStock_Max());
            ps.setString(10, uc.getStock_Actual());
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
            ps.setString(1, uc.getCodigo());
            ps.setString(2, uc.getNombre());
            ps.setString(3, uc.getDescripcion());
            ps.setString(4, uc.getIdCategoria());
            ps.setString(5, uc.getIdProveedor());
            ps.setDouble(6, uc.getPrecio_Compra());
            ps.setDouble(7, uc.getPrecio_Venta());
            ps.setInt(8, uc.getStock_Min());
            ps.setInt(9, uc.getStock_Max());
            ps.setString(10, uc.getStock_Actual());
            ps.setInt(11, uc.getId());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }
    
    public static int actualizarStock(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.ACTUALIZAR_STOCK;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getStock_Actual());
            ps.setInt(2, uc.getId());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }
    
    public static int eliminar(int id) {
        int rsu = 0;
        String sql = Sentencias.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            {
                ps.setInt(1, id);
                rsu = ps.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }
    
    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) pnlProducto.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Sentencias.LISTAR;
        } else {
            sql = "SELECT * FROM productos WHERE (idproducto LIKE'" + busca + "%' OR "
                    + "codigo LIKE'" + busca 
                    + "%' OR nombre LIKE'" + busca 
                    + "%' OR descripcion LIKE'" + busca 
                    + "%' OR idcategoria LIKE'" + busca 
                    + "%' OR idproveedor LIKE'" + busca 
                    + "%' OR precio_compra LIKE'" + busca 
                    + "%' OR precio_venta LIKE'" + busca 
                    + "%' OR stock_min LIKE'" + busca 
                    + "%' OR stock_max LIKE'" + busca 
                    + "%' OR stock_actual LIKE'" + busca + "%' OR "
                    + "idproducto LIKE'" + busca + "%') "
                    + "ORDER BY nombre;";
        }
        String datos[] = new String[11];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idproducto");
                datos[1] = rs.getString("codigo");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("descripcion");
                datos[4] = rs.getString("idcategoria");
                datos[5] = rs.getString("idproveedor");
                datos[6] = rs.getString("precio_compra");
                datos[7] = rs.getString("precio_venta");
                datos[8] = rs.getString("stock_min");
                datos[9] = rs.getString("stock_max");
                datos[10] = rs.getString("stock_actual");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void listar_pnlBuscar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Productos.tabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Sentencias.LISTAR;
        } else {
            sql = "SELECT * FROM productos WHERE (idproducto LIKE'" + busca + "%' OR "
                    + "codigo LIKE'" + busca 
                    + "%' OR nombre LIKE'" + busca 
                    + "%' OR descripcion LIKE'" + busca 
                    + "%' OR idcategoria LIKE'" + busca 
                    + "%' OR idproveedor LIKE'" + busca 
                    + "%' OR precio_compra LIKE'" + busca 
                    + "%' OR precio_venta LIKE'" + busca 
                    + "%' OR stock_min LIKE'" + busca 
                    + "%' OR stock_max LIKE'" + busca 
                    + "%' OR stock_actual LIKE'" + busca + "%' OR "
                    + "idproducto LIKE'" + busca + "%') "
                    + "ORDER BY nombre;";
        }
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("codigo");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("precio_venta");
                datos[3] = rs.getString("stock_actual");
                modelo.addRow(datos);
            }
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
            Logger.getLogger(paneles.Z_Compras.Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public static void Consultar_Categorias(JComboBox Categoria){
        String c = null;
        String SQL = "SELECT nombre from categorias ORDER BY nombre ASC;";
        
        try {  
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            Categoria.addItem("Seleccione una Categoria");
            while(rs.next()){
                Categoria.addItem(rs.getString("nombre"));
            }
          
        }
        catch (SQLException ex){
            Logger.getLogger(paneles.Z_Compras.Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static int extraerID() {
        int c = 0;
        String SQL = "SELECT MAX(idproducto) FROM productos";

        try {
             Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getInt(1);
            }
                      
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
