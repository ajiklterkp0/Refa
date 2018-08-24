/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Proveedores;

/**
 *
 * @author jona
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM proveedores ORDER BY idproveedor";

    public static String REGISTRAR = "INSERT INTO proveedores(rfc, nombre, direccion, telefono, email)"
            + "VALUES(?,?,?,?,?);";

    public static String ACTUALIZAR = "UPDATE proveedores SET "
            + "rfc=?, "
            + "nombre=?, "
            + "direccion=?, "
            + "telefono=?, "
            + "email=?, "
            + "WHERE idproveedor=?";
            

    public static String ELIMINAR = "DELETE FROM proveedores WHERE idproveedores = ?";

    private int id;
    private String rfc;
    private String nombre;
    private String direccion;
    private String numero;
    private String email;  

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getRfc(){
        return rfc;
    }
    public void setRfc(String rfc){
        this.rfc= rfc;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero= numero;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
