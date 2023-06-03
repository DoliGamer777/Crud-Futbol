/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zambabol;

/**
 *
 * @author josej
 */
public class Equipo {
    
    public String nombre;
    public String entrenador;
    public String id;

    public Equipo() {
    }
    
    
    public Equipo(String nombre, String entrenador, String id) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
    
    
    
    
    
    
}
