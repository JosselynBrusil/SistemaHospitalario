/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Medico extends Persona implements Serializable{
    String especialidad;
    

    public Medico() {
    }

    public Medico(String especialidad, String nombre, String id, String usuario, String contraseña) {
        super(nombre, id, usuario, contraseña);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    
    
    
}
