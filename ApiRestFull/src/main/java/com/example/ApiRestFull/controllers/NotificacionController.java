package com.example.ApiRestFull.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiRestFull.observador.Observador;
import com.example.ApiRestFull.probandoObservador.AppObservador;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {
    private List<Observador> observadores=new ArrayList<>();

    @PostMapping
    public void notificarObservadores(@RequestBody String mensaje){
        try {
            for(Observador observador:observadores){
                System.out.println(observador);
                observador.actualizar(mensaje);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/registrar")
    public void registrarObservador(@RequestBody Observador observador){
        try {
        observadores.add(observador);  
        System.out.println("observador agregado");  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
