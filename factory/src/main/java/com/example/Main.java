package com.example;



import com.example.DAO.AlumnoDAO;
import com.example.entity.Alumno;
import com.example.factoryEnum.FactoryEnum;


public class Main {
    
    public static void main(String[] args) {
        Alumno alumn=new Alumno();
        alumn.setNombre("Camilo");
        alumn.setApellido("Sexto");
        AlumnoDAO dao=new AlumnoDAO(FactoryEnum.Sqlconnection);
        dao.IngresarAlumno(alumn);
        System.out.println("--------------SQL----------------");
        dao.findAllAlumnos();
        System.out.println("---------------------------------");
        dao=new AlumnoDAO(FactoryEnum.MySqlconnection);
        dao.IngresarAlumno(alumn);
        System.out.println("--------------MySql----------------");
        dao.findAllAlumnos();
        System.out.println("---------------------------------");
        
        
    }
}