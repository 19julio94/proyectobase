/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author JP
 */
public class Conectar {
 Connection con =null;
 
 public Connection Conexion(){
     
     try {
         //cargar driver
         //Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost/videojuegos","root","");
         System.out.println("Conexion establecida");
         JOptionPane.showMessageDialog(null,"Conexion establecida");
     } catch (SQLException e){
         System.out.println("Error de conexion");
     }
     
     return con;
 
}
 
 
}
