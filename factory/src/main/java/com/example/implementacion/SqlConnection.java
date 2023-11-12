package com.example.implementacion;

import java.sql.Connection;
import java.sql.DriverManager;

import com.example.conexion.IConexion;

public class SqlConnection implements IConexion {
    String url="jdbc:sqlserver://DESKTOP-18A126S:1433;databaseName=Escuela;encrypt=false;trustServerCertificate=true";
    String user="sa";
    String password="Samuray7)";
    
    @Override
    public Connection getConexion() {
        try {
            
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion a sqlServer exitosa");
            return connection;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

}
