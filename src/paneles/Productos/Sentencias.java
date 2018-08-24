/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Productos;

/**
 *
 * @author jona
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM productos ORDER BY nombre";

    public static String REGISTRAR = "INSERT INTO productos(codigo ,nombre, descripcion, idcategoria, idproveedor, precio_compra ,precio_venta ,stock_min ,stock_max ,stock_actual)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE productos SET "
            + "nombre=?, "
            + "descripcion=?, "
            + "idcategoria=?, "
            + "idproveedor=?, "
            + "precio_compra=?, "
            + "precio_venta=?, "
            + "stock_min=?, "
            + "stock_max=?, "
            + "stock_actual=?, "
            + "WHERE idproducto=?";
    
    public static String ACTUALIZAR_STOCK = "UPDATE productos SET "
            + "nombre=?, "
            + "descripcion=?, "
            + "idcategoria=?, "
            + "idproveedor=?, "
            + "precio_compra=?, "
            + "precio_venta=?, "
            + "stock_min=?, "
            + "stock_max=?, "
            + "stock_actual=?, "
            + "WHERE idproducto=?";

    public static String ELIMINAR = "DELETE FROM productos WHERE idproducto = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE productos";

    private int id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private String idcategoria;
    private String idproveedor;
    private double precio_compra;
    private double precio_venta;
    private int stock_min;
    private int stock_max;
    private String stock_actual;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdCategoria() {
        return idcategoria;
    }

    public void setIdCategoria(String idcategoria) {
        this.idcategoria = idcategoria;
    } 
    
    public String getIdProveedor() {
        return idproveedor;
    }

    public void setIdProveedor(String idproveedor) {
        this.idproveedor = idproveedor;
    } 
    
    public double getPrecio_Compra() {
        return  precio_compra;
    }

    public void setPrecio_Compra(double precio_compra) {
        this.precio_compra = precio_compra;
    } 
   
    public double getPrecio_Venta() {
        return  precio_venta;
    }

    public void setPrecio_Venta(double precio_venta) {
        this.precio_venta = precio_venta;
    } 
    
    public int getStock_Min() {
        return stock_min;
    }

    public void setStock_Min(int stock_min) {
        this.stock_min = stock_min;
    }
    
    public int getStock_Max() {
        return stock_max;
    }

    public void setStock_Max(int stock_max) {
        this.stock_max = stock_max;
    }
    
    public String getStock_Actual() {
        return stock_actual;
    }

    public void setStock_Actual(String stock_actual) {
        this.stock_actual = stock_actual;
    }

}
