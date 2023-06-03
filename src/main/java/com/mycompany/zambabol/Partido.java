/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zambabol;

/**
 *
 * @author josej
 */
public class Partido {
    
    public String equipovisitante;
    public String equipolocal;
    public int puntajelocal;
    public int puntajevisitante;
    public String fecha;

    public Partido() {
    }

    public Partido(String equipovisitante, String equipolocal, int puntajelocal, int puntajevisitante, String fecha) {
        this.equipovisitante = equipovisitante;
        this.equipolocal = equipolocal;
        this.puntajelocal = puntajelocal;
        this.puntajevisitante = puntajevisitante;
        this.fecha = fecha;
    }

    public String getEquipovisitante() {
        return equipovisitante;
    }

    public void setEquipovisitante(String equipovisitante) {
        this.equipovisitante = equipovisitante;
    }

    public String getEquipolocal() {
        return equipolocal;
    }

    public void setEquipolocal(String equipolocal) {
        this.equipolocal = equipolocal;
    }

    public int getPuntajelocal() {
        return puntajelocal;
    }

    public void setPuntajelocal(int puntajelocal) {
        this.puntajelocal = puntajelocal;
    }

    public int getPuntajevisitante() {
        return puntajevisitante;
    }

    public void setPuntajevisitante(int puntajevisitante) {
        this.puntajevisitante = puntajevisitante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
