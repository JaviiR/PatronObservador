package com.example.implementacion;

import java.sql.Connection;
import java.sql.DriverManager;

import com.example.conexion.IConexion;

public class MySqlConnection implements IConexion {
    String url="jdbc:mysql://localhost:3306/escuela";
    String user="root";
    String password="";
    

    @Override
    public Connection getConexion() {
        try {
            
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion a MySql exitosa");
            return connection;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

}
