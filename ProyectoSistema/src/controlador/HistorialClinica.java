/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class HistorialClinica implements Serializable{
    String receta, indicaciones,fecha;

    public HistorialClinica() {
    }

    public HistorialClinica(String receta, String indicaciones, String fecha) {
        this.receta = receta;
        this.indicaciones = indicaciones;
        this.fecha = fecha;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "HistorialClinica{" + "receta=" + receta + ", indicaciones=" + indicaciones + ", fecha=" + fecha + '}';
    }
    
    
    
}
