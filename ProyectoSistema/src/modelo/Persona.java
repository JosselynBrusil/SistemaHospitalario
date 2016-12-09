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
public class Persona implements Serializable {
    public String nombre,id,usuario,pass;

    public Persona() {
    }

    public Persona(String nombre, String id, String usuario, String pass) {
        this.nombre = nombre;
        this.id = id;
        this.usuario = usuario;
        this.pass = pass;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", usuario=" + usuario + ", pass=" + pass + '}';
    }
    
    
    
}
