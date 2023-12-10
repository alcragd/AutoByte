/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import java.sql.*;
import javax.swing.JOptionPane;

public class AutoByteDB {
    Connection conectar = null;
    public Connection conexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/AutoByte","root","");
            JOptionPane.showMessageDialog(null, "Conectado exitosamente");
        }
        catch(ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    JOptionPane.showMessageDialog(null, "NO CONECTADO");
                }
        return conectar;
    }
    
}
