package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josselyn
 */
public class Paciente {
    private String seguro;
    private HistoriaClinica hc;

    public String getSeguro() {
        return seguro;
    }

    public HistoriaClinica getHc() {
        return hc;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public void setHc(HistoriaClinica hc) {
        this.hc = hc;
    }
    
}
