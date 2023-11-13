package com.example.ApiRestFull.probandoObservador;

import com.example.ApiRestFull.observador.Observador;
import com.fasterxml.jackson.annotation.JsonTypeName;
@JsonTypeName("AppObservador")
public class AppObservador implements Observador{
  
    @Override
    public void actualizar(String mensaje) {
        try {
            notificarObservadores(mensaje);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    

    


    private void notificarObservadores(String mensaje){
        System.out.println("notificacion imprimida desde el observador ");
    }
    
    
}
