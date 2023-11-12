package com.example.factory;

import com.example.conexion.IConexion;
import com.example.factoryEnum.FactoryEnum;
import com.example.implementacion.MySqlConnection;
import com.example.implementacion.SqlConnection;

public class Factory {

    public static IConexion ObtenerConexionPorTipo(FactoryEnum tipo) {
        switch (tipo) {
            case Sqlconnection:
                return new SqlConnection();
            case MySqlconnection:
                return new MySqlConnection();
            default:
                return null;
        }
    }
}
