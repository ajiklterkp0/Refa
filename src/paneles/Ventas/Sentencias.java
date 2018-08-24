/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Ventas;


/**
 *
 * @author jona
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM producto ORDER BY nombre";
    public static String LISTAR1 = "SELECT * FROM ventas, producto WHERE codigo = idproducto";

    public static String REGISTRAR = "INSERT INTO ventas(idventa, codigo, cantidad, total, fecha) "
            + "VALUES(?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE producto SET "
            + "nombre=?, "
            + "descripcion=?, "
            + "tipoproducto=?, "
            + "precio=? "
            + "WHERE idproducto=?";


    private int id_venta;
    private String codigo;
    private int cantidad;
    private double total;
    private String fecha;
    private double cambio;
    

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
   
}
