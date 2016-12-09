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
public class Paciente extends Persona implements Serializable {
    String numHistoria,nombreDoc;

    public Paciente() {
    }

    public Paciente(String numHistoria, String nombreDoc, String nombre, String id, String usuario, String pass) {
        super(nombre, id, usuario, pass);
        this.numHistoria = numHistoria;
        this.nombreDoc = nombreDoc;
    }

 
    public String getNumHistoria() {
        return numHistoria;
    }

    public void setNumHistoria(String numHistoria) {
        this.numHistoria = numHistoria;
    }
    
    
    
    
}
