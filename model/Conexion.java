/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author WZZRDPC
 */
public class Conexion {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://192.168.18.54:3306/servidor?" +
                                   "user=root&password=Administrador_027");
            Statement st= conn.createStatement();
            ResultSet rs=st.executeQuery("select * from usuario");
            while(rs.next()){
            String id= rs.getString(1);
            String correo = rs.getString(2);
            String contraseña=rs.getString(3);
            String nombre = rs.getString(4);
            String apellidos = rs.getString(5);
            String direccion = rs.getString(6);
            }
            
           
            System.out.println("CONECTADO");
        } catch (Exception ex) {
            // handle the error
            System.err.println("ERROR");
        }
    }
    
    
    
    
}

  

