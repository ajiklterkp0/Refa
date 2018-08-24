/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Z_Compras;

import java.util.Date;
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author jona
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM compras WHERE idcompra!=1 ORDER BY idcompra";

    public static String REGISTRAR = "INSERT INTO compras(descripcion, idproveedor, fechacompra, total, pdf) "
            + "VALUES(?,?,?,?,?);";

    public static String ACTUALIZAR = "UPDATE compras SET "
            + "descripcion=?, "
            + "idproveedor=?, "
            + "fechacompra=?, "
            + "total=?, "
            + "pdf=?, "
            + "WHERE idcompra=?";
            

    public static String ELIMINAR = "DELETE FROM compras WHERE idcompra = ?";

    private int id;
    private String descripcion;
    private String idproveedor;
    private String fecha;
    private double total;
    private String pdf;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
    
    public String getIdProveedor(){
        return idproveedor;
    }
    public void setIdProveedor(String idproveedor){
        this.idproveedor= idproveedor;
    }
    
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha= fecha;
    }
    
    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total= total;
    }
    
    public String getPdf(){
        return pdf;
    }
    public void setPdf(String pdf){
        this.pdf= pdf;
    }
}
