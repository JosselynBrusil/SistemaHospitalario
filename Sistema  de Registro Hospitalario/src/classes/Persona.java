/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author Josselyn
 */
public class Persona implements Serializable {
    private String nombre, usuario, password;
    private int ci;

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
        private HistoriaClinica hc;
    
  
    
    private String apellido;
   
    private String cI;

    public Persona(String nombre, String usuario, String password, HistoriaClinica hc, String apellido, String cI) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.hc = hc;
        this.apellido = apellido;
       
        this.cI = cI;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HistoriaClinica getHc() {
        return hc;
    }

    public void setHc(HistoriaClinica hc) {
        this.hc = hc;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  

    public String getcI() {
        return cI;
    }

    public void setcI(String cI) {
        this.cI = cI;
    }
    
    
}
