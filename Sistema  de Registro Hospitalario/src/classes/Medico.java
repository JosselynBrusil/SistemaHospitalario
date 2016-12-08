package classes;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josselyn
 */
public class Medico extends Persona  implements Serializable {

    private String especialidad;

    public Medico(String especialidad, String nombre, String usuario, String password, HistoriaClinica hc, String apellido, String contraseña, String cI) {
        super(nombre, usuario, password, hc, apellido, contraseña, cI);
        this.especialidad = especialidad;
    }

    public Medico() {
    }
    
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    


    
}
