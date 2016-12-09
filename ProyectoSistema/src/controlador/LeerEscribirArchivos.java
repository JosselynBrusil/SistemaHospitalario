/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USRBET
 */
public class LeerEscribirArchivos implements Serializable{
    public void escribirArchivo(Object lista, String nomArchi){
        
        try {
            FileOutputStream fos=new FileOutputStream("src"+File.separator+"archivos"+File.separator+""+nomArchi+".lista");
            ObjectOutputStream ous=new ObjectOutputStream(fos);
            ous.writeObject(lista);
            ous.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public Object leerArchivo(String nombreArchivo){
        Object o=null;
        try {
            FileInputStream fis=new FileInputStream("src"+File.separator+"archivos"
                    +File.separator+""+nombreArchivo+".lista");
            ObjectInputStream ois=new ObjectInputStream(fis);
             o=(Object)ois.readObject();
            ois.close();
              } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return o;
        
    }
    
}
