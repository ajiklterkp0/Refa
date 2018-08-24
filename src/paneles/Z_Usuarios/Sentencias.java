/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.Z_Usuarios;

/**
 *
 * @author jona
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM usuarios WHERE idusuario!=1 ORDER BY idusuario";

    public static String REGISTRAR = "INSERT INTO usuarios(nombre, apellido_p, apellido_m, direccion, numero, usuario, password, tipousuario) "
            + "VALUES(?,?,?,?,?,?,?,?);";

    public static String ACTUALIZAR = "UPDATE usuarios SET "
            + "nombre=?, "
            + "apellido_p=?, "
            + "apellido_m=?, "
            + "direccion=?, "
            + "numero=?, "
            + "usuario=?, "
            + "password=?, "
            + "tipousuario=? "
            + "WHERE idusuario=?";
            

    public static String ELIMINAR = "DELETE FROM usuarios WHERE idusuario = ?";

    private int id;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String direccion;
    private String numero;
    private String usuario;
    private String password;
    private String tipo;  

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getApellido_P(){
        return apellido_p;
    }
    public void setApellido_P(String apellido_p){
        this.apellido_p= apellido_p;
    }
    
    public String getApellido_M(){
        return apellido_m;
    }
    public void setApellido_M(String apellido_m){
        this.apellido_m= apellido_m;
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

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
