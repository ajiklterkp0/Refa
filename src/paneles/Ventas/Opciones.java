/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Ventas;

import A_conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jona
 */
public class Opciones {

    static ConexionBD cc = new ConexionBD();
    public static Connection cn = cc.conexion();
    static PreparedStatement ps;

    public static int registrar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, uc.getId_venta());
            ps.setString(2, uc.getCodigo());
            ps.setDouble(3, uc.getCantidad());
            ps.setDouble(4, uc.getTotal());
            ps.setString(5, uc.getFecha());
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
            ps.setInt(1, uc.getCantidad());
            ps.setDouble(2, uc.getTotal());
            ps.setString(3, uc.getFecha());
            ps.setString(4, uc.getCodigo());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }


    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) paneles.Ventas.Productos.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Sentencias.LISTAR;
        } else {
            sql = "SELECT * FROM producto WHERE (idproducto LIKE'" + busca + "%' OR "
                    + "nombre LIKE'" + busca + "%' OR descripcion LIKE'" + busca + "%' OR "
                    + "tipoproducto LIKE'" + busca + "%' OR precio LIKE'" + busca + "%' OR "
                    + "idproducto LIKE'" + busca + "%') "
                    + "ORDER BY idproducto";
        }
        String datos[] = new String[6];
        try {           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idproducto");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("descripcion");
                datos[3] = rs.getString("tipoproducto");
                datos[4] = rs.getString("precio");
                datos[5] = rs.getString("stock");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listarVentas(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) paneles.Ventas.ListaVentas.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Sentencias.LISTAR1;
        } else {
            sql = "SELECT * FROM ventas, producto WHERE (idventa LIKE'" + busca + "%' OR "
                    + "nombre LIKE'" + busca + "%' OR descripcion LIKE'" + busca + "%' OR "
                    + "total LIKE'" + busca + "%' OR fecha LIKE'" + busca + "%') "
                    + "AND codigo = idproducto";
        }
        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idventa");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("descripcion");
                datos[3] = rs.getString("total");
                datos[4] = rs.getString("fecha");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listarEntradas(String fecha) {
        DefaultTableModel modelo = (DefaultTableModel) paneles.Ventas.ModalCorteDia.ListaEntradas.getModel();

        String sql = "SELECT * FROM ventas, producto WHERE fecha = '" + fecha + "'";
        String datos[] = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("nombre");
                datos[1] = (rs.getString("descripcion") + " - " + rs.getString("cantidad"));
                datos[2] = rs.getString("total");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        corteEntradas();
    }

    public static void corteEntradas() {
        int filas = paneles.Ventas.ModalCorteDia.ListaEntradas.getRowCount();
        double totalE = 0.0;
        for (int i = 0; i < filas; i++) {
            totalE = totalE + Double.parseDouble(paneles.Ventas.ModalCorteDia.ListaEntradas.getValueAt(i, 2).toString());
        }
        paneles.Ventas.ModalCorteDia.lblE.setText(String.valueOf(totalE));
    }

    public static void listarSalidas(String fecha) {
        DefaultTableModel modelo = (DefaultTableModel) paneles.Ventas.ModalCorteDia.ListaSalidas.getModel();

        String sql = "SELECT * FROM gastos WHERE fecha_gasto = '" + fecha + "'";
        String datos[] = new String[2];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("descripcion");
                datos[1] = rs.getString("gastado");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        corteSalidas();
    }

    public static void corteSalidas() {
        int filas = paneles.Ventas.ModalCorteDia.ListaSalidas.getRowCount();
        double totalE = 0.0;
        for (int i = 0; i < filas; i++) {
            totalE = totalE + Double.parseDouble(paneles.Ventas.ModalCorteDia.ListaSalidas.getValueAt(i, 1).toString());
        }
        paneles.Ventas.ModalCorteDia.lblS.setText(String.valueOf(totalE));
    }

    public static void corteTotal() {
        double entradas = Double.parseDouble(paneles.Ventas.ModalCorteDia.lblE.getText());
        double salidas = Double.parseDouble(paneles.Ventas.ModalCorteDia.lblS.getText());
        paneles.Ventas.ModalCorteDia.total.setText(String.valueOf(entradas - salidas));
    }

    public static void calcular() {
        String pre;
        String can;
        double precio;
        int cantidad;
        double imp = 0.0;

        for (int i = 0; i < paneles.Ventas.Ventas.tablaVentas.getRowCount(); i++) {
            pre = paneles.Ventas.Ventas.tablaVentas.getValueAt(i, 2).toString();
            can = paneles.Ventas.Ventas.tablaVentas.getValueAt(i, 3).toString();
            precio = Double.parseDouble(pre);
            cantidad = Integer.parseInt(can);
            imp = precio * cantidad;
            paneles.Ventas.Ventas.tablaVentas.setValueAt(imp, i, 4);
        }
        paneles.Ventas.Ventas.lblTotal.setText(""+imp);
    }
    
    public static void calcularcambio() {
        String cobrar = paneles.Ventas.Cobrar.total_cobrar.getText();//
        String efectiv = paneles.Ventas.Cobrar.lblefectivo.getText();
        double cantidadcobrar = 0.0;
        double cantidadefectivo = 0.0;
        double total = 0.0;
        
            
            if(efectiv.equals(""))
            {
                cantidadcobrar = Double.parseDouble(cobrar);
                efectiv= "0";
                cantidadefectivo= Double.parseDouble(efectiv);
                total = cantidadefectivo-cantidadcobrar;
                if(total != 0)
                {
                    paneles.Ventas.Cobrar.Cambio.setText("Falta");
                    double numero = total;
                    numero *= -1;
                    DecimalFormat df = new DecimalFormat("#.00");
                    paneles.Ventas.Cobrar.total_cambio.setText("" + df.format(numero));
                }
                else
                {
                    DecimalFormat df = new DecimalFormat("#.00");
                    paneles.Ventas.Cobrar.total_cambio.setText("" + df.format(total));
                }
            }
            else
            {
                cantidadcobrar = Double.parseDouble(cobrar);
                cantidadefectivo= Double.parseDouble(efectiv);
                total = cantidadefectivo-cantidadcobrar;
                System.out.println(total);
                
                if(total <= 0)
                {
                    paneles.Ventas.Cobrar.Cambio.setText("Falta");
                    double numero = total;
                    numero *= -1;
                    DecimalFormat df = new DecimalFormat("#.00");
                    paneles.Ventas.Cobrar.total_cambio.setText("" + df.format(numero));
                }
                else
                {
                    DecimalFormat df = new DecimalFormat("#.00");
                    paneles.Ventas.Cobrar.total_cambio.setText("" + df.format(total));
                }
                     
            }
    }

    public static void corteCaja() {
        int filas = paneles.Ventas.ListaVentas.tabla.getRowCount();
        double totalE = 0.0;
        for (int i = 0; i < filas; i++) {
            totalE = totalE + Double.parseDouble(paneles.Ventas.ListaVentas.tabla.getValueAt(i, 3).toString());
        }
        paneles.Ventas.ListaVentas.lblTotal1.setText(String.valueOf(totalE));
    }
    
    public static void numerosVenta() {
        int c = 0;
        String SQL = "SELECT MAX(idventa) FROM ventas";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getInt(1);
            }

            if (c == 0) {
                paneles.Ventas.Ventas.numVenta.setText("1");
            } else {
                paneles.Ventas.Ventas.numVenta.setText(String.valueOf(c + 1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}