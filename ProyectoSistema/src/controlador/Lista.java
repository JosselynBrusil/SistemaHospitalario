/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author USRBET
 */
public class Lista extends ArrayList<Object> implements Serializable{

    @Override
    public boolean add(Object e) {
        //guarda en la BDD
        
        return super.add(e); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int size() {
        return super.size(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object get(int index) {
        return super.get(index); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
