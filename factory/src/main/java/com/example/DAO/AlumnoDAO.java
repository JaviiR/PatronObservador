package com.example.DAO;

import java.sql.Connection;

import com.example.conexion.IConexion;
import com.example.entity.Alumno;
import com.example.factory.Factory;
import com.example.factoryEnum.FactoryEnum;
import java.sql.ResultSet;


import java.sql.PreparedStatement;

public class AlumnoDAO {
    private IConexion conexion=null;
    public AlumnoDAO(FactoryEnum tipo){
        conexion=Factory.ObtenerConexionPorTipo(tipo);
    }
    public void IngresarAlumno(Alumno alumn){
        try {
        String sql="insert into Alumno(nombre,apellido) values(?,?)";
        Connection connection=conexion.getConexion();
        PreparedStatement prepared=connection.prepareStatement(sql);
        prepared.setString(1,alumn.getNombre());  
        prepared.setString(2,alumn.getApellido()); 
        prepared.executeUpdate();
        System.out.println("Alumno ingresado exitosamente");
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
    public void findAllAlumnos(){
        try {
            ResultSet resultado=conexion.getConexion().prepareStatement("select*from Alumno").executeQuery();
            
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                
                
                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
            }
    
            System.out.println();    
            } catch (Exception e) {
                System.out.println("-ERROR: "+e.getMessage());
            }
            
    }
}
