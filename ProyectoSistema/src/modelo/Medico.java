/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.HistorialClinica;
import controlador.LeerEscribirArchivos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Medico extends Persona implements Serializable{
    String especialidad;
    
          LeerEscribirArchivos leerEsc=new LeerEscribirArchivos();
           HashMap<String,List<HistorialClinica>> hm= new HashMap(); // tablas hash key y value
        List<HistorialClinica> hc=new ArrayList();
   
         String numHist;

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
    public void crearHistoria(){
        String receta, indicaciones,fecha;
      
        Scanner sc= new Scanner(System.in);
//        hc.add(new HistorialClinica("noce","noce","noce"));
//        hm.put("1723291090", hc);
//         leerEsc.escribirArchivo(hm, "HistoriaClinica");
        
        hm=(HashMap<String,List<HistorialClinica>>) leerEsc.leerArchivo("HistoriaClinica");
         System.out.println("Ingrese numero de Historia Clinica");
         numHist=sc.nextLine();
        System.out.println("Ingrese la receta");
        receta=sc.nextLine();
        System.out.println("Ingrese Las indicaciones");
        indicaciones=sc.nextLine();
        System.out.println("Ingrese la fecha");
        fecha=sc.nextLine();
        hc.add(new HistorialClinica(receta,indicaciones,fecha));
        if(hm==null){
             
             hm.put(numHist,hc);
            leerEsc.escribirArchivo(hm, "HistoriaClinica");
        }else{
            if(hm.get(numHist)==null){
               hm.put(numHist, hc);
               leerEsc.escribirArchivo(hm, "HistoriaClinica");
                
            }else{
                hc=hm.get(numHist);
                 hc.add(new HistorialClinica(receta,indicaciones,fecha));
                 hm.put(numHist, hc);
                   leerEsc.escribirArchivo(hm, "HistoriaClinica");
                
            }
                
        }
        
        
    }
    public void verHistoria(){
        
        Scanner sc= new Scanner(System.in);
          
        hm=(HashMap<String,List<HistorialClinica>>) leerEsc.leerArchivo("HistoriaClinica");
         System.out.println("Ingrese numero de Historia Clinica");
         numHist=sc.nextLine();
         hc=hm.get(numHist);
         if(hc==null){
             System.out.println("No existen registro");
         }else{
             for (int i = 0; i < hc.size(); i++) {
                 System.out.println(hc.get(i));
                 
             }
         }
        
        
    }
    
    
    
    
    
}
