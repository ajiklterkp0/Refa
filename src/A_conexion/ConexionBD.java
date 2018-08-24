/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package A_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jona
 */
public class ConexionBD {
    Connection conect = null;

    public Connection conexion() {
        if(conect == null){
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/refaccionaria", "root", "123456"); 
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        }
        return conect;
    }   
    
}
